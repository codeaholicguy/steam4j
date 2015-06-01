package com.codeaholicguy.steam4j.client;

import com.codeaholicguy.steam4j.config.SteamConfiguration;
import com.codeaholicguy.steam4j.constant.ErrorCode;
import com.codeaholicguy.steam4j.exception.SteamTechnicalException;
import com.codeaholicguy.steam4j.request.GetServersAtAddressRequest;
import com.codeaholicguy.steam4j.response.GetAppListResponse;
import com.codeaholicguy.steam4j.response.GetServersAtAddressResponse;
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

    public GetAppListResponse getAppList() throws SteamTechnicalException {
        try {
            return steamApps.getAppList(this.configuration);
        } catch (IOException | URISyntaxException e) {
            throw new SteamTechnicalException(String.format("Technical error: %s", e.getMessage()), ErrorCode.TECHNICAL_ERROR);
        }
    }

    public GetServersAtAddressResponse getServersAtAddressResponse(GetServersAtAddressRequest request) throws SteamTechnicalException {
        try {
            return steamApps.getServersAtAddressResponse(this.configuration, request);
        } catch (IllegalAccessException | IOException | URISyntaxException e) {
            throw new SteamTechnicalException(String.format("Technical error: %s", e.getMessage()), ErrorCode.TECHNICAL_ERROR);
        }
    }

}
