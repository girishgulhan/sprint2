package com.UniversityCourseSelection.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UniversityCourseSelection.entities.FeedBack;
import com.UniversityCourseSelection.exceptions.NoFeedBacks;
import com.UniversityCourseSelection.repositories.StudentFeedBackRepository;

@Service
public class StudentFeedBackServiceImpl implements StudentFeedBackService {
	@Autowired
	private StudentFeedBackRepository feedRepo;

	@Override
	public Optional<FeedBack> getStudentFeedBackById(Long id) throws NoFeedBacks {
		if(!feedRepo.existsById(id))
			throw new NoFeedBacks();
		return feedRepo.findById(id);
	}

	@Override
	public List<FeedBack> getAllFeedBacks(){
		return feedRepo.findAll();
	}
}
