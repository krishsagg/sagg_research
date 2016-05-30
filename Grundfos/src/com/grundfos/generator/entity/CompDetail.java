package com.grundfos.generator.entity;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.hibernate.jpa.internal.metamodel.AbstractIdentifiableType;
import org.hibernate.mapping.PersistentClass;

import com.grundfos.generator.core.SingleEntity;

@Entity
@NamedQueries({
	@NamedQuery(name="byName",query="from CompDetail where name = ?")
})
@Cacheable
public class CompDetail extends SingleEntity<Integer,CompDetail>{
	
	public CompDetail(Class javaType, AbstractIdentifiableType<? super CompDetail> superType,
			PersistentClass persistentClass) {
		super(javaType, superType, persistentClass);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="identifier")
	private Integer id;
	
	@Column(name="name")
	private String name;

	
	
}
