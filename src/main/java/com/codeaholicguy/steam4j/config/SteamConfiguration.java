package com.codeaholicguy.steam4j.config;

/**
 * Most WebAPI methods take the following arguments in their URL.
 *
 * @author codeaholicguy
 */
public class SteamConfiguration {

    private String key;
    private String format;
    private String language;

    /**
     * @param key Your Steam Web API key.
     */
    public SteamConfiguration(String key) {
        this.key = key;
    }

    /**
     * @param key      Your Steam Web API key.
     * @param format   The file format to return output in.(json (default), xml, vdf (Valve Data Format)).
     * @param language The ISO639-1 language code for the language all tokenized strings should be returned in.
     */
    public SteamConfiguration(String key, String format, String language) {
        this.key = key;
        this.format = format;
        this.language = language;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SteamConfiguration{");
        sb.append("key='").append(key).append('\'');
        sb.append(", format='").append(format).append('\'');
        sb.append(", language='").append(language).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
