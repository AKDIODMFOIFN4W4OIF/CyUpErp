package com.zlbc.CyUpErp.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
@Data
public class PrescriptionDetailDTO {
    @JsonProperty("PspCode")
    private String pspCode;
    @JsonProperty("PspType")
    private String pspType;
    @JsonProperty("DrugCode")
    private String drugCode;
    @JsonProperty("DrugName")
    private String drugName;
    @JsonProperty("PatientName")
    private String patientName;
    @JsonProperty("DrugPlace")
    private String drugPlace;
    @JsonProperty("DrugConsumptionDate")
    private String drugConsumptionDate;
    @JsonProperty("DrugSpecification")
    private String drugSpecification;
    @JsonProperty("HospitalCode")
    private String hospitalCode;
    @JsonProperty("ConsumptionFlg")
    private int consumptionFlg;
    @JsonProperty("PspDrugAmount")
    private String pspDrugAmount;
    @JsonProperty("DrugConsumption")
    private String drugConsumption;
    @JsonProperty("DrugFactory")
    private String drugFactory;
}
