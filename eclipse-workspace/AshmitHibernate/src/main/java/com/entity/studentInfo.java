package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class studentInfo {
	@Id
	int id;
	@Column
	String name;
	@Column
	int age;
	@Column
	String email;
	@Column
	int marks;
	@Column
	String phoneNumber;
	
	
	
	public studentInfo() {
	}
	
	public studentInfo(int id, String name, int age, String email, int marks, String phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.marks = marks;
		this.phoneNumber = phoneNumber;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "studentInfo [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", marks=" + marks
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
}
