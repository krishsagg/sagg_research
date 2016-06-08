package com.grundfos.generator.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.grundfos.generator.entity.CompDetail;
import com.grundfos.generator.entity.EntityDetail;
import com.grundfos.generator.service.IEntityService;
import com.grundfos.generator.service.impl.GrunEntityHelper;

@RestController
public class GrunController {
		
	@Autowired
	private IEntityService entityService;
			
	@Autowired
	private GrunEntityHelper entityHelper;
	
	@RequestMapping(path = "/entities/new", method = RequestMethod.POST)
	@ResponseBody
	public void createEntity( @RequestParam(name="",value="",required=true) String entityName, @RequestParam(name="",value="",required=true) String compName){
		CompDetail comp = entityService.getComponentsByName(compName);	
		EntityDetail entity = entityHelper.createEntity(entityName, comp);
		entityService.createEntity(entity);
	}
	
	@RequestMapping(path = "/entities/component", method = RequestMethod.GET,produces="application/json")
	public @ResponseBody List<EntityDetail> getEntitiesByComponent(String compName){
		CompDetail comp = entityService.getComponentsByName(compName);
		return  entityService.getEntityByComponent(comp);		
	}
	
	@RequestMapping(path = "/entities/name", method = RequestMethod.GET,produces="application/json")
	public @ResponseBody EntityDetail getEntitiesByName(String name){
		return entityService.getEntitiesByName(name);		
	}
	
	@RequestMapping(path = "/componenet/new", method = RequestMethod.POST)
	public void createComponent(@RequestParam(name="",value="",required=true) String compName){
		CompDetail comp = entityHelper.createComponent(compName);
		entityService.createComponent(comp);
	}
	
	@RequestMapping(path = "/component/name", method = RequestMethod.GET,produces="application/json")
	public @ResponseBody CompDetail getComponentsByName(String name){
		return entityService.getComponentsByName(name);
	}
	
}
