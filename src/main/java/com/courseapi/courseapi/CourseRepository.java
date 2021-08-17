package com.courseapi.courseapi;

import com.courseapi.courseapi.models.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course, String> {


    //getAllTopics()
    //getTopic(String id)
    //updateTopic(Topic t)
    //deleteTopic(Topic t)


}
