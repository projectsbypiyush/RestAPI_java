package com.courses.bestcourse.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Courses {
	
	@Id
	private long courseId;
	private String courseName;
	private String courseDetails;
	public long getCourseId() {
		return courseId;
	}
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDesc() {
		return courseDetails;
	}
	public void setCourseDesc(String courseDesc) {
		this.courseDetails = courseDesc;
	}
	public Courses(long courseId, String courseName, String courseDesc) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDetails = courseDesc;
	}
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Courses [courseId=" + courseId + ", courseName=" + courseName + ", courseDetails=" + courseDetails + "]";
	}
	
	
	
}
