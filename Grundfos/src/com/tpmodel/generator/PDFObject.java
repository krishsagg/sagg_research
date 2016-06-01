package com.tpmodel.generator;

import java.util.Map;

public class PDFObject {
	
	private Integer pageCount;
	
	private Map<Integer,String> pageMap;

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Map<Integer, String> getPageMap() {
		return pageMap;
	}

	public void setPageMap(Map<Integer, String> pageMap) {
		this.pageMap = pageMap;
	}

}
