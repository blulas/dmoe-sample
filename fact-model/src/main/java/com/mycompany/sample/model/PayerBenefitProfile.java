package com.mycompany.sample.model;

import java.time.LocalDate;

public class PayerBenefitProfile extends ValidationBase {

    private String benefitType;
    private String name;
    private String phoneNumber;
    private String type;
    private String policyNumber;
    private String insuranceCoverageType;
    private LocalDate dateofService;

	public String getBenefitType() {
		return this.benefitType;
	}

	public void setBenefitType(String benefitType) {
		this.benefitType = benefitType;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPolicyNumber() {
		return this.policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getInsuranceCoverageType() {
		return this.insuranceCoverageType;
	}

	public void setInsuranceCoverageType(String insuranceCoverageType) {
		this.insuranceCoverageType = insuranceCoverageType;
	}

	public LocalDate getDateofService() {
		return this.dateofService;
	}

	public void setDateofService(LocalDate dateofService) {
		this.dateofService = dateofService;
	}
}
