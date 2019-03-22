package com.springmvc.utils;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class firstFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		//类型转换为HttpServlet类型
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		//获取ip
		String ip = request.getRemoteAddr();
		//获取url
		String url = request.getRequestURL().toString();
		//格式化日期
		SimpleDateFormat da = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = new Date();
		String data = da.format(d);
		
		System.out.printf("%s %s 访问了 %s%n", data, ip, url);
		//统一字符编码格式
		request.setCharacterEncoding("utf-8");
        arg2.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
