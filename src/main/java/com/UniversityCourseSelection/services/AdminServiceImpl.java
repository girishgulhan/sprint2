package com.UniversityCourseSelection.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UniversityCourseSelection.entities.Admin;
import com.UniversityCourseSelection.entities.Student;
import com.UniversityCourseSelection.entities.University;
import com.UniversityCourseSelection.exceptions.AdminAlreadyExists;
import com.UniversityCourseSelection.exceptions.DuplicateUniversity;
import com.UniversityCourseSelection.repositories.AdminRepository;
import com.UniversityCourseSelection.repositories.StudentRepository;
import com.UniversityCourseSelection.repositories.UniversityRepository;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminRepository adminRepo;
	@Autowired
	private StudentRepository studentRepo;
	@Autowired
	private UniversityRepository uRepo;

	@Override
	public Admin saveAdmin(Admin ad) throws AdminAlreadyExists {
		if (adminRepo.existsById(ad.getAdmin_Id()))
			throw new AdminAlreadyExists();
		return adminRepo.save(ad);
	}

	@Override
	public List<Admin> getAdmin() {
		return adminRepo.findAll();
	}

	@Override
	public String loginAdmin(Admin ad) {
		Optional<Admin> admin = adminRepo.findById(ad.getAdmin_Id());
		if (admin.isPresent()) {
			if (admin.get().getAdmin_Password().equals(ad.getAdmin_Password()))
				return "login successfull";
		}
		return "Invalid Id or Password";
	}
	@Override
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}

	@Override
	public University saveUniversity(University s) throws DuplicateUniversity {
		if (uRepo.existsById(s.getUniversityId()))
			throw new DuplicateUniversity();
		return uRepo.save(s);
	}
}
