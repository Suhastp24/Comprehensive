package com.comprehensive.doctor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.comprehensive.doctor.model.Doctor;

@Repository
public interface DoctorRepository  extends JpaRepository<Doctor, Long>{
	
	@Query(value="select * from doctor where doctor_name=:str",nativeQuery = true)
	Doctor getDetailsByName(@Param("str") String str);
	

	Doctor findByDoctorId(Long doctorId);

}
