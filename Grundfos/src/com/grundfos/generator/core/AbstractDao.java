package com.grundfos.generator.core;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDao<T,Integer> implements IAbstractDao<T,Integer>{
	
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
	public T find(T t, Integer k) {
		T result = emManager.find((Class<T>) t, k);
		return result;
	}

		

}
