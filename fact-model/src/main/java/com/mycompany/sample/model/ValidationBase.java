package com.mycompany.sample.model;

import java.util.List;
import java.util.ArrayList;

public class ValidationBase {

    private List<ValidationMessage> validationMessages = new ArrayList<ValidationMessage>();

	public List<ValidationMessage> getValidationMessages() {
		return this.validationMessages;
	}

	public void setValidationMessages(List<ValidationMessage> validationMessages) {
		this.validationMessages = validationMessages;
	}

    public void addValidationMessage(String code, String text) {

        ValidationMessage msg = new ValidationMessage();
        msg.setCode(code);
        msg.setText(text);

        getValidationMessages().add(msg);
    }
}
 
