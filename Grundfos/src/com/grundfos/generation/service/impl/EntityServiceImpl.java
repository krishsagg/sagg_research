package com.grundfos.generation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.grundfos.generation.service.IEntityService;
import com.grundfos.generator.dao.IComponentDao;
import com.grundfos.generator.dao.IEntityDao;
import com.grundfos.generator.entity.CompDetail;

public class EntityServiceImpl implements IEntityService{

	@Autowired 
	private IEntityDao entityDAO;
	
	@Autowired
	private IComponentDao compDAO;

	@Override
	public void createComponent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createEntity(CompDetail component) {
		// TODO Auto-generated method stub
		
	}
	

	
	
	
}
