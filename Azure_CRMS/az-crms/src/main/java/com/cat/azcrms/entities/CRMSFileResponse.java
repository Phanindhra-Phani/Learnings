package com.cat.azcrms.entities;

import java.io.Serializable;

public class CRMSFileResponse implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	private byte[] fileInBytes;
	private String docId;
	private String fileName;

	public byte[] getFileInBytes() {
		return fileInBytes;
	}

	public void setFileInBytes(byte[] fileInBytes) {
		this.fileInBytes = fileInBytes;
	}

	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}
