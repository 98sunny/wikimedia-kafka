package org.kafka.producer.wikimedia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class SprinbootProducerApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(SprinbootProducerApplication.class);
        
    }
    public void sendMessage() {
		String topic="wikimedia_recentchange";
	}
}
