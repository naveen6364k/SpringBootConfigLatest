package com.sample.Repositary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.Entity.Course;

@Repository
public interface CourseRepositary extends CrudRepository<Course, Long>{

}
