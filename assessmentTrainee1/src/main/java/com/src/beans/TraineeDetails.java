package com.src.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TraineeDetails {
	@Id
	private int Id;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	private String name;
	private String location;
	private String domain;
	public TraineeDetails getById(int id2) {
		// TODO Auto-generated method stub
		this.Id=id2;
		return null;
	}
	public void register(TraineeDetails trainee) {
		// TODO Auto-generated method stub
		
	}
	public void modify(TraineeDetails trainee) {
		// TODO Auto-generated method stub
		
	}
}
