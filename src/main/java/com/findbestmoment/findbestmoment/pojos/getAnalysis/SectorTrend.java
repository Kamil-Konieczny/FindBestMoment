
package com.findbestmoment.findbestmoment.pojos.getAnalysis;

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
    "maxAge",
    "symbol",
    "peRatio",
    "pegRatio",
    "estimates"
})
@Generated("jsonschema2pojo")
public class SectorTrend {

    @JsonProperty("maxAge")
    private Integer maxAge;
    @JsonProperty("symbol")
    private Object symbol;
    @JsonProperty("peRatio")
    private PeRatio__1 peRatio;
    @JsonProperty("pegRatio")
    private PegRatio__1 pegRatio;
    @JsonProperty("estimates")
    private List<Object> estimates = null;
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

    @JsonProperty("symbol")
    public Object getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(Object symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("peRatio")
    public PeRatio__1 getPeRatio() {
        return peRatio;
    }

    @JsonProperty("peRatio")
    public void setPeRatio(PeRatio__1 peRatio) {
        this.peRatio = peRatio;
    }

    @JsonProperty("pegRatio")
    public PegRatio__1 getPegRatio() {
        return pegRatio;
    }

    @JsonProperty("pegRatio")
    public void setPegRatio(PegRatio__1 pegRatio) {
        this.pegRatio = pegRatio;
    }

    @JsonProperty("estimates")
    public List<Object> getEstimates() {
        return estimates;
    }

    @JsonProperty("estimates")
    public void setEstimates(List<Object> estimates) {
        this.estimates = estimates;
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
