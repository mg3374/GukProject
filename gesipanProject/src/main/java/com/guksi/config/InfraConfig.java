package com.guksi.config;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource({"classpath:DB/dbconfig.properties"})
@EnableTransactionManagement
public class InfraConfig {
	@Bean
	public DataSource dataSource1(@Value ("${db.driver}") String driverClassName,
								  @Value("${db.url}") String url,
								  @Value("${db.username}") String username,
								  @Value("${db.password}") String password) {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(driverClassName);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		return ds;
	}
	
	@Bean
	public SqlSessionFactoryBean sessionfactorybean(DataSource ds) {
		SqlSessionFactoryBean sfb = new SqlSessionFactoryBean();
		sfb.setDataSource(ds);
		String confFile = "classpath:/myBatis/mybatis-config.xml";
		Resource res =  new PathMatchingResourcePatternResolver().getResource(confFile);
		sfb.setConfigLocation(res);
		return sfb;
	}
	
	@Bean
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactoryBean factory) throws Exception {
		SqlSessionTemplate template = new SqlSessionTemplate(factory.getObject());
		return template;
	}
	
}
