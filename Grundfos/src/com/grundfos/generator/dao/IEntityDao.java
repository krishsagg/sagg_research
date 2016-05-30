package com.grundfos.generator.dao;

import java.util.List;

import com.grundfos.generator.core.IAbstractDao;
import com.grundfos.generator.entity.EntityDetail;

public interface IEntityDao extends IAbstractDao {
	
	public List<EntityDetail> getEntityListByName(String name);
	
	public List<EntityDetail> getEntityListByCompName(String compName);

}
