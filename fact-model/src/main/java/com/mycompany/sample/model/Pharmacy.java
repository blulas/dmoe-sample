package com.mycompany.sample.model;

public class Pharmacy extends ValidationBase {

    private String name;
    private Address address;
    private String NPI;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getNPI() {
		return this.NPI;
	}

	public void setNPI(String NPI) {
		this.NPI = NPI;
	}
}
