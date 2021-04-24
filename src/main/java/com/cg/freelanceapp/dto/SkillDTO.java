package com.cg.freelanceapp.dto;

public class SkillDTO {
	String name;
	String description;
	public SkillDTO(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	public SkillDTO() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
