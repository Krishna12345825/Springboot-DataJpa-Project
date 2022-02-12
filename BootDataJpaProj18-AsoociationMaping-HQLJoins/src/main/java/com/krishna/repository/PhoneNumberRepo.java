package com.krishna.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.krishna.model.PhoneNumber;

public interface PhoneNumberRepo extends JpaRepository<PhoneNumber, Integer> {

}