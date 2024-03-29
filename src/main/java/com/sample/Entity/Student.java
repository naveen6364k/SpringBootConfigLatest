package com.sample.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 
 * @author Naveen Kumar
 *
 */
@Entity
@Table(name = "student")
@SequenceGenerator(name = "student_id_seq", initialValue = 1)
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_id_seq")
	@Column(name = "student_id")
	private Long id;

	@Column(name = "Student_name")
	private String name;

	@Column(name = "course_name")
	private String courseName;

	@Column(name = "course_id_ref")
	private int courseIdRef;

	@OneToOne
	@JoinColumn
	private Course course;

	public int getCourseId() {
		return courseIdRef;
	}

	public void setCourseId(int courseIdRef) {
		this.courseIdRef = courseIdRef;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
