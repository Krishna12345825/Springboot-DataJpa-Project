package com.krishna.service;

import java.util.List;

import com.krishna.model.EmployeeInfo;

public interface IEmployeeMgmtService {
	public String registerEmployee(EmployeeInfo info);

	public List<EmployeeInfo> getAllEmpDetails();

}
