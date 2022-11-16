package com.mycompany.sample.model;

import java.time.LocalDate;

public class ContextConfig extends ValidationBase {

    private String customerRecordID;
    private String benefitVerificationID;
    private String clientID;

	public String getCustomerRecordID() {
		return this.customerRecordID;
	}

	public void setCustomerRecordID(String customerRecordID) {
		this.customerRecordID = customerRecordID;
	}

	public String getBenefitVerificationID() {
		return this.benefitVerificationID;
	}

	public void setBenefitVerificationID(String benefitVerificationID) {
		this.benefitVerificationID = benefitVerificationID;
	}

	public String getClientID() {
		return this.clientID;
	}

	public void setClientID(String clientID) {
		this.clientID = clientID;
	}
}
