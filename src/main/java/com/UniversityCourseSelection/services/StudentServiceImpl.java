package com.UniversityCourseSelection.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UniversityCourseSelection.entities.Student;
import com.UniversityCourseSelection.entities.FeedBack;
import com.UniversityCourseSelection.exceptions.StudentAlreadyExists;
import com.UniversityCourseSelection.exceptions.StudentIdNotExist;
import com.UniversityCourseSelection.repositories.StudentFeedBackRepository;
import com.UniversityCourseSelection.repositories.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepo;
	@Autowired
	private StudentFeedBackRepository feedRepo;

	@Override
	public Student saveStudent(Student s) throws StudentAlreadyExists {
		if (studentRepo.existsById(s.getStudentId()))
			throw new StudentAlreadyExists();
		return studentRepo.save(s);
	}

	@Override
	public Optional<Student> getStudentById(Long id) throws StudentIdNotExist {
		if(!studentRepo.existsById(id))
			throw new StudentIdNotExist();
		Optional<Student> stu = studentRepo.findById(id);
		return stu;

	}

	@Override
	public void deleteStudent(Long Id) throws StudentIdNotExist{
		if(!studentRepo.existsById(Id))
			throw new StudentIdNotExist();
		studentRepo.deleteById(Id);

	}

	@Override
	public Student updateStudent(Student str) throws StudentIdNotExist {
		if(!studentRepo.existsById(str.getStudentId())){
			throw new StudentIdNotExist();
		}
		return studentRepo.save(str);
	}

	@Override
	public FeedBack postFeedBack(FeedBack s) {
		
		return feedRepo.save(s);
	}

	/*
	 * @Override public Optional<Student> studentByName(String studentFirstName) {
	 * Optional<Student> stu=studentRepo.findStudentByFirstName(studentFirstName);
	 * return stu; }
	 */

}
