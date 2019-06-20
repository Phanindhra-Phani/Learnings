package com.springboot.SpringBootLearning.entity;

import java.io.Serializable;
import java.util.Map;

public class DocumentDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String docId;
	private Map<String, String> accessMap;
	private String newOwner;
	
	public String getDocId() {
		return docId;
	}
	public void setDocId(String docId) {
		this.docId = docId;
	}
	public Map<String, String> getAccessMap() {
		return accessMap;
	}
	public void setAccessMap(Map<String, String> accessMap) {
		this.accessMap = accessMap;
	}
	
	public String getNewOwner() {
		return newOwner;
	}
	public void setNewOwner(String newOwner) {
		this.newOwner = newOwner;
	}
	
	@Override
	public String toString() {
		return "DocumentDetails [docId=" + docId + ", accessMap=" + accessMap + ", newOwner=" + newOwner + "]";
	}
	
}
