package com.victot.todoList.doc;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(
        title = "TodoList API",
        description = "API Rest com uma lista de tarefas",
        version = "1.0",
        license = @License(name = "license", url = "url.com.br"),
        contact = @Contact(name = "Victor", url = "https://github.com/victot-exe", email = "victorfarian@gmail.com")
))
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi customOpenAPI() {
        return GroupedOpenApi.builder()
                .group("public")
                .packagesToScan("com.victot.todoList.controllers")
                .pathsToMatch("/**")
                .build();
    }
}
