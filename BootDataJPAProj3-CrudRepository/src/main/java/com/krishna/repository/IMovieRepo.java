package com.krishna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishna.entity.Movie;

public interface IMovieRepo extends JpaRepository<Movie, Integer> {

}
