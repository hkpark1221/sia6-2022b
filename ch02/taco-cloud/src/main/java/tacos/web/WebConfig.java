package tacos.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // auto-configuration interface
public class WebConfig implements WebMvcConfigurer {

//  @Override // substituted with HomeController.java
//  public void addViewControllers(ViewControllerRegistry registry) {
//    registry.addViewController("/").setViewName("home");
//  }

  @Override // additional practice
  public void addCorsMappings(CorsRegistry registry){
    registry.addMapping("/**")
            .allowedOrigins("https://localhost:8080")
            .allowedOrigins("https://www.google.com/");
  }

}
