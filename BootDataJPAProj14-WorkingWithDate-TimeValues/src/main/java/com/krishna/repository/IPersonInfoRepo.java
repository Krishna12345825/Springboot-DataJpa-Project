package com.krishna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishna.model.PersonInfo;

public interface IPersonInfoRepo extends JpaRepository<PersonInfo, Integer> {

}
