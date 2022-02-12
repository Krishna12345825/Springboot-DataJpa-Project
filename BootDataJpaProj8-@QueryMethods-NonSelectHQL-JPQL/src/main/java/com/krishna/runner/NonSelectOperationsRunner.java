package com.krishna.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.krishna.repository.IMovieRepo;

@Component
public class NonSelectOperationsRunner implements CommandLineRunner {
	@Autowired
	private IMovieRepo  repo;

	@Override
	public void run(String... args) throws Exception {
		 System.out.println("updatting "+repo.modifyRatingByMoiveName(4.5f,"RRR")+"  movies");
		 
		 System.out.println(repo.deleteMovieByYearRange("1900","2000")+" movies are deleted");

	}//run(-)

}//class