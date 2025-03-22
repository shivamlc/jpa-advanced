package com.spring.boot.data.concepts.jpa_advanced.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.boot.data.concepts.jpa_advanced.entity.Course;
import jakarta.persistence.EntityManager;

@Repository
public class CourseRepository {

    @Autowired
    EntityManager entityManager;

    public Course findCourseById(Long id){
        return entityManager.find(Course.class, id);
    }

}
