package com.github.democratati.docfiscparser.serializer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.ParameterizedType;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

public class XMLSerializerImpl<T> implements XMLSerializer<T> {
	
	private static final String newline = System.getProperty("line.separator");
	
	private Class<T> clazz;
	private String xml;
	
	@SuppressWarnings("unchecked")
	public XMLSerializerImpl() {
		this.clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
	public XMLSerializerImpl(String conteudoXml) {
		this();
		setXml(xml);
	}
	
	public void setXml(String xml) {
		if (xml == null || xml.isEmpty())
			throw new IllegalArgumentException("Um conteúdo com de xml deve ser informado!");
		this.xml = xml;
	}

	@Override
	public String readFile(Path path) {		
		if (Files.exists(path)) {
			StringBuilder str = new StringBuilder();			
			try (BufferedReader reader = Files.newBufferedReader(path)) {
			    String line = null;
			    while ((line = reader.readLine()) != null) {
			        str.append(line+newline);
			    }
			} catch (IOException x) {
			    System.err.format("Erro no momento de ler o arquivo de xml: %s%n", x);
			}
			setXml(str.toString());
			return str.toString();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T parseFromObject() {
		T object = null;
		try {
			if (xml == null || xml.isEmpty())
				throw new IllegalArgumentException("O conteúdo do XML deve ser preenchido!");
			
			JAXBContext context = JAXBContext.newInstance(clazz);			
			Unmarshaller um = context.createUnmarshaller();			
			
			object = (T) um.unmarshal(new StreamSource(new StringReader(this.xml)));
					
		} catch(JAXBException e) {
			System.err.format("Erro no momento de converter o arquivo XML da entidade informada em objeto: %s%n", e);
		} 	
		return object;
	}

	@Override
	public T parseFromObject(Path path) {
		readFile(path);
		T object = parseFromObject(); 
		return object;
	}

	@Override
	public T parseFromObject(String xml) {
		setXml(xml);
		T object = parseFromObject();
		return object;
	}
}
