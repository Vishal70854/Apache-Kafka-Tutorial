package com.deliveryboy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration  // define multiple beans per method in a class with this annotation.
public class KafkaConfig {
    // NewTopic is a new topic to be created by Admin.createTopic(by apache kafka)
    @Bean
    public NewTopic topic(){
        return TopicBuilder
                .name(AppConstants.LOCATION_TOPIC_NAME)  // set the name of topic
//                .partitions()                 // set the number of partitions in a topic(not needed currently)
//                .replicas()                   // set the replication factor(not needed currently)
                .build();
    }
}
