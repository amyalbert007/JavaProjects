package com.cg.onlineflatrental;


import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
 
@Configuration
//This annotation enables the Swagger support in the application.
@EnableSwagger2
public class MySwaggerConfig {
	
	// The select() method called on Docket bean returns an "ApiSelectorBuilder". This provides "apis()" and "paths()" methods to filter the controllers and methods being documented using string predicates.
    @Bean
    public Docket postsApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(metadata()).select().paths(regex("/flatbooking.*")).build();
    }
 
    @SuppressWarnings("deprecation")
    private ApiInfo metadata() {
        return new ApiInfoBuilder().title("Online Flat Rental App").description("API reference guide for developers").termsOfServiceUrl("https://www.abccg.com/").contact("Batra, Yatin").version("1.0").build();    
    }

}
