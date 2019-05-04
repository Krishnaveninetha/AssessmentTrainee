package com.src.dao;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestBody;

import com.src.beans.TraineeDetails;

public interface TraineeDao {

	 int login(TraineeDetails td);
	 TraineeDetails register( TraineeDetails td);
	int deleteTrainee(int id);
	int modify(TraineeDetails td);
	TraineeDetails getById(int id);
	ArrayList<TraineeDetails> getAll();


}
