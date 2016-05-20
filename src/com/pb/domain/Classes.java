package com.pb.domain;

import java.util.Set;

public class Classes {
	Integer id;
	String name;
	Set<Student> student;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Student> getStudent() {
		return student;
	}
	public void setStudent(Set<Student> student) {
		this.student = student;
	}
}
