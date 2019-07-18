package com.cat.azcrms.entities;

import java.io.Serializable;
import java.util.List;

public class RevokeAccessRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String docId;
	private List<String> usersToBeRevoked;
	
	public String getDocId() {
		return docId;
	}
	public void setDocId(String docId) {
		this.docId = docId;
	}
	public List<String> getUsersToBeRevoked() {
		return usersToBeRevoked;
	}
	public void setUsersToBeRevoked(List<String> usersToBeRevoked) {
		this.usersToBeRevoked = usersToBeRevoked;
	}
	@Override
	public String toString() {
		return "RevokeAccess [docId=" + docId + ", usersToBeRevoked=" + usersToBeRevoked + "]";
	}

}
