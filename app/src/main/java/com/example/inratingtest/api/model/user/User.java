package com.example.inratingtest.api.model.user;

import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("id")
    private Integer id;

    @SerializedName("nickname")
    private String nickname;

    @SerializedName("active_gift")
    private Object activeGift;

    @SerializedName("avatar_image")
    private AvatarImage avatarImage;

    @SerializedName("off_page")
    private Boolean offPage;

    @SerializedName("name")
    private String name;

    @SerializedName("lastname")
    private String lastname;

    @SerializedName("status")
    private String status;

    @SerializedName("gender")
    private String gender;

    @SerializedName("is_subscribed")
    private Boolean isSubscribed;

    @SerializedName("is_online")
    private Boolean isOnline;

    @SerializedName("last_online_timestamp")
    private Integer lastOnlineTimestamp;

    @SerializedName("in_my_blacklist")
    private Boolean inMyBlacklist;

    @SerializedName("has_me_in_blacklist")
    private Boolean hasMeInBlacklist;

    @SerializedName("multiplier")
    private Integer multiplier;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Object getActiveGift() {
        return activeGift;
    }

    public void setActiveGift(Object activeGift) {
        this.activeGift = activeGift;
    }

    public AvatarImage getAvatarImage() {
        return avatarImage;
    }

    public void setAvatarImage(AvatarImage avatarImage) {
        this.avatarImage = avatarImage;
    }

    public Boolean getOffPage() {
        return offPage;
    }

    public void setOffPage(Boolean offPage) {
        this.offPage = offPage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getIsSubscribed() {
        return isSubscribed;
    }

    public void setIsSubscribed(Boolean isSubscribed) {
        this.isSubscribed = isSubscribed;
    }

    public Boolean getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
    }

    public Integer getLastOnlineTimestamp() {
        return lastOnlineTimestamp;
    }

    public void setLastOnlineTimestamp(Integer lastOnlineTimestamp) {
        this.lastOnlineTimestamp = lastOnlineTimestamp;
    }

    public Boolean getInMyBlacklist() {
        return inMyBlacklist;
    }

    public void setInMyBlacklist(Boolean inMyBlacklist) {
        this.inMyBlacklist = inMyBlacklist;
    }

    public Boolean getHasMeInBlacklist() {
        return hasMeInBlacklist;
    }

    public void setHasMeInBlacklist(Boolean hasMeInBlacklist) {
        this.hasMeInBlacklist = hasMeInBlacklist;
    }

    public Integer getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(Integer multiplier) {
        this.multiplier = multiplier;
    }

}
