
package com.findbestmoment.findbestmoment.pojos.auto_complete;

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
    "explains",
    "count",
    "quotes",
    "news",
    "nav",
    "lists",
    "researchReports",
    "totalTime",
    "timeTakenForQuotes",
    "timeTakenForNews",
    "timeTakenForAlgowatchlist",
    "timeTakenForPredefinedScreener",
    "timeTakenForCrunchbase",
    "timeTakenForNav",
    "timeTakenForResearchReports"
})
@Generated("jsonschema2pojo")
public class Auto_example {

    @JsonProperty("explains")
    private List<Object> explains = null;
    @JsonProperty("count")
    private Integer count;
    @JsonProperty("quotes")
    private List<Quote> quotes = null;
    @JsonProperty("news")
    private List<News> news = null;
    @JsonProperty("nav")
    private List<Object> nav = null;
    @JsonProperty("lists")
    private List<Object> lists = null;
    @JsonProperty("researchReports")
    private List<Object> researchReports = null;
    @JsonProperty("totalTime")
    private Integer totalTime;
    @JsonProperty("timeTakenForQuotes")
    private Integer timeTakenForQuotes;
    @JsonProperty("timeTakenForNews")
    private Integer timeTakenForNews;
    @JsonProperty("timeTakenForAlgowatchlist")
    private Integer timeTakenForAlgowatchlist;
    @JsonProperty("timeTakenForPredefinedScreener")
    private Integer timeTakenForPredefinedScreener;
    @JsonProperty("timeTakenForCrunchbase")
    private Integer timeTakenForCrunchbase;
    @JsonProperty("timeTakenForNav")
    private Integer timeTakenForNav;
    @JsonProperty("timeTakenForResearchReports")
    private Integer timeTakenForResearchReports;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("explains")
    public List<Object> getExplains() {
        return explains;
    }

    @JsonProperty("explains")
    public void setExplains(List<Object> explains) {
        this.explains = explains;
    }

    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonProperty("quotes")
    public List<Quote> getQuotes() {
        return quotes;
    }

    @JsonProperty("quotes")
    public void setQuotes(List<Quote> quotes) {
        this.quotes = quotes;
    }

    @JsonProperty("news")
    public List<News> getNews() {
        return news;
    }

    @JsonProperty("news")
    public void setNews(List<News> news) {
        this.news = news;
    }

    @JsonProperty("nav")
    public List<Object> getNav() {
        return nav;
    }

    @JsonProperty("nav")
    public void setNav(List<Object> nav) {
        this.nav = nav;
    }

    @JsonProperty("lists")
    public List<Object> getLists() {
        return lists;
    }

    @JsonProperty("lists")
    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    @JsonProperty("researchReports")
    public List<Object> getResearchReports() {
        return researchReports;
    }

    @JsonProperty("researchReports")
    public void setResearchReports(List<Object> researchReports) {
        this.researchReports = researchReports;
    }

    @JsonProperty("totalTime")
    public Integer getTotalTime() {
        return totalTime;
    }

    @JsonProperty("totalTime")
    public void setTotalTime(Integer totalTime) {
        this.totalTime = totalTime;
    }

    @JsonProperty("timeTakenForQuotes")
    public Integer getTimeTakenForQuotes() {
        return timeTakenForQuotes;
    }

    @JsonProperty("timeTakenForQuotes")
    public void setTimeTakenForQuotes(Integer timeTakenForQuotes) {
        this.timeTakenForQuotes = timeTakenForQuotes;
    }

    @JsonProperty("timeTakenForNews")
    public Integer getTimeTakenForNews() {
        return timeTakenForNews;
    }

    @JsonProperty("timeTakenForNews")
    public void setTimeTakenForNews(Integer timeTakenForNews) {
        this.timeTakenForNews = timeTakenForNews;
    }

    @JsonProperty("timeTakenForAlgowatchlist")
    public Integer getTimeTakenForAlgowatchlist() {
        return timeTakenForAlgowatchlist;
    }

    @JsonProperty("timeTakenForAlgowatchlist")
    public void setTimeTakenForAlgowatchlist(Integer timeTakenForAlgowatchlist) {
        this.timeTakenForAlgowatchlist = timeTakenForAlgowatchlist;
    }

    @JsonProperty("timeTakenForPredefinedScreener")
    public Integer getTimeTakenForPredefinedScreener() {
        return timeTakenForPredefinedScreener;
    }

    @JsonProperty("timeTakenForPredefinedScreener")
    public void setTimeTakenForPredefinedScreener(Integer timeTakenForPredefinedScreener) {
        this.timeTakenForPredefinedScreener = timeTakenForPredefinedScreener;
    }

    @JsonProperty("timeTakenForCrunchbase")
    public Integer getTimeTakenForCrunchbase() {
        return timeTakenForCrunchbase;
    }

    @JsonProperty("timeTakenForCrunchbase")
    public void setTimeTakenForCrunchbase(Integer timeTakenForCrunchbase) {
        this.timeTakenForCrunchbase = timeTakenForCrunchbase;
    }

    @JsonProperty("timeTakenForNav")
    public Integer getTimeTakenForNav() {
        return timeTakenForNav;
    }

    @JsonProperty("timeTakenForNav")
    public void setTimeTakenForNav(Integer timeTakenForNav) {
        this.timeTakenForNav = timeTakenForNav;
    }

    @JsonProperty("timeTakenForResearchReports")
    public Integer getTimeTakenForResearchReports() {
        return timeTakenForResearchReports;
    }

    @JsonProperty("timeTakenForResearchReports")
    public void setTimeTakenForResearchReports(Integer timeTakenForResearchReports) {
        this.timeTakenForResearchReports = timeTakenForResearchReports;
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
