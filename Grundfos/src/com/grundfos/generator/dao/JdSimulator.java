/**
 * 
 */
package com.grundfos.generator.dao;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.jsonschema2pojo.AbstractAnnotator;
import org.jsonschema2pojo.AnnotationStyle;
import org.jsonschema2pojo.DefaultGenerationConfig;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.Jackson2Annotator;
import org.jsonschema2pojo.NoopAnnotator;
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.rules.RuleFactory;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.sun.codemodel.JAnnotationArrayMember;
import com.sun.codemodel.JAnnotationUse;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JFieldVar;

/**
 * @author krishna.gurumurthy
 *
 */
public class JdSimulator {
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		JCodeModel codeModel = new JCodeModel();

		URL source = new URL("file:///D:/asis_workspace/Grundfos/entity_config/item.json");

		GenerationConfig config = new DefaultGenerationConfig() {
		@Override
		public boolean isGenerateBuilders() { // set config option by overriding method
		return true;
		}
		 @Override
		    public AnnotationStyle getAnnotationStyle() {
		        return AnnotationStyle.JACKSON2;
		    }
		};
		
		AbstractAnnotator abstractAnnotr = new Jackson2Annotator() {
			@Override
		    public void propertyOrder(JDefinedClass clazz, JsonNode propertiesNode) {
		        @SuppressWarnings("unused")
				JAnnotationUse annotationValue = clazz.annotate(Entity.class).param("name",clazz.name());
		        JAnnotationArrayMember annotationValues = clazz.annotate(NamedQueries.class).paramArray("value");	
		        Map <String,String> querymap = new HashMap<String,String>();
		        querymap.put("sample1","select name from Item where dept = 100");
		        querymap.put("sample2","select name from Item where dept = 100 and clas = 200");
		        for (Entry<String,String> entry: querymap.entrySet()) {
		        	JAnnotationUse annotationVal = annotationValues.annotate(NamedQuery.class).param("name",entry.getKey()).param("query", entry.getValue());		        			        	
		        }
		    }
			
			 @Override
			    public void propertyField(JFieldVar field, JDefinedClass clazz, String propertyName, JsonNode propertyNode) {
			        field.annotate(Column.class).param("name", propertyName);
			        if (field.type().erasure().equals(field.type().owner().ref(Set.class))) {
			            field.annotate(JsonDeserialize.class).param("as", LinkedHashSet.class);
			        }
			        if (propertyNode.has("javaJsonView")) {
			            field.annotate(JsonView.class).param(
			                "value", field.type().owner().ref(propertyNode.get("javaJsonView").asText()));
			        }
			    }
		};
		
		SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, abstractAnnotr, new SchemaStore()), new SchemaGenerator());
		mapper.generate(codeModel, "Item", "com.grundfos.generator.entity", source);

		codeModel.build(new File("src"));
		
		
	}

}
