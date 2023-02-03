package com.UniversityCourseSelection.services;

import java.util.List;
import java.util.Optional;

import com.UniversityCourseSelection.entities.Staff;
import com.UniversityCourseSelection.exceptions.StaffNotExist;

public interface StaffService {

	Staff saveStaff(Staff s);

	List<Staff> getAllStaff();

	Optional<Staff> getStaffById(Long id) throws StaffNotExist;

	void deleteStaffById(Long id) throws StaffNotExist;

	Staff updateStaffById(Staff s);

	Optional<Staff> StaffByName(String staffName) throws StaffNotExist;


}
