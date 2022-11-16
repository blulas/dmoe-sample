package com.mycompany.sample.model;

public class ProductDetails extends ValidationBase {

    private String name;
    private String jCode;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJCode() {
		return this.jCode;
	}

	public void setJCode(String jCode) {
		this.jCode = jCode;
	}
}
