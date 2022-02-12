package com.krishna.service;

import java.util.List;

import com.krishna.model.PersonInfo;

public interface IPersonInfoMgmtService {
	
	public String registerPErson(PersonInfo info);
	public List<PersonInfo> fetchAllPersonDetails();
	
	public PersonInfo fetchPersonDetailsById(int pid);

}
