package com.codeaholicguy.steam4j.service;

import com.codeaholicguy.steam4j.client.SteamClient;
import com.codeaholicguy.steam4j.config.SteamConfiguration;
import com.codeaholicguy.steam4j.factory.SteamFactory;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author hoangnn
 */
public class ISteamAppsTest {

    @Test
    public void testGetAppList() throws Exception {
        String apiKey = "";

        SteamConfiguration configuration = new SteamConfiguration(apiKey);
        SteamClient steamClient = SteamFactory.getInstance(configuration).getClient();

        System.out.println(steamClient.getAppList().getAppList().getAppList().size());
    }
}
