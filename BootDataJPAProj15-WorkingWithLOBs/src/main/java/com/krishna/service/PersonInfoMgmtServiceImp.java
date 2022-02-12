package com.krishna.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.model.PersonInfo;
import com.krishna.repository.IPersonInfoRepo;

@Service("PersonService")
public class PersonInfoMgmtServiceImp implements IPersonInfoMgmtService {

	@Autowired
	private IPersonInfoRepo repo;
	
	@Override
	public String registerPErson(PersonInfo info) {
		return repo.save(info).getPid()+"person is saved";
	}

	@Override
	public List<PersonInfo> fetchAllPersonDetails() {
		return  repo.findAll();
	}

	@Override
	public PersonInfo fetchPersonDetailsById(int pid) {
	 Optional<PersonInfo> opt = repo.findById(pid);
	if(opt.isPresent())
		return opt.get();
	else
	 return null;
	}

}
