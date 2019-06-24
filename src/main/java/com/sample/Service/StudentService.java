package com.sample.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.Entity.Course;
import com.sample.Entity.Student;
import com.sample.Repositary.CourseRepositary;
import com.sample.Repositary.StudentRepositary;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepositary studentRepo;
	
	@Autowired
	private CourseRepositary courseRepo;

	public Student saveStudent(Student student) {
		
		System.out.println("Student Object is" + student.toString());
		if(student != null) {
		student = 	studentRepo.save(student);
		}
		return student;
	}

	public Course saveStudentCourse(Course course) {
		if(course != null) {
			course = courseRepo.save(course);
		}
		return course;
	}

}
