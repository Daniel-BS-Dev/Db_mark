package com.db_mark.demo.repositories;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db_mark.demo.entities.Hairdresser;

@Repository
public interface HairdresserRepository extends JpaRepository<Hairdresser, Long> {
	
	List<Hairdresser> findAll();
}