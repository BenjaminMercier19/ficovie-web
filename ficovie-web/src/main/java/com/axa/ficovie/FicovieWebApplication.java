package com.axa.ficovie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@SpringBootApplication
public class FicovieWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(FicovieWebApplication.class, args);
	}

	//ENABLE CORS FOR ACCESSING FROM LOCAL NODE SERVER
	@Bean
	 public WebMvcConfigurer corsConfigurer() {
			 return new WebMvcConfigurerAdapter() {
					 @Override
					 public void addCorsMappings(CorsRegistry registry) {
							 registry.addMapping("/api/**").allowedOrigins("http://localhost:8000");
					 }
			 };
	 }
}
