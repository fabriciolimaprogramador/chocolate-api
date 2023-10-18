package br.com.chocolates.api.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import br.com.chocolates.api.utils.ConvertStringToEnum;

@Configuration
public class RegistraConvertEnumConfig implements WebMvcConfigurer {
	
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new ConvertStringToEnum());
    }

}
