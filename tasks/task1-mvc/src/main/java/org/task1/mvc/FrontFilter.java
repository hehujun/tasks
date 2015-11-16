package org.task1.mvc;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FrontFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println(filterConfig);
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("doFilter");
		chain.doFilter(request, response);
	}

	public void destroy() {
		System.out.println("destory");
	}
}
