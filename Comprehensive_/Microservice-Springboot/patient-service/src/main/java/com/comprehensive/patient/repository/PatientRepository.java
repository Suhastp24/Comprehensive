package com.comprehensive.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comprehensive.patient.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
