package com.UniversityCourseSelection.services;

import java.util.List;
import java.util.Optional;
import com.UniversityCourseSelection.entities.University;
import com.UniversityCourseSelection.exceptions.UniversityIdNotExist;

public interface UniversityService {

	List<University> getAllUniversities();

	Optional<University> getUniversityByCode(Long id) throws UniversityIdNotExist;

	void deleteUniversity(Long id) throws UniversityIdNotExist;

	University updateUniversity(University crs) throws UniversityIdNotExist;
}
