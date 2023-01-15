package com.db_mark.demo.dtos;

import java.io.Serializable;
import java.sql.Date;
import java.time.Instant;

import com.db_mark.demo.entities.Client;
import com.db_mark.demo.entities.Haircut;
import com.db_mark.demo.enums.TypeOptionHaircut;

public class HaircutDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Instant hour;
	private TypeOptionHaircut option;
	private Double price;
	private Long hairdresserId;
	private Client client;
	
	public HaircutDTO(Long id, Instant hour, TypeOptionHaircut option, Double price, Long hairdresserId, Client client) {
		this.id = id;
		this.hour = hour;
		this.option = option;
		this.price = price;
		this.hairdresserId = hairdresserId;
	}

	public HaircutDTO(Haircut entity) {
		id = entity.getId();
		hour = entity.getHour();
		option = entity.getOption();
		price = entity.getPrice();
		hairdresserId = entity.getHairdresser().getId();
		client = entity.getClient();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Instant getHour() {
		return hour;
	}

	public void setHour(Instant hour) {
		this.hour = hour;
	}

	public TypeOptionHaircut getOption() {
		return option;
	}

	public void setOption(TypeOptionHaircut option) {
		this.option = option;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Long getHairdresserId() {
		return hairdresserId;
	}

	public void setHairdresserId(Long hairdresserId) {
		this.hairdresserId = hairdresserId;
	}

	public Client getClient() {
		return client;
	}

	public void setClientId(Client client) {
		this.client = client;
	}
}
