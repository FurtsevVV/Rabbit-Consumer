package com.zakat.rabbitconsumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
    private final String EXCHANGE_NAME = "obmennik";

    private RabbitTemplate rabbitTemplate;

    @Autowired
    public void setRabbitTemplate(RabbitTemplate rabbitTemplate){
        this.rabbitTemplate = rabbitTemplate;
    }


    @RabbitListener(queues = "queue1")
    public void receiveMessage(IntDto intDto){
        System.out.println("Get intDto: " + intDto);
        Message message1 = new Message();
        message1.setId(3);
        message1.setText(intDto.getNumber().toString());

        rabbitTemplate.convertAndSend(EXCHANGE_NAME, "rkb", message1);
        System.out.println("Send back message object: " + message1);
    }
}
