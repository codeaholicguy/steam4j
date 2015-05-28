package com.codeaholicguy.steam4j.object;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * List of every publicly facing program in the store/library.
 *
 * @author hoangnn
 */
public class AppList {

    @SerializedName("apps")
    private List<AppInfo> appList;

    private AppList() {
    }

    public AppList(List<AppInfo> appList) {
        this.appList = appList;
    }

    public List<AppInfo> getAppList() {
        return appList;
    }

    public void setAppList(List<AppInfo> appList) {
        this.appList = appList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AppList{");
        sb.append("appList=").append(appList);
        sb.append('}');
        return sb.toString();
    }
}
