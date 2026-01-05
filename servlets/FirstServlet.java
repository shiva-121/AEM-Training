package com.adobe.ase.aem.training.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.propertytypes.ServiceDescription;
//import org.jetbrains.annotations.NotNull;

@Component(service=Servlet.class) // registering this class/servlet as an OSGI component
@ServiceDescription("This is sling servlet")
@SlingServletPaths("/bin/firstservlet")
public class FirstServlet extends SlingAllMethodsServlet{
	@Override
	protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
			throws ServletException, IOException {
		response.setHeader("Content-Type", "text/html");
		response.getWriter().print("<h2>This is our first sling servlet.</h2>");
		response.getWriter().close();
	}
	
}
