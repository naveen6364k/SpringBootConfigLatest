package com.sample.Repositary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.Entity.Student;

@Repository
public interface StudentRepositary extends CrudRepository<Student, Long> {

}
