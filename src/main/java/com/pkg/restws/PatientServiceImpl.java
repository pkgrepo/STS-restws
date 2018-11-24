package com.pkg.restws;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
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

	@Override
	public List<Patient> getPatients() {
		Collection<Patient> tempList= patients.values();
		List<Patient> response = new ArrayList<>(tempList);
		return response;
	}

	@Override
	public Patient getPatient(Long id) {
		return patients.get(id);
	}
	
}
