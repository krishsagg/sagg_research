package com.grundfos.generator.dao;

import java.util.List;

import com.grundfos.generator.core.IAbstractDao;
import com.grundfos.generator.entity.CompDetail;

public interface IComponentDao <CompDetail,Integer>  extends IAbstractDao{

	public CompDetail getComponentListByName(String name);
	
}
