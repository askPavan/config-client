package com.ms.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Component
public class Student {
	
	@Value("${name}")
	private String name;
	@Value("${rollNo}")
	private String rollNo;
	@Value("${branch}")
	private String branch;
	@Value("${college}")
	private String college;
	

}
