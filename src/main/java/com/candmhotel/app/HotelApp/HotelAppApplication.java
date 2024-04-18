package com.candmhotel.app.HotelApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
@SpringBootApplication
@Configuration
@Controller
public class HotelAppApplication implements WebMvcConfigurer{
  private final static String[] CLASSPATH_RESOURCE_LOCATIONS = {
    "classpath:/META-INF/resources/",
    "classpath:/resources/",
    "classpath:/static/",
    "classpath:/public/"
  };
	public static void main(String[] args) {
		SpringApplication.run(HotelAppApplication.class, args);
	}
  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry){
    registry.addResourceHandler("/**").addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS);
  }
  @GetMapping("/")
  public String IndexPath(){
    return "index";
  }
  
}
