package com.example.mod5_hom;

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
        "year",
        "author",
        "wiki_url"
})
@Generated("jsonschema2pojo")
public class DuneModel {

    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("year")
    private String year;
    @JsonProperty("author")
    private List<String> author = null;
    @JsonProperty("wiki_url")
    private String wikiUrl;
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

    @JsonProperty("year")
    public String getYear() {
        return year;
    }

    @JsonProperty("year")
    public void setYear(String year) {
        this.year = year;
    }

    @JsonProperty("author")
    public List<String> getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(List<String> author) {
        this.author = author;
    }

    @JsonProperty("wiki_url")
    public String getWikiUrl() {
        return wikiUrl;
    }

    @JsonProperty("wiki_url")
    public void setWikiUrl(String wikiUrl) {
        this.wikiUrl = wikiUrl;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "DuneModel{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", author=" + author +
                ", wikiUrl='" + wikiUrl + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}