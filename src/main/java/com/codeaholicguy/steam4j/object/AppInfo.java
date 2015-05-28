package com.codeaholicguy.steam4j.object;

import com.google.gson.annotations.SerializedName;

/**
 * Publicly facing program in the store/library.
 *
 * @author hoangnn
 */
public class AppInfo {

    /**
     * An integer containing the program's ID.
     */
    @SerializedName("appid")
    private Integer appId;

    /**
     * A string containing the program's publicly facing title.
     */
    @SerializedName("name")
    private String name;

    private AppInfo() {
    }

    public AppInfo(Integer appId, String name) {
        this.appId = appId;
        this.name = name;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AppInfo{");
        sb.append("appId=").append(appId);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
