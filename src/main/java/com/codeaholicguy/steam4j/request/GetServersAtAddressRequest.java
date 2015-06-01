package com.codeaholicguy.steam4j.request;

import com.codeaholicguy.steam4j.object.ServerList;
import com.google.gson.annotations.SerializedName;

/**
 * Shows all steam-compatible servers related to a IPv4 Address Request.
 *
 * @author hoangnn
 */
public class GetServersAtAddressRequest {

    /**
     * IP Address of Server (IPv4 format).
     */
    private String addr;

    private GetServersAtAddressRequest() {
    }

    public GetServersAtAddressRequest(String addr) {
        this.addr = addr;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetServersAtAddressRequest{");
        sb.append("addr='").append(addr).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
