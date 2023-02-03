package com.UniversityCourseSelection.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.UniversityCourseSelection.entities.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff,Long> {
     public Optional<Staff> findBystaffName(@Param("name") String staffName);
}
