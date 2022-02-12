package com.krishna.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.krishna.model.Movie;

public class PL_SQLProcedureCallRunner implements CommandLineRunner {

	@Autowired
	private EntityManager manager;
	
	@Override
	public void run(String... args) throws Exception {
// create StoredProcedureQuery object representing the given PL/SQL Procedure
		StoredProcedureQuery query = manager.createStoredProcedureQuery("P_GET_MOVIES_BY_YEAR_RANGE",Movie.class);
		// registered parameters of PL/SQl procedure with java types
		query.registerStoredProcedureParameter(1,String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2,String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3,String.class, ParameterMode.REF_CURSOR);

		// set Values to IN params
		query.setParameter(1,"1900");
		query.setParameter(2, "2021");
		
		// Call PL/SQL Procedure and get the results
		List<Movie> list = query.getResultList();
		list.forEach(System.out::println);
	}// run(-)

}//class
