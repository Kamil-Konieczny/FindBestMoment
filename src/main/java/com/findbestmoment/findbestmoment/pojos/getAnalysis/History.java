
package com.findbestmoment.findbestmoment.pojos.getAnalysis;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "maxAge",
    "epsActual",
    "epsEstimate",
    "epsDifference",
    "surprisePercent",
    "quarter",
    "period"
})
@Generated("jsonschema2pojo")
public class History {

    @JsonProperty("maxAge")
    private Integer maxAge;
    @JsonProperty("epsActual")
    private EpsActual epsActual;
    @JsonProperty("epsEstimate")
    private EpsEstimate epsEstimate;
    @JsonProperty("epsDifference")
    private EpsDifference epsDifference;
    @JsonProperty("surprisePercent")
    private SurprisePercent surprisePercent;
    @JsonProperty("quarter")
    private Quarter quarter;
    @JsonProperty("period")
    private String period;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("maxAge")
    public Integer getMaxAge() {
        return maxAge;
    }

    @JsonProperty("maxAge")
    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

    @JsonProperty("epsActual")
    public EpsActual getEpsActual() {
        return epsActual;
    }

    @JsonProperty("epsActual")
    public void setEpsActual(EpsActual epsActual) {
        this.epsActual = epsActual;
    }

    @JsonProperty("epsEstimate")
    public EpsEstimate getEpsEstimate() {
        return epsEstimate;
    }

    @JsonProperty("epsEstimate")
    public void setEpsEstimate(EpsEstimate epsEstimate) {
        this.epsEstimate = epsEstimate;
    }

    @JsonProperty("epsDifference")
    public EpsDifference getEpsDifference() {
        return epsDifference;
    }

    @JsonProperty("epsDifference")
    public void setEpsDifference(EpsDifference epsDifference) {
        this.epsDifference = epsDifference;
    }

    @JsonProperty("surprisePercent")
    public SurprisePercent getSurprisePercent() {
        return surprisePercent;
    }

    @JsonProperty("surprisePercent")
    public void setSurprisePercent(SurprisePercent surprisePercent) {
        this.surprisePercent = surprisePercent;
    }

    @JsonProperty("quarter")
    public Quarter getQuarter() {
        return quarter;
    }

    @JsonProperty("quarter")
    public void setQuarter(Quarter quarter) {
        this.quarter = quarter;
    }

    @JsonProperty("period")
    public String getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(String period) {
        this.period = period;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
