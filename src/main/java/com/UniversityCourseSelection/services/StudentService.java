package com.UniversityCourseSelection.services;

import java.util.Optional;
import com.UniversityCourseSelection.entities.Student;
import com.UniversityCourseSelection.entities.FeedBack;
import com.UniversityCourseSelection.exceptions.StudentAlreadyExists;
import com.UniversityCourseSelection.exceptions.StudentIdNotExist;

public interface StudentService {
    
	Student saveStudent(Student s) throws StudentAlreadyExists;

	Optional<Student> getStudentById(Long id) throws StudentIdNotExist;


	Student updateStudent(Student crs) throws StudentIdNotExist;

	void deleteStudent(Long id) throws StudentIdNotExist;

	FeedBack postFeedBack(FeedBack s);

	//Optional<Student> studentByName(String studentFirstName);

}
