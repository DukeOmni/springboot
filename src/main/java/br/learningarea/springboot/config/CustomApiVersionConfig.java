package br.learningarea.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.accept.StandardApiVersionDeprecationHandler;
import org.springframework.web.servlet.config.annotation.ApiVersionConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.net.URI;
import java.time.ZonedDateTime;

@Configuration
public class CustomApiVersionConfig implements WebMvcConfigurer {
    @Bean
    StandardApiVersionDeprecationHandler deprecationHandler() {
        var handler = new StandardApiVersionDeprecationHandler();
        handler.configureVersion("1.0")
                .setDeprecationDate(ZonedDateTime.parse("2026-06-01T00:00:00Z"))
                .setDeprecationLink(URI.create("https://api.example.com/docs/migrate-v1-to-v2"))
                .setSunsetDate(ZonedDateTime.parse("2026-11-12T19:10:00Z"))
                .setSunsetLink(URI.create("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
        return handler;
    }

    @Override
    public void configureApiVersioning(ApiVersionConfigurer configurer) {
        configurer
                .useRequestHeader("API-Version")
                .addSupportedVersions("1.0", "2.0")
                .setDefaultVersion("1.0")
                .setDeprecationHandler(deprecationHandler());
    }

}
