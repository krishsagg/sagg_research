package com.grundfos.generator.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.grundfos.generator.core.AbstractDao;
import com.grundfos.generator.dao.IEntityDao;
import com.grundfos.generator.entity.EntityDetail;

@SuppressWarnings("rawtypes")
@Repository("entityDao")
public class EntityDao extends AbstractDao implements IEntityDao <EntityDetail,Integer>  {	
		
	public EntityDetail getEntityListByName(String name) {
		return null;
	}
	
	public List<EntityDetail> getEntityListByCompName(String compName) {
		return null;
	}
	

}
