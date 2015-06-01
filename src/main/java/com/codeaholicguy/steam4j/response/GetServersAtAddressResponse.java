package com.codeaholicguy.steam4j.response;

import com.codeaholicguy.steam4j.object.AppList;
import com.codeaholicguy.steam4j.object.ServerList;
import com.google.gson.annotations.SerializedName;

/**
 * Shows all steam-compatible servers related to a IPv4 Address.
 *
 * @author hoangnn
 */
public class GetServersAtAddressResponse {

    @SerializedName("response")
    private ServerList serverList;

    private GetServersAtAddressResponse() {
    }

    public GetServersAtAddressResponse(ServerList serverList) {
        this.serverList = serverList;
    }

    public ServerList getServerList() {
        return serverList;
    }

    public void setServerList(ServerList serverList) {
        this.serverList = serverList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetServersAtAddressResponse{");
        sb.append("serverList=").append(serverList);
        sb.append('}');
        return sb.toString();
    }
}
