package com.mycompany.sample.model;

import java.time.LocalDate;

public class ConsentDetails extends ValidationBase {

    private boolean patientAttestationOnFile;
    private LocalDate patientAttestationDateOnFile;
    private boolean providerAttestationOnFile;
    private LocalDate providerAttestationDateOnFile;
    private boolean parentOrGuardianAttestationOnFile;
    private LocalDate parentOrGuardianDateOnFile;
    private boolean activePrescriptiononFile;
    private boolean theReaValidPrescriptiononFile;

	public boolean isPatientAttestationOnFile() {
		return this.patientAttestationOnFile;
	}

	public void setPatientAttestationOnFile(boolean patientAttestationOnFile) {
		this.patientAttestationOnFile = patientAttestationOnFile;
	}

	public LocalDate getPatientAttestationDateOnFile() {
		return this.patientAttestationDateOnFile;
	}

	public void setPatientAttestationDateOnFile(LocalDate patientAttestationDateOnFile) {
		this.patientAttestationDateOnFile = patientAttestationDateOnFile;
	}

	public boolean isProviderAttestationOnFile() {
		return this.providerAttestationOnFile;
	}

	public void setProviderAttestationOnFile(boolean providerAttestationOnFile) {
		this.providerAttestationOnFile = providerAttestationOnFile;
	}

	public LocalDate getProviderAttestationDateOnFile() {
		return this.providerAttestationDateOnFile;
	}

	public void setProviderAttestationDateOnFile(LocalDate providerAttestationDateOnFile) {
		this.providerAttestationDateOnFile = providerAttestationDateOnFile;
	}

	public boolean isParentOrGuardianAttestationOnFile() {
		return this.parentOrGuardianAttestationOnFile;
	}

	public void setParentOrGuardianAttestationOnFile(boolean parentOrGuardianAttestationOnFile) {
		this.parentOrGuardianAttestationOnFile = parentOrGuardianAttestationOnFile;
	}

	public LocalDate getParentOrGuardianDateOnFile() {
		return this.parentOrGuardianDateOnFile;
	}

	public void setParentOrGuardianDateOnFile(LocalDate parentOrGuardianDateOnFile) {
		this.parentOrGuardianDateOnFile = parentOrGuardianDateOnFile;
	}

	public boolean isActivePrescriptiononFile() {
		return this.activePrescriptiononFile;
	}

	public void setActivePrescriptiononFile(boolean activePrescriptiononFile) {
		this.activePrescriptiononFile = activePrescriptiononFile;
	}

	public boolean isTheReaValidPrescriptiononFile() {
		return this.theReaValidPrescriptiononFile;
	}

	public void setTheReaValidPrescriptiononFile(boolean theReaValidPrescriptiononFile) {
		this.theReaValidPrescriptiononFile = theReaValidPrescriptiononFile;
	}
}
