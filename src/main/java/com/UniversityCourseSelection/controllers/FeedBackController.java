package com.UniversityCourseSelection.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.UniversityCourseSelection.entities.FeedBack;
import com.UniversityCourseSelection.exceptions.NoFeedBacks;
import com.UniversityCourseSelection.services.StudentFeedBackService;

@RestController
public class FeedBackController {
	@Autowired
	private StudentFeedBackService feedService;
	
	@GetMapping("/getStudentFeedBack/{feedBackId}")
	public ResponseEntity<List<FeedBack>> getFeedBackById(@RequestParam Long id) throws NoFeedBacks  {
		Optional<FeedBack> str1 = feedService.getStudentFeedBackById(id);
		return new ResponseEntity(str1, HttpStatus.OK);
	}
	
	@GetMapping("/getAllStudentFeedBacks")
	public ResponseEntity<List<FeedBack>> getAllFeedBacks(){
		List<FeedBack> list = feedService.getAllFeedBacks();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
}
