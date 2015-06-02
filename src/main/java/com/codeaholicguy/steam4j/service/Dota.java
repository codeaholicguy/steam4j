package com.codeaholicguy.steam4j.service;

import com.codeaholicguy.steam4j.builder.RequestBuilder;
import com.codeaholicguy.steam4j.config.SteamConfiguration;
import com.codeaholicguy.steam4j.constant.SteamAPI;
import com.codeaholicguy.steam4j.request.GetRaritiesRequest;
import com.codeaholicguy.steam4j.response.GetAppListResponse;
import com.codeaholicguy.steam4j.response.GetHeroesResponse;
import com.codeaholicguy.steam4j.response.GetRaritiesResponse;
import com.codeaholicguy.steam4j.response.GetTournamentPrizePoolResponse;
import com.codeaholicguy.steam4j.util.ParameterUtil;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * @author hoangnn
 */
public class Dota implements IDota {

    private RequestBuilder requestBuilder;

    @Override
    public GetRaritiesResponse getRarities(SteamConfiguration configuration, GetRaritiesRequest request) throws IOException, URISyntaxException, IllegalAccessException {
        requestBuilder = RequestBuilder.create(configuration);

        return requestBuilder.get(SteamAPI.Dota.PATH, SteamAPI.Dota.GET_RARITIES, ParameterUtil.getParameters(request), GetRaritiesResponse.class);
    }

    @Override
    public GetHeroesResponse getHeroes(SteamConfiguration configuration) {
        return null;
    }

    @Override
    public GetTournamentPrizePoolResponse getTournamentPrizePool(SteamConfiguration configuration) {
        return null;
    }

}
