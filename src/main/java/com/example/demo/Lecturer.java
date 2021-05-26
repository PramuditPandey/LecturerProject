package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Lecturer {
@Id
private int id;
private String name;
private String email;
private Long phonenumber;
public Lecturer() {
	super();
	// TODO Auto-generated constructor stub
}
public Lecturer(int id, String name, String email, Long phonenumber) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.phonenumber = phonenumber;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Long getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(Long phonenumber) {
	this.phonenumber = phonenumber;
}

}
