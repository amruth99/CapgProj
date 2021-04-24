package com.cg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.freelanceapp.dto.SkillDTO;
import com.cg.freelanceapp.entities.Skill;
import com.cg.freelanceapp.service.ISkillService;

@SpringBootTest
class JobPortalSkillExpApplicationTests {

	@Autowired
	ISkillService skillService;
	@Autowired
	Skill skill;
	@Test
	void Test1() {
		Long id = skill.getId() ;
		SkillDTO skilldto = new SkillDTO("java", "java skill");
		skillService.save(skilldto);
		System.out.println(skillService.findById(id).getName());
		assertEquals("java", skillService.findById(id).getName());
		
	}

}
