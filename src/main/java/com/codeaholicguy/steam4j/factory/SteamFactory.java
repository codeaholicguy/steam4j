package com.codeaholicguy.steam4j.factory;

import com.codeaholicguy.steam4j.client.SteamClient;
import com.codeaholicguy.steam4j.config.SteamConfiguration;

/**
 * Steam Factory to get Client.
 *
 * @author hoangnn
 */
public class SteamFactory {

    private static SteamFactory ourInstance = null;
    private static SteamClient steamClient = null;

    private SteamConfiguration configuration;

    public static SteamFactory getInstance(SteamConfiguration configuration) {
        if (ourInstance == null) {
            ourInstance = new SteamFactory(configuration);
        }
        return ourInstance;
    }

    public SteamClient getClient() {
        if (steamClient == null) {
            steamClient = new SteamClient(this.configuration);
        }
        return steamClient;
    }

    /**
     * Configuration for Steam Client.
     *
     * @param configuration configuration
     */
    private SteamFactory(SteamConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SteamFactory{");
        sb.append("configuration=").append(configuration);
        sb.append('}');
        return sb.toString();
    }
}
