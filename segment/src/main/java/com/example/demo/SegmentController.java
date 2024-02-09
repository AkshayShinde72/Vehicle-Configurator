package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SegmentController 
{
	@Autowired
	private SegmentService service;
	
	@PostMapping("/api/addStudent")
	public void saveStudent(@RequestBody Segment ref)
	{
		service.save(ref);
	}
	
	@GetMapping("/api/students")
	public List<Segment> getAllStudents()
	{
		return service.getAll();
	}
	@GetMapping("/api/student/{phonenumber}")
	public Segment getStudent(@PathVariable String phonenumber)
	{
		return service.getStudent(phonenumber); 
	}
}
