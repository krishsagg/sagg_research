package com.tpmodel.generator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.itextpdf.text.exceptions.UnsupportedPdfException;
import com.itextpdf.text.pdf.PRStream;
import com.itextpdf.text.pdf.PdfDictionary;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfObject;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfString;

public class PdfWrapper {
	
	private String pdfFile;
	
	private boolean isFile;
	
	public Boolean checkExistence (){		
		return false;
	}
	
	public PdfWrapper(String pdfFile,boolean isFile) {
		this.isFile = isFile;
		this.pdfFile = pdfFile;
	}

	public void readPdf () throws FileNotFoundException, IOException{		
		File file = new File("D://BTPOC/junk.pdf");		
		PdfReader pdfReader = new PdfReader(new FileInputStream(file));
		 preparePDFObject(pdfReader);
	}
	
	private void preparePDFObject(PdfReader pdfReader) throws IOException{	
		final String dest = "D://BTPOC/stream%s";
		if (null!=pdfReader){
			 PdfReader reader = pdfReader;
		        PdfObject obj;
		        for (int i = 1; i <= reader.getXrefSize(); i++) {
		            obj = reader.getPdfObject(i);
		            if (obj != null && obj.isString()) {
		                PRStream stream = (PRStream)obj;
		                byte[] b;
		                try {
		                    b = PdfReader.getStreamBytes(stream);
		                }
		                catch(UnsupportedPdfException e) {
		                    b = PdfReader.getStreamBytesRaw(stream);
		                }
		                FileOutputStream fos = new FileOutputStream(String.format(dest, i));
		                fos.write(b);
		                fos.flush();
		                fos.close();
		            }
		        }
			}
		
		}
}
