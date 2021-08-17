package com.courseapi.courseapi;

import com.courseapi.courseapi.models.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends CrudRepository<Course, String> {
    //getAllTopics()
    //getTopic(String id)
    //updateTopic(Topic t)
    //deleteTopic(Topic t)
    public List<Course> findByTopicId(String topicId);
}
