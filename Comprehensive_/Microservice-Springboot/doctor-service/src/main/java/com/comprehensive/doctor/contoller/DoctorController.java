package com.comprehensive.doctor.contoller;


import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.comprehensive.doctor.model.Doctor;
import com.comprehensive.doctor.service.DoctorService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Doctor createDoctor(@RequestBody Doctor doctor) {
		return doctorService.addDoctor(doctor);
	}

	@GetMapping
	public List<Doctor> getAll() {
		return doctorService.fetchAllDoctor();
		
	}

	@GetMapping("/byname/{str}")
	public Doctor getOneDoctor(@PathVariable String str) {
		return doctorService.getDoctorByName(str);
	}
   
	//patient
	@GetMapping("/inc/{str}")
	public Doctor incPatiofdoc(@PathVariable String str) {
		return doctorService.incrementPatient(str);
	}

	
	
	 
}