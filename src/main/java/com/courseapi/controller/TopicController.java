package com.courseapi.controller;

import com.courseapi.models.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                (new Topic( "Spring", "Spring Framework", "Spring Framework Description")),
                (new Topic("Java", "Core Java", "Core Java Description")),
                (new Topic("Javascript", "Fluent JavaScript", "Javascript Description"))
        );
    }
}
