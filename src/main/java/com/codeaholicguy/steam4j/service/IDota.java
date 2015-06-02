package com.codeaholicguy.steam4j.service;

import com.codeaholicguy.steam4j.config.SteamConfiguration;
import com.codeaholicguy.steam4j.request.GetRaritiesRequest;
import com.codeaholicguy.steam4j.response.GetHeroesResponse;
import com.codeaholicguy.steam4j.response.GetRaritiesResponse;
import com.codeaholicguy.steam4j.response.GetTournamentPrizePoolResponse;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Methods relating to Dota 2.
 *
 * @author hoangnn
 */
public interface IDota {

    /**
     * Dota 2 item rarity list.
     *
     * @return
     */
    GetRaritiesResponse getRarities(SteamConfiguration configuration, GetRaritiesRequest request) throws IOException, URISyntaxException, IllegalAccessException;

    /**
     * A list of heroes within Dota 2.
     *
     * @return
     */
    GetHeroesResponse getHeroes(SteamConfiguration configuration);


    /**
     * The current prizepool for specific tournaments.
     *
     * @return
     */
    GetTournamentPrizePoolResponse getTournamentPrizePool(SteamConfiguration configuration);


}
