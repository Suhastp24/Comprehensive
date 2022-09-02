package com.comprehensive.doctor;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.comprehensive.doctor.model.Doctor;
import com.comprehensive.doctor.repository.DoctorRepository;

@DataJpaTest
public class DoctorRepositoryTests {
	
	@Autowired 
	private DoctorRepository doctorRepository;
	
	
	
	
	

}
