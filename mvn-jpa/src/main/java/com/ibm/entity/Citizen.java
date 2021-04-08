package com.ibm.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "citi")
public class Citizen {
	@EmbeddedId
	private Passport id;
	@Column(length = 30)
	private String name;
	
	public Passport getId() {
		return id;
	}
	public void setId(Passport id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Citizen{id:" + id + ",name:\"" + name + "\"}";
	}
}