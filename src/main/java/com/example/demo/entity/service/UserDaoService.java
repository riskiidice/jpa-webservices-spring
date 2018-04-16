package com.example.demo.entity.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
@Transactional
public class UserDaoService {
	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(User user) {
		//Open Transaction
		entityManager.persist(user);
		//Close Transaction
		return user.getId();
	}
}
