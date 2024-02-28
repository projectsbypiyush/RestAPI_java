package com.courses.bestcourse.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courses.bestcourse.dao.CourseDao;
import com.courses.bestcourse.entities.Courses;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	CourseDao courseDao;
	
	// private List<Courses> list;

	public CourseServiceImpl() {

//		list = new ArrayList<Courses>();
//		list.add(new Courses(1020,"Advanced Java","4 Months"));
//		list.add(new Courses(1021,"Core Python","2 Months"));
//		list.add(new Courses(1022,"Java SpringBoot","3 Months"));
	}

	@Override
	public List<Courses> getCourses() {
		
		return courseDao.findAll();
	}

	@Override
	public Courses getCourse(long courseId) {

//		Courses c=null;
//		for(Courses course:list) {
//			if(course.getCourseId()==courseId) {
//				c = course;
//				break;
//			}
//		}

		return courseDao.getOne(courseId);
	}

	public Courses addCourse(Courses course) {

//		Courses c = new Courses(course.getCourseId(),course.getCourseName(),course.getCourseDesc());
//		list.add(c);
		
		courseDao.save(course);
		return course;
	}

	public Courses updateCourse(Courses course) {

//		Courses updatedCourse=null;
//		int index=0;
//		for(Courses c:list) {
//			if(c.getCourseId()==course.getCourseId()) {
//				updatedCourse = course;
//				index=list.indexOf(c);
//				break;
//			}
//		}
//		list.add(updatedCourse);
//		list.remove(index);

		courseDao.save(course);
		return course;
	}

	public void deleteCourse(long courseId) {

//		Courses course=null;
//		int index=0;
//		for(Courses c:list) {
//			if(c.getCourseId() == courseId) {
//				index = list.indexOf(c);
//				course=c;
//				break;
//				
//			}
//		}
//		list.remove(index);
//		
//	}
		
		Courses entity = courseDao.getOne(courseId);
		courseDao.delete(entity);

	}
}
