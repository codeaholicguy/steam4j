package com.codeaholicguy.steam4j.response;

import com.codeaholicguy.steam4j.object.AppVersion;
import com.google.gson.annotations.SerializedName;

/**
 * Check if a given app version is the most current available.
 *
 * @author hoangnn
 */
public class UpToDateCheckResponse {

    @SerializedName("response")
    private AppVersion appVersion;

    private UpToDateCheckResponse() {
    }

    public UpToDateCheckResponse(AppVersion appVersion) {
        this.appVersion = appVersion;
    }

    public AppVersion getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(AppVersion appVersion) {
        this.appVersion = appVersion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UpToDateCheckResponse{");
        sb.append("appVersion=").append(appVersion);
        sb.append('}');
        return sb.toString();
    }

}
