package com.kemling.jpatutorial.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

  @Autowired
  private TopicService topicService;

  @RequestMapping("/topics")
  public List<Topic> getAllTopics() {
    return topicService.getAllTopics();
  }

  @RequestMapping("/topics/{id}")
  public Topic getTopic(@PathVariable String id) {
    return topicService.getTopic(id);
  }

  @PostMapping("/topics")
  //@RequestMapping(method= RequestMethod.POST, value="/topics")
  public void addTopic(@RequestBody Topic topic) {
    topicService.addTopic(topic);
  }

  @PutMapping("/topics/{id}")
  //@RequestMapping(method= RequestMethod.PUT, value="/topics/{id}")
  public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
    topicService.updateTopic(topic,id);
  }

  @DeleteMapping("/topics/{id}")
  //@RequestMapping(method= RequestMethod.DELETE, value="/topics/{id}")
  public void deleteTopic(@PathVariable String id) {
    topicService.deleteTopic(id);
  }

}
