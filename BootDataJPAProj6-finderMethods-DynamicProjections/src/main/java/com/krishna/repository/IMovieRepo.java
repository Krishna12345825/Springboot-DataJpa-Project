package com.krishna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishna.model.Movie;
import com.krishna.view.View;

public interface IMovieRepo extends JpaRepository<Movie, Integer> {

	public <T extends View> Iterable<T> findByMnameIn(List<String> movies, Class<T> clazz);

}