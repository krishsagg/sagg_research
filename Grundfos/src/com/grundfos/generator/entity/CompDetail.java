package com.grundfos.generator.entity;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.jpa.internal.metamodel.AbstractIdentifiableType;
import org.hibernate.mapping.PersistentClass;

import com.grundfos.generator.core.SingleEntity;

@Entity
@NamedQueries({
	@NamedQuery(name="byName",query="from CompDetail where name = ?")
})
@Table(name="Component",schema="public")
public class CompDetail extends SingleEntity<Integer,CompDetail>{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@NotNull
	@SequenceGenerator(name = "comp_seq")
	@Column(name="identifier")
	private Integer id;
	
	@Column(name="name")
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
