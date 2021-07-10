package com.myproyect.spring.mysneakers.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Car {

	@JsonProperty("listSneaker")
	protected List<Sneaker> listSneaker;
	
	@JsonProperty("amount")
	private String amount;
    
	@JsonProperty("value")
	private String value;

	public List<Sneaker> getListSneaker() {
		return listSneaker;
	}

	public void setListSneaker(List<Sneaker> listSneaker) {
		this.listSneaker = listSneaker;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Car [listSneaker=" + listSneaker + ", amount=" + amount + ", value=" + value + "]";
	}
	
	

} 
