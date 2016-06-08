package com.grundfos.generator.service;

import java.util.List;

import com.grundfos.generator.entity.CompDetail;
import com.grundfos.generator.entity.EntityDetail;

public interface IEntityService {

  public Integer createComponent(CompDetail component);
  
  public Integer createEntity(EntityDetail entity);
  
  public EntityDetail getEntitiesByName(String name);
  
  public List<EntityDetail> getEntityByComponent(CompDetail component);

  public CompDetail getComponentsByName(String name);
}
