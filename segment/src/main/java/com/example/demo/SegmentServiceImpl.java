package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SegmentServiceImpl implements SegmentService {

	@Autowired
	private SegmentRepository s_repository;
	
	@Override
	public void save(Segment ref) {
		System.out.println(ref);
		s_repository.save(ref);
	}

	@Override
	public List<Segment> getAll() {
		// TODO Auto-generated method stub
		return s_repository.findAll();
	}

	@Override
	public Segment getStudent(String ManufacturingName) {
		// TODO Auto-generated method stub
		return s_repository.getStudent(ManufacturingName);
	}

}
