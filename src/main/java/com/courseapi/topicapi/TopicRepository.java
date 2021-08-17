package com.courseapi.topicapi;

import com.courseapi.topicapi.models.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends CrudRepository<Topic, String> {


    //getAllTopics()
    //getTopic(String id)
    //updateTopic(Topic t)
    //deleteTopic(Topic t)


}
