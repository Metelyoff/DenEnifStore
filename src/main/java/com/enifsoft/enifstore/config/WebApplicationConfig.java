package com.enifsoft.enifstore.config;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.enifsoft.enifstore"})
@EnableJpaRepositories
public class WebApplicationConfig extends SpringBootServletInitializer implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public WebApplicationConfig() {
        super();
        setRegisterErrorPageFilter(false);
    }

    public static void main(String[] args) {
        SpringApplication.run(WebApplicationConfig.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(WebApplicationConfig.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

}
