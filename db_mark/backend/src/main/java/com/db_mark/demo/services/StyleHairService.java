package com.db_mark.demo.services;

import org.springframework.transaction.annotation.Transactional;

import com.db_mark.demo.dtos.StyleHairDTO;
import com.db_mark.demo.entities.StyleHair;
import com.db_mark.demo.repositories.StyleHairRepository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StyleHairService {
	
	@Autowired
	private StyleHairRepository repository;
	
	@Transactional(readOnly = true)
	public List<StyleHairDTO> findAllPage() {
		List<StyleHair> list = repository.findAll();
		return list.stream().map(x -> new StyleHairDTO(x)).collect(Collectors.toList());
	}
}