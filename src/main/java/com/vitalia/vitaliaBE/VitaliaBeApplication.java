package com.vitalia.vitaliaBE;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.vitalia.vitaliaBE.config.JwtFilter;

@SpringBootApplication
public class VitaliaBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(VitaliaBeApplication.class, args);
	}
	
	@Bean
	public FilterRegistrationBean<JwtFilter> jwfFilter(){
		FilterRegistrationBean<JwtFilter> registrationBean = new FilterRegistrationBean<JwtFilter>();
		registrationBean.setFilter(new JwtFilter());
		registrationBean.addUrlPatterns("/api/productos/*");
		registrationBean.addUrlPatterns("/api/usuarios/*");
		return registrationBean;
	}

}
