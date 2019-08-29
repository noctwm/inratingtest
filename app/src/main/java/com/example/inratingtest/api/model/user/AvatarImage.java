package com.example.inratingtest.api.model.user;

import com.google.gson.annotations.SerializedName;

public class AvatarImage {

    @SerializedName("url_medium")
    private String urlMedium;

    @SerializedName("id")
    private Integer id;

    @SerializedName("url")
    private String url;

    @SerializedName("url_large")
    private String urlLarge;

    @SerializedName("url_small")
    private String urlSmall;

    @SerializedName("url_origin")
    private String urlOrigin;

    @SerializedName("url_medium_origin")
    private String urlMediumOrigin;

    @SerializedName("url_large_origin")
    private String urlLargeOrigin;

    @SerializedName("url_small_origin")
    private String urlSmallOrigin;

    @SerializedName("mentioned_users_count")
    private Integer mentionedUsersCount;

    public String getUrlMedium() {
        return urlMedium;
    }

    public void setUrlMedium(String urlMedium) {
        this.urlMedium = urlMedium;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlLarge() {
        return urlLarge;
    }

    public void setUrlLarge(String urlLarge) {
        this.urlLarge = urlLarge;
    }

    public String getUrlSmall() {
        return urlSmall;
    }

    public void setUrlSmall(String urlSmall) {
        this.urlSmall = urlSmall;
    }

    public String getUrlOrigin() {
        return urlOrigin;
    }

    public void setUrlOrigin(String urlOrigin) {
        this.urlOrigin = urlOrigin;
    }

    public String getUrlMediumOrigin() {
        return urlMediumOrigin;
    }

    public void setUrlMediumOrigin(String urlMediumOrigin) {
        this.urlMediumOrigin = urlMediumOrigin;
    }

    public String getUrlLargeOrigin() {
        return urlLargeOrigin;
    }

    public void setUrlLargeOrigin(String urlLargeOrigin) {
        this.urlLargeOrigin = urlLargeOrigin;
    }

    public String getUrlSmallOrigin() {
        return urlSmallOrigin;
    }

    public void setUrlSmallOrigin(String urlSmallOrigin) {
        this.urlSmallOrigin = urlSmallOrigin;
    }

    public Integer getMentionedUsersCount() {
        return mentionedUsersCount;
    }

    public void setMentionedUsersCount(Integer mentionedUsersCount) {
        this.mentionedUsersCount = mentionedUsersCount;
    }

}