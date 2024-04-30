package com.deliveryboy.service;

import com.deliveryboy.config.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
    // we can use KafkaTemplate to send messages in spring boot

    @Autowired  // this bean is available in apache kafka container so we can autowire it.
    private KafkaTemplate<String, String> kafkaTemplate;

    // logger
    private Logger logger = LoggerFactory.getLogger(KafkaService.class);

    public boolean updateLocation(String location){
        // kafkaTemplate.send(key, value) pair where we have send key as name of producer message and value as location for this method
        this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME, location);
        this.logger.info("message produced");
        return true;


    }

}
