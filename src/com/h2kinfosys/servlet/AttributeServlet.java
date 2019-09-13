package com.h2kinfosys.servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AttributeServlet
 */
@WebServlet(description = "Test Attribute Servlet", urlPatterns = { "/attr" })
public class AttributeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String reqAttrValue = (String) request.getAttribute("ReqAttribute");
		String sessionAttrValue = (String) request.getSession().getAttribute("sessionAttribute");
		String contextAttr = (String) request.getServletContext().getAttribute("contextAttribute");
	
		System.out.println("reqAttrValue :: " + reqAttrValue);
		System.out.println("sessionAttrValue :: " + sessionAttrValue);
		System.out.println("contextAttr :: " + contextAttr);
		Cookie[] cookies = request.getCookies();
		for(Cookie eachCookie : cookies) {
			System.out.println(eachCookie.getName() + "   " + eachCookie.getValue());
		}
		
		response.sendRedirect("index.html");
	}

}
