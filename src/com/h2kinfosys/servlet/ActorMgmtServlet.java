package com.h2kinfosys.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActorMgmtServlet extends HttpServlet {
	
	// Life cycle
	// 1. take birth
	@Override
	public void init() throws ServletException {
		System.out.println("ActorMgmtServlet init - only when Servlet initialized");
	}
	// 2. serve forever - service methods - GET - POST
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Enumeration<String> params = req.getParameterNames();
		String eachParam = null;
		PrintWriter out = resp.getWriter();
		out.println("<HTML><body>");
		
		while(params.hasMoreElements()) {
			eachParam = params.nextElement();
			//System.out.println("Param Name :: " + eachParam + " Param Value :: " + req.getParameter(eachParam));
			out.println("<p>");
			out.println("Param Name :: " + eachParam + " Param Value :: " + req.getParameter(eachParam));
			out.println("</p>");
		}
		
		out.println("<p> HttpServletRequest - all implicit and explicit data coming from user </p>");
		out.println("<p> HttpServletResponse - all implicit and explicit data sent to the user </p>");
		out.println("<p> ServletContext - Servlet to Tomcat communication object. Object is kept at Tomcat level </p>");
		out.println("<p> ServletConfig - Static Data. Tomcat to Servlet communication object. Object is kept at Tomcat level </p>");
		out.println("<p> HttpSession - Active Interaction between user and web server. State of Web App </p>");
		out.println("<p> HttpListeners - Observers of change in Request, Session and Context </p>");
		out.println("<p> ServletFilters - Entity which can filter the request and response </p>");
	
	
		out.println("</body></HTML>");
		/*
		if(actorId != null && actorId.length()> 0) {
			System.out.println("Valid Actor Id :: " + actorId);
		}else {
			actorId = "100";
		}*/
		resp.flushBuffer();
		System.out.println("doGet is called from Browser ::  " );
		
		
	}
	
	// 3. dies
	@Override
	public void destroy() {
		System.out.println("ActorMgmtServlet destory - only when Servlet Destroyed");
	}
}
