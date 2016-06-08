package com.grundfos.generator.dao.impl;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.grundfos.generator.core.AbstractDao;
import com.grundfos.generator.dao.IComponentDao;
import com.grundfos.generator.entity.CompDetail;

@Repository("compDao")
public class ComponentDao extends AbstractDao implements IComponentDao <CompDetail,Integer> {
	
	public CompDetail getComponentListByName(String name) {
		return null;
	}

	
}
