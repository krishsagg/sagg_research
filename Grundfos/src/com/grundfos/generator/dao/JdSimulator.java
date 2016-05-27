/**
 * 
 */
package com.grundfos.generator.dao;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.jsonschema2pojo.AnnotationStyle;
import org.jsonschema2pojo.DefaultGenerationConfig;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.Jackson2Annotator;
import org.jsonschema2pojo.NoopAnnotator;
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.rules.RuleFactory;

import com.sun.codemodel.JCodeModel;

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
		        return AnnotationStyle.NONE;
		    }
		};

		SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new NoopAnnotator(), new SchemaStore()), new SchemaGenerator());
		mapper.generate(codeModel, "Sample", "com.example", source);

		codeModel.build(new File("output"));
	}

}
