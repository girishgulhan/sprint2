package com.UniversityCourseSelection.services;

import java.util.List;
import java.util.Optional;

import com.UniversityCourseSelection.entities.FeedBack;
import com.UniversityCourseSelection.exceptions.NoFeedBacks;

public interface StudentFeedBackService {

	Optional<FeedBack> getStudentFeedBackById(Long id) throws NoFeedBacks;

	List<FeedBack> getAllFeedBacks();

}
