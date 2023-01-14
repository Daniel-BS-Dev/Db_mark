package com.db_mark.demo.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.db_mark.demo.dtos.HaircutDTO;
import com.db_mark.demo.entities.Haircut;
import com.db_mark.demo.repositories.HaircutRepository;

@Service
public class HaircutService {
	
	@Autowired
	private HaircutRepository repository;
	
	@Transactional(readOnly = true)
	public List<HaircutDTO> findAllPage() {
		List<Haircut> list = repository.findAll();
		return list.stream().map(x -> new HaircutDTO(x)).collect(Collectors.toList());
	}

}
