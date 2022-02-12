package com.krishna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishna.model.Movie;
import com.krishna.view.ResultView;

public interface IMovieRepo extends JpaRepository<Movie, Integer> {

	public  Iterable<ResultView>  findByMidGreaterThanEqualAndMidLessThanEqual(int startMid,int endMid);

}