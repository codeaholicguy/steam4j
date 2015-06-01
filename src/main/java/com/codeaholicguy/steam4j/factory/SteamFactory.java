package com.codeaholicguy.steam4j.factory;

import com.codeaholicguy.steam4j.client.SteamClient;
import com.codeaholicguy.steam4j.config.SteamConfiguration;
import com.codeaholicguy.steam4j.constant.ErrorCode;
import com.codeaholicguy.steam4j.exception.SteamConfigurationException;
import com.codeaholicguy.steam4j.util.StringUtil;

/**
 * Steam Factory to get Client.
 *
 * @author hoangnn
 */
public class SteamFactory {

    private static SteamFactory ourInstance = null;
    private static SteamClient steamClient = null;

    private SteamConfiguration configuration;

    public static SteamFactory getInstance(SteamConfiguration configuration) throws SteamConfigurationException {
        if (StringUtil.isNullorEmpty(configuration.getKey())) {
            throw new SteamConfigurationException("Invalid api key", ErrorCode.INVALID_API_KEY);
        }
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
