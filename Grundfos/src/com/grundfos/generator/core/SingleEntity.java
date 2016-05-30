/**
 * 
 */
package com.grundfos.generator.core;

import javax.persistence.EntityManager;

import org.hibernate.jpa.internal.metamodel.AbstractIdentifiableType;
import org.hibernate.jpa.internal.metamodel.EntityTypeImpl;
import org.hibernate.mapping.PersistentClass;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author krishna.gurumurthy
 *
 */
public abstract class SingleEntity<Integer,T> extends EntityTypeImpl<T>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SingleEntity(Class javaType, AbstractIdentifiableType<? super T> superType,
			PersistentClass persistentClass) {
		super(javaType, superType, persistentClass);
	}

	@Autowired
	private GrunEntityManagerFactory emFactory;
	
	public void persist(T t) {
	EntityManager em = emFactory.createEntityManager();
	em.persist(t);	
	}
	
	public void update(T t, Integer id)	{
		EntityManager em = emFactory.createEntityManager();
		em.merge(t);
	}
	
	public void remove(T t, Integer id){
		EntityManager em = emFactory.createEntityManager();
		em.remove(t);
	}
	
	public void find(T t, Integer id){
		EntityManager em = emFactory.createEntityManager();
		em.find((Class<T>) t, id);	
	}	
}
