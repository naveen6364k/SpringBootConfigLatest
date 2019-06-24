package com.sample.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.Entity.Course;
import com.sample.Entity.Student;
import com.sample.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentSerivce;

	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	public Student saveStudent(@RequestBody Student student) {

		System.out.println("-----------------------------------------------------Student Object inside the Service" + student.toString());
		Student response = studentSerivce.saveStudent(student);
		return response;
	}
	
	@RequestMapping(value = "/saveCourse" , method = RequestMethod.POST)
	public Course saveCourse(@RequestBody Course course) {
		
		Course response = studentSerivce.saveStudentCourse(course);
		
		return response;
	}

}
