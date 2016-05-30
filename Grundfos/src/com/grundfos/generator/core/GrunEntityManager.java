package com.grundfos.generator.core;

import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.FlushModeType;
import javax.persistence.LockModeType;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;
import javax.persistence.SynchronizationType;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.metamodel.Metamodel;
import javax.persistence.spi.PersistenceUnitTransactionType;

import org.hibernate.jpa.internal.EntityManagerFactoryImpl;
import org.hibernate.jpa.internal.EntityManagerImpl;

public class GrunEntityManager extends EntityManagerImpl implements EntityManager{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GrunEntityManager(EntityManagerFactoryImpl entityManagerFactory, PersistenceContextType pcType,
			SynchronizationType synchronizationType, PersistenceUnitTransactionType transactionType,
			boolean discardOnClose, @SuppressWarnings("rawtypes") Class sessionInterceptorClass, Map properties) {
		super(entityManagerFactory, pcType, synchronizationType, transactionType, discardOnClose, sessionInterceptorClass,
				properties);
	}

}
