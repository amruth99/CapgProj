package com.cg.freelanceapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dao.ISkillDao;
import com.cg.freelanceapp.dto.SkillDTO;
import com.cg.freelanceapp.entities.Skill;
import com.cg.freelanceapp.exceptions.IdNotFoundException;

@Service
public class SkillImpl implements ISkillService {

	@Autowired
	ISkillDao SkillDao;
	
	/**
	 * Method :Skill
	 * Method
	 * @param skillDto
	 * @throws  IdNotFoundException
	 * Description: This method creates a 
	 */
	@Override
	public Skill save(SkillDTO skillDto) {
		Skill skill = new Skill();
		skill.setDescription(skillDto.getDescription());
		skill.setName(skillDto.getName());
		
		return SkillDao.save(skill);
	}

	@Override
	public Skill update(Long id, Skill skill) {
		if(SkillDao.existsById(id)) {
			return SkillDao.save(skill);
		}
		else {
			throw new IdNotFoundException();
		}

	}

	@Override
	public void remove(Long id) {
		if(SkillDao.existsById(id)) {
			SkillDao.deleteById(id);
		}
			else {
				throw new IdNotFoundException();
			}

}

	@Override
	public Skill findById(Long id) {
		return SkillDao.findById(id).get();
	}
}
