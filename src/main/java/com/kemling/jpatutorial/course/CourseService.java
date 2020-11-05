package com.kemling.jpatutorial.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

  @Autowired
  private CourseRepository courseRepository;


  public List<Course> getAllCourses() {
    List<Course> courses = new ArrayList<>();
    courseRepository.findAll().forEach(courses::add);
    return courses;
  }

  public Course getCourse(String id) {
    return courseRepository.findById(id).orElse(null);
    //500 om posten inte finns
  }

  public void addCourse(Course course, String topicId) {
    courseRepository.save(course);
    //TODO: se till att kursen sparas på en topic
  }

  public void updateCourse(String topicId, String courseId, Course course) {
    courseRepository.save(course);
    //TODO: se till att kursen uppdateras på en topic
    // lägger till om posten inte finns
  }

  public void deleteCourse(String id) {
    courseRepository.deleteById(id);
    //500 om posten inte finns
  }
}
