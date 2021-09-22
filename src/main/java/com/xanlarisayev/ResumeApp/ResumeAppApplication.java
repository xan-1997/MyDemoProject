package com.xanlarisayev.ResumeApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ResumeAppApplication{

	public static void main(String[] args) {
		SpringApplication.run(ResumeAppApplication.class, args);
	}

	@Configuration
	public class MyConfig implements WebMvcConfigurer{
		@Override
		public void addResourceHandlers(ResourceHandlerRegistry registry) {
			registry.addResourceHandler("/img/**")
					.addResourceLocations("classpath: /static/img/")
					.setCachePeriod(0);
		}
	}

}
