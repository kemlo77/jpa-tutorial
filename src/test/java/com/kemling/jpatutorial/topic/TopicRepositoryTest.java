package com.kemling.jpatutorial.topic;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.stream.StreamSupport;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class TopicRepositoryTest {

    @Autowired
    private TopicRepository topicRepository;

    @Test
    public void testFindAll() {
        Iterable<Topic> topics = topicRepository.findAll();
        long numberOfTopics = StreamSupport.stream(topics.spliterator(), false).count();
        assertEquals(2, numberOfTopics);
    }

}
