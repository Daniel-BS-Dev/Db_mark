package com.db_mark.demo.dtos;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.db_mark.demo.entities.Client;
import com.db_mark.demo.entities.Haircut;
import com.db_mark.demo.entities.StyleHair;
import com.db_mark.demo.enums.typeOptionHaircut;

public class HaircutDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Date hour;
	private typeOptionHaircut option;
	private Double price;
	private Long styleHairId;
	
	public HaircutDTO(Long id, Date hour, typeOptionHaircut option, Double price, Long styleHairId) {
		this.id = id;
		this.hour = hour;
		this.option = option;
		this.price = price;
		this.styleHairId = styleHairId;
	}

	public HaircutDTO(Haircut entity) {
		id = entity.getId();
		hour = entity.getHour();
		option = entity.getOption();
		price = entity.getPrice();
		styleHairId = entity.getStyleHair().getId();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getHour() {
		return hour;
	}

	public void setHour(Date hour) {
		this.hour = hour;
	}

	public typeOptionHaircut getOption() {
		return option;
	}

	public void setOption(typeOptionHaircut option) {
		this.option = option;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Long getStyleHairId() {
		return styleHairId;
	}

	public void setStyleHairId(Long styleHairId) {
		this.styleHairId = styleHairId;
	}
	
}
