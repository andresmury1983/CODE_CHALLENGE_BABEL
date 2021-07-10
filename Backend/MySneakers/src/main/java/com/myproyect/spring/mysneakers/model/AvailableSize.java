package com.myproyect.spring.mysneakers.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AvailableSize {
   
	@JsonProperty("id")
	private String id;
	
	@JsonProperty("size")
	private String size;
	
	@JsonProperty("amount")
	private String amount;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "AvailableSize [id=" + id + ", size=" + size + ", amount=" + amount + "]";
	}
	
	
	
}
