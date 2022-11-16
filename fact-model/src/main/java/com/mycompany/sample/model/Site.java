package com.mycompany.sample.model;

public class Site extends ValidationBase {

    private String name;
    private String NPI;
    private String taxID;
    private Address address;
    private String facilityType;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getFacilityType() {
		return this.facilityType;
	}

	public void setFacilityType(String facilityType) {
		this.facilityType = facilityType;
	}
}
