package com.UniversityCourseSelection.exceptions;

import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class CentralizedExceptionHandler {
@ExceptionHandler(value = DuplicateStudentFirstName.class)
public ResponseEntity<String> DuplicateFirstName(DuplicateStudentFirstName user1){
		return new ResponseEntity<String>("FirstName Cant't be Empty!", HttpStatus.CONFLICT);
	}

@ExceptionHandler(value = StudentAlreadyExists.class)
public ResponseEntity<String> StudentAlreadyExits(StudentAlreadyExists user1){
		return new ResponseEntity<String>("Entered StudentId Already Exists!", HttpStatus.CONFLICT);
	}
@ExceptionHandler(value = DuplicateUniversity.class)
public ResponseEntity<String> DuplicateUniversity(DuplicateUniversity user1){
		return new ResponseEntity<String>("University Already Exists!", HttpStatus.CONFLICT);
	}

@ExceptionHandler(value = CourseAlreadyExists.class)
public ResponseEntity<String> CourseAlreadyExists(CourseAlreadyExists user1){
		return new ResponseEntity<String>("Course Already Exists!", HttpStatus.CONFLICT);
	}

@ExceptionHandler(value = StaffNotExist.class)
public ResponseEntity<String> DuplicateStaff(StaffNotExist user1){
		return new ResponseEntity<String>("Staff Not Exist!", HttpStatus.CONFLICT);
	}

@ExceptionHandler(value = CourseIdNotExist.class)
public ResponseEntity<String> CourseIdNotExist(CourseIdNotExist user1){
		return new ResponseEntity<String>("CourseId Not Exist!", HttpStatus.CONFLICT);
	}

@ExceptionHandler(value = StudentIdNotExist.class)
public ResponseEntity<String> StudentIdNotExist(StudentIdNotExist user1){
		return new ResponseEntity<String>("StudentId Not Exist!", HttpStatus.CONFLICT);
	}

@ExceptionHandler(value = UniversityIdNotExist.class)
public ResponseEntity<String> UniversityIdNotExist(UniversityIdNotExist user1){
		return new ResponseEntity<String>("UniversityId Not Exist!", HttpStatus.CONFLICT);
	}

@ExceptionHandler(value = AdminAlreadyExists.class)
public ResponseEntity<String> AdminAlreadyExists(AdminAlreadyExists user1){
		return new ResponseEntity<String>("Admin Can Login only once", HttpStatus.CONFLICT);
	}

@ExceptionHandler(value = CourseNameNotExist.class)
public ResponseEntity<String> CourseNameNotExist(CourseNameNotExist user1){
		return new ResponseEntity<String>("Course Name Not Found", HttpStatus.CONFLICT);
	}

@ExceptionHandler(value = {ConstraintViolationException.class,MethodArgumentNotValidException.class})
public ResponseEntity<String> handleViolation(Exception ee){
		return new ResponseEntity<String>(ee.getMessage(), HttpStatus.BAD_REQUEST);
	}

@ExceptionHandler(value = NoFeedBacks.class)
public ResponseEntity<String> NoFeedBacks(NoFeedBacks user1){
		return new ResponseEntity<String>("No FeedBack's", HttpStatus.CONFLICT);
	}
}
