package com.mycompany.sample.model;

public class Provider extends ValidationBase {

    private String firstName;
    private String lastName;
    private String NPI;
    private String taxID;
    private Address address;

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNPI() {
		return this.NPI;
	}

	public void setNPI(String NPI) {
		this.NPI = NPI;
	}

	public String getTaxID() {
		return this.taxID;
	}

	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
