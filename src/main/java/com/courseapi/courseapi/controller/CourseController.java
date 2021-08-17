package com.courseapi.courseapi.controller;

import com.courseapi.courseapi.CourseService;
import com.courseapi.courseapi.models.Course;
import com.courseapi.topicapi.models.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseService CourseService;

    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id){
        return CourseService.getAllCourses(id);
    }

    @RequestMapping("/topic/{topicId}/courses/{id}")
    public Optional<Course> getCourse(@PathVariable String id){
        return CourseService.getCourse(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/topic/{topicId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId){
        course.setTopic(new Topic(topicId, "", ""));
        CourseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topic/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String id,  @PathVariable String topicId){
        course.setTopic(new Topic(topicId, "", ""));
        CourseService.updateCourse(id, course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topic/{topicId}/courses/{id}")
    public void deleteCourse(@PathVariable String id, @PathVariable String topicId){
        CourseService.deleteCourse(id);
    }
}
