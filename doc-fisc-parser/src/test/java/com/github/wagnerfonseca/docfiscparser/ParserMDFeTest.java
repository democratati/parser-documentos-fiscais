package com.github.wagnerfonseca.docfiscparser;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;

import com.github.wagnerfonseca.docfiscparser.assembly.Parser;

public class ParserMDFeTest {
	
	@Before
	public void setUp() {
		Parser.MDFE.parser("../raw/xml/MDFe_216.xml");
	}
	
	// ler um arquivo XML
	@Test
	public void testName() throws FileNotFoundException {
		
	}
	

}
