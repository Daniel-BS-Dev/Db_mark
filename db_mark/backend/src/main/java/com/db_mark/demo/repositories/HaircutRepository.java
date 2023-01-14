package com.db_mark.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db_mark.demo.entities.Haircut;

@Repository
public interface HaircutRepository extends JpaRepository<Haircut, Long> {
	
	List<Haircut> findAll();

}
