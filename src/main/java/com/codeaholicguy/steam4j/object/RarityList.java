package com.codeaholicguy.steam4j.object;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * List of rarity objects.
 *
 * @author hoangnn
 */
public class RarityList {

    /**
     * Possible number of rarities. This number appears to be currently incorrect and off by one.
     */
    @SerializedName("count")
    private Integer count;

    /**
     * List of rarity objects.
     */
    @SerializedName("rarities")
    private List<RarityInfo> rarityInfoList;

    /**
     * Status.
     */
    @SerializedName("status")
    private Integer status;

    private RarityList() {
    }

    public RarityList(Integer count, List<RarityInfo> rarityInfoList, Integer status) {
        this.count = count;
        this.rarityInfoList = rarityInfoList;
        this.status = status;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<RarityInfo> getRarityInfoList() {
        return rarityInfoList;
    }

    public void setRarityInfoList(List<RarityInfo> rarityInfoList) {
        this.rarityInfoList = rarityInfoList;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RarityList{");
        sb.append("count=").append(count);
        sb.append(", rarityInfoList=").append(rarityInfoList);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}
