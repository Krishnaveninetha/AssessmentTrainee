package com.src.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Query;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.src.beans.TraineeDetails;
@Component("tdao")
@Repository
@ComponentScan("com.src")
public class TraineeDaoImpl implements TraineeDao{

	@PersistenceContext
	EntityManager entityManager;
	@Override
	public int login(TraineeDetails td) {
		// TODO Auto-generated method stub
		entityManager.persist(td);
		return 0;
	}

	@Override
	public TraineeDetails register(TraineeDetails td) {
		// TODO Auto-generated method stub
		entityManager.persist(td);
		return null;
	}

	@Override
	public int deleteTrainee(int id) {
		// TODO Auto-generated method stub
		TraineeDetails trainee =new TraineeDetails();
		trainee.setId(id);
		entityManager.remove(getById(id));
		return 0;
		
	}

	@Override
	public int modify(TraineeDetails td) {
		// TODO Auto-generated method stub
		entityManager.merge(td);
		return 0;
	}

	@Override
	public TraineeDetails getById(int id) {
		// TODO Auto-generated method stub
		TraineeDetails trainee=entityManager.find(TraineeDetails.class, id);
		return trainee;
	
	}

	@Override
	public ArrayList<TraineeDetails> getAll() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		Query<TraineeDetails> query = (Query<TraineeDetails>) entityManager.createQuery("from Trainee ");
		ArrayList<TraineeDetails> list =(ArrayList<TraineeDetails>) query.list();
		return list;
		
	}

}
