package com.github.wagnerfonseca.docfiscparser.assembly;

import java.nio.file.Path;

import com.github.wagnerfonseca.docfiscparser.model.mdfe.MdfeProc;
import com.github.wagnerfonseca.docfiscparser.model.mdfe.TMDFe;
import com.github.wagnerfonseca.docfiscparser.serializer.mdfe.MDFeSerializer;


/**
 * <h3>Classe para realizar o parser do XML</h3>
 * <br>
 * <p>Escolha o tipo de documento fiscal para realiar o Parser do arquivo</p>
 * <b>Documentos fiscais:</b>
 * <ul>
 * 	<li><b>MDF-e:</b> Manifesto Eletrônico de Documentos Fiscais</li>
 * </ul>
 * */
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
