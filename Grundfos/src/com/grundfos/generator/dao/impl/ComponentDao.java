package com.grundfos.generator.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.grundfos.generator.dao.IComponentDao;
import com.grundfos.generator.entity.CompDetail;

@Repository("compDao")
public class ComponentDao implements IComponentDao{

	
	
	public List<CompDetail> getComponentListByName(String name) {
		return null;
	}
	
}
