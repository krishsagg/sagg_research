package com.grundfos.generator.core;

import org.springframework.beans.factory.annotation.Autowired;

public class AbstractDao<T> implements IAbstractDao{
	
	@Autowired
	private GrunEntityManager emManager;
	
	@Override
	public void insert(Object t) {
		emManager.persist(t);		
	}

	@Override
	public void update(Object t) {
	   emManager.merge(t);			
	}

	@Override
	public void remove(Object t) {
	  emManager.remove(t);		
	}

	@Override
	public Object find(Object t) {
		return null;
	}

}
