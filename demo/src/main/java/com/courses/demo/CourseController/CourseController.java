package com.courses.demo.CourseController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.courses.demo.CourseService.CourseService;
import com.courses.demo.Data.Course;
import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/courses") 
    public List<Course> getCourses() {
        return courseService.getAllCourses();
    }
    
    @PostMapping("addcourse")
    public Course addCourse(@RequestParam String name, @RequestParam String description) {
        Course course = new Course(name, description);
        courseService.addCourse(course);
        return course;
    }
    
}
