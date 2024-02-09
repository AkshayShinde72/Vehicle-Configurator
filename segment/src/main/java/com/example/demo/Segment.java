package com.example.demo;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="SegmentMaster")
public class Segment {

	private int SegmentId;
	private String SegmentName;
	
	private Set<Manufacturing> SegmentManufacturers;
	
    public Segment() {
		
	}
	
	public Segment(int segmentId, String segmentName, Set<Manufacturing> segmentManufacturers) {
		super();
		SegmentId = segmentId;
		SegmentName = segmentName;
		SegmentManufacturers = segmentManufacturers;
	}

	/**
	 * @return the segmentId
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "SegmentId")
	public int getSegmentId() {
		return SegmentId;
	}
	/**
	 * @param segmentId the segmentId to set
	 */
	public void setSegmentId(int segmentId) {
		SegmentId = segmentId;
	}
	/**
	 * @return the segmentName
	 */
	@Column(name = "SegmentName", length = 100)
	public String getSegmentName() {
		return SegmentName;
	}
	/**
	 * @param segmentName the segmentName to set
	 */
	public void setSegmentName(String segmentName) {
		SegmentName = segmentName;
	}
	@Override
	public String toString() {
		return "Segment [SegmentId=" + SegmentId + ", SegmentName=" + SegmentName + "]";
	}

	/**
	 * @return the segmentManufacturers
	 */
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "SegmentId", referencedColumnName="SegmentId")
	public Set<Manufacturing> getSegmentManufacturers() {
		return SegmentManufacturers;
	}

	/**
	 * @param segmentManufacturers the segmentManufacturers to set
	 */

	public void setSegmentManufacturers(Set<Manufacturing> segmentManufacturers) {
		SegmentManufacturers = segmentManufacturers;
	}
	
	
	
	
	
}
