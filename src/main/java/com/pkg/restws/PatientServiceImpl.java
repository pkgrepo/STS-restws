package com.pkg.restws;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.pkg.restws.model.Patient;

@Service
public class PatientServiceImpl implements PatientService {
	
	Map<Long,Patient> patients = new HashMap<>();
	long currentId = 123;
	
	
	public PatientServiceImpl() {
		init();
	}
	
	void init() {
		Patient patient = new Patient();
		patient.setId(currentId);
		patient.setName("Prashant");
		patients.put(patient.getId(), patient);
	}
	
}
