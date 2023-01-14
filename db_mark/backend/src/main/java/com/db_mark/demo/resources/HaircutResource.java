package com.db_mark.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db_mark.demo.dtos.HaircutDTO;
import com.db_mark.demo.services.HaircutService;

@RestController
@RequestMapping(value = "/haircut")
public class HaircutResource {

	@Autowired
	private HaircutService service;

	@GetMapping
	public ResponseEntity<List<HaircutDTO>> findAll() {
		List<HaircutDTO> list = service.findAllPage();
		return ResponseEntity.ok().body(list);
	}
}
