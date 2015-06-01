package com.codeaholicguy.steam4j.object;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * All steam-compatible servers related to a IPv4 Address..
 *
 * @author hoangnn
 */
public class ServerList {

    /**
     * Returns true if ip address is valid, does not mean server is functioning properly.
     */
    @SerializedName("success")
    private Boolean success;

    /**
     * A list of every server from this ip address.
     */
    @SerializedName("servers")
    private List<ServerInfo> serverList;

    private ServerList() {
    }

    public ServerList(Boolean success, List<ServerInfo> serverList) {
        this.success = success;
        this.serverList = serverList;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<ServerInfo> getServerList() {
        return serverList;
    }

    public void setServerList(List<ServerInfo> serverList) {
        this.serverList = serverList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ServerList{");
        sb.append("success=").append(success);
        sb.append(", serverList=").append(serverList);
        sb.append('}');
        return sb.toString();
    }
}
