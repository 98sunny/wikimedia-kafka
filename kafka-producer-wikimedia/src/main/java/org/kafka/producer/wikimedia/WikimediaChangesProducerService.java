package org.kafka.producer.wikimedia;


import java.net.URI;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.launchdarkly.eventsource.EventHandler;
import com.launchdarkly.eventsource.EventSource;



@Service
public class WikimediaChangesProducerService {
	private static final Logger LOGGER=LoggerFactory.getLogger(WikimediaChangesProducerService.class);
	private KafkaTemplate<String, String> kafkaTemplate;
	
	@Autowired
	public WikimediaChangesProducerService(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
//		to read real time stream of data from wikimedia, we use
//		event source
		
	}
	
	public void sendMessage() throws InterruptedException {
		String topic="wikimedia_recentchange";
//		to read real time stream data from wikimedia, as we use event source
//		EventHandler eventHandler
		EventHandler eventHandler=new WikimediaChangesHandler(kafkaTemplate, topic);
		String url="https://stream.wikimedia.org/v2/stream/recentchange";
		EventSource.Builder builder=new EventSource.Builder(eventHandler, URI.create(url));
		EventSource eventSource=builder.build();
		eventSource.start();
		TimeUnit.MINUTES.sleep(10);
		
		
		
		
	}
	

}
