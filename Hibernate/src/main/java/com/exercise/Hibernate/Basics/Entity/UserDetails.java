package com.exercise.Hibernate.Basics.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "USER")
public class UserDetails implements Serializable {

	private static final long serialVersionUID = -1L;

	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private Long userId;
	
	@Column(name = "USER_NAME")
	private String userName;
	
	@Column(name = "CREATED_DATE")
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
	/*
	 * Using Embedded annotation
	 */
//	@Embedded
//	private Address temporaryAddress;
	
	/*
	 * Example using Element Collection annotation
	 * If JoinTable is not given then table creates with name "UserDetails_addressList"
	 * If joinColumns is defined then, foreign key is created with name "UserDetails_USER_ID"
	 */
//	@ElementCollection
//	@JoinTable(name = "USER_ADDRESS",
//			joinColumns = @JoinColumn(name = "USER_ID"))
//	Set<Address> addressList = new HashSet<Address>();
	
	/*
	 * In addition to above, we have a new annotations, @GenericGenerator which is used to create a strategy to create primary key
	 * And @CollectionId is used to map the Primary Key name and type of key
	 */
	@ElementCollection
	@JoinTable(name = "USER_ADDRESS",
			joinColumns = @JoinColumn(name = "USER_ID"))
	@GenericGenerator(name = "hilo-gen", strategy = "hilo")
	@CollectionId(columns = {@Column(name="ADDRESS_ID")}, generator ="hilo-gen", type = @Type(type="long"))
	Collection<Address> addressList = new ArrayList<Address>();
	
//	public Address getTemporaryAddress() {
//		return temporaryAddress;
//	}
//
//	public void setTemporaryAddress(Address temporaryAddress) {
//		this.temporaryAddress = temporaryAddress;
//	}

	public Date getCreatedDate() {
		return createdDate;
	}

	
	public Collection<Address> getAddressList() {
		return addressList;
	}


	public void setAddressList(Collection<Address> addressList) {
		this.addressList = addressList;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Long getUserId() {
		return userId;
	}
	
	public UserDetails() {

	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName + "]";
	}
	
}
