package com.example.demo;

import java.util.List;

public interface SegmentService {

	
	void save(Segment ref);
	List<Segment> getAll();
	Segment getStudent(String ManufacturingName);
}
