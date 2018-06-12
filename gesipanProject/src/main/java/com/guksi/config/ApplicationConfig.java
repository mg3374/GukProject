package com.guksi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
@Import(InfraConfig.class)
@Configuration
@ComponentScan({"com.guksi.service","com.guksi.controller" ,"com.guksi.dao"})
public class ApplicationConfig {


	
	
	
}
  