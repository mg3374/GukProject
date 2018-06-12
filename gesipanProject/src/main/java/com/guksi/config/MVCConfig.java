package com.guksi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({ "com.guksi.controller" , "com.guksi.interceptor" })
@EnableWebMvc
public class MVCConfig implements WebMvcConfigurer {

	@Bean
	public ViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/view/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	/*@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addViewController("/home").setViewName("home"); 
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/Img/**").addResourceLocations("/WEB-INF/Img/");
		registry.addResourceHandler("/Css/**").addResourceLocations("/WEB-INF/Css/");
		registry.addResourceHandler("/upload/**").addResourceLocations("/WEB-INF/upload/");
	}
	@Autowired
	EncodingInterceptor ei;
	
	@Autowired
	SesssionInterceptor si;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(ei);
		registry.addInterceptor(si).addPathPatterns("/session/**"); 
	}
	
	@Bean
	public MultipartResolver multipartResolver() {
		CommonsMultipartResolver cmr = new CommonsMultipartResolver();
		cmr.setDefaultEncoding("utf-8");
		return cmr;
	}*/
}
