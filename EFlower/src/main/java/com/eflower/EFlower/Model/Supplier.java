package com.eflower.EFlower.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Supplier {
	private String supplierName;
	@Id
	private String supplierId;
	private String supplierPassword;
	private String supplierContact;
	private String supplierMail;
	private String supplirAddress;
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierPassword() {
		return supplierPassword;
	}
	public void setSupplierPassword(String supplierPassword) {
		this.supplierPassword = supplierPassword;
	}
	public String getSupplierContact() {
		return supplierContact;
	}
	public void setSupplierContact(String supplierContact) {
		this.supplierContact = supplierContact;
	}
	public String getSupplierMail() {
		return supplierMail;
	}
	public void setSupplierMail(String supplierMail) {
		this.supplierMail = supplierMail;
	}
	public String getSupplirAddress() {
		return supplirAddress;
	}
	public void setSupplirAddress(String supplirAddress) {
		this.supplirAddress = supplirAddress;
	}
	
	
	

}
