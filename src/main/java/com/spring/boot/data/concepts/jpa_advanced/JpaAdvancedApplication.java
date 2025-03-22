package com.spring.boot.data.concepts.jpa_advanced;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.boot.data.concepts.jpa_advanced.repository.CourseRepository;

@SpringBootApplication
public class JpaAdvancedApplication implements CommandLineRunner {

	@Autowired
	CourseRepository courseRepository;

	Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(JpaAdvancedApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("Finding course by id 1000l: {}", 
		courseRepository.findCourseById(1000l));
	}

}
