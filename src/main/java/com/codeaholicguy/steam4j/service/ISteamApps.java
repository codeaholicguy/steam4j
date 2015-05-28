package com.codeaholicguy.steam4j.service;

import com.codeaholicguy.steam4j.config.SteamConfiguration;
import com.codeaholicguy.steam4j.response.GetAppListResponse;

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
     * @return GetAppListResponse
     */
    GetAppListResponse getAppList(SteamConfiguration configuration) throws IOException, URISyntaxException;

}
