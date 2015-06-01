package com.codeaholicguy.steam4j.request;

/**
 * @author hoangnn
 */
public class UpToDateCheckRequest {

    /**
     * AppID of game.
     */
    private Integer appid;

    /**
     * The installed version of the game.
     */
    private Integer version;

    private UpToDateCheckRequest() {
    }

    public UpToDateCheckRequest(Integer appid, Integer version) {
        this.appid = appid;
        this.version = version;
    }

    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UpToDateCheckRequest{");
        sb.append("appid=").append(appid);
        sb.append(", version=").append(version);
        sb.append('}');
        return sb.toString();
    }
}
