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
    public void testFindAll() {
        Iterable<Course> courses = courseRepository.findAll();
        long numberOfCourses = StreamSupport.stream(courses.spliterator(), false).count();
        assertEquals(1, numberOfCourses);
    }

}
