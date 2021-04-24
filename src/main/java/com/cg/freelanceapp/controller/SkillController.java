package com.cg.freelanceapp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.freelanceapp.dto.SkillDTO;
import com.cg.freelanceapp.entities.Skill;
import com.cg.freelanceapp.exceptions.IdAlreadyExistsException;
import com.cg.freelanceapp.exceptions.IdNotFoundException;
import com.cg.freelanceapp.service.ISkillService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/*
 * @author Amruth N
 * Description:
 * Created Date:19 April ,2021
 * Version : v1.0.0
 */
@Api("Skill Controller")
@RestController
@RequestMapping("/Skill30")
public class SkillController {
	@Autowired
	ISkillService SkillService;
	@ApiOperation(value = "Save a skill")
	@PostMapping("/SkillSave")
	public ResponseEntity<Object> saveskill(@RequestBody SkillDTO skillDto) {
		try {
			SkillService.save(skillDto);
			return new ResponseEntity<>("Skill Saved.", HttpStatus.OK);
}
		catch (IdAlreadyExistsException e) {
			throw new IdAlreadyExistsException("Skill already exists in database");
		}
	}
	@DeleteMapping(value = "/removeSkill/{id}")
	public ResponseEntity<Object> RemoveSkill(@PathVariable Long id) {
		try {
			SkillService.remove(id);
			return new ResponseEntity<>("Deleted Skill Successfully.", HttpStatus.OK);
}
		catch (IdNotFoundException e) {
			throw new IdNotFoundException("Cannot find skill with given id.");
		}
	}
	
	@PostMapping("/updateSkill/{id}")
	public ResponseEntity<Object> updateSkill(@PathVariable Long id, @RequestBody Skill skill) {
		try {
			SkillService.update(id,skill);
			return new ResponseEntity<>("Updated records successfully", HttpStatus.OK);
}
		 catch (IdNotFoundException e) {
				throw new IdNotFoundException("Cannot find skill with given id");
			}
		}
}
