package com.courses.bestcourse.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.courses.bestcourse.entities.Courses;

public interface CourseDao extends JpaRepository<Courses, Long> {

}
