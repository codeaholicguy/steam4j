package com.codeaholicguy.steam4j.client;

import com.codeaholicguy.steam4j.config.SteamConfiguration;
import com.codeaholicguy.steam4j.response.GetAppListResponse;
import com.codeaholicguy.steam4j.service.ISteamApps;
import com.codeaholicguy.steam4j.service.SteamApps;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Steam Client for calling API.
 *
 * @author codeaholicguy
 */
public class SteamClient {

    private SteamConfiguration configuration;

    public SteamClient(SteamConfiguration configuration) {
        this.configuration = configuration;
    }

    public SteamConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(SteamConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SteamClient{");
        sb.append("configuration=").append(configuration);
        sb.append('}');
        return sb.toString();
    }

    private ISteamApps steamApps = new SteamApps();

    public GetAppListResponse getAppList() throws IOException, URISyntaxException {
        return steamApps.getAppList(this.configuration);
    }

}
