package org.kafka.consumer.database.DB;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="wikimedia_recentchange")
@Getter
@Setter
public class WikiMediaData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Lob
	private String wikiEventData;
	public void setWikiEventData(String eventMessage) {
		// TODO Auto-generated method stub
		wikiEventData=eventMessage;
		
	}
	

}
