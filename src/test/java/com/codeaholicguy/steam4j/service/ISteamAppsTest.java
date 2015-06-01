package com.codeaholicguy.steam4j.service;

import com.codeaholicguy.steam4j.client.SteamClient;
import com.codeaholicguy.steam4j.config.SteamConfiguration;
import com.codeaholicguy.steam4j.factory.SteamFactory;
import com.codeaholicguy.steam4j.request.GetServersAtAddressRequest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

/**
 * @author hoangnn
 */
public class ISteamAppsTest {

    private String apiKey = "F14129C7145CDA473B92A40B3627BE35";

    private SteamConfiguration configuration = new SteamConfiguration(apiKey);
    private SteamClient steamClient;

    @Before
    public void setUp() throws Exception {
        steamClient = SteamFactory.getInstance(configuration).getClient();
    }

    @Test
    public void testGetAppList() throws Exception {
        Assert.assertNotNull(steamClient.getAppList());
    }

    @Test
    public void getServersAtAddressResponse() throws Exception {
        Assert.assertTrue(steamClient.getServersAtAddressResponse(new GetServersAtAddressRequest("64.94.100.204")).getServerList().getSuccess());
    }
}
