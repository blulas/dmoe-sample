package com.mycompany.sample.model;

public class DiagnosisCode extends ValidationBase {

    private String code;
    private String indicator;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getIndicator() {
		return this.indicator;
	}

	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}
}
