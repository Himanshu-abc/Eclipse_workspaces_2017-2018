package com.app.bean_and_controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestApiController {

	@RequestMapping(value="/Students", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Student> getStudentList(){
	
		Student s1=new Student();
		s1.setName("The Great Khali");
		
		Student s2=new Student();
		s2.setName("The Undertaker");
		
		Student s3=new Student();
		s3.setName("John Cena");
		
		List<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		return list;
	}

	//retrieve a record
	
	@RequestMapping(value="/Students/{name}",method=RequestMethod.GET)
	public Student getStudent(@PathVariable("name") String name) {
		
		Student s=new Student();
		s.setName(name);
		s.setHobby("WWE");
		
		return s;
	}
	
	// update a record
	
	@RequestMapping(value="/Students/{name}",method=RequestMethod.PUT,consumes=MediaType.APPLICATION_XML_VALUE)
	public boolean updateStudent(@PathVariable("name") String name,@RequestBody Student s) {
		
		System.out.println(name);
		System.out.println("Student Name : "+s.getName()+" Student Hobby : "+s.getHobby());
		
		//fetching record from database with given name
		//updating record in database with given name
		
		return true;
	}
}
