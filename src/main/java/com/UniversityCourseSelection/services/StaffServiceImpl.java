package com.UniversityCourseSelection.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UniversityCourseSelection.entities.Staff;
import com.UniversityCourseSelection.exceptions.StaffNotExist;
import com.UniversityCourseSelection.repositories.StaffRepository;

@Service
public class StaffServiceImpl implements StaffService {
	@Autowired
	private StaffRepository stRepo;

	@Override
	public Staff saveStaff(Staff s) {
		return stRepo.save(s);
	}

	// Custom named Query Exception
	@Override
	public Optional<Staff> StaffByName(String staffName) throws StaffNotExist {
		if (stRepo.findBystaffName(staffName).isEmpty())
			throw new StaffNotExist();
		Optional<Staff> list = stRepo.findBystaffName(staffName);
		return list;
	}

	@Override
	public List<Staff> getAllStaff() {
		List<Staff> staff = stRepo.findAll();
		return staff;
	}

	@Override
	public Optional<Staff> getStaffById(Long Id) throws StaffNotExist {
		if (!stRepo.existsById(Id))
			throw new StaffNotExist();
		Optional<Staff> staff = stRepo.findById(Id);
		return staff;
	}

	@Override
	public Staff updateStaffById(Staff s) {
		Staff staff = stRepo.save(s);
		return staff;
	}

	@Override
	public void deleteStaffById(Long Id) throws StaffNotExist {
		if (!stRepo.existsById(Id))
			throw new StaffNotExist();
		stRepo.deleteById(Id);
	}

}
