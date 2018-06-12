package com.guksi.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
@Component
public class EncodingInterceptor implements HandlerInterceptor{
@Override
public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		throws Exception {
	// TODO Auto-generated method stub
	request.setCharacterEncoding("utf-8");
	return HandlerInterceptor.super.preHandle(request, response, handler);
}
}
