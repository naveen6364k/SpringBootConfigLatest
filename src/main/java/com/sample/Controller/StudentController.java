package com.sample.Controller;

import java.util.ArrayList;
import java.util.List;

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

		Student response = studentSerivce.saveStudent(student);
		return response;
	}

	@RequestMapping(value = "/saveCourse", method = RequestMethod.POST)
	public Course saveCourse(@RequestBody Course course) {

		Course response = studentSerivce.saveStudentCourse(course);

		return response;
	}

	 
   /**
    * 
    * @return AllStudentList
    */
	@RequestMapping(value="/getAllStudents", method = RequestMethod.GET)
	public List<Student> getAllStudent() {
		List<Student> student = new ArrayList<Student>();
		student = studentSerivce.getAllStudent();
		return student;

	}
}
