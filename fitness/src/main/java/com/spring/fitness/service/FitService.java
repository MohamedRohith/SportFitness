package com.spring.fitness.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.fitness.model.FitModel;
import com.spring.fitness.repository.FitRepo;

@Service
public class FitService {
	@Autowired
	private FitRepo repository;
	public List<FitModel> getFitModel() {
		return repository.findAll();
	}
	public Optional<FitModel> getFitModelbyId(int id) {
		return repository.findById(id);
	}
	public FitModel addFitModel(FitModel fitmodel) {
		return repository.save(fitmodel);
	}
	public FitModel editFitModel(FitModel fitmodel, int id) {
		FitModel fitmodelx = repository.findById(id).orElse(null);
		if(fitmodelx != null) {
			fitmodelx.setBulking(fitmodel.getBulking());
			fitmodelx.setCutting(fitmodel.getCutting());
			fitmodelx.setPrice(fitmodel.getPrice());
			return repository.saveAndFlush(fitmodelx);
			
		}
		else {
			return null;
		}
		
	}
	public String deleteFitModel(int id) {
		repository.deleteById(id);
		return "deleted !";
	}
	

}
