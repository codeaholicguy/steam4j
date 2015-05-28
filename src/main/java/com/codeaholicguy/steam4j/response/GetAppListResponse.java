package com.codeaholicguy.steam4j.response;

import com.codeaholicguy.steam4j.object.AppList;
import com.google.gson.annotations.SerializedName;

/**
 * Full list of every publicly facing program in the store/library.
 *
 * @author hoangnn
 */
public class GetAppListResponse {

    @SerializedName("applist")
    private AppList appList;

    private GetAppListResponse() {
    }

    public GetAppListResponse(AppList appList) {
        this.appList = appList;
    }

    public AppList getAppList() {
        return appList;
    }

    public void setAppList(AppList appList) {
        this.appList = appList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetAppListResponse{");
        sb.append("appList=").append(appList);
        sb.append('}');
        return sb.toString();
    }
}
