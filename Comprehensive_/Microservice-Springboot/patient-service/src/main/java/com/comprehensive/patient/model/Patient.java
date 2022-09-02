package com.comprehensive.patient.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="patient")
public class Patient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long patientId;
	
	private String patientName;

	private String visitedDoctor;
	
	private int patientAge;
	
	@Temporal(TemporalType.DATE)
	private Date dateOfVisit=new Date();
	
	public Patient() {
		super();
	}
	
	

	public Patient(long patientId, String patientName, String visitedDoctor, int patientAge, Date dateOfVisit, long doctorId) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.visitedDoctor = visitedDoctor;
		this.patientAge=patientAge;
		this.dateOfVisit=dateOfVisit;
	}



	public long getPatientId() {
		return patientId;
	}

	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getVisitedDoctor() {
		return visitedDoctor;
	}

	public void setVisitedDoctor(String visitedDoctor) {
		this.visitedDoctor = visitedDoctor;
	}
	
	public int getPatientAge() {
		return patientAge;
	}
	
	public void setPatientAge(int patientAge) {
		this.patientAge=patientAge;
	}

	public Date getDateOfVisit() {
		return dateOfVisit;
	}

	public void setDateOfVisit(Date dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}

	@Override
	public String toString() {
		return "PatientDetails [patientId=" + patientId + ", patientName=" + patientName + ", visitedDoctor=" + visitedDoctor
				+ ", patientAge=" + patientAge + ", dateOfVisit=" + dateOfVisit + "]";
	}
  	

}
