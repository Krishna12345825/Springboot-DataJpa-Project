package com.krishna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.repository.PersonRepo;
import com.krishna.repository.PhoneNumberRepo;

@Service("otmService")
public class OneToManyMappingMgmtServiceImpl implements IOneToManyMappingMgmtService {
	@Autowired
	private  PersonRepo   personRepo;
	@Autowired
	private  PhoneNumberRepo phoneRepo;
	
	
	@Override
	public List<Object[]> fetchDataByJoins() {
		return personRepo.getDataByJoins();
	}
	
	

	
}//class