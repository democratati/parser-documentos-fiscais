package com.github.wagnerfonseca.docfiscparser.assembly;

import java.nio.file.Path;

import com.github.wagnerfonseca.docfiscparser.model.mdfe.MdfeProc;
import com.github.wagnerfonseca.docfiscparser.model.mdfe.TMDFe;
import com.github.wagnerfonseca.docfiscparser.serializer.mdfe.MDFeSerializer;

public enum Parser {
	
	MDFE {
		@Override
		public TMDFe parser(Path path) {
			MDFeSerializer serializer = new MDFeSerializer();
			MdfeProc mdfeProc = serializer.parseFromObject(path);			
			return mdfeProc.getMDFe();
		}
		
	};
	
	/**
	 * Realizar o parser do xml
	 * */
	public abstract Object parser(Path path);

}
