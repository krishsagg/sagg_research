package com.grundfos.generator.core;

public interface IAbstractDao<T,Integer> {
	
	public void insert(T t);
	
	public void update(T t);
	
	public void remove(T t);

	public T find(T t,Integer k);

}
