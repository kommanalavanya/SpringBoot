package com.jobiak.mvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bank_details")
public class Account {
	@Id
	private Long bankId;
	   private String name;
	   private String email;
	   private String accno;
	   private Double balance;
	   public Account() {
		// TODO Auto-generated constructor stub
	}
	   


	public Long getBankId() {
		return bankId;
	}



	public void setBankId(Long bankId) {
		this.bankId = bankId;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	   
	   

}
