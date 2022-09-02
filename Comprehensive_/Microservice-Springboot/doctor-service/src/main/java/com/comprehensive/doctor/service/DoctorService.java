package com.comprehensive.doctor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comprehensive.doctor.model.Doctor;
import com.comprehensive.doctor.repository.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	    public Doctor addDoctor(Doctor doctor) {
	       return doctorRepository.save(doctor)	;
		}
		
	
		public Doctor getDoctorById(long doctorId) {
		 return doctorRepository.findByDoctorId(doctorId);
		}


		public Doctor getDoctorByName(String str) {
			Doctor doctor= doctorRepository.getDetailsByName(str);
			return doctor;
		}
		
		
		public Doctor incrementPatient(String str)
		{
			Doctor doctor= doctorRepository.getDetailsByName(str);
			int currentParient=doctor.getNoOfPatients();
			doctor.setNoOfPatients(currentParient+1);
			return doctorRepository.save(doctor);	
		}


		public List<Doctor> fetchAllDoctor() {
			return doctorRepository.findAll();
		}
		
	}

