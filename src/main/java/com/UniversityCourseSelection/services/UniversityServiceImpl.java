package com.UniversityCourseSelection.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UniversityCourseSelection.entities.University;
import com.UniversityCourseSelection.exceptions.UniversityIdNotExist;
import com.UniversityCourseSelection.repositories.UniversityRepository;

@Service
public class UniversityServiceImpl implements UniversityService {
	@Autowired
	private UniversityRepository uRepo;

	@Override
	public List<University> getAllUniversities() {
		return uRepo.findAll();
	}

	@Override
	public Optional<University> getUniversityByCode(Long id) throws UniversityIdNotExist {
		if(!uRepo.existsById(id))
			throw new UniversityIdNotExist();
		return uRepo.findById(id);
	}

	@Override
	public void deleteUniversity(Long id) throws UniversityIdNotExist {
		if(!uRepo.existsById(id))
			throw new UniversityIdNotExist();
		uRepo.deleteById(id);

	}

	@Override
	public University updateUniversity(University crs) throws UniversityIdNotExist{
		if(!uRepo.existsById(crs.getUniversityId())) {
			throw new UniversityIdNotExist();
		}
		return uRepo.save(crs);
	}

}
