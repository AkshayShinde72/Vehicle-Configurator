package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface SegmentRepository extends JpaRepository<Segment,Integer>{

	@Query(value="select * from SegmentMaster  where SegmentId in(select SegmentId from ManufacturingMaster where Manufacturing_Name=:ManufacturingName)",nativeQuery = true)
	Segment getStudent(@Param("ManufacturingName")String ManufacturingName);
}
