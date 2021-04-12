
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
    "numberOfAnalysts",
    "yearAgoRevenue",
    "growth"
})
@Generated("jsonschema2pojo")
public class RevenueEstimate {

    @JsonProperty("avg")
    private Avg__1 avg;
    @JsonProperty("low")
    private Low__1 low;
    @JsonProperty("high")
    private High__1 high;
    @JsonProperty("numberOfAnalysts")
    private NumberOfAnalysts__1 numberOfAnalysts;
    @JsonProperty("yearAgoRevenue")
    private YearAgoRevenue yearAgoRevenue;
    @JsonProperty("growth")
    private Growth__3 growth;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("avg")
    public Avg__1 getAvg() {
        return avg;
    }

    @JsonProperty("avg")
    public void setAvg(Avg__1 avg) {
        this.avg = avg;
    }

    @JsonProperty("low")
    public Low__1 getLow() {
        return low;
    }

    @JsonProperty("low")
    public void setLow(Low__1 low) {
        this.low = low;
    }

    @JsonProperty("high")
    public High__1 getHigh() {
        return high;
    }

    @JsonProperty("high")
    public void setHigh(High__1 high) {
        this.high = high;
    }

    @JsonProperty("numberOfAnalysts")
    public NumberOfAnalysts__1 getNumberOfAnalysts() {
        return numberOfAnalysts;
    }

    @JsonProperty("numberOfAnalysts")
    public void setNumberOfAnalysts(NumberOfAnalysts__1 numberOfAnalysts) {
        this.numberOfAnalysts = numberOfAnalysts;
    }

    @JsonProperty("yearAgoRevenue")
    public YearAgoRevenue getYearAgoRevenue() {
        return yearAgoRevenue;
    }

    @JsonProperty("yearAgoRevenue")
    public void setYearAgoRevenue(YearAgoRevenue yearAgoRevenue) {
        this.yearAgoRevenue = yearAgoRevenue;
    }

    @JsonProperty("growth")
    public Growth__3 getGrowth() {
        return growth;
    }

    @JsonProperty("growth")
    public void setGrowth(Growth__3 growth) {
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
