package com.codeaholicguy.steam4j.client;

import com.codeaholicguy.steam4j.builder.RequestBuilder;
import com.codeaholicguy.steam4j.config.SteamConfiguration;
import com.codeaholicguy.steam4j.constant.SteamAPI;
import com.codeaholicguy.steam4j.factory.SteamFactory;
import com.codeaholicguy.steam4j.response.GetAppListResponse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author hoangnn
 */
public class SteamFactoryTest {

    private String apiKey = "";

    @Test
    public void testGetInstance() throws Exception {
        SteamConfiguration configuration = new SteamConfiguration(apiKey);
        SteamClient steamClient = SteamFactory.getInstance(configuration).getClient();

        Assert.assertNotNull(steamClient);
    }
}
