package com.spring.fitness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.fitness.model.FitModel;
@Repository
public interface FitRepo extends JpaRepository<FitModel, Integer>{

}
