package com.UniversityCourseSelection.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.UniversityCourseSelection.entities.University;
import com.UniversityCourseSelection.exceptions.DuplicateUniversity;
import com.UniversityCourseSelection.exceptions.UniversityIdNotExist;
import com.UniversityCourseSelection.services.UniversityService;

@RestController
public class UniversityController {
	@Autowired
	private UniversityService uService;
	@GetMapping("/allUniversities")
	public ResponseEntity<List<University>> getAllUniversities() {
		List<University> list = uService.getAllUniversities();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@GetMapping("/getUniversityById/{Id}")
	public ResponseEntity<List<University>> getUniversityByCode(@RequestParam Long id) throws UniversityIdNotExist {
		Optional<University> str1 = uService.getUniversityByCode(id);
		return new ResponseEntity(str1, HttpStatus.OK);

	}

	@DeleteMapping("/deleteUniversityById/{id}")
	public String deleteUniversity(@RequestParam Long id) throws UniversityIdNotExist {
		uService.deleteUniversity(id);
		return "University Deleted SuccesFully";

	}

	@PutMapping("/updateUniversity")
	public University updateUniversity(@RequestBody University crs) throws UniversityIdNotExist {
		return uService.updateUniversity(crs);
	}
}
