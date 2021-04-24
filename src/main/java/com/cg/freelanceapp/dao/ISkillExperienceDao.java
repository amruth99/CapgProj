package com.cg.freelanceapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.freelanceapp.entities.SkillExperience;
import com.cg.freelanceapp.service.SkillExperienceImpl;

@Repository
public interface ISkillExperienceDao extends JpaRepository<SkillExperience, Long>{
	
}
