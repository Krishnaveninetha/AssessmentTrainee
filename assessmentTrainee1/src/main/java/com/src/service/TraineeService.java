package com.src.service;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestBody;


import com.src.beans.TraineeDetails;

public interface TraineeService {

	 int login(TraineeDetails td);
	 TraineeDetails register(@RequestBody TraineeDetails td);
	int deleteTrainee(int id);
	int modify(TraineeDetails td);
	TraineeDetails getById(int id);
	ArrayList<TraineeDetails> getAll();

}
