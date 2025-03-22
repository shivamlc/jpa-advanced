package com.spring.boot.data.concepts.jpa_advanced.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.spring.boot.data.concepts.jpa_advanced.JpaAdvancedApplication;
import com.spring.boot.data.concepts.jpa_advanced.entity.Course;;

@SpringBootTest(classes = JpaAdvancedApplication.class)//runs test with specific springboot app context
public class CourseRepositoryTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    CourseRepository courseRepository;

    @Test
    public void whenAppIsRun_thenContextIsLoaded()
    {
        //first spring context loads
        //then this test is run
        //then context is killed

        logger.info("This test is running after spring context is loaded");

    }

    @Test
    public void whenCourseIdIsProvided_thenCourseNameIsReturned()
    {
       //arrange
       Long id= 1000l;

       // act
       Course course = courseRepository.findCourseById(id);

       //assert

        //left side is expected val, right side is actual val
       assertEquals("Spring boot jpa advanced concepts", course.getName());

    }
    
}
