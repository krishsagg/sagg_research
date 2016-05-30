package com.grundfos.generator.core;

public interface IAbstractDao<T> {
	
	public void insert(T t);
	
	public void update(T t);
	
	public void remove(T t);

	public T find(T t);

}
