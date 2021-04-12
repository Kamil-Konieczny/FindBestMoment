
package com.findbestmoment.findbestmoment.pojos.biggestMovers;

import java.util.HashMap;
import java.util.List;
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
    "field",
    "operators",
    "values",
    "labelsSelected"
})
@Generated("jsonschema2pojo")
public class Criterium {

    @JsonProperty("field")
    private String field;
    @JsonProperty("operators")
    private List<String> operators = null;
    @JsonProperty("values")
    private List<Double> values = null;
    @JsonProperty("labelsSelected")
    private List<Integer> labelsSelected = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("field")
    public String getField() {
        return field;
    }

    @JsonProperty("field")
    public void setField(String field) {
        this.field = field;
    }

    @JsonProperty("operators")
    public List<String> getOperators() {
        return operators;
    }

    @JsonProperty("operators")
    public void setOperators(List<String> operators) {
        this.operators = operators;
    }

    @JsonProperty("values")
    public List<Double> getValues() {
        return values;
    }

    @JsonProperty("values")
    public void setValues(List<Double> values) {
        this.values = values;
    }

    @JsonProperty("labelsSelected")
    public List<Integer> getLabelsSelected() {
        return labelsSelected;
    }

    @JsonProperty("labelsSelected")
    public void setLabelsSelected(List<Integer> labelsSelected) {
        this.labelsSelected = labelsSelected;
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
