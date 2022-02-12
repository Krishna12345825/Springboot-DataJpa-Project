package com.krishna.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.krishna.repository.IMovieRepo;

@Component
public class NativeSQLTestRunner implements CommandLineRunner {
	@Autowired
	private IMovieRepo repo;

	@Override
	public void run(String... args) throws Exception {
		int result = repo.registerMovie("raja", 4.5f, "2021");
		System.out.println(result == 0 ? "movie not registered" : "movie registered");

	}// run(-)

}// class
