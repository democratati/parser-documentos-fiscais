package com.github.wagnerfonseca.docfiscparser.serializer;

import java.lang.reflect.ParameterizedType;

public class XMLSerializerImpl<T> implements XMLSerializer<T> {
	
	private Class<T> clazz;
	
	@SuppressWarnings("unchecked")
	public XMLSerializerImpl() {			
		
		this.clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	

	

}
