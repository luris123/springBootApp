package com.courses.demo.CourseService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.courses.demo.Data.Course;

@Service
public class CourseService {
    private List<Course> courses = new ArrayList<>();

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getAllCourses() {
        return courses;
    }
    
}
