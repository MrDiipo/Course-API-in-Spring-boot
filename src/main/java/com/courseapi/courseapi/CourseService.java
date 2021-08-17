package com.courseapi.courseapi;

import com.courseapi.courseapi.models.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository topicRepository;

    public List<Course> getAllCourses() {
        List<Course> courses = new ArrayList<>();
        topicRepository.findAll().forEach(courses::add);
        return courses;
    }

    public Optional<Course> getCourse(String id) {
        return topicRepository.findById(id);
        //return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }

    public void addCourse(Course course) {

        //topics.add(topic);
        topicRepository.save(course);
    }

    public void updateCourse(String id, Course course) {
      topicRepository.save(course);}

    public void deleteCourse(String id) {
        topicRepository.deleteById(id);
            }
}
