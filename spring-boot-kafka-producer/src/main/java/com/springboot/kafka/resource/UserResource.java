package com.springboot.kafka.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.kafka.model.User;

@RestController
@RequestMapping("kafka")
public class UserResource {

    @Autowired
    KafkaTemplate<String, User> kafkaTemplate;
    private static final String TOPIC = "kafka_template_example";

    @GetMapping("/publish/{message}")
    public String post(@PathVariable("message") String message) {
        kafkaTemplate.send(TOPIC, message);
        return "published";
    }

}
