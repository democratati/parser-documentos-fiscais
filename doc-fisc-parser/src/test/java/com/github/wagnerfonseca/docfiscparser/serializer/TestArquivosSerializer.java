package com.github.wagnerfonseca.docfiscparser.serializer;

import static com.github.wagnerfonseca.docfiscparser.model.mdfe.TMDFe.InfMDFe.Ide;
import static com.github.wagnerfonseca.docfiscparser.model.mdfe.TMDFe.InfMDFe.Tot;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.containsString;

import java.nio.file.Paths;

import org.junit.BeforeClass;
import org.junit.Test;


import com.github.wagnerfonseca.docfiscparser.model.mdfe.MdfeProc;
import com.github.wagnerfonseca.docfiscparser.serializer.mdfe.MDFeJSONSerializer;
import com.github.wagnerfonseca.docfiscparser.serializer.mdfe.MDFeSerializer;

public class TestArquivosSerializer {
	
	private static MDFeSerializer serializer;
	private static MdfeProc mdfeProc;
	
	@BeforeClass
	public static void setUp() {
		serializer = new MDFeSerializer();
		mdfeProc = serializer.parseFromObject(Paths.get("../raw/xml/mdfe_216.xml"));
	}
	
	
	@Test
	public void testLerXMLMDFeParaObjeto() throws Exception {
		Ide ide = mdfeProc.getMDFe().getInfMDFe().getIde();
		
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
	
	@Test
	public void testSerializarIdeParaJSON() throws Exception {
		Ide ide = mdfeProc.getMDFe().getInfMDFe().getIde();
		
		String result = MDFeJSONSerializer.ideToJSON(ide);
		System.out.println(result);
		assertThat(result, containsString("\"nmdf\":\"216\""));
	}
	
	@Test
	public void testSerializarTotParaJSON() throws Exception {
		Tot tot = mdfeProc.getMDFe().getInfMDFe().getTot();
		
		String result = MDFeJSONSerializer.totToJSON(tot);
		System.out.println(result);
		assertThat(result, containsString("\"vcarga\":\"496750.00\""));
		assertThat(result, containsString("02"));
		assertThat(result, containsString("\"qcarga\":\"6.5400\""));
	}
	


}
