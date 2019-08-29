package com.example.inratingtest.api.model.post;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rating {

    @SerializedName("level")
    @Expose
    private Integer level;
    @SerializedName("value")
    @Expose
    private Integer value;
    @SerializedName("caption")
    @Expose
    private String caption;
    @SerializedName("proportion")
    @Expose
    private Double proportion;

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Double getProportion() {
        return proportion;
    }

    public void setProportion(Double proportion) {
        this.proportion = proportion;
    }

}
