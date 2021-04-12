
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
    "pre",
    "post",
    "regular"
})
public class TradingPeriods {

    @JsonProperty("pre")
    private List<List<Pre_>> pre = null;
    @JsonProperty("post")
    private List<List<Post_>> post = null;
    @JsonProperty("regular")
    private List<List<Regular_>> regular = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pre")
    public List<List<Pre_>> getPre() {
        return pre;
    }

    @JsonProperty("pre")
    public void setPre(List<List<Pre_>> pre) {
        this.pre = pre;
    }

    @JsonProperty("post")
    public List<List<Post_>> getPost() {
        return post;
    }

    @JsonProperty("post")
    public void setPost(List<List<Post_>> post) {
        this.post = post;
    }

    @JsonProperty("regular")
    public List<List<Regular_>> getRegular() {
        return regular;
    }

    @JsonProperty("regular")
    public void setRegular(List<List<Regular_>> regular) {
        this.regular = regular;
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
