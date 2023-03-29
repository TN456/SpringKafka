package com.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopic {

	@Bean
	public NewTopic topic() {
		return TopicBuilder.name("topic_first")
				.build();
	}
	
	@Bean
	public NewTopic JsonTopic() {
		return TopicBuilder.name("topic_first_json")
				.build();
	}
}
