
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
    "epochGradeDate",
    "firm",
    "toGrade",
    "fromGrade",
    "action"
})
@Generated("jsonschema2pojo")
public class History__1 {

    @JsonProperty("epochGradeDate")
    private Integer epochGradeDate;
    @JsonProperty("firm")
    private String firm;
    @JsonProperty("toGrade")
    private String toGrade;
    @JsonProperty("fromGrade")
    private String fromGrade;
    @JsonProperty("action")
    private String action;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("epochGradeDate")
    public Integer getEpochGradeDate() {
        return epochGradeDate;
    }

    @JsonProperty("epochGradeDate")
    public void setEpochGradeDate(Integer epochGradeDate) {
        this.epochGradeDate = epochGradeDate;
    }

    @JsonProperty("firm")
    public String getFirm() {
        return firm;
    }

    @JsonProperty("firm")
    public void setFirm(String firm) {
        this.firm = firm;
    }

    @JsonProperty("toGrade")
    public String getToGrade() {
        return toGrade;
    }

    @JsonProperty("toGrade")
    public void setToGrade(String toGrade) {
        this.toGrade = toGrade;
    }

    @JsonProperty("fromGrade")
    public String getFromGrade() {
        return fromGrade;
    }

    @JsonProperty("fromGrade")
    public void setFromGrade(String fromGrade) {
        this.fromGrade = fromGrade;
    }

    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
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
