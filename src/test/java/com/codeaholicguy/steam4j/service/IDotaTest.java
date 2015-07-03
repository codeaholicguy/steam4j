package com.codeaholicguy.steam4j.service;

import com.codeaholicguy.steam4j.client.SteamClient;
import com.codeaholicguy.steam4j.config.SteamConfiguration;
import com.codeaholicguy.steam4j.factory.SteamFactory;
import com.codeaholicguy.steam4j.request.GetRaritiesRequest;
import com.codeaholicguy.steam4j.helper.Constants;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author hoangnn
 */
public class IDotaTest extends TestCase {


    private SteamConfiguration configuration = new SteamConfiguration(Constants.TEMPORARY_API_KEY);
    private SteamClient steamClient;

    @Before
    public void setUp() throws Exception {
        steamClient = SteamFactory.getInstance(configuration).getClient();
    }

    @Test
    public void testGetRarities() throws Exception {
        Assert.assertEquals(steamClient.getRarities(new GetRaritiesRequest("en")).getRarityList().getStatus().intValue(), 200);
    }

    @Test
    public void testGetHeroes() throws Exception {

    }

    @Test
    public void testGetTournamentPrizePool() throws Exception {

    }
}