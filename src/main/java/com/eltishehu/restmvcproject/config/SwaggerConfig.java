package com.eltishehu.restmvcproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * Created by e.sh. on 19-Oct-18
 */
@EnableSwagger2
@Configuration
public class SwaggerConfig { // extends WebMvcConfigurationSupport {

    @Bean
    public Docket api() {

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .pathMapping("/")
                .apiInfo(metaData());

    }

    private ApiInfo metaData() {

        Contact contact = new Contact("Elti Shehu", "https://www.eltishehu.com", "elti_shehu@hotmail.com");

        return new ApiInfo(
                "Spring Framework Tutorial",
                "Spring Framework 5",
                "1.0",
                "Terms of Service: blah blah",
                contact,
                "Apache License Version 2.0",
                "https://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList<>()
        );
    }

    //if you're not running spring boot and dont see swagger ui, you need to add these configurations
    /*@Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }*/
}
