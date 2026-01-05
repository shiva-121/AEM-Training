package com.adobe.ase.aem.training.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
//import org.jetbrains.annotations.NotNull;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.propertytypes.ServiceDescription;

import com.adobe.ase.aem.training.core.services.DatabaseService;

@Component(service = Servlet.class)
@ServiceDescription("This is database servlet")
@SlingServletPaths("/bin/databaseservlet")

public class DatabaseServlet extends SlingSafeMethodsServlet{
	@Reference
	DatabaseService obj; 	// reference of interface
	@Override
	protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
			throws ServletException, IOException {
		
		String result = obj.callDatabase();
		
		response.setHeader("Content-Type", "text/html");
		
		response.getWriter().print("<h2>"+result+"</h2>");
		
		response.getWriter().close();
	}
}
