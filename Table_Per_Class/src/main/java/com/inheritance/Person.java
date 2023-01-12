package com.inheritance;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
@DiscriminatorColumn(name= "PERSON",discriminatorType = DiscriminatorType.STRING)
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int person_id;
	
	int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
