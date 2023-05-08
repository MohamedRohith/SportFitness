package com.spring.fitness.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.fitness.model.FitModel;
import com.spring.fitness.service.FitService;

@RestController
@RequestMapping("/api")
public class FitController {
	@Autowired
	private FitService service;
	@GetMapping()
	public List<FitModel> read() {
		return service.getFitModel();
	}
	@GetMapping("/{id}")
	public Optional<FitModel> readById(@PathVariable int id) {
		return service.getFitModelbyId(id);
	}
	@PostMapping
	public FitModel update(@RequestBody FitModel fitmodel, @PathVariable int id) {
		return service.editFitModel(fitmodel, id);
	}
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id ) {
		return service.deleteFitModel(id);
	}

}
