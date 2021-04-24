package com.cg.freelanceapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dao.IFreelancerDao;
import com.cg.freelanceapp.dao.ISkillDao;
import com.cg.freelanceapp.dao.ISkillExperienceDao;
import com.cg.freelanceapp.dto.SkillExperienceDTO;
import com.cg.freelanceapp.entities.Freelancer;
import com.cg.freelanceapp.entities.Skill;
import com.cg.freelanceapp.entities.SkillExperience;

@Service
public class SkillExperienceImpl implements ISkillExperienceService {
	
	
	@Autowired
	ISkillExperienceDao SkillExperienceDao;
	@Autowired
	ISkillDao skillDao;
	@Autowired
	IFreelancerDao freelancerDao;
	/**
	 * Method :SkillExperience
	 * Method
	 * @param skillExperienceDto
	 * @throws IdNotFoundException
	 * Description: This method creates a 
	 */
	
	@Override
	public SkillExperience addSkill(SkillExperienceDTO skillExperienceDto) {
		SkillExperience skillExperience= new SkillExperience();
		skillExperience.setYears(skillExperienceDto.getYears());
		skillExperience.setFreelancer(freelancerDao.findById(skillExperienceDto.getFreelancerId()).get());
		skillExperience.setSkill(skillDao.findById(skillExperienceDto.getSkillId()).get());
		return SkillExperienceDao.save(skillExperience);
	}

	@Override
	public void updateSkillYears(Long id, Integer Years) {
		 if(SkillExperienceDao.existsById(id)) {
			 SkillExperience skillExperience  = SkillExperienceDao.findById(id).get();
			 skillExperience.setYears(Years);
			 SkillExperienceDao.save(skillExperience);
		  }
	}
}
