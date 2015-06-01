package com.codeaholicguy.steam4j.object;

import com.google.gson.annotations.SerializedName;

/**
 * @author hoangnn
 */
public class AppVersion {

    /**
     * Boolean indicating if request was successful.
     */
    @SerializedName("success")
    private Boolean success;

    /**
     * Boolean indicating if the given version number is the most current version.
     */
    @SerializedName("up_to_date")
    private Boolean upToDate;

    /**
     * Boolean indicating if the given version can be listed in public changelogs.
     */
    @SerializedName("version_is_listable")
    private Boolean versionIsListable;

    /**
     * (Optional)
     * Integer of the most current version of the app available.
     */
    @SerializedName("required_version")
    private Integer requiredVersion;

    /**
     * (Optional)
     * A string giving the status message if applicable.
     */
    @SerializedName("message")
    private String message;

    private AppVersion() {
    }

    public AppVersion(Boolean success, Boolean upToDate, Boolean versionIsListable, Integer requiredVersion, String message) {
        this.success = success;
        this.upToDate = upToDate;
        this.versionIsListable = versionIsListable;
        this.requiredVersion = requiredVersion;
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Boolean getUpToDate() {
        return upToDate;
    }

    public void setUpToDate(Boolean upToDate) {
        this.upToDate = upToDate;
    }

    public Boolean getVersionIsListable() {
        return versionIsListable;
    }

    public void setVersionIsListable(Boolean versionIsListable) {
        this.versionIsListable = versionIsListable;
    }

    public Integer getRequiredVersion() {
        return requiredVersion;
    }

    public void setRequiredVersion(Integer requiredVersion) {
        this.requiredVersion = requiredVersion;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AppVersion{");
        sb.append("success=").append(success);
        sb.append(", upToDate=").append(upToDate);
        sb.append(", versionIsListable=").append(versionIsListable);
        sb.append(", requiredVersion=").append(requiredVersion);
        sb.append(", message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
