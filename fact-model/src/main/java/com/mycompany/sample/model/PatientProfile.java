package com.mycompany.sample.model;

import java.time.LocalDate;

public class PatientProfile extends ValidationBase {

    private String firstName;
    private String middleName;
    private String lastName;
    private String suffixName;
    private String gender;
    private LocalDate dateOfBirth;
    private String sSN;
    private Address address;
    private Pharmacy preferredPharmacy;

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSuffixName() {
		return this.suffixName;
	}

	public void setSuffixName(String suffixName) {
		this.suffixName = suffixName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getSSN() {
		return this.sSN;
	}

	public void setSSN(String sSN) {
		this.sSN = sSN;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Pharmacy getPreferredPharmacy() {
		return this.preferredPharmacy;
	}

	public void setPreferredPharmacy(Pharmacy preferredPharmacy) {
		this.preferredPharmacy = preferredPharmacy;
	}
}
