package com.grundfos.generator.swagger.document;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.knappsack.swagger4springweb.controller.ApiDocumentationController;

@Controller
@RequestMapping(value="/documentation")
public class DocumentationController extends ApiDocumentationController {

	public DocumentationController() {
		setBaseControllerPackage("com.grundfos.generator.controller");
		setBaseModelPackage("com.grundfos.generator.entity");
		setApiVersion("v1");
	}
	
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	   public String documentation() {
	        return "documentation";
	    }

}
