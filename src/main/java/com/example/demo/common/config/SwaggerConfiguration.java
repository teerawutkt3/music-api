package com.example.demo.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.ApiKeyVehicle;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Value("${application.swagger.enable:true}")
    private boolean externallyConfiguredFlag;

    @Value("${application.swagger.token}")
    private String token;

    @Bean
    public Docket selectApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(externallyConfiguredFlag)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

//    @Bean
//    public SecurityConfiguration security() {
//        final String swaggerToken = token;
//        return new SecurityConfiguration(
//                null,
//                null,
//                null,
//                null,
//                "Bearer " + swaggerToken, ApiKeyVehicle.HEADER,
//                "Authorization", ",");
//    }
}
