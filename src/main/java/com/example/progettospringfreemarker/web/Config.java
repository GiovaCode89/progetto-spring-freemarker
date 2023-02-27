package com.example.progettospringfreemarker.web;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.example.progettospringfreemarker.controller")
public class Config {


    //Creo il FreeMarkerViewResolver
    @Bean
    public FreeMarkerViewResolver createResolver(){
        FreeMarkerViewResolver resolver= new FreeMarkerViewResolver();
        resolver.setPrefix("");
        //setSuffix("...") indica il formato dei file da prendere nella cartella delle view
        resolver.setSuffix(".ftl");
        return resolver;
    }


    //Creo il FreeMarkerConfigurer
    @Bean
    public FreeMarkerConfigurer configureFreeMarker(){
        FreeMarkerConfigurer config= new FreeMarkerConfigurer();
        //'setTemplateLoaderPath("...")' indica la path dove vi sono le view
        config.setTemplateLoaderPath("/WEB-INF/view/");
        return config;
    }
}
