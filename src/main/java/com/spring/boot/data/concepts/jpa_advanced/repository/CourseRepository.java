package com.spring.boot.data.concepts.jpa_advanced.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.boot.data.concepts.jpa_advanced.entity.Course;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional// should be used whenever we need to change data
public class CourseRepository {

    @Autowired
    EntityManager entityManager;

    public Course findCourseById(Long id){
        return entityManager.find(Course.class, id);
    }

    public boolean deleteCourseById(Long id){
        Course courseToDelete = findCourseById(id);
        if(null != courseToDelete){
        entityManager.remove(courseToDelete);
        return true;
        }
        return false;
    }
}
