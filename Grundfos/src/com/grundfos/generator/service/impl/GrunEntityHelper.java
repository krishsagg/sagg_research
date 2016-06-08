package com.grundfos.generator.service.impl;

import com.grundfos.generator.entity.CompDetail;
import com.grundfos.generator.entity.EntityDetail;

public class GrunEntityHelper {

	
	public EntityDetail createEntity(String name,CompDetail comp){
		EntityDetail entityDetail = new EntityDetail();
		entityDetail.setName(name);
		entityDetail.setComp(comp);
		return entityDetail;
	}
	
	public CompDetail createComponent(String name){
		CompDetail compDetail = new CompDetail();
		compDetail.setName(name);
		return compDetail;
	}
	
}
