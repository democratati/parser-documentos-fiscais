package com.github.wagnerfonseca.docfiscparser.serializer;

import java.nio.file.Path;

public interface XMLSerializer<T> {
	
	/**
	 * Ler o conteudo do xml
	 * 
	 * @param informar o caminho do arquivo xml
	 * */
	String readFile(Path path);	
	
	T parseFromObject();
	
	/**
	 * Converter um xml em Objeto
	 * 
	 * @param caminho do arquivo xml
	 * */
	T parseFromObject(Path path);
	
	/**
	 * Converter um xml em Objeto
	 * 
	 * @param conteudo do xml
	 * */
	T parseFromObject(String xml);
	

}
