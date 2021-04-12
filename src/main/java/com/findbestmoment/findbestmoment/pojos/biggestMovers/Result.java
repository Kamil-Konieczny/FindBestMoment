
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
    "id",
    "title",
    "description",
    "canonicalName",
    "criteriaMeta",
    "rawCriteria",
    "start",
    "count",
    "total",
    "quotes",
    "predefinedScr",
    "versionId"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("canonicalName")
    private String canonicalName;
    @JsonProperty("criteriaMeta")
    private CriteriaMeta criteriaMeta;
    @JsonProperty("rawCriteria")
    private String rawCriteria;
    @JsonProperty("start")
    private Integer start;
    @JsonProperty("count")
    private Integer count;
    @JsonProperty("total")
    private Integer total;
    @JsonProperty("quotes")
    private List<Quote> quotes = null;
    @JsonProperty("predefinedScr")
    private Boolean predefinedScr;
    @JsonProperty("versionId")
    private Integer versionId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("canonicalName")
    public String getCanonicalName() {
        return canonicalName;
    }

    @JsonProperty("canonicalName")
    public void setCanonicalName(String canonicalName) {
        this.canonicalName = canonicalName;
    }

    @JsonProperty("criteriaMeta")
    public CriteriaMeta getCriteriaMeta() {
        return criteriaMeta;
    }

    @JsonProperty("criteriaMeta")
    public void setCriteriaMeta(CriteriaMeta criteriaMeta) {
        this.criteriaMeta = criteriaMeta;
    }

    @JsonProperty("rawCriteria")
    public String getRawCriteria() {
        return rawCriteria;
    }

    @JsonProperty("rawCriteria")
    public void setRawCriteria(String rawCriteria) {
        this.rawCriteria = rawCriteria;
    }

    @JsonProperty("start")
    public Integer getStart() {
        return start;
    }

    @JsonProperty("start")
    public void setStart(Integer start) {
        this.start = start;
    }

    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    @JsonProperty("quotes")
    public List<Quote> getQuotes() {
        return quotes;
    }

    @JsonProperty("quotes")
    public void setQuotes(List<Quote> quotes) {
        this.quotes = quotes;
    }

    @JsonProperty("predefinedScr")
    public Boolean getPredefinedScr() {
        return predefinedScr;
    }

    @JsonProperty("predefinedScr")
    public void setPredefinedScr(Boolean predefinedScr) {
        this.predefinedScr = predefinedScr;
    }

    @JsonProperty("versionId")
    public Integer getVersionId() {
        return versionId;
    }

    @JsonProperty("versionId")
    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
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
