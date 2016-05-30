package com.grundfos.generator.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.grundfos.generator.dao.impl.EntityDao;

public class EntityTest extends GrundfosTestContext{

	@Autowired
	private EntityDao entityDAO;
	
	@Test
	public void createEntity(){
		
	}
	
	
}
