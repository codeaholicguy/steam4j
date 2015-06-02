package com.codeaholicguy.steam4j.response;

import com.codeaholicguy.steam4j.object.RarityList;
import com.google.gson.annotations.SerializedName;

/**
 * Dota 2 item rarity list.
 *
 * @author hoangnn
 */
public class GetRaritiesResponse {

    /**
     * Dota 2 item rarity list.
     */
    @SerializedName("result")
    private RarityList rarityList;

    private GetRaritiesResponse() {
    }

    public GetRaritiesResponse(RarityList rarityList) {
        this.rarityList = rarityList;
    }

    public RarityList getRarityList() {
        return rarityList;
    }

    public void setRarityList(RarityList rarityList) {
        this.rarityList = rarityList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetRaritiesResponse{");
        sb.append("rarityList=").append(rarityList);
        sb.append('}');
        return sb.toString();
    }
}
