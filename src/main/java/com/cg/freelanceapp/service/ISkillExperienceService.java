package com.cg.freelanceapp.service;

import com.cg.freelanceapp.dto.SkillExperienceDTO;
import com.cg.freelanceapp.entities.Freelancer;
import com.cg.freelanceapp.entities.Skill;
import com.cg.freelanceapp.entities.SkillExperience;

public interface ISkillExperienceService {
	
	public  void updateSkillYears(Long id, Integer Years);

	public SkillExperience addSkill(SkillExperienceDTO SkillExperienceDto);
}
