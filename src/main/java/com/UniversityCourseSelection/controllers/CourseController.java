package com.UniversityCourseSelection.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.UniversityCourseSelection.entities.Course;
import com.UniversityCourseSelection.exceptions.CourseAlreadyExists;
import com.UniversityCourseSelection.exceptions.CourseIdNotExist;
import com.UniversityCourseSelection.exceptions.CourseNameNotExist;
import com.UniversityCourseSelection.exceptions.StaffNotExist;
import com.UniversityCourseSelection.services.CourseService;

@RestController
public class CourseController {
	@Autowired
	private CourseService courseService;

	@PostMapping("/saveCourse")
	public String saveCourse(@RequestBody Course cs) throws CourseAlreadyExists {
		Course str = courseService.saveCourse(cs);
		return "Course saved successfully.";
	}

	@GetMapping("/getAllCourses")
	public ResponseEntity<List<Course>> getAllCourse() {
		List<Course> crs = courseService.getAllCourse();
		return new ResponseEntity<List<Course>>(crs, HttpStatus.OK);

	}

	@GetMapping("/getCourseByName/{name}")
	public Optional<Course> getCourseByName(@PathVariable String crsName) throws CourseNameNotExist {
		Optional<Course> list = courseService.CourseByName(crsName);
		return list;
	}

	@GetMapping("/getCourse/{Id}")
	public ResponseEntity<List<Course>> getCourseById(@RequestParam Long id) throws CourseIdNotExist {
		Optional<Course> crs1 = courseService.getCourseById(id);
		return new ResponseEntity(crs1, HttpStatus.OK);

	}

	@DeleteMapping("/deleteCourse/{courseId}")
	public String deleteCourse(@RequestParam Long id) throws CourseIdNotExist {
		courseService.deleteCourse(id);
		return "Course Deleted SuccesFully";

	}

	@PutMapping("/updateCourse")
	public Course updateCourse(@RequestBody Course crs) throws CourseIdNotExist {
		return courseService.updateCourse(crs);
	}
}
