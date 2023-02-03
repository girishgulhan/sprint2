package com.UniversityCourseSelection.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UniversityCourseSelection.entities.University;

@Repository
public interface UniversityRepository extends JpaRepository<University,Long>{

}
