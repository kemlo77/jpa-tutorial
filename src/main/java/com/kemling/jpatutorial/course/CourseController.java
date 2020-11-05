package com.kemling.jpatutorial.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {

  @Autowired
  private CourseService courseService;

  @RequestMapping("/topics/{topicId}/courses")
  public List<Course> getAllCourses(@PathVariable String topicId) {
    // return courseService.getAllCourses(topicId);
    return new ArrayList<Course>();
  }

  @RequestMapping("/topics/{topicId}/courses/{courseId}")
  public Course getCourse(@PathVariable String courseId) {
    return courseService.getCourse(courseId);
  }

  @PostMapping("/topics/{topicId}/courses")
  public void addCourse(@PathVariable String topicId, @RequestBody Course course) {
    courseService.addCourse(course, topicId);
  }

  @PutMapping("/topics/{topicId}/courses/{courseId}")
  public void updateCourse(@PathVariable String topicId,
      @PathVariable String courseId, @RequestBody Course course) {
    courseService.updateCourse(topicId, topicId, course);
  }

  @DeleteMapping("topics/{topicId}/courses/{courseId}")
  public void deleteCoursse(@PathVariable String courseId) {
    courseService.deleteCourse(courseId);
  }

}
