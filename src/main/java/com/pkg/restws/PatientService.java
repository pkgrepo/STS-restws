package com.pkg.restws;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.pkg.restws.model.Patient;

@Path("/patientservice")
public interface PatientService {

	@Path("/patients")
	@GET
	List<Patient> getPatients();
	
	@Path("/patients/{ee}")
	@GET
	Patient getPatient(@PathParam(value = "ee") Long id);
	
	
}
