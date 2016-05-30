package com.grundfos.generator.dao;

import java.util.List;

import com.grundfos.generator.entity.CompDetail;

public interface IComponentDao {

	public List<CompDetail> getComponentListByName(String name);
	
}
