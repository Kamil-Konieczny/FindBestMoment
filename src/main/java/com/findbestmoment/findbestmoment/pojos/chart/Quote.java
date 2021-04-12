
package com.findbestmoment.findbestmoment.pojos.chart;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "close",
    "low",
    "volume",
    "high",
    "open"
})
public class Quote {

    @JsonProperty("close")
    private List<Double> close = null;
    @JsonProperty("low")
    private List<Double> low = null;
    @JsonProperty("volume")
    private List<Integer> volume = null;
    @JsonProperty("high")
    private List<Double> high = null;
    @JsonProperty("open")
    private List<Double> open = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("close")
    public List<Double> getClose() {
        return close;
    }

    @JsonProperty("close")
    public void setClose(List<Double> close) {
        this.close = close;
    }

    @JsonProperty("low")
    public List<Double> getLow() {
        return low;
    }

    @JsonProperty("low")
    public void setLow(List<Double> low) {
        this.low = low;
    }

    @JsonProperty("volume")
    public List<Integer> getVolume() {
        return volume;
    }

    @JsonProperty("volume")
    public void setVolume(List<Integer> volume) {
        this.volume = volume;
    }

    @JsonProperty("high")
    public List<Double> getHigh() {
        return high;
    }

    @JsonProperty("high")
    public void setHigh(List<Double> high) {
        this.high = high;
    }

    @JsonProperty("open")
    public List<Double> getOpen() {
        return open;
    }

    @JsonProperty("open")
    public void setOpen(List<Double> open) {
        this.open = open;
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
