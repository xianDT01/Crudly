package com.DuranRecMovies.DuranRecMovies.repository;

import com.DuranRecMovies.DuranRecMovies.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
