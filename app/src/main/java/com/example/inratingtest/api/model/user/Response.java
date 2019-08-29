package com.example.inratingtest.api.model.user;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Response {

    @SerializedName("data")
    private List<User> data = null;

    @SerializedName("links")
    private Links links;

    @SerializedName("meta")
    private Meta meta;

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

}
