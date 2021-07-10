package com.myproyect.spring.mysneakers.domain;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SneakersResponse<Sneaker> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("listSneaker")
	protected List<Sneaker> list;

	public List<Sneaker> getList() {
		return list;
	}

	public void setList(List<Sneaker> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "SneakersResponse [list=" + list + "]";
	} 

}
