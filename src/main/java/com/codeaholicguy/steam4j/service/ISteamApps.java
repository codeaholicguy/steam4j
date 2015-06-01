package com.codeaholicguy.steam4j.service;

import com.codeaholicguy.steam4j.config.SteamConfiguration;
import com.codeaholicguy.steam4j.request.GetServersAtAddressRequest;
import com.codeaholicguy.steam4j.response.GetAppListResponse;
import com.codeaholicguy.steam4j.response.GetServersAtAddressResponse;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Methods relating to Steam Apps in general.
 *
 * @author hoangnn
 */
public interface ISteamApps {

    /**
     * Full list of every publicly facing program in the store/library.
     *
     * @param configuration configuration
     * @return GetAppListResponse
     */
    GetAppListResponse getAppList(SteamConfiguration configuration) throws IOException, URISyntaxException;

    /**
     * Shows all steam-compatible servers related to a IPv4 Address.
     *
     * @param configuration configuration
     * @param request       request
     * @return GetServersAtAddressResponse
     */
    GetServersAtAddressResponse getServersAtAddressResponse(SteamConfiguration configuration, GetServersAtAddressRequest request) throws IOException, URISyntaxException, IllegalAccessException;

}
