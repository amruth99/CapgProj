package com.cg.freelanceapp.service;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dto.SkillDTO;
import com.cg.freelanceapp.entities.Skill;

@Service
public interface ISkillService {

	Skill save(SkillDTO skillDto);

	void remove(Long id);

	Skill update(Long id,Skill skill);
	
	Skill findById(Long id);

}
