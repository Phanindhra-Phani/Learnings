package com.cat.azcrms.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class GrantAccessRequestMap implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String docId;
	private Map<String, List<String>> accessMap;
	
	public String getDocId() {
		return docId;
	}
	public void setDocId(String docId) {
		this.docId = docId;
	}
	public Map<String, List<String>> getAccessMap() {
		return accessMap;
	}
	public void setAccessMap(Map<String, List<String>> accessMap) {
		this.accessMap = accessMap;
	}
	
	@Override
	public String toString() {
		return "GrantAccessRequestMap [docId=" + docId + ", accessMap=" + accessMap + "]";
	}
	
}
