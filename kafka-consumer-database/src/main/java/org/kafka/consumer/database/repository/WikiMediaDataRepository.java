package org.kafka.consumer.database.repository;

import org.kafka.consumer.database.DB.WikiMediaData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface WikiMediaDataRepository extends JpaRepository<WikiMediaData, Long>{
	
}
