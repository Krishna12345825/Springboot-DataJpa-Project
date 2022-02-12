package com.krishna.runner;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class PL_SQLProcedureCallRunner implements CommandLineRunner {

	@Autowired
	private EntityManager manager;
	
	@Override
	public void run(String... args) throws Exception {
// create StoredProcedureQuery object
		StoredProcedureQuery query = manager.createStoredProcedureQuery("PRO_AUTHENTICATION");
		// registered parameters  with java types
		query.registerStoredProcedureParameter(1,String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2,String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3,String.class, ParameterMode.OUT);

		// set Values to IN params
		query.setParameter(1,"RAJA");
		query.setParameter(2, "rani1");
		
		// Call PL/SQL Procedure 
		String result= (String) query.getOutputParameterValue(3);
		System.out.println("Authentication result::"+result);
	}// run(-)

}//class
