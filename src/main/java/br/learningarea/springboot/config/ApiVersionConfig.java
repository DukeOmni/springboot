package br.learningarea.springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.accept.ApiVersionParser;
import org.springframework.web.accept.InvalidApiVersionException;
import org.springframework.web.servlet.config.annotation.ApiVersionConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Configuration
public class ApiVersionConfig implements WebMvcConfigurer {
    private static final Pattern PATTERN = Pattern.compile("v(\\d+)");

    public record ApiVersion(String version, int major) implements Comparable<ApiVersion>{
        @Override
        public int compareTo(ApiVersion o) {
            return Integer.compare(major,o.major);
        }
    }
    @Override
    public void configureApiVersioning(ApiVersionConfigurer configurer) {
        configurer.setVersionParser((ApiVersionParser<ApiVersion>)version -> {
                Matcher m = PATTERN.matcher(version);
                if (m.matches()){
                    return new ApiVersion(version,Integer.parseInt(m.group(1)));
                }else{
                    throw new InvalidApiVersionException(version);
                }
            });
    }
}
