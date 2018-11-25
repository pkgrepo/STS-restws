package com.pkg.restws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.pkg.restws.model.Patient;

@Consumes("application/xml,application/json")
@Produces("application/xml,application/json")
@Path("/patientservice")
public interface PatientService {

	@Path("/patients")
	@GET
	List<Patient> getPatients();
	
	@Path("/patients/{ee}")
	@GET
	Patient getPatient(@PathParam(value = "ee") Long id);
	
	@Path("/patients")
	@POST
	Response createPatient(Patient pat);
	
	@Path("/patients")
	@PUT
	Response updatePatient(Patient pat);
	
	@Path("/patients/{ee}")
	@DELETE
	Response deletePatient(@PathParam(value = "ee") Long id);
	
	
}
