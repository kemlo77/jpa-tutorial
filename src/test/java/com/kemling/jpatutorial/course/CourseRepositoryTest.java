package com.kemling.jpatutorial.course;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.StreamSupport;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void findAllTest() {
        Iterable<Course> courses = courseRepository.findAll();
        long numberOfCourses = StreamSupport.stream(courses.spliterator(), false).count();
        assertEquals(3, numberOfCourses);
    }

    @Test
    public void findByTopicIdTest() {
        Iterable<Course> courses = courseRepository.findByTopicId("cesar");
        long numberOfCourses = StreamSupport.stream(courses.spliterator(), false).count();
        assertEquals(2, numberOfCourses);
    }

}
