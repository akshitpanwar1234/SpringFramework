package com.Voys.JDBCTest.Model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Alien {
	private int Id;
	private String Name;
	private String tech;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}

	@Override
	public String toString() {
		return "Alien [Id=" + Id + ", Name=" + Name + ", tech=" + tech + "]";
	}
}
