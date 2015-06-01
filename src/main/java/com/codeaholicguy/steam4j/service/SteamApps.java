package com.codeaholicguy.steam4j.service;

import com.codeaholicguy.steam4j.builder.RequestBuilder;
import com.codeaholicguy.steam4j.config.SteamConfiguration;
import com.codeaholicguy.steam4j.constant.SteamAPI;
import com.codeaholicguy.steam4j.request.GetServersAtAddressRequest;
import com.codeaholicguy.steam4j.request.UpToDateCheckRequest;
import com.codeaholicguy.steam4j.response.GetAppListResponse;
import com.codeaholicguy.steam4j.response.GetServersAtAddressResponse;
import com.codeaholicguy.steam4j.response.UpToDateCheckResponse;
import com.codeaholicguy.steam4j.util.ParameterUtil;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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

    @Override
    public GetServersAtAddressResponse getServersAtAddressResponse(SteamConfiguration configuration, GetServersAtAddressRequest request) throws IOException, URISyntaxException, IllegalAccessException {
        requestBuilder = RequestBuilder.create(configuration);

        return requestBuilder.get(SteamAPI.SteamApps.PATH, SteamAPI.SteamApps.GET_SERVER_AT_ADDRESS, ParameterUtil.getParameters(request), GetServersAtAddressResponse.class);
    }

    @Override
    public UpToDateCheckResponse upToDateCheckResponse(SteamConfiguration configuration, UpToDateCheckRequest request) throws IllegalAccessException, IOException, URISyntaxException {
        requestBuilder = RequestBuilder.create(configuration);

        return requestBuilder.get(SteamAPI.SteamApps.PATH, SteamAPI.SteamApps.UP_TO_DATE_CHECK, ParameterUtil.getParameters(request), UpToDateCheckResponse.class);
    }

}
