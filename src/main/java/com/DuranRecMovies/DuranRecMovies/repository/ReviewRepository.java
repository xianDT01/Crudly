package com.DuranRecMovies.DuranRecMovies.repository;


import com.DuranRecMovies.DuranRecMovies.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}