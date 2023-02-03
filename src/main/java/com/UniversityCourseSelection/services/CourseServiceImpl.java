package com.UniversityCourseSelection.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.UniversityCourseSelection.entities.Course;
import com.UniversityCourseSelection.exceptions.CourseAlreadyExists;
import com.UniversityCourseSelection.exceptions.CourseIdNotExist;
import com.UniversityCourseSelection.exceptions.CourseNameNotExist;
import com.UniversityCourseSelection.repositories.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseRepository courseRepo;

	@Override
	public Course saveCourse(Course cs) throws CourseAlreadyExists {
		if (courseRepo.existsById(cs.getCourseId()))
			throw new CourseAlreadyExists();
		return courseRepo.save(cs);
	}

	@Override
	public List<Course> getAllCourse() {
		return courseRepo.findAll();
	}

	@Override
	public Optional<Course> getCourseById(Long id) throws CourseIdNotExist {
		if(!courseRepo.existsById(id))
			throw new CourseIdNotExist();
		Optional<Course> emp = courseRepo.findById(id);
		return emp;
	}

	@Override
	public void deleteCourse(Long courseId) throws CourseIdNotExist {
		if(!courseRepo.existsById(courseId))
			throw new CourseIdNotExist();
		courseRepo.deleteById(courseId);

	}

	@Override
	public Course updateCourse(Course crs) throws CourseIdNotExist {
		if(!courseRepo.existsById(crs.getCourseId())) {
			throw new CourseIdNotExist();
		}
		return courseRepo.save(crs);
	}

	@Override
	public Optional<Course> CourseByName(String crsName) throws CourseNameNotExist {
		if (courseRepo.findByCourseName(crsName).isEmpty())
			throw new CourseNameNotExist();
		Optional<Course> list = courseRepo.findByCourseName(crsName);
		return list;
	}

	
}
