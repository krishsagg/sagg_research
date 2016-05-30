package com.grundfos.generator.core;

import java.util.Map;

import javax.persistence.Cache;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnitUtil;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.metamodel.Metamodel;

import org.hibernate.boot.spi.MetadataImplementor;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.jpa.boot.internal.SettingsImpl;
import org.hibernate.jpa.internal.EntityManagerFactoryImpl;
import org.springframework.beans.factory.annotation.Qualifier;

@SuppressWarnings("serial")
@PersistenceContext(unitName="grundfosData")
@Qualifier(value="entityManagerFactory")
public class GrunEntityManagerFactory extends EntityManagerFactoryImpl implements EntityManagerFactory{

	public GrunEntityManagerFactory(String persistenceUnitName, SessionFactoryImplementor sessionFactory,
			MetadataImplementor metadata, SettingsImpl settings, Map<?, ?> configurationValues) {
		super(persistenceUnitName, sessionFactory, metadata, settings, configurationValues);
	}

}
