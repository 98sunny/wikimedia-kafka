package org.kafka.producer.wikimedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class SprinbootProducerApplication implements CommandLineRunner
{
    public static void main( String[] args )
    {
        SpringApplication.run(SprinbootProducerApplication.class);
        
    }
    public void sendMessage() {
		String topic="wikimedia_recentchange";
	}
    @Autowired
    private WikimediaChangesProducerService wikimediaChangesProducerService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		wikimediaChangesProducerService.sendMessage();
		
	}
}
