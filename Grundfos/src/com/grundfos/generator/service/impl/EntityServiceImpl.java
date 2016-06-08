package com.grundfos.generator.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.grundfos.generator.dao.IComponentDao;
import com.grundfos.generator.dao.IEntityDao;
import com.grundfos.generator.entity.CompDetail;
import com.grundfos.generator.entity.EntityDetail;
import com.grundfos.generator.service.IEntityService;

@Service("entityService")
@Transactional
public class EntityServiceImpl implements IEntityService{

	@Autowired 
	private IEntityDao entityDAO;
	
	@Autowired
	private IComponentDao compDAO;
	
	@Override
	public Integer createComponent(CompDetail comp) {
		compDAO.insert(comp);
		return comp.getId();
	}
	
	@Override
	public Integer createEntity(EntityDetail entity) {
		entityDAO.insert(entity);
		return entity.getId();
	}

	@Override
	public EntityDetail getEntitiesByName(String name) {
		return (EntityDetail) entityDAO.getEntityListByName(name);
		
	}

	@Override
	public List<EntityDetail> getEntityByComponent(CompDetail component) {
		return entityDAO.getEntityListByCompName(component.getName());
		
	}

	@Override
	public CompDetail getComponentsByName(String name) {
		return (CompDetail) compDAO.getComponentListByName(name);
	}	
}
