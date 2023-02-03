package com.UniversityCourseSelection.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.UniversityCourseSelection.entities.Staff;
import com.UniversityCourseSelection.exceptions.StaffNotExist;
import com.UniversityCourseSelection.services.StaffService;

@RestController
public class StaffController {

	@Autowired
	private StaffService staffService;

	@PostMapping("/saveStaff")
	public String saveStaff(@RequestBody Staff s) {
		Staff save = staffService.saveStaff(s);
		return "Staff data Saved Sucessfully";
	}

	@GetMapping("/getAllStaffs")
	public ResponseEntity<List<Staff>> getAllStaffEntity() {
		List<Staff> Staff = staffService.getAllStaff();
		return new ResponseEntity<List<Staff>>(Staff, HttpStatus.OK);
	}

	@GetMapping("/getStaffById/{Id}")
	public ResponseEntity<List<Staff>> getStaffId(@PathVariable Long Id) throws StaffNotExist {
		Optional<Staff> staff = staffService.getStaffById(Id);
		return new ResponseEntity(staff, HttpStatus.OK);
	}

	@DeleteMapping("/deleteById/{Id}")
	public String deleteCourse(@RequestParam Long Id) throws StaffNotExist {
		staffService.deleteStaffById(Id);
		return "deleted Student Data Sucessfully";
	}

	@PutMapping("/updateStaff")
	public Staff updatestaff(@RequestBody Staff s) {
		return staffService.updateStaffById(s);
	}

	// custom exception using userdefined Exception method
	@GetMapping("/getStaffByName/{staffName}")
	public Optional<Staff> getStaffByName(@PathVariable String staffName) throws StaffNotExist {
		Optional<Staff> list = staffService.StaffByName(staffName);
		return list;
	}
}
