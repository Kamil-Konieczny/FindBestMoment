
package com.findbestmoment.findbestmoment.pojos.auto_complete;

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
    "exchange",
    "shortname",
    "quoteType",
    "symbol",
    "index",
    "score",
    "typeDisp",
    "longname",
    "isYahooFinance"
})
@Generated("jsonschema2pojo")
public class Quote {

    @JsonProperty("exchange")
    private String exchange;
    @JsonProperty("shortname")
    private String shortname;
    @JsonProperty("quoteType")
    private String quoteType;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("index")
    private String index;
    @JsonProperty("score")
    private Double score;
    @JsonProperty("typeDisp")
    private String typeDisp;
    @JsonProperty("longname")
    private String longname;
    @JsonProperty("isYahooFinance")
    private Boolean isYahooFinance;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("exchange")
    public String getExchange() {
        return exchange;
    }

    @JsonProperty("exchange")
    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    @JsonProperty("shortname")
    public String getShortname() {
        return shortname;
    }

    @JsonProperty("shortname")
    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    @JsonProperty("quoteType")
    public String getQuoteType() {
        return quoteType;
    }

    @JsonProperty("quoteType")
    public void setQuoteType(String quoteType) {
        this.quoteType = quoteType;
    }

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("index")
    public String getIndex() {
        return index;
    }

    @JsonProperty("index")
    public void setIndex(String index) {
        this.index = index;
    }

    @JsonProperty("score")
    public Double getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Double score) {
        this.score = score;
    }

    @JsonProperty("typeDisp")
    public String getTypeDisp() {
        return typeDisp;
    }

    @JsonProperty("typeDisp")
    public void setTypeDisp(String typeDisp) {
        this.typeDisp = typeDisp;
    }

    @JsonProperty("longname")
    public String getLongname() {
        return longname;
    }

    @JsonProperty("longname")
    public void setLongname(String longname) {
        this.longname = longname;
    }

    @JsonProperty("isYahooFinance")
    public Boolean getIsYahooFinance() {
        return isYahooFinance;
    }

    @JsonProperty("isYahooFinance")
    public void setIsYahooFinance(Boolean isYahooFinance) {
        this.isYahooFinance = isYahooFinance;
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
