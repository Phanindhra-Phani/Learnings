package com.learning.springmvc.entites;

public class UserEntity {
	
	public Integer USERID;
	public String USERFIRSTNAME;
	private String USERLASTNAME;
	private Integer AGE;
	private String STORYTYPE;
	
	public UserEntity(Integer USERID, String USERFIRSTNAME, String USERLASTNAME, Integer AGE, String STORYTYPE) {
		super();
		this.USERID = USERID;
		this.USERFIRSTNAME = USERFIRSTNAME;
		this.USERLASTNAME = USERLASTNAME;
		this.AGE = AGE;
		this.STORYTYPE = STORYTYPE;
	}

	public Integer getUSERID() {
		return USERID;
	}

	public void setUSERID(Integer uSERID) {
		USERID = uSERID;
	}

	public String getUSERFIRSTNAME() {
		return USERFIRSTNAME;
	}

	public void setUSERFIRSTNAME(String uSERFIRSTNAME) {
		USERFIRSTNAME = uSERFIRSTNAME;
	}

	public String getUSERLASTNAME() {
		return USERLASTNAME;
	}

	public void setUSERLASTNAME(String uSERLASTNAME) {
		USERLASTNAME = uSERLASTNAME;
	}

	public Integer getAGE() {
		return AGE;
	}

	public void setAGE(Integer aGE) {
		AGE = aGE;
	}

	public String getSTORYTYPE() {
		return STORYTYPE;
	}

	public void setSTORYTYPE(String sTORYTYPE) {
		STORYTYPE = sTORYTYPE;
	}

	@Override
	public String toString() {
		return "UserEntity [USERID=" + USERID + ", USERFIRSTNAME=" + USERFIRSTNAME + ", USERLASTNAME=" + USERLASTNAME
				+ ", AGE=" + AGE + ", STORYTYPE=" + STORYTYPE + "]";
	}

}
