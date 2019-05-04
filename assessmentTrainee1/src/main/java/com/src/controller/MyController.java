package com.src.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.src.beans.TraineeDetails;
import com.src.service.TraineeService;

@RestController
public class MyController {
	@Autowired
	TraineeService trainee;
	@GetMapping("/")
	public String sayHi() {
		return "Hello";
	}
	
	@PostMapping("/add")
	public ResponseEntity insertData(@RequestBody TraineeDetails trainee) {
		trainee.register(trainee);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@PutMapping("/modify")
	public ResponseEntity<?> updateData(@RequestBody TraineeDetails trainee) {
		trainee.modify(trainee);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<?> deleteTrainee(@RequestBody int id) {
		trainee.deleteTrainee(id);
		return new ResponseEntity<>(HttpStatus.OK);		
	}
	
	@GetMapping("/getById")
	public TraineeDetails getByPid(@RequestBody int id) {
		TraineeDetails trainee2=trainee.getById(id);
		return trainee2;
	}

	@GetMapping("/getAll")
	public ArrayList<TraineeDetails> getAllProducts(){
		ArrayList<TraineeDetails> trainees = trainee.getAll();
		return trainees;
	}
}
