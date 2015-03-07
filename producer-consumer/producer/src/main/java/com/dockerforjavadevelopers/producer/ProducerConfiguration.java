package com.dockerforjavadevelopers.producer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

@Configuration
@EnableAutoConfiguration
public class ProducerConfiguration {

    public static String destination = "destination";
    
    /*
    @Autowired
    private ConfigurableApplicationContext context;

    @Bean
    JmsTemplate jmsTemplate() {
        return context.getBean(JmsTemplate.class);
    }*/

}
