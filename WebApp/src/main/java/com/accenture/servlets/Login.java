package com.accenture.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.accenture.model.UserModel;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String errorMsg, companyName;
	UserModel userModel;
	// Anything
    public Login() {
        System.out.println("Login()");
    }
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Login Init()");
		ServletContext context = config.getServletContext();
		
		companyName = context.getInitParameter("company");
		errorMsg = config.getInitParameter("errorString");
		
		System.out.println("Company:"+companyName);
		System.out.println("Error:"+errorMsg);
		
		userModel = new UserModel();
	}
	public void destroy() {
		System.out.println("Login Destroy()"); 
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Login Service()");
		
		PrintWriter writer = response.getWriter();
		
//		String username = request.getParameter("username");
//		String pass = request.getParameter("password");
		
		userModel.setUsername(request.getParameter("username"));
		userModel.setPassword(request.getParameter("password"));
		
		if(userModel.getUsername().equalsIgnoreCase("admin") && userModel.getPassword().equalsIgnoreCase("admin123")) {
//			System.out.println("Welcome");
//			writer.print("<h1>Welcome Accenture<h1/>");
			// RequestDispatcher Use to forward the request
//			RequestDispatcher dispatcher = request.getRequestDispatcher("/Welcome").forward(request, response);
			request.getRequestDispatcher("Welcome.jsp").forward(request, response);
		}
		else {
//			System.out.println("Invalid Credentials");
			writer.print(errorMsg+"<br>");
			request.getRequestDispatcher("/LoginException").include(request, response);
		}
		
	}

}
