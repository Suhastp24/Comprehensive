package com.comprehensive.patient;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.comprehensive.patient.model.Patient;
import com.comprehensive.patient.repository.PatientRepository;

public class PatientRepositoryTest {
	
	@Autowired
	PatientRepository patientRepository;
	
	@Test
	public void getPatientTest() {
		Patient patient =patientRepository.findById(1L).get();
		
		Assertions.assertThat(patient.getPatientId()).isEqualTo(1L);
	}
	

}
