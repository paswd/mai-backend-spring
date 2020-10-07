package ru.paswd.mai.backend.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SpringfoxConfig {

    @Bean
    Docket docket() {
        return create("ru.paswd.mai.backend.controllers");
    }

    private static Docket create(String basePackage) {
        return new Docket(DocumentationType.SWAGGER_2)
                .tags(
                        new Tag("cache", "Cache")
                )
                .useDefaultResponseMessages(false)
                .groupName("api")
                .select()
                .apis(RequestHandlerSelectors.basePackage(basePackage))
                .paths(PathSelectors.regex("/api.*"))
                .build()
                .apiInfo(apiInfo());
    }

    private static ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Backend API")
                .contact(new Contact("paswd", "http://paswd.ru/", "me@paswd.ru"))
                .version("1")
                .build();
    }
}
