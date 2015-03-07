package com.dockerforjavadevelopers.consumer;


import javax.jms.ConnectionFactory;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.listener.SimpleMessageListenerContainer;
import org.springframework.jms.listener.adapter.MessageListenerAdapter;

import com.dockerforjavadevelopers.service.Preview;

@Configuration
@EnableAutoConfiguration
public class ConsumerConfiguration {

    private String destination = "destination";

    @Bean
    Preview preview() {
        return new Preview();
    }
    

    @Bean
    Consumer receiver() {
        return new Consumer();
    }


    @Bean
    MessageListenerAdapter adapter() {
        MessageListenerAdapter messageListener
                = new MessageListenerAdapter(receiver());
        messageListener.setDefaultListenerMethod("receiveMessage");
        return messageListener;
    }

    
    @Bean
    SimpleMessageListenerContainer container(ConnectionFactory connectionFactory) {
   	
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
        //container.setMessageListener(messageListener);
        container.setMessageListener(adapter());        
        container.setConnectionFactory(connectionFactory);
        container.setDestinationName(destination);
        return container;
    }


}
