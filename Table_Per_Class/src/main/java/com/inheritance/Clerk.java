package com.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class Clerk extends Person{

	
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	
}
