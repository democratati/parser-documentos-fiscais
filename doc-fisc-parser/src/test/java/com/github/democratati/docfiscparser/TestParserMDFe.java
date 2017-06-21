package com.github.democratati.docfiscparser;

import static org.junit.Assert.*;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Before;
import org.junit.Test;

import com.github.democratati.docfiscparser.assembly.Parser;
import com.github.democratati.docfiscparser.model.mdfe.TMDFe;
import com.github.democratati.docfiscparser.model.mdfe.TMDFe.InfMDFe.Ide;


public class TestParserMDFe {
	
	private Path path;
	private TMDFe mdfe;
	
	@Before
	public void setUp() {
		path = Paths.get("../raw/xml/mdfe_216.xml");		
		mdfe = (TMDFe) Parser.MDFE.parser(path);
	}
	
	// ler um arquivo XML
	@Test
	public void testDadosMDFe() throws Exception {
		Ide ide = mdfe.getInfMDFe().getIde();
		
		assertEquals("216", ide.getNMDF());		
		assertEquals("23",ide.getCUF()); 
		assertEquals("1",ide.getTpAmb()); 
		assertEquals("2",ide.getTpEmit()); 
		assertEquals("58",ide.getMod()); 
		assertEquals("1",ide.getSerie());		 
		assertEquals("00000000",ide.getCMDF()); 
		assertEquals("3",ide.getCDV()); 
		assertEquals("1",ide.getModal());
		assertEquals("1",ide.getTpEmis());
		assertEquals("CE", ide.getUFIni().value()); 
		assertEquals("SP", ide.getUFFim().value());
	}
	

}
