package com.UniversityCourseSelection.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UniversityCourseSelection.entities.FeedBack;

public interface StudentFeedBackRepository extends JpaRepository<FeedBack, Long> {

}
