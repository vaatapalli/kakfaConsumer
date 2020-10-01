package com.example.kakfaConsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerListener {

    @KafkaListener(topics="Kafka_Example",groupId ="group_id")
    public void consumer(String message)
    {
        System.out.println("Consumer Message : "+message);
    }

    @KafkaListener(topics="Kafka_json",groupId = "group_json",
    containerFactory = "usertKafkaListenerFactory")
    public void userconsumer_json(User user)
    {
        System.out.println("User Container : " + user);
    }

}
