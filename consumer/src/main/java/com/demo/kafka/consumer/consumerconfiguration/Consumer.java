package com.demo.kafka.consumer.consumerconfiguration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(Sink.class)
public class Consumer {
	private static Logger logger = LoggerFactory.getLogger(Consumer.class);

	@StreamListener(Sink.INPUT)
	public void loggerSink(com.demo.kafka.consumer.model.SinkTimeInfo sinkTimeInfo) {
		logger.info("Received: " + sinkTimeInfo.toString());
	}
}
