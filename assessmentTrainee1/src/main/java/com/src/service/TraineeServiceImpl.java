package com.src.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.src.beans.TraineeDetails;
import com.src.dao.TraineeDao;
@Transactional
@Service
@Component("trainee")
public class TraineeServiceImpl implements TraineeService {

	@Autowired
	TraineeDao tdao;
	@Override
	public int login(TraineeDetails td) {
		// TODO Auto-generated method stub
		return tdao.login(td);
	}

	@Override
	public TraineeDetails register(TraineeDetails td) {
		// TODO Auto-generated method stub
		return tdao.register(td);
	}

	@Override
	public int deleteTrainee(int id) {
		// TODO Auto-generated method stub
		return tdao.deleteTrainee(id);
	}

	@Override
	public int modify(TraineeDetails td) {
		// TODO Auto-generated method stub
		return tdao.modify(td);
	}

	@Override
	public TraineeDetails getById(int id) {
		// TODO Auto-generated method stub
		return tdao.getById(id);
	}

	@Override
	public ArrayList<TraineeDetails> getAll() {
		// TODO Auto-generated method stub
		return tdao.getAll();
	}

}

