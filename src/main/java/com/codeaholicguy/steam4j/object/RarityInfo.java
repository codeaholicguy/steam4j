package com.codeaholicguy.steam4j.object;

import com.google.gson.annotations.SerializedName;

/**
 * @author hoangnn
 */
public class RarityInfo {

    /**
     * The internal rarity name string.
     */
    @SerializedName("name")
    private String name;

    /**
     * ID of rarity, used for indexing.
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Sorting and logical order of rarities, from most distributed to least.
     */
    @SerializedName("order")
    private Integer order;

    /**
     * String of the hexadecimal RGB tuple of the rarity name as it is displayed in-game.
     */
    @SerializedName("color")
    private String color;

    /**
     * The localized name of the rarity for use in name display.
     */
    @SerializedName("localized_name")
    private String localizedName;

    private RarityInfo() {
    }

    public RarityInfo(String name, Integer id, Integer order, String color, String localizedName) {
        this.name = name;
        this.id = id;
        this.order = order;
        this.color = color;
        this.localizedName = localizedName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public void setLocalizedName(String localizedName) {
        this.localizedName = localizedName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RarityInfo{");
        sb.append("name='").append(name).append('\'');
        sb.append(", id=").append(id);
        sb.append(", order=").append(order);
        sb.append(", color='").append(color).append('\'');
        sb.append(", localizedName='").append(localizedName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
