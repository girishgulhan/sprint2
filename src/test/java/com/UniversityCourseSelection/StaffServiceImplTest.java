package com.UniversityCourseSelection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import com.UniversityCourseSelection.entities.Staff;
import com.UniversityCourseSelection.repositories.StaffRepository;
import com.UniversityCourseSelection.services.StaffServiceImpl;

@ExtendWith(MockitoExtension.class)
public class StaffServiceImplTest {
	@Mock
	private StaffRepository staffRepo;
	
	
	@InjectMocks
	private StaffServiceImpl serviceMock;
	
	Staff staff;
	
	List<Staff>  staffList=new ArrayList<>();
	@BeforeEach
	public void setup() {
		staffList.add(new Staff());//1
		staffList.add(new Staff());//2
		serviceMock = new StaffServiceImpl();
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	public void testSaveStaff() {
		when(staffRepo.save(staff)).thenReturn(staff);
		Staff res=serviceMock.saveStaff(staff);
		assertEquals(staff,res);
	}
	@Test
	public void testGetAllStaff() {
		when(staffRepo.findAll()).thenReturn(staffList);
		assertEquals(staffList, serviceMock.getAllStaff());
		verify(staffRepo,times(1)).findAll();
	}
    @Test
    public void testUpdateStaff() {
    	Staff s = new Staff(120, "bali", "principle");
    	when(staffRepo.save(any())).thenReturn(s);
    	Staff sch=serviceMock.updateStaffById(s);
    	Assertions.assertEquals(120, sch.getStaffId());
    }
}
