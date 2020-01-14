package com.yixin.springboot.utils;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.Contact;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Package: com.yixin.springbootyixin.utils
 * @ClassName: SwaggerConfig
 * @Description: Java类作用
 * @Author: 式神
 * @CreateDate: 2020/1/14 14:52
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.yixin.springboot.controller"))
                //禁用basic-error-controller
                .paths(Predicates.not(PathSelectors.regex("/error.*")))
                .paths(PathSelectors.regex("/.*"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger-UI ")
                .contact(new Contact("yoyo", "https://www.yixin.com/", "yoyo@yoyo.com"))
                .version("2.0")
                .description("API")
                .build();
    }
}
