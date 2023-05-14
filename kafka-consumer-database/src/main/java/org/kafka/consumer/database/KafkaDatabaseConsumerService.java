package org.kafka.consumer.database;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaDatabaseConsumerService {
	private static final Logger LOGGER=LoggerFactory.getLogger(KafkaDatabaseConsumerService.class);
	
	@KafkaListener(
			topics="wikimedia_recentchange",
			groupId="myGroup"
			)
	public void consume(String eventMessage) {
		LOGGER.info(String.format("String Received->%s", eventMessage));
	}
	
}
