package com.auto1.devtest.misc.jackson;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

@Provider
public class JacksonObjectMapperProvider implements ContextResolver<ObjectMapper> {

	private ObjectMapper objectMapper;

	public JacksonObjectMapperProvider() {
		objectMapper = new ObjectMapper();

		objectMapper.configure(SerializationConfig.Feature.AUTO_DETECT_GETTERS, false);
		objectMapper.configure(SerializationConfig.Feature.AUTO_DETECT_IS_GETTERS, false);
		objectMapper.configure(SerializationConfig.Feature.AUTO_DETECT_FIELDS, true);

//		objectMapper.configure(DeserializationConfig.Feature.AUTO_DETECT_SETTERS, false);
//		objectMapper.configure(DeserializationConfig.Feature.AUTO_DETECT_FIELDS, false);
		objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		/*
		 * objectMapper.setVisibility(PropertyAccessor.ALL, Visibility.NONE); objectMapper.setVisibility(PropertyAccessor.FIELD,
		 * Visibility.NONE); objectMapper.setVisibility(PropertyAccessor.GETTER, Visibility.NONE);
		 * objectMapper.setVisibility(PropertyAccessor.SETTER, Visibility.NONE);
		 */
	}

	public ObjectMapper getContext(Class<?> type) {
		return objectMapper;
	}

}