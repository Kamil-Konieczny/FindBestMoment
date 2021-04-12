
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
    "size",
    "offset",
    "sortField",
    "sortType",
    "quoteType",
    "topOperator",
    "criteria"
})
@Generated("jsonschema2pojo")
public class CriteriaMeta {

    @JsonProperty("size")
    private Integer size;
    @JsonProperty("offset")
    private Integer offset;
    @JsonProperty("sortField")
    private String sortField;
    @JsonProperty("sortType")
    private String sortType;
    @JsonProperty("quoteType")
    private String quoteType;
    @JsonProperty("topOperator")
    private String topOperator;
    @JsonProperty("criteria")
    private List<Criterium> criteria = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    @JsonProperty("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @JsonProperty("sortField")
    public String getSortField() {
        return sortField;
    }

    @JsonProperty("sortField")
    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    @JsonProperty("sortType")
    public String getSortType() {
        return sortType;
    }

    @JsonProperty("sortType")
    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    @JsonProperty("quoteType")
    public String getQuoteType() {
        return quoteType;
    }

    @JsonProperty("quoteType")
    public void setQuoteType(String quoteType) {
        this.quoteType = quoteType;
    }

    @JsonProperty("topOperator")
    public String getTopOperator() {
        return topOperator;
    }

    @JsonProperty("topOperator")
    public void setTopOperator(String topOperator) {
        this.topOperator = topOperator;
    }

    @JsonProperty("criteria")
    public List<Criterium> getCriteria() {
        return criteria;
    }

    @JsonProperty("criteria")
    public void setCriteria(List<Criterium> criteria) {
        this.criteria = criteria;
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
