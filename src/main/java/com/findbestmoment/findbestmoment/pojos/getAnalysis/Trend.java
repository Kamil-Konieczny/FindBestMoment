
package com.findbestmoment.findbestmoment.pojos.getAnalysis;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.expression.spel.SpelEvaluationException;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "period",
    "strongBuy",
    "buy",
    "hold",
    "sell",
    "strongSell"
})
@Generated("jsonschema2pojo")
public class Trend {

    @JsonProperty("period")
    private String period;
    @JsonProperty("strongBuy")
    private Integer strongBuy;
    @JsonProperty("buy")
    private Integer buy;
    @JsonProperty("hold")
    private Integer hold;
    @JsonProperty("sell")
    private Integer sell;
    @JsonProperty("strongSell")
    private Integer strongSell;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("period")
    public String getPeriod() {
        return period;
    }

    @JsonProperty("period")
    public void setPeriod(String period) {
        this.period = period;
    }

    @JsonProperty("strongBuy")
    public Integer getStrongBuy() {
        return strongBuy;
    }

    @JsonProperty("strongBuy")
    public void setStrongBuy(Integer strongBuy) {
        this.strongBuy = strongBuy;
    }

    @JsonProperty("buy")
    public Integer getBuy() {
        return buy;
    }

    @JsonProperty("buy")
    public void setBuy(Integer buy) {
        this.buy = buy;
    }

    @JsonProperty("hold")
    public Integer getHold() {
        return hold;
    }

    @JsonProperty("hold")
    public void setHold(Integer hold) {
        this.hold = hold;
    }

    @JsonProperty("sell")
    public Integer getSell() {
        return sell;
    }

    @JsonProperty("sell")
    public void setSell(Integer sell) {
        this.sell = sell;
    }

    @JsonProperty("strongSell")
    public Integer getStrongSell() {
        return strongSell;
    }

    @JsonProperty("strongSell")
    public void setStrongSell(Integer strongSell) {
        this.strongSell = strongSell;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Double getBuyPercentage()
    {
        try
        {
            int all= sell+buy+2*sell+2*buy+hold;
        int all_buy = buy+2*strongBuy;
        if( all_buy!=0) {

        DecimalFormat df = new DecimalFormat("###.##");
        double percentage = (all_buy*100)/all;
            System.out.println(Double.valueOf(df.format(percentage)));
            return Double.valueOf(df.format(percentage));
        }
        else
        {
            return 0.0;
        }
        }
        catch (SpelEvaluationException x)
        {
            return 0.0;
        }
    }
    public Double getSellPercentage()
    {
        try
        {
            int all = sell + buy + 2 * sell + 2 * buy + hold;
            int all_sell = sell + 2 * strongSell;
            if (all_sell != 0) {
                DecimalFormat df = new DecimalFormat("###.##");
                double percentage = (all_sell * 100) / all;
                return Double.valueOf(df.format(percentage));
            } else {
                return 0.0;
            }
        }
        catch (SpelEvaluationException x)
        {
            return 0.0;
        }
    }
    public Double getHoldPercentage()
    {
        try
        {
            int all= sell+buy+2*sell+2*buy+hold;

        if(hold!=0) {
            double percentage = (hold *100) /all;
            DecimalFormat df = new DecimalFormat("###.##");
            return Double.valueOf(df.format(percentage));
        }
        else
        {
            return 0.0;
        }
        }
         catch (SpelEvaluationException x)
        {
            return 0.0;
        }
    }

}
