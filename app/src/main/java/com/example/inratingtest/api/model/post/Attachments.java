package com.example.inratingtest.api.model.post;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Attachments {

    @SerializedName("images")
    private List<Image> images = null;

    @SerializedName("videos")
    private Object videos;

    @SerializedName("posts")
    private Object posts;

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public Object getVideos() {
        return videos;
    }

    public void setVideos(Object videos) {
        this.videos = videos;
    }

    public Object getPosts() {
        return posts;
    }

    public void setPosts(Object posts) {
        this.posts = posts;
    }

}
