package com.UniversityCourseSelection.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UniversityCourseSelection.entities.Admin;
import com.UniversityCourseSelection.entities.Student;
import com.UniversityCourseSelection.entities.University;
import com.UniversityCourseSelection.exceptions.AdminAlreadyExists;
import com.UniversityCourseSelection.exceptions.DuplicateUniversity;
import com.UniversityCourseSelection.services.AdminService;

@RestController
public class AdminController {
	@Autowired
	private AdminService adminService;

	@PostMapping("/saveAdmin")
	public String saveAdmin(@RequestBody Admin ad) throws AdminAlreadyExists {
		Admin saveAdmin = adminService.saveAdmin(ad);
		return "Admin credential saved successfully";
	}

	@PostMapping("/loginAdmin")
	public ResponseEntity<String> loginAdmin(@RequestBody Admin ad) {
		String s = adminService.loginAdmin(ad);
		return new ResponseEntity<>(s, HttpStatus.OK);
	}
	@PostMapping("/saveUniversity")
	public String saveStudent(@RequestBody University s) throws DuplicateUniversity {
		University stu = adminService.saveUniversity(s);
		return "University saved successfully";
	}
	@GetMapping("/allStudents")
	public ResponseEntity<List<Student>> getAllStudents() {
		List<Student> list = adminService.getAllStudents();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
}
