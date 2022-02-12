package com.krishna.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.model.Employee;

@Service("empService")
public class EmployeeMgmtService implements IEmployeeMgmtService {
	
	@Autowired
	private EntityManager manager;

	@Override
	public List<Employee> fetchEmpDetailsByDesgs(String desg1, String desg2) {
		// create StoredProcedureQuery object types
		StoredProcedureQuery query = manager.createStoredProcedureQuery("P_GET_EMPS_BY_JOB", Employee.class);
		// register Parameters with JDBC types
		query.registerStoredProcedureParameter(1,String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2,String.class, ParameterMode.IN);
		// set values to IN Params
		query.setParameter(1,desg1);
		query.setParameter(2,desg2);
		// call the PL/SQL Procedure and get thr result
		List<Employee> list= query.getResultList();
		return list;
	}
	
	
	

}
