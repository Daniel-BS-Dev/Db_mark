package com.db_mark.demo.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.db_mark.demo.enums.TypeUser;

@Entity
@Table(name = "tb_hairdresser")
public class Hairdresser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name_user;
	private TypeUser type_user;
	private Date dayoff;
	private Date start_work;
	private Date finished_work;
	private Date hour_meal;
	
	@OneToMany(mappedBy="hairdresser")
	private List<Haircut> haircuts = new ArrayList<>();
	
	public Hairdresser() {}
	
	public Hairdresser(Long id, String name_user, TypeUser type_user, Date dayoff, Date start_work, Date finished_work, Date hour_meal) {
		this.id = id;
		this.name_user = name_user;
		this.type_user = type_user;
		this.dayoff = dayoff;
		this.start_work = start_work;
		this.finished_work = finished_work;
		this.hour_meal = hour_meal;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName_user() {
		return name_user;
	}

	public void setName_user(String name_user) {
		this.name_user = name_user;
	}

	public TypeUser getType_user() {
		return type_user;
	}

	public void setType_user(TypeUser type_user) {
		this.type_user = type_user;
	}

	public Date getDayoff() {
		return dayoff;
	}

	public void setDayoff(Date dayoff) {
		this.dayoff = dayoff;
	}

	public Date getStart_work() {
		return start_work;
	}

	public void setStart_work(Date start_work) {
		this.start_work = start_work;
	}

	public Date getFinished_work() {
		return finished_work;
	}

	public void setFinished_work(Date finished_work) {
		this.finished_work = finished_work;
	}

	public Date getHour_meal() {
		return hour_meal;
	}

	public void setHour_meal(Date hour_meal) {
		this.hour_meal = hour_meal;
	}

	public List<Haircut> getHaircuts() {
		return haircuts;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hairdresser other = (Hairdresser) obj;
		return Objects.equals(id, other.id);
	}
}