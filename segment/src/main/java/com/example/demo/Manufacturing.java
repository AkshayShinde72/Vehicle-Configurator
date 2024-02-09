package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ManufacturingMaster")
public class Manufacturing {

	private int ManufacturingId;
	private String ManufacturingName;
	/**
	 * @return the manufacturingId
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ManufacturingId")
	public int getManufacturingId() {
		return ManufacturingId;
	}
	/**
	 * @param manufacturingId the manufacturingId to set
	 */
	public void setManufacturingId(int manufacturingId) {
		ManufacturingId = manufacturingId;
	}
	/**
	 * @return the manufacturingName
	 */
	@Column(name = "ManufacturingName", nullable = false, length=10)
	public String getManufacturingName() {
		return ManufacturingName;
	}
	/**
	 * @param manufacturingName the manufacturingName to set
	 */
	public void setManufacturingName(String manufacturingName) {
		ManufacturingName = manufacturingName;
	}
	
	
	
	
}
