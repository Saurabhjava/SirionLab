package com.sirion.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class DL {
	@Id
	private String dlNo;
	private LocalDate issueDate;
	private LocalDate expDate;
	@ElementCollection
	@CollectionTable(name = "vehicle")
	List<String> vehicleType;
	@OneToOne(mappedBy = "dl")
	private Person person;
	
	public DL() {
		// TODO Auto-generated constructor stub
	}
	public DL(String dlNo, LocalDate issueDate, LocalDate expDate, List<String> vehicleType) {
		super();
		this.dlNo = dlNo;
		this.issueDate = issueDate;
		this.expDate = expDate;
		this.vehicleType = vehicleType;
	}

	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public String getDlNo() {
		return dlNo;
	}
	public void setDlNo(String dlNo) {
		this.dlNo = dlNo;
	}
	public LocalDate getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}
	public LocalDate getExpDate() {
		return expDate;
	}
	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}
	public List<String> getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(List<String> vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	
	

}
