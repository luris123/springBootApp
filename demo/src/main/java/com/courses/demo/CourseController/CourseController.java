package com.courses.demo.CourseController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.courses.demo.Data.Course;
import java.util.List;

import javax.annotation.PostConstruct;

@RestController
public class CourseController {

    @PostConstruct

    @GetMapping
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/courses") 
    public List<Course> getCourses() {
        return List.of(new Course("Java", "Spring Boot"),
                new Course("Python", "Django"));
    }

    @PostMapping("addcourse")
    public Course addCourse(@RequestBody Course course) {
        return course;
    }
    
}
