package com.github.wagnerfonseca.docfiscparser.serializer.mdfe;

import static com.github.wagnerfonseca.docfiscparser.model.mdfe.TMDFe.InfMDFe;
import static com.github.wagnerfonseca.docfiscparser.model.mdfe.TMDFe.InfMDFe.Ide;
import static com.github.wagnerfonseca.docfiscparser.model.mdfe.TMDFe.InfMDFe.Tot;
import static com.github.wagnerfonseca.docfiscparser.model.mdfe.TMDFe.InfMDFe.Emit;
import static com.github.wagnerfonseca.docfiscparser.model.mdfe.TMDFe.InfMDFe.InfDoc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.wagnerfonseca.docfiscparser.model.mdfe.TMDFe;

public class MDFeJSONSerializer {

	public static String mdfeToJSON(TMDFe mdfe) {
		try {
			 return new ObjectMapper().writeValueAsString(mdfe);
		} catch (JsonProcessingException e) {			
			e.printStackTrace();
		}		
		return null;
	}
	
	public static String indMDFeToJSON(InfMDFe infMDFe) {
		try {
			 return new ObjectMapper().writeValueAsString(infMDFe);
		} catch (JsonProcessingException e) {			
			e.printStackTrace();
		}		
		return null;
	}
	
	public static String ideToJSON(Ide ide) {
		try {
			 return new ObjectMapper().writeValueAsString(ide);
		} catch (JsonProcessingException e) {			
			e.printStackTrace();
		}		
		return null;
	}
	
	public static String emitToJSON(Emit emit) {
		try {
			 return new ObjectMapper().writeValueAsString(emit);
		} catch (JsonProcessingException e) {			
			e.printStackTrace();
		}		
		return null;
	}
	
	public static String totToJSON(Tot tot) {
		try {
			 return new ObjectMapper().writeValueAsString(tot);
		} catch (JsonProcessingException e) {			
			e.printStackTrace();
		}		
		return null;
	}
	
	public static String infDocToJSON(InfDoc infDoc) {
		try {
			 return new ObjectMapper().writeValueAsString(infDoc);
		} catch (JsonProcessingException e) {			
			e.printStackTrace();
		}		
		return null;
	}

}
