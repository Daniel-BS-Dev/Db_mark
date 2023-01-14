package com.db_mark.demo.services;

import org.springframework.transaction.annotation.Transactional;

import com.db_mark.demo.dtos.HairdresserDTO;
import com.db_mark.demo.entities.Hairdresser;
import com.db_mark.demo.repositories.HairdresserRepository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HairdresserService {
	
	@Autowired
	private HairdresserRepository repository;
	
	@Transactional(readOnly = true)
	public List<HairdresserDTO> findAllPage() {
		List<Hairdresser> list = repository.findAll();
		return list.stream().map(x -> new HairdresserDTO(x)).collect(Collectors.toList());
	}
}