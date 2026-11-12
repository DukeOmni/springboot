package br.learningarea.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ApiVersionConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Configuration
public class CustomApiVersionResolver implements WebMvcConfigurer {
    private static final Pattern VENDOR =
            Pattern.compile("application/vnd\\.acme\\.v(\\d+(?:\\.\\d+)?)\\+json");

    @Override
    public void configureApiVersioning(ApiVersionConfigurer configurer) {
        configurer.useVersionResolver( request -> {
                String accept = request.getHeader("Accept");
                if (accept != null) {
                    Matcher m = VENDOR.matcher(accept);
                    if (m.find()) {
                        return m.group(1);
                    }
                }
                return request.getHeader("API-Version");
            }
        );
    }
}

