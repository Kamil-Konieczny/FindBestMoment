
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
    "avg",
    "low",
    "high",
    "yearAgoEps",
    "numberOfAnalysts",
    "growth"
})
@Generated("jsonschema2pojo")
public class EarningsEstimate {

    @JsonProperty("avg")
    private Avg avg;
    @JsonProperty("low")
    private Low low;
    @JsonProperty("high")
    private High high;
    @JsonProperty("yearAgoEps")
    private YearAgoEps yearAgoEps;
    @JsonProperty("numberOfAnalysts")
    private NumberOfAnalysts numberOfAnalysts;
    @JsonProperty("growth")
    private Growth__2 growth;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("avg")
    public Avg getAvg() {
        return avg;
    }

    @JsonProperty("avg")
    public void setAvg(Avg avg) {
        this.avg = avg;
    }

    @JsonProperty("low")
    public Low getLow() {
        return low;
    }

    @JsonProperty("low")
    public void setLow(Low low) {
        this.low = low;
    }

    @JsonProperty("high")
    public High getHigh() {
        return high;
    }

    @JsonProperty("high")
    public void setHigh(High high) {
        this.high = high;
    }

    @JsonProperty("yearAgoEps")
    public YearAgoEps getYearAgoEps() {
        return yearAgoEps;
    }

    @JsonProperty("yearAgoEps")
    public void setYearAgoEps(YearAgoEps yearAgoEps) {
        this.yearAgoEps = yearAgoEps;
    }

    @JsonProperty("numberOfAnalysts")
    public NumberOfAnalysts getNumberOfAnalysts() {
        return numberOfAnalysts;
    }

    @JsonProperty("numberOfAnalysts")
    public void setNumberOfAnalysts(NumberOfAnalysts numberOfAnalysts) {
        this.numberOfAnalysts = numberOfAnalysts;
    }

    @JsonProperty("growth")
    public Growth__2 getGrowth() {
        return growth;
    }

    @JsonProperty("growth")
    public void setGrowth(Growth__2 growth) {
        this.growth = growth;
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
