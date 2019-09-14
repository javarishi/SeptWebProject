package com.h2kinfosys.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AuditFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		String filterInitParam = filterConfig.getInitParameter("directory");
		System.out.println("AuditFilter :: " + filterInitParam);
	}
	
	@Override
	public void doFilter(ServletRequest request, 
						ServletResponse response, 
						FilterChain chain)
			throws IOException, ServletException {
		// Filter Pre-processor
		System.out.println("Pre-processor of AuditFilter" );
		
		// Next thing in pipeline - filter or Servlet
		chain.doFilter(request, response);
		
		// Post Processing 
		System.out.println("Post Processing AuditFilter :: " + response.getContentType());
	}
	
	@Override
	public void destroy() {
	
	}

}
