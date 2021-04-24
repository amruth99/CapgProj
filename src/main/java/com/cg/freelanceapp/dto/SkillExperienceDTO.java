package com.cg.freelanceapp.dto;

public class SkillExperienceDTO {

	Integer Years;
	Long skillId;
	Long freelancerId;
	public Integer getYears() {
		return Years;
	}
	public void setYears(Integer years) {
		Years = years;
	}
	public Long getSkillId() {
		return skillId;
	}
	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}
	public Long getFreelancerId() {
		return freelancerId;
	}
	public void setFreelancerId(Long freelancerId) {
		this.freelancerId = freelancerId;
	}
	public SkillExperienceDTO(Integer years, Long skillId, Long freelancerId) {
		super();
		Years = years;
		this.skillId = skillId;
		this.freelancerId = freelancerId;
	}
	public SkillExperienceDTO() {
		super();
	}
	
}
