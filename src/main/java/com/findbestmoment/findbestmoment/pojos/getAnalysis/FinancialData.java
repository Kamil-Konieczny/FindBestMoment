
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
    "ebitdaMargins",
    "profitMargins",
    "grossMargins",
    "operatingCashflow",
    "revenueGrowth",
    "operatingMargins",
    "ebitda",
    "targetLowPrice",
    "recommendationKey",
    "grossProfits",
    "freeCashflow",
    "targetMedianPrice",
    "currentPrice",
    "earningsGrowth",
    "currentRatio",
    "returnOnAssets",
    "numberOfAnalystOpinions",
    "targetMeanPrice",
    "debtToEquity",
    "returnOnEquity",
    "targetHighPrice",
    "totalCash",
    "totalDebt",
    "totalRevenue",
    "totalCashPerShare",
    "financialCurrency",
    "maxAge",
    "revenuePerShare",
    "quickRatio",
    "recommendationMean"
})
@Generated("jsonschema2pojo")
public class FinancialData {

    @JsonProperty("ebitdaMargins")
    private EbitdaMargins ebitdaMargins;
    @JsonProperty("profitMargins")
    private ProfitMargins profitMargins;
    @JsonProperty("grossMargins")
    private GrossMargins grossMargins;
    @JsonProperty("operatingCashflow")
    private OperatingCashflow operatingCashflow;
    @JsonProperty("revenueGrowth")
    private RevenueGrowth revenueGrowth;
    @JsonProperty("operatingMargins")
    private OperatingMargins operatingMargins;
    @JsonProperty("ebitda")
    private Ebitda ebitda;
    @JsonProperty("targetLowPrice")
    private TargetLowPrice targetLowPrice;
    @JsonProperty("recommendationKey")
    private String recommendationKey;
    @JsonProperty("grossProfits")
    private GrossProfits grossProfits;
    @JsonProperty("freeCashflow")
    private FreeCashflow freeCashflow;
    @JsonProperty("targetMedianPrice")
    private TargetMedianPrice targetMedianPrice;
    @JsonProperty("currentPrice")
    private CurrentPrice currentPrice;
    @JsonProperty("earningsGrowth")
    private EarningsGrowth earningsGrowth;
    @JsonProperty("currentRatio")
    private CurrentRatio currentRatio;
    @JsonProperty("returnOnAssets")
    private ReturnOnAssets returnOnAssets;
    @JsonProperty("numberOfAnalystOpinions")
    private NumberOfAnalystOpinions numberOfAnalystOpinions;
    @JsonProperty("targetMeanPrice")
    private TargetMeanPrice targetMeanPrice;
    @JsonProperty("debtToEquity")
    private DebtToEquity debtToEquity;
    @JsonProperty("returnOnEquity")
    private ReturnOnEquity returnOnEquity;
    @JsonProperty("targetHighPrice")
    private TargetHighPrice targetHighPrice;
    @JsonProperty("totalCash")
    private TotalCash totalCash;
    @JsonProperty("totalDebt")
    private TotalDebt totalDebt;
    @JsonProperty("totalRevenue")
    private TotalRevenue totalRevenue;
    @JsonProperty("totalCashPerShare")
    private TotalCashPerShare totalCashPerShare;
    @JsonProperty("financialCurrency")
    private String financialCurrency;
    @JsonProperty("maxAge")
    private Integer maxAge;
    @JsonProperty("revenuePerShare")
    private RevenuePerShare revenuePerShare;
    @JsonProperty("quickRatio")
    private QuickRatio quickRatio;
    @JsonProperty("recommendationMean")
    private RecommendationMean recommendationMean;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ebitdaMargins")
    public EbitdaMargins getEbitdaMargins() {
        return ebitdaMargins;
    }

    @JsonProperty("ebitdaMargins")
    public void setEbitdaMargins(EbitdaMargins ebitdaMargins) {
        this.ebitdaMargins = ebitdaMargins;
    }

    @JsonProperty("profitMargins")
    public ProfitMargins getProfitMargins() {
        return profitMargins;
    }

    @JsonProperty("profitMargins")
    public void setProfitMargins(ProfitMargins profitMargins) {
        this.profitMargins = profitMargins;
    }

    @JsonProperty("grossMargins")
    public GrossMargins getGrossMargins() {
        return grossMargins;
    }

    @JsonProperty("grossMargins")
    public void setGrossMargins(GrossMargins grossMargins) {
        this.grossMargins = grossMargins;
    }

    @JsonProperty("operatingCashflow")
    public OperatingCashflow getOperatingCashflow() {
        return operatingCashflow;
    }

    @JsonProperty("operatingCashflow")
    public void setOperatingCashflow(OperatingCashflow operatingCashflow) {
        this.operatingCashflow = operatingCashflow;
    }

    @JsonProperty("revenueGrowth")
    public RevenueGrowth getRevenueGrowth() {
        return revenueGrowth;
    }

    @JsonProperty("revenueGrowth")
    public void setRevenueGrowth(RevenueGrowth revenueGrowth) {
        this.revenueGrowth = revenueGrowth;
    }

    @JsonProperty("operatingMargins")
    public OperatingMargins getOperatingMargins() {
        return operatingMargins;
    }

    @JsonProperty("operatingMargins")
    public void setOperatingMargins(OperatingMargins operatingMargins) {
        this.operatingMargins = operatingMargins;
    }

    @JsonProperty("ebitda")
    public Ebitda getEbitda() {
        return ebitda;
    }

    @JsonProperty("ebitda")
    public void setEbitda(Ebitda ebitda) {
        this.ebitda = ebitda;
    }

    @JsonProperty("targetLowPrice")
    public TargetLowPrice getTargetLowPrice() {
        return targetLowPrice;
    }

    @JsonProperty("targetLowPrice")
    public void setTargetLowPrice(TargetLowPrice targetLowPrice) {
        this.targetLowPrice = targetLowPrice;
    }

    @JsonProperty("recommendationKey")
    public String getRecommendationKey() {
        return recommendationKey;
    }

    @JsonProperty("recommendationKey")
    public void setRecommendationKey(String recommendationKey) {
        this.recommendationKey = recommendationKey;
    }

    @JsonProperty("grossProfits")
    public GrossProfits getGrossProfits() {
        return grossProfits;
    }

    @JsonProperty("grossProfits")
    public void setGrossProfits(GrossProfits grossProfits) {
        this.grossProfits = grossProfits;
    }

    @JsonProperty("freeCashflow")
    public FreeCashflow getFreeCashflow() {
        return freeCashflow;
    }

    @JsonProperty("freeCashflow")
    public void setFreeCashflow(FreeCashflow freeCashflow) {
        this.freeCashflow = freeCashflow;
    }

    @JsonProperty("targetMedianPrice")
    public TargetMedianPrice getTargetMedianPrice() {
        return targetMedianPrice;
    }

    @JsonProperty("targetMedianPrice")
    public void setTargetMedianPrice(TargetMedianPrice targetMedianPrice) {
        this.targetMedianPrice = targetMedianPrice;
    }

    @JsonProperty("currentPrice")
    public CurrentPrice getCurrentPrice() {
        return currentPrice;
    }

    @JsonProperty("currentPrice")
    public void setCurrentPrice(CurrentPrice currentPrice) {
        this.currentPrice = currentPrice;
    }

    @JsonProperty("earningsGrowth")
    public EarningsGrowth getEarningsGrowth() {
        return earningsGrowth;
    }

    @JsonProperty("earningsGrowth")
    public void setEarningsGrowth(EarningsGrowth earningsGrowth) {
        this.earningsGrowth = earningsGrowth;
    }

    @JsonProperty("currentRatio")
    public CurrentRatio getCurrentRatio() {
        return currentRatio;
    }

    @JsonProperty("currentRatio")
    public void setCurrentRatio(CurrentRatio currentRatio) {
        this.currentRatio = currentRatio;
    }

    @JsonProperty("returnOnAssets")
    public ReturnOnAssets getReturnOnAssets() {
        return returnOnAssets;
    }

    @JsonProperty("returnOnAssets")
    public void setReturnOnAssets(ReturnOnAssets returnOnAssets) {
        this.returnOnAssets = returnOnAssets;
    }

    @JsonProperty("numberOfAnalystOpinions")
    public NumberOfAnalystOpinions getNumberOfAnalystOpinions() {
        return numberOfAnalystOpinions;
    }

    @JsonProperty("numberOfAnalystOpinions")
    public void setNumberOfAnalystOpinions(NumberOfAnalystOpinions numberOfAnalystOpinions) {
        this.numberOfAnalystOpinions = numberOfAnalystOpinions;
    }

    @JsonProperty("targetMeanPrice")
    public TargetMeanPrice getTargetMeanPrice() {
        return targetMeanPrice;
    }

    @JsonProperty("targetMeanPrice")
    public void setTargetMeanPrice(TargetMeanPrice targetMeanPrice) {
        this.targetMeanPrice = targetMeanPrice;
    }

    @JsonProperty("debtToEquity")
    public DebtToEquity getDebtToEquity() {
        return debtToEquity;
    }

    @JsonProperty("debtToEquity")
    public void setDebtToEquity(DebtToEquity debtToEquity) {
        this.debtToEquity = debtToEquity;
    }

    @JsonProperty("returnOnEquity")
    public ReturnOnEquity getReturnOnEquity() {
        return returnOnEquity;
    }

    @JsonProperty("returnOnEquity")
    public void setReturnOnEquity(ReturnOnEquity returnOnEquity) {
        this.returnOnEquity = returnOnEquity;
    }

    @JsonProperty("targetHighPrice")
    public TargetHighPrice getTargetHighPrice() {
        return targetHighPrice;
    }

    @JsonProperty("targetHighPrice")
    public void setTargetHighPrice(TargetHighPrice targetHighPrice) {
        this.targetHighPrice = targetHighPrice;
    }

    @JsonProperty("totalCash")
    public TotalCash getTotalCash() {
        return totalCash;
    }

    @JsonProperty("totalCash")
    public void setTotalCash(TotalCash totalCash) {
        this.totalCash = totalCash;
    }

    @JsonProperty("totalDebt")
    public TotalDebt getTotalDebt() {
        return totalDebt;
    }

    @JsonProperty("totalDebt")
    public void setTotalDebt(TotalDebt totalDebt) {
        this.totalDebt = totalDebt;
    }

    @JsonProperty("totalRevenue")
    public TotalRevenue getTotalRevenue() {
        return totalRevenue;
    }

    @JsonProperty("totalRevenue")
    public void setTotalRevenue(TotalRevenue totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    @JsonProperty("totalCashPerShare")
    public TotalCashPerShare getTotalCashPerShare() {
        return totalCashPerShare;
    }

    @JsonProperty("totalCashPerShare")
    public void setTotalCashPerShare(TotalCashPerShare totalCashPerShare) {
        this.totalCashPerShare = totalCashPerShare;
    }

    @JsonProperty("financialCurrency")
    public String getFinancialCurrency() {
        return financialCurrency;
    }

    @JsonProperty("financialCurrency")
    public void setFinancialCurrency(String financialCurrency) {
        this.financialCurrency = financialCurrency;
    }

    @JsonProperty("maxAge")
    public Integer getMaxAge() {
        return maxAge;
    }

    @JsonProperty("maxAge")
    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

    @JsonProperty("revenuePerShare")
    public RevenuePerShare getRevenuePerShare() {
        return revenuePerShare;
    }

    @JsonProperty("revenuePerShare")
    public void setRevenuePerShare(RevenuePerShare revenuePerShare) {
        this.revenuePerShare = revenuePerShare;
    }

    @JsonProperty("quickRatio")
    public QuickRatio getQuickRatio() {
        return quickRatio;
    }

    @JsonProperty("quickRatio")
    public void setQuickRatio(QuickRatio quickRatio) {
        this.quickRatio = quickRatio;
    }

    @JsonProperty("recommendationMean")
    public RecommendationMean getRecommendationMean() {
        return recommendationMean;
    }

    @JsonProperty("recommendationMean")
    public void setRecommendationMean(RecommendationMean recommendationMean) {
        this.recommendationMean = recommendationMean;
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
