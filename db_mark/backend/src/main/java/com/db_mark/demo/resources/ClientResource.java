package com.db_mark.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db_mark.demo.dtos.ClientDTO;
import com.db_mark.demo.services.ClientService;

@RestController
@RequestMapping(value = "/client")
public class ClientResource {

	@Autowired
	private ClientService service;

	@GetMapping
	public ResponseEntity<List<ClientDTO>> findAll() {
		List<ClientDTO> list = service.findAllPage();
		return ResponseEntity.ok().body(list);
	}
}
