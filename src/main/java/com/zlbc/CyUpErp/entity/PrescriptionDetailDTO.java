package com.zlbc.CyUpErp.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
@Data
public class PrescriptionDetailDTO {
    @JsonProperty("PspCode")
    private String PspCode;
    @JsonProperty("PspType")
    private String PspType;
    @JsonProperty("DrugCode")
    private String DrugCode;
    @JsonProperty("DrugName")
    private String DrugName;
    @JsonProperty("PatientName")
    private String PatientName;
    @JsonProperty("DrugPlace")
    private String DrugPlace;
    @JsonProperty("DrugConsumptionDate")
    private String DrugConsumptionDate;
    @JsonProperty("DrugSpecification")
    private String DrugSpecification;
    @JsonProperty("HospitalCode")
    private String HospitalCode;
    @JsonProperty("ConsumptionFlg")
    private int ConsumptionFlg;
    @JsonProperty("PspDrugAmount")
    private String PspDrugAmount;
    @JsonProperty("DrugConsumption")
    private String DrugConsumption;
    @JsonProperty("DrugFactory")
    private String DrugFactory;
}
