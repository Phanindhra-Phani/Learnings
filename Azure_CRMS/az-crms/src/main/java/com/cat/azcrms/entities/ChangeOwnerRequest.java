package com.cat.azcrms.entities;

import java.io.Serializable;

public class ChangeOwnerRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String docId;
	private String newOwner;
	
	public String getDocId() {
		return docId;
	}
	public void setDocId(String docId) {
		this.docId = docId;
	}
	public String getNewOwner() {
		return newOwner;
	}
	public void setNewOwner(String newOwner) {
		this.newOwner = newOwner;
	}
	
	@Override
	public String toString() {
		return "ChangeOwner [docId=" + docId + ", newOwner=" + newOwner + "]";
	}
	
}
