package com.comprehensive.patient.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.comprehensive.patient.VO.Doctor;
import com.comprehensive.patient.model.Patient;
import com.comprehensive.patient.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository patientRepository;
	
	   public Patient addPatient(Patient patient) {
	       return patientRepository.save(patient)	;
		}
			
		public List<Patient> fetchAllPatient() {
			return patientRepository.findAll();
		}
		
		public Patient getPatientById(long patientId) {
		 return patientRepository.findById(patientId).get();
		}
		
	}
