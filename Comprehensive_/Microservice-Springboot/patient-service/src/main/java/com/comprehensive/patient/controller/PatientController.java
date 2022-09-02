package com.comprehensive.patient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.comprehensive.patient.VO.Doctor;
import com.comprehensive.patient.model.Patient;
import com.comprehensive.patient.service.PatientService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private PatientService patientService;
	
	@PostMapping
	public Patient createDoctor(@RequestBody Patient patient) {
		String doctr = patient.getVisitedDoctor();
		restTemplate.getForObject("http://DOCTOR-SERVICE/doctor/new/" + doctr, Doctor.class);
		return patientService.addPatient(patient);
	}

	@GetMapping
	public List<Patient> getAll() {
		return patientService.fetchAllPatient();
	}

	@GetMapping("/{id}")
	public Patient getOneDoctor(@PathVariable long patientId){
		return patientService.getPatientById(patientId);
	}

}
