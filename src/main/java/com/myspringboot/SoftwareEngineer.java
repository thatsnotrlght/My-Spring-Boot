package com.myspringboot;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SoftwareEngineer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Auto Increments
	private Integer id;
	private String name;
	private String techStack;
	
	//Constructors
	public SoftwareEngineer() {
		
	}

	public SoftwareEngineer(Integer id, 
							String name, 
							String techStack) {
		this.id = id;
		this.name = name;
		this.techStack = techStack;
	}

	// Getters and Setters
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

	public String getTechStack() {
		return techStack;
	}

	public void setTechStack(String techStack) {
		this.techStack = techStack;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, techStack);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SoftwareEngineer other = (SoftwareEngineer) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(techStack, other.techStack);
	}
}
