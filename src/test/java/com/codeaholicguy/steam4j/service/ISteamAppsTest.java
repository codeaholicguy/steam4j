package com.codeaholicguy.steam4j.service;

import com.codeaholicguy.steam4j.client.SteamClient;
import com.codeaholicguy.steam4j.config.SteamConfiguration;
import com.codeaholicguy.steam4j.constant.SteamAppId;
import com.codeaholicguy.steam4j.factory.SteamFactory;
import com.codeaholicguy.steam4j.request.GetServersAtAddressRequest;
import com.codeaholicguy.steam4j.request.UpToDateCheckRequest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

/**
 * @author hoangnn
 */
public class ISteamAppsTest {

    private String apiKey = "";

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
    public void testGetServersAtAddressResponse() throws Exception {
        Assert.assertTrue(steamClient.getServersAtAddress(new GetServersAtAddressRequest("64.94.100.204")).getServerList().getSuccess());
    }

    @Test
    public void testUpToDateCheckResponse() throws Exception {
        Assert.assertTrue(steamClient.checkUpToDate(new UpToDateCheckRequest(SteamAppId.DOTA_2, 37)).getAppVersion().getSuccess());
    }
}
