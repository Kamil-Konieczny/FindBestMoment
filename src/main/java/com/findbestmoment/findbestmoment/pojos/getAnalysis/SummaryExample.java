
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
    "recommendationTrend",
    "financialsTemplate",
    "price",
    "earningsHistory",
    "indexTrend",
    "financialData",
    "earningsTrend",
    "quoteType",
    "sectorTrend",
    "summaryDetail",
    "symbol",
    "upgradeDowngradeHistory",
    "pageViews",
    "industryTrend"
})
@Generated("jsonschema2pojo")
public class SummaryExample {

    @JsonProperty("recommendationTrend")
    private RecommendationTrend recommendationTrend;
    @JsonProperty("financialsTemplate")
    private FinancialsTemplate financialsTemplate;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("earningsHistory")
    private EarningsHistory earningsHistory;
    @JsonProperty("indexTrend")
    private IndexTrend indexTrend;
    @JsonProperty("financialData")
    private FinancialData financialData;
    @JsonProperty("earningsTrend")
    private EarningsTrend earningsTrend;
    @JsonProperty("quoteType")
    private QuoteType quoteType;
    @JsonProperty("sectorTrend")
    private SectorTrend sectorTrend;
    @JsonProperty("summaryDetail")
    private SummaryDetail summaryDetail;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("upgradeDowngradeHistory")
    private UpgradeDowngradeHistory upgradeDowngradeHistory;
    @JsonProperty("pageViews")
    private PageViews pageViews;
    @JsonProperty("industryTrend")
    private IndustryTrend industryTrend;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("recommendationTrend")
    public RecommendationTrend getRecommendationTrend() {
        return recommendationTrend;
    }

    @JsonProperty("recommendationTrend")
    public void setRecommendationTrend(RecommendationTrend recommendationTrend) {
        this.recommendationTrend = recommendationTrend;
    }

    @JsonProperty("financialsTemplate")
    public FinancialsTemplate getFinancialsTemplate() {
        return financialsTemplate;
    }

    @JsonProperty("financialsTemplate")
    public void setFinancialsTemplate(FinancialsTemplate financialsTemplate) {
        this.financialsTemplate = financialsTemplate;
    }

    @JsonProperty("price")
    public Price getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Price price) {
        this.price = price;
    }

    @JsonProperty("earningsHistory")
    public EarningsHistory getEarningsHistory() {
        return earningsHistory;
    }

    @JsonProperty("earningsHistory")
    public void setEarningsHistory(EarningsHistory earningsHistory) {
        this.earningsHistory = earningsHistory;
    }

    @JsonProperty("indexTrend")
    public IndexTrend getIndexTrend() {
        return indexTrend;
    }

    @JsonProperty("indexTrend")
    public void setIndexTrend(IndexTrend indexTrend) {
        this.indexTrend = indexTrend;
    }

    @JsonProperty("financialData")
    public FinancialData getFinancialData() {
        return financialData;
    }

    @JsonProperty("financialData")
    public void setFinancialData(FinancialData financialData) {
        this.financialData = financialData;
    }

    @JsonProperty("earningsTrend")
    public EarningsTrend getEarningsTrend() {
        return earningsTrend;
    }

    @JsonProperty("earningsTrend")
    public void setEarningsTrend(EarningsTrend earningsTrend) {
        this.earningsTrend = earningsTrend;
    }

    @JsonProperty("quoteType")
    public QuoteType getQuoteType() {
        return quoteType;
    }

    @JsonProperty("quoteType")
    public void setQuoteType(QuoteType quoteType) {
        this.quoteType = quoteType;
    }

    @JsonProperty("sectorTrend")
    public SectorTrend getSectorTrend() {
        return sectorTrend;
    }

    @JsonProperty("sectorTrend")
    public void setSectorTrend(SectorTrend sectorTrend) {
        this.sectorTrend = sectorTrend;
    }

    @JsonProperty("summaryDetail")
    public SummaryDetail getSummaryDetail() {
        return summaryDetail;
    }

    @JsonProperty("summaryDetail")
    public void setSummaryDetail(SummaryDetail summaryDetail) {
        this.summaryDetail = summaryDetail;
    }

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("upgradeDowngradeHistory")
    public UpgradeDowngradeHistory getUpgradeDowngradeHistory() {
        return upgradeDowngradeHistory;
    }

    @JsonProperty("upgradeDowngradeHistory")
    public void setUpgradeDowngradeHistory(UpgradeDowngradeHistory upgradeDowngradeHistory) {
        this.upgradeDowngradeHistory = upgradeDowngradeHistory;
    }

    @JsonProperty("pageViews")
    public PageViews getPageViews() {
        return pageViews;
    }

    @JsonProperty("pageViews")
    public void setPageViews(PageViews pageViews) {
        this.pageViews = pageViews;
    }

    @JsonProperty("industryTrend")
    public IndustryTrend getIndustryTrend() {
        return industryTrend;
    }

    @JsonProperty("industryTrend")
    public void setIndustryTrend(IndustryTrend industryTrend) {
        this.industryTrend = industryTrend;
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
