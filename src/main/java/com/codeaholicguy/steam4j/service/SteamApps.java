package com.codeaholicguy.steam4j.service;

import com.codeaholicguy.steam4j.builder.RequestBuilder;
import com.codeaholicguy.steam4j.config.SteamConfiguration;
import com.codeaholicguy.steam4j.constant.SteamAPI;
import com.codeaholicguy.steam4j.response.GetAppListResponse;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Methods relating to Steam Apps in general.
 *
 * @author hoangnn
 */
public class SteamApps implements ISteamApps {

    private RequestBuilder requestBuilder;

    @Override
    public GetAppListResponse getAppList(SteamConfiguration configuration) throws IOException, URISyntaxException {
        requestBuilder = RequestBuilder.create(configuration);

        return requestBuilder.get(SteamAPI.SteamApps.PATH, SteamAPI.SteamApps.GET_APP_LIST, null, GetAppListResponse.class);
    }
}
