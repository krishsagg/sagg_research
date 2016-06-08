package com.grundfos.generator.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.metamodel.Attribute;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.IdentifiableType;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.MapAttribute;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.Type;
import javax.validation.constraints.NotNull;

import org.hibernate.jpa.internal.metamodel.AbstractIdentifiableType;
import org.hibernate.mapping.PersistentClass;

import com.grundfos.generator.core.SingleEntity;

@Entity
@NamedQueries({
	@NamedQuery(name="byName",query="from EntityDetail where name = ?"),
	@NamedQuery(name="byComp",query="from EntityDetail where comp = ?")
})
@Table(name="Entity",schema="public")
public class EntityDetail extends SingleEntity<Integer,EntityDetail>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="identifier")
	@SequenceGenerator(name = "entity_seq")
	@NotNull
	private Integer id;
	
	@Column(name="identifier")
	private String name;
	

	@Column(name="component")
	private CompDetail comp;

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
	
	@ManyToOne(fetch=FetchType.LAZY,cascade={CascadeType.ALL})
	@JoinColumn(name="component")
	public CompDetail getComp() {
		return comp;
	}

	public void setComp(CompDetail comp) {
		this.comp = comp;
	}

}
