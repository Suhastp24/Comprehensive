package com.comprehensive.patient.VO;

public class Doctor {
	

	private long doctorId;
	private String doctorName;
	private int doctorAge;
	private String doctorGender;
	private String doctorSpecialistFields;
	private int  noOfPatients;
	
	public Doctor() {
		
	}
	
	public Doctor(long doctorId, String doctorName, int doctorAge, String doctorGender,
			String doctorSpecialistFields, int noOfPatients) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorAge = doctorAge;
		this.doctorGender = doctorGender;
		this.doctorSpecialistFields = doctorSpecialistFields;
		this.noOfPatients=noOfPatients;
	}
	
	public long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public long getDoctorAge() {
		return doctorAge;
	}
	public void setDoctorAge(int doctorAge) {
		this.doctorAge = doctorAge;
	}
	public String getDoctorGender() {
		return doctorGender;
	}
	public void setDoctorGender(String doctorGender) {
		this.doctorGender = doctorGender;
	}
	public String getDoctorSpecialistFields() {
		return doctorSpecialistFields;
	}
	public void setDoctorSpecialistFields(String doctorSpecialistFields) {
		this.doctorSpecialistFields = doctorSpecialistFields;
	}
	public int getNoOfPatients() {
		return noOfPatients;
	}
	
	public void setNoOfPatients(int noOfPatients) {
		this.noOfPatients=noOfPatients;
	}
	
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", doctorAge=" + doctorAge + ", doctorGender=" + doctorGender
				+ ", doctoSpecialistFields=" + doctorSpecialistFields + ", noOfPatients=" + noOfPatients + ", getDoctorId()=" + getDoctorId()
				+ ", getDoctorName()=" + getDoctorName() + ", getDoctorAge()=" + getDoctorAge() + ", getDoctorGender()=" + getDoctorGender()
				+ ", getDoctorSpecialistFields()=" + getDoctorSpecialistFields() + ", getNoOfPatients()=" + getNoOfPatients()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
