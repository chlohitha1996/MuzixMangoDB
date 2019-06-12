package com.stackroute.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.stackroute")).paths( regex("/api/v1/.*")).build().apiInfo(appInfo());
    }

    private ApiInfo appInfo(){
<<<<<<< HEAD
        ApiInfo apiInfo = new ApiInfo("Music API(playmusic)","Spring boot Application for sound tracks","1.0","Terms Of service","Music aka playmusic","Apache License Version 2.0","https://www.apache.org/license.html");
=======
        ApiInfo apiInfo = new ApiInfo("Music API(playmusic)","Spring boot Application for sound tracks","1.0","Terms Of Service","Music aka playmusic","Apache License Version 2.0","https://www.apache.org/license.html");
>>>>>>> 6667fbebf7e5d2dd27cd4003c607ab0d2e7665fb
        return apiInfo;
    }
}