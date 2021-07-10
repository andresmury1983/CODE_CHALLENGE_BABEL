package com.myproyect.spring.mysneakers.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sneaker   {
		
	@JsonProperty("id")
	private String id;
	
	@JsonProperty("brand")
	private String brand;

	@JsonProperty("model")
	private String model;
	
	@JsonProperty("price")
	private String price;
	
	@JsonProperty("launchDate")
	private String launchDate;
	
	@JsonProperty("publishDate")
	private String publishDate;
	
	@JsonProperty("image")
	private String image;
	
	@JsonProperty("listAvailableSize")
	protected List<AvailableSize> listaAvailableSize;

	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getLaunchDate() {
		return launchDate;
	}


	public void setLaunchDate(String launchDate) {
		this.launchDate = launchDate;
	}


	public String getPublishDate() {
		return publishDate;
	}


	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public List<AvailableSize> getListaAvailableSize() {
		return listaAvailableSize;
	}


	public void setListaAvailableSize(List<AvailableSize> listaAvailableSize) {
		this.listaAvailableSize = listaAvailableSize;
	}


	@Override
	public String toString() {
		return "Sneaker [id=" + id + ", brand=" + brand + ", model=" + model + ", price=" + price + ", launchDate="
				+ launchDate + ", publishDate=" + publishDate + ", image=" + image + ", listaAvailableSize="
				+ listaAvailableSize + "]";
	}



	

	


}
