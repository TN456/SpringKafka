package com.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.kafka.JsonKafkaProducer;
import com.kafka.model.User;

@RestController
@RequestMapping("/api")
public class JsonMessageController {
	
	@Autowired
	private JsonKafkaProducer kafkaProducer;

	@PostMapping("/publishJson")
    public ResponseEntity<String> publish(@RequestBody User user){
        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Json message sent to kafka topic");
    }
}
