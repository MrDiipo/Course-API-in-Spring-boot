package com.courseapi;

import com.courseapi.models.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            (new Topic("Spring", "Spring Framework", "Spring Framework Description")),
            (new Topic("Java", "Core Java", "Core Java Description")),
            (new Topic("Javascript", "Fluent JavaScript", "Javascript Description"))
    ));

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Optional<Topic> getTopic(String id) {
        return topicRepository.findById(id);
        //return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {

        //topics.add(topic);
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
      topicRepository.save(topic);}

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
            }
}
