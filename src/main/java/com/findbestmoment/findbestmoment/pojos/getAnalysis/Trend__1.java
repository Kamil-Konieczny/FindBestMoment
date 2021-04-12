
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
    "period",
    "endDate",
    "growth",
    "earningsEstimate",
    "revenueEstimate",
    "epsTrend",
    "epsRevisions"
})
@Generated("jsonschema2pojo")
public class Trend__1 {

    @JsonProperty("maxAge")
    private Integer maxAge;
    @JsonProperty("period")
    private String period;
    @JsonProperty("endDate")
    private Object endDate;
    @JsonProperty("growth")
    private Growth__1 growth;
    @JsonProperty("earningsEstimate")
    private EarningsEstimate earningsEstimate;
    @JsonProperty("revenueEstimate")
    private RevenueEstimate revenueEstimate;
    @JsonProperty("epsTrend")
    private EpsTrend epsTrend;
    @JsonProperty("epsRevisions")
    private EpsRevisions epsRevisions;
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

    @JsonProperty("period")
    public String getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(String period) {
        this.period = period;
    }

    @JsonProperty("endDate")
    public Object getEndDate() {
        return endDate;
    }

    @JsonProperty("endDate")
    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("growth")
    public Growth__1 getGrowth() {
        return growth;
    }

    @JsonProperty("growth")
    public void setGrowth(Growth__1 growth) {
        this.growth = growth;
    }

    @JsonProperty("earningsEstimate")
    public EarningsEstimate getEarningsEstimate() {
        return earningsEstimate;
    }

    @JsonProperty("earningsEstimate")
    public void setEarningsEstimate(EarningsEstimate earningsEstimate) {
        this.earningsEstimate = earningsEstimate;
    }

    @JsonProperty("revenueEstimate")
    public RevenueEstimate getRevenueEstimate() {
        return revenueEstimate;
    }

    @JsonProperty("revenueEstimate")
    public void setRevenueEstimate(RevenueEstimate revenueEstimate) {
        this.revenueEstimate = revenueEstimate;
    }

    @JsonProperty("epsTrend")
    public EpsTrend getEpsTrend() {
        return epsTrend;
    }

    @JsonProperty("epsTrend")
    public void setEpsTrend(EpsTrend epsTrend) {
        this.epsTrend = epsTrend;
    }

    @JsonProperty("epsRevisions")
    public EpsRevisions getEpsRevisions() {
        return epsRevisions;
    }

    @JsonProperty("epsRevisions")
    public void setEpsRevisions(EpsRevisions epsRevisions) {
        this.epsRevisions = epsRevisions;
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
