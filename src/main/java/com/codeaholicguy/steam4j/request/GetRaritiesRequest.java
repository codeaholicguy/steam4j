package com.codeaholicguy.steam4j.request;

/**
 * @author hoangnn
 */
public class GetRaritiesRequest {

    /**
     * The language to provide rarity names in.
     */
    private String language;

    private GetRaritiesRequest() {
    }

    public GetRaritiesRequest(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetRaritiesRequest{");
        sb.append("language='").append(language).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
