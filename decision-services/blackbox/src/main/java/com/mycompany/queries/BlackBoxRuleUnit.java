package com.mycompany.queries;

import org.kie.kogito.rules.DataSource;
import org.kie.kogito.rules.DataStore;
import org.kie.kogito.rules.RuleUnitData;

import java.util.List;
import java.util.ArrayList;

import java.util.List;
import java.util.ArrayList;

import com.mycompany.sample.model.ContextConfig;
import com.mycompany.sample.model.PatientProfile;
import com.mycompany.sample.model.ConsentDetails;
import com.mycompany.sample.model.PolicyHolder;
import com.mycompany.sample.model.Provider;
import com.mycompany.sample.model.Site;
import com.mycompany.sample.model.DiagnosisCode;
import com.mycompany.sample.model.ProductDetails;
import com.mycompany.sample.model.PayerBenefitProfile;

public class BlackBoxRuleUnit implements RuleUnitData {

    private String mLOnlySync;
    private String requestType;
    private DataStore<ContextConfig> contextConfig;
    private DataStore<PatientProfile> patientProfile;
    private DataStore<ConsentDetails> consentDetails;
    private DataStore<PolicyHolder> policyHolder;
    private DataStore<Provider> provider;
    private DataStore<Site> site;
    private DataStore<DiagnosisCode> diagnosisCodes;
    private DataStore<ProductDetails> productDetails;
    private DataStore<String> cptCodes;
    private DataStore<PayerBenefitProfile> payerBenefitProfiles;

    public BlackBoxRuleUnit() {

        this.contextConfig = DataSource.createStore();
        this.patientProfile = DataSource.createStore();
        this.consentDetails = DataSource.createStore();
        this.policyHolder = DataSource.createStore();
        this.provider = DataSource.createStore();
        this.site = DataSource.createStore();
        this.diagnosisCodes = DataSource.createStore();
        this.productDetails = DataSource.createStore();
        this.cptCodes = DataSource.createStore();
        this.payerBenefitProfiles = DataSource.createStore();
    }

    public BlackBoxRuleUnit(String mLOnlySync, String requestType) {

        // Read only stuff
        this.mLOnlySync = mLOnlySync;
        this.requestType = requestType;

        // Read/Write stuff
        this.contextConfig = DataSource.createStore();
        this.patientProfile = DataSource.createStore();
        this.consentDetails = DataSource.createStore();
        this.policyHolder = DataSource.createStore();
        this.provider = DataSource.createStore();
        this.site = DataSource.createStore();
        this.diagnosisCodes = DataSource.createStore();
        this.productDetails = DataSource.createStore();
        this.cptCodes = DataSource.createStore();
        this.payerBenefitProfiles = DataSource.createStore();
    }

    public String getMLOnlySync() {
        return this.mLOnlySync;
    }

    public void setMLOnlySync(String mLOnlySync) {
        this.mLOnlySync = mLOnlySync;
    }

    public String getRequestType() {
        return this.requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public DataSource<ContextConfig> getContextConfig() {
        return this.contextConfig;
    }

    public void setContextConfig(DataStore<ContextConfig> contextConfig) {
        this.contextConfig = contextConfig;
    }

    public DataStore<PatientProfile> getPatientProfile() {
        return this.patientProfile;
    }

    public void setPatientProfile(DataStore<PatientProfile> patientProfile) {
        this.patientProfile = patientProfile;
    }

    public DataStore<ConsentDetails> getConsentDetails() {
        return this.consentDetails;
    }

    public void setConsentDetails(DataStore<ConsentDetails> consentDetails) {
        this.consentDetails = consentDetails;
    }

    public DataStore<Provider> getProvider() {
        return this.provider;
    }

    public void setProvider(DataStore<Provider> provider) {
        this.provider = provider;
    }

    public DataStore<Site> getSite() {
        return this.site;
    }

    public void setSite(DataStore<Site> site) {
        this.site = site;
    }

    public DataStore<DiagnosisCode> getDiagnosisCodes() {
        return this.diagnosisCodes;
    }

    public void setDiagnosisCodes(DataStore<DiagnosisCode> diagnosisCodes) {
        this.diagnosisCodes = diagnosisCodes;
    }

    public DataStore<ProductDetails> getProductDetails() {
        return this.productDetails;
    }

    public void setProductDetails(DataStore<ProductDetails> productDetails) {
        this.productDetails = productDetails;
    }

    public DataStore<String> getCPTCodes() {
        return this.cptCodes;
    }

    public void setCPTCodes(DataStore<String> cPTCodes) {
        this.cptCodes = cptCodes;
    }

    public DataStore<PayerBenefitProfile> getPayerBenefitProfiles() {
        return this.payerBenefitProfiles;
    }

    public void setPayerBenefitProfiles(DataStore<PayerBenefitProfile> payerBenefitProfiles) {
        this.payerBenefitProfiles = payerBenefitProfiles;
    }
}
