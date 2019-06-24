package com.sample.Repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.sample.Entity.Student;

@Repository
public interface StudentRepositary extends JpaRepository<Student, Long> {

	@Query("FROM Student s inner join Course c on s.courseIdRef = c.courseId")
	List<Student> findAllStudentList();

}
