package com.codeaholicguy.steam4j.object;

import com.google.gson.annotations.SerializedName;

/**
 * Server related to a IPv4 Address.
 *
 * @author hoangnn
 */
public class ServerInfo {

    /**
     * Gives the ip address, and the port number. Ex: "64.94.100.204:27015".
     */
    @SerializedName("addr")
    private String addr;
    /**
     * Gives the gmsindex. (?) Ex: 65534.
     */
    @SerializedName("gmsindex")
    private Integer gmsindex;

    /**
     * Gives the steam game appid. Ex: 730.
     */
    @SerializedName("appid")
    private Integer appid;

    /**
     * Tells which directory the game is from. Ex: "csgo".
     */
    @SerializedName("gamedir")
    private String gamedir;

    /**
     * Gives the region of the server. Ex: 1.
     */
    @SerializedName("region")
    private String region;

    /**
     * Boolean, if server is secure or not. Ex: true.
     */
    @SerializedName("secure")
    private Boolean secure;

    /**
     * Boolean, if server is a lan game. Ex: false.
     */
    @SerializedName("lan")
    private Boolean lan;

    /**
     * Gives the port number for the server. Ex: 27015.
     */
    @SerializedName("gameport")
    private Integer gameport;

    /**
     * Gives the specport. Ex: 0.
     */
    @SerializedName("specport")
    private Integer specport;

    private ServerInfo() {
    }

    public ServerInfo(String addr, Integer gmsindex, Integer appid, String gamedir, String region, Boolean secure, Boolean lan, Integer gameport, Integer specport) {
        this.addr = addr;
        this.gmsindex = gmsindex;
        this.appid = appid;
        this.gamedir = gamedir;
        this.region = region;
        this.secure = secure;
        this.lan = lan;
        this.gameport = gameport;
        this.specport = specport;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Integer getGmsindex() {
        return gmsindex;
    }

    public void setGmsindex(Integer gmsindex) {
        this.gmsindex = gmsindex;
    }

    public Integer getAppid() {
        return appid;
    }

    public void setAppid(Integer appid) {
        this.appid = appid;
    }

    public String getGamedir() {
        return gamedir;
    }

    public void setGamedir(String gamedir) {
        this.gamedir = gamedir;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Boolean getSecure() {
        return secure;
    }

    public void setSecure(Boolean secure) {
        this.secure = secure;
    }

    public Boolean getLan() {
        return lan;
    }

    public void setLan(Boolean lan) {
        this.lan = lan;
    }

    public Integer getGameport() {
        return gameport;
    }

    public void setGameport(Integer gameport) {
        this.gameport = gameport;
    }

    public Integer getSpecport() {
        return specport;
    }

    public void setSpecport(Integer specport) {
        this.specport = specport;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ServerInfo{");
        sb.append("addr='").append(addr).append('\'');
        sb.append(", gmsindex=").append(gmsindex);
        sb.append(", appid=").append(appid);
        sb.append(", gamedir='").append(gamedir).append('\'');
        sb.append(", region='").append(region).append('\'');
        sb.append(", secure=").append(secure);
        sb.append(", lan=").append(lan);
        sb.append(", gameport=").append(gameport);
        sb.append(", specport=").append(specport);
        sb.append('}');
        return sb.toString();
    }
}
