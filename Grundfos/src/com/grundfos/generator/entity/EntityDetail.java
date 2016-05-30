package com.grundfos.generator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.hibernate.jpa.internal.metamodel.AbstractIdentifiableType;
import org.hibernate.mapping.PersistentClass;

import com.grundfos.generator.core.SingleEntity;

@Entity
@MappedSuperclass
@NamedQueries({
	@NamedQuery(name="byName",query="from EntityDetail where name = ?")
})
public class EntityDetail extends SingleEntity<Integer,EntityDetail>{
	
	public EntityDetail(Class javaType, AbstractIdentifiableType<? super EntityDetail> superType,
			PersistentClass persistentClass) {
		super(javaType, superType, persistentClass);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="identifier")
	private Integer id;
	
	@Column(name="identifier")
	private String name;
	
	@Column(name="identifier")
	private Integer comp;

}
