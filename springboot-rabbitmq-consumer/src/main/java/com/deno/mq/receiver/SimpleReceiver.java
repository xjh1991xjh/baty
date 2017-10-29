package com.deno.mq.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class SimpleReceiver {
   
    @RabbitHandler
    public void process(String hello) {
        System.out.println("Consumer SimpleReceiver receive msg: " + hello);
    }   
}
