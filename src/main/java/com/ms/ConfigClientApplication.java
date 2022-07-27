package com.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ApplicationContext;

import com.ms.beans.Student;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
@RefreshScope
public class ConfigClientApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ConfigClientApplication.class, args);
		Student student = context.getBean(Student.class);
		log.info("Studet Data from Config Server: {}", student);
	}

}
