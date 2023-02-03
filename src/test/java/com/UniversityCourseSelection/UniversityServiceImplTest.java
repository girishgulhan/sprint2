package com.UniversityCourseSelection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import com.UniversityCourseSelection.entities.University;
import com.UniversityCourseSelection.exceptions.DuplicateUniversity;
import com.UniversityCourseSelection.repositories.UniversityRepository;
import com.UniversityCourseSelection.services.UniversityServiceImpl;

@ExtendWith(MockitoExtension.class)
public class UniversityServiceImplTest {
	@Mock
	private UniversityRepository uRepo;
	
	
	@InjectMocks
	private UniversityServiceImpl serviceMock;
	
	University university;
	
	List<University>  uList=new ArrayList<>();
	@BeforeEach
	public void setup() {
		uList.add(new University());//1
		uList.add(new University());//2
		serviceMock = new UniversityServiceImpl();
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	public void testGetallUniversity() {
		when(uRepo.findAll()).thenReturn(uList);
		assertEquals(uList, serviceMock.getAllUniversities());
		verify(uRepo,times(1)).findAll();
	}

}
