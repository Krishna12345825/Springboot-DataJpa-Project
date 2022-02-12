package com.krishna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishna.model.EmployeeInfo;

public interface EmployeeInfoRepo extends JpaRepository<EmployeeInfo, Integer> {

}
