package com.codeaholicguy.steam4j.client;

import com.codeaholicguy.steam4j.builder.RequestBuilder;
import com.codeaholicguy.steam4j.config.SteamConfiguration;
import com.codeaholicguy.steam4j.constant.SteamAPI;
import com.codeaholicguy.steam4j.factory.SteamFactory;
import com.codeaholicguy.steam4j.response.GetAppListResponse;
import org.junit.Test;

/**
 * @author hoangnn
 */
public class SteamFactoryTest {

    @Test
    public void testGetInstance() throws Exception {
        String apiKey = "";

        SteamConfiguration configuration = new SteamConfiguration(apiKey);
        SteamClient steamClient = SteamFactory.getInstance(configuration).getClient();

        System.out.println(steamClient);
    }
}
