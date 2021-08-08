package com.courseapi;

import com.courseapi.models.Topic;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics =  Arrays.asList(
            (new Topic( "Spring", "Spring Framework", "Spring Framework Description")),
            (new Topic("Java", "Core Java", "Core Java Description")),
            (new Topic("Javascript", "Fluent JavaScript", "Javascript Description"))
    );

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }
}
