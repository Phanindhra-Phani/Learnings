package com.cat.azcrms.entities;

import java.io.Serializable;

public class CRMSFileRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1L;
	
	private byte[] fileInBytes;
	private String fileName;
	private String hashCode;
	
	public byte[] getFileInBytes() {
		return fileInBytes;
	}
	public void setFileInBytes(byte[] fileInBytes) {
		this.fileInBytes = fileInBytes;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getHashCode() {
		return hashCode;
	}
	public void setHashCode(String hashCode) {
		this.hashCode = hashCode;
	}
	
}
