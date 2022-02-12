package com.krishna.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.krishna.model.Movie;

@Transactional
public interface IMovieRepo extends JpaRepository<Movie, Integer> {

	@Query(value = "INSERT INTO SP_DATA_MOVIE VALUES(MID_SEQ.NEXTVAL,?,?,?)", nativeQuery = true)
	@Modifying
	public int registerMovie(String name, float rating, String year);

}