package com.order.client.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigDecimal id;
	
	private BigDecimal iduser;
	
	private BigDecimal idcarrer;
	
	private String status;

	public BigDecimal getId() {
		return id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public BigDecimal getIduser() {
		return iduser;
	}

	public void setIduser(BigDecimal iduser) {
		this.iduser = iduser;
	}

	public BigDecimal getIdcarrer() {
		return idcarrer;
	}

	public void setIdcarrer(BigDecimal idcarrer) {
		this.idcarrer = idcarrer;
	}
	
}