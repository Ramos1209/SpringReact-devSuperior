package com.pauloramos.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pauloramos.dsmovie.entities.Score;
import com.pauloramos.dsmovie.entities.ScorePk;

public interface ScoreRepository extends JpaRepository<Score, ScorePk>{

}
