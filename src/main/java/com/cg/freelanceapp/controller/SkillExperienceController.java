package com.cg.freelanceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.freelanceapp.dto.SkillExperienceDTO;
import com.cg.freelanceapp.entities.SkillExperience;
import com.cg.freelanceapp.exceptions.IdAlreadyExistsException;
import com.cg.freelanceapp.exceptions.IdNotFoundException;
import com.cg.freelanceapp.service.ISkillExperienceService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/*
* @author Amruth N
* Description:
* Created Date:21 April ,2021
* Version : v1.0.0
*/
@Api("SkillExperience Controller")
@RestController
@RequestMapping("/SkillExperience")
public class SkillExperienceController {

	@Autowired
	ISkillExperienceService SkillExperienceService;
	@ApiOperation(value = "Add skill")
	@PostMapping("/AddSkill")
	public ResponseEntity<Object> Addskill(@RequestBody SkillExperienceDTO skillexperienceDto) {
		try {
			 SkillExperienceService.addSkill(skillexperienceDto);
			 return new ResponseEntity<>("Skill Saved.", HttpStatus.OK);
}
		catch (IdAlreadyExistsException e) {
			throw new IdAlreadyExistsException("SkillExperience id already exists in database");
		}
}

	@PutMapping("/updateSkillYears/{id}")
	public ResponseEntity<Object> updateSkillYears(@PathVariable Long id,@PathVariable Integer Years, @RequestBody SkillExperience skillexperience) {
		try {
			SkillExperienceService.updateSkillYears(id, Years);
			return new ResponseEntity<>("Updated records successfully", HttpStatus.OK);
		}
				 catch (IdNotFoundException e) {
						throw new IdNotFoundException("Cannot find skillExperience with given id");
					}
				}
}