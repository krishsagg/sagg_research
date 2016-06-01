package com.tpmodel.generator;

import java.io.IOException;

public class Runner {
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {	
		PdfWrapper pdfWrapper = new PdfWrapper("D://BTPOC//NRI16.pdf",true);
		 pdfWrapper.readPdf();		
	}

}
