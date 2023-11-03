package com.zomato.zomato;

import org.apache.kafka.common.protocol.types.Field;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class kafkaConfig {

    @KafkaListener(topics = AppConstants.LOCATION_TOPIC_NAME,groupId = AppConstants.GROUP_ID)
    public void updateLocation(String value){
        System.out.println(value);
    }
}
