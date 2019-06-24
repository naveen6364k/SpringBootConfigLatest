package com.sample.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.Entity.Course;

@Repository
public interface CourseRepositary extends JpaRepository<Course, Long>{

}
