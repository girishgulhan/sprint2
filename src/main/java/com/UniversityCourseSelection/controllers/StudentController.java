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

import com.UniversityCourseSelection.entities.Course;
import com.UniversityCourseSelection.entities.Student;
import com.UniversityCourseSelection.entities.FeedBack;
import com.UniversityCourseSelection.exceptions.DuplicateStudentFirstName;
import com.UniversityCourseSelection.exceptions.StudentAlreadyExists;
import com.UniversityCourseSelection.exceptions.StudentIdNotExist;
import com.UniversityCourseSelection.services.StudentFeedBackService;
import com.UniversityCourseSelection.services.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	@Autowired
	private StudentFeedBackService feedService;

	@PostMapping("/saveStudent")
	public String saveStudent(@RequestBody Student s) throws StudentAlreadyExists {
		Student stu = studentService.saveStudent(s);
		return "saved successfully";
	}

	@GetMapping("/getStudentById/{Id}")
	public ResponseEntity<List<Student>> getStudentById(@RequestParam Long id) throws StudentIdNotExist {
		Optional<Student> str1 = studentService.getStudentById(id);
		return new ResponseEntity(str1, HttpStatus.OK);

	}

	@DeleteMapping("/deleteStudentById/{id}")
	public String deleteCourse(@RequestParam Long id) throws StudentIdNotExist {
		studentService.deleteStudent(id);
		return "Student Deleted SuccesFully";

	}

	@PutMapping("/updateStudent")
	public Student updateStudent(@RequestBody Student crs) throws StudentIdNotExist{
		return studentService.updateStudent(crs);
	}

	@PostMapping("/giveFeedBack")
	public String giveFeedBack(@RequestBody  FeedBack s) {
		FeedBack stu = studentService.postFeedBack(s);
		return "FeedBack Posted Successfully";
	}
	/*
	 * @GetMapping("/getStudentByName") public Optional<Student>
	 * studentByName(@RequestParam String studentFirstName){ Optional<Student>
	 * stu=studentService.studentByName(studentFirstName); return stu;
	 * 
	 * }
	 */

}
