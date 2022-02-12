package com.krishna.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.krishna.service.IEmployeeMgmtService;


@Component
public class CallingPLSQLProcedureTestRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeMgmtService service;
	
	
	@Override
	public void run(String... args) throws Exception {

		service.fetchEmpDetailsByDesgs("CLEARK", "MANAGER").forEach(emp->{
			System.out.println(emp);
		});
		
	}

}
