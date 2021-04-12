
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
    "current",
    "7daysAgo",
    "30daysAgo",
    "60daysAgo",
    "90daysAgo"
})
@Generated("jsonschema2pojo")
public class EpsTrend {

    @JsonProperty("current")
    private Current current;
    @JsonProperty("7daysAgo")
    private _7daysAgo _7daysAgo;
    @JsonProperty("30daysAgo")
    private _30daysAgo _30daysAgo;
    @JsonProperty("60daysAgo")
    private _60daysAgo _60daysAgo;
    @JsonProperty("90daysAgo")
    private _90daysAgo _90daysAgo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("current")
    public Current getCurrent() {
        return current;
    }

    @JsonProperty("current")
    public void setCurrent(Current current) {
        this.current = current;
    }

    @JsonProperty("7daysAgo")
    public _7daysAgo get7daysAgo() {
        return _7daysAgo;
    }

    @JsonProperty("7daysAgo")
    public void set7daysAgo(_7daysAgo _7daysAgo) {
        this._7daysAgo = _7daysAgo;
    }

    @JsonProperty("30daysAgo")
    public _30daysAgo get30daysAgo() {
        return _30daysAgo;
    }

    @JsonProperty("30daysAgo")
    public void set30daysAgo(_30daysAgo _30daysAgo) {
        this._30daysAgo = _30daysAgo;
    }

    @JsonProperty("60daysAgo")
    public _60daysAgo get60daysAgo() {
        return _60daysAgo;
    }

    @JsonProperty("60daysAgo")
    public void set60daysAgo(_60daysAgo _60daysAgo) {
        this._60daysAgo = _60daysAgo;
    }

    @JsonProperty("90daysAgo")
    public _90daysAgo get90daysAgo() {
        return _90daysAgo;
    }

    @JsonProperty("90daysAgo")
    public void set90daysAgo(_90daysAgo _90daysAgo) {
        this._90daysAgo = _90daysAgo;
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
