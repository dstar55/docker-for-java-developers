package com.dockerforjavadevelopers.producer;


import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.core.JmsTemplate;

public class Application {

    
    public static void main(String[] args) {
    	
        // Launch the application
        ConfigurableApplicationContext context = SpringApplication.run(ProducerConfiguration.class, args);
        JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);
              
        for (int i = 0; i < 20; i++) {
        	Producer producer = new Producer();
        	producer.setJmsTemplate(jmsTemplate);
        	producer.sendMessage(""+i);
			
		}
    }

}
