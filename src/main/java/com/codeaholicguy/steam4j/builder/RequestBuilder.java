package com.codeaholicguy.steam4j.builder;

import com.codeaholicguy.steam4j.config.SteamConfiguration;
import com.codeaholicguy.steam4j.constant.SteamAPI;
import com.codeaholicguy.steam4j.constant.URL;
import com.codeaholicguy.steam4j.util.JsonUtil;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.Set;

/**
 * @author hoangnn
 */
public class RequestBuilder {

    private CloseableHttpClient httpClient;
    private HttpGet httpGet;
    private StringBuilder stringBuilder;
    private URIBuilder uriBuilder;
    private SteamConfiguration configuration;

    private RequestBuilder(SteamConfiguration configuration) {
        this.httpClient = HttpClientBuilder.create().build();
        this.httpGet = new HttpGet();
        this.stringBuilder = new StringBuilder(SteamAPI.HOST);
        this.uriBuilder = new URIBuilder().setScheme(URL.SCHEME_HTTP);
        this.configuration = configuration;
    }

    public static RequestBuilder create(SteamConfiguration configuration) {
        return new RequestBuilder(configuration);
    }

    public <T> T get(String apiContext, String apiPath, Map<String, Object> params, Class<T> clazz) throws URISyntaxException, IOException {
        // Build request URI
        uriBuilder.setHost(stringBuilder.append(apiContext).append(apiPath).toString());
        addConfiguration();
        addParameters(params);

        httpGet.setURI(uriBuilder.build());

        // Send request
        CloseableHttpResponse response = httpClient.execute(httpGet);
        HttpEntity entity = response.getEntity();

        if (entity != null) {
            String responseString = new BasicResponseHandler().handleResponse(response);

            if (responseString != null) {
                return JsonUtil.fromJson(responseString, clazz);
            }
        }

        return null;
    }

    private void addParameters(Map<String, Object> params) {
        if (params != null) {
            Set<Map.Entry<String, Object>> paramEntries = params.entrySet();
            for (Map.Entry<String, Object> paramEntry : paramEntries) {
                uriBuilder.addParameter(paramEntry.getKey(), String.valueOf(paramEntry.getValue()));
            }
        }
    }

    private void addConfiguration() {
        if (configuration != null) {
            if (configuration.getKey() != null) {
                uriBuilder.addParameter(SteamAPI.Parameter.API_KEY, configuration.getKey());
            }

            if (configuration.getFormat() != null) {
                uriBuilder.addParameter(SteamAPI.Parameter.FORMAT, configuration.getFormat());
            }

            if (configuration.getLanguage() != null) {
                uriBuilder.addParameter(SteamAPI.Parameter.LANGUAGE, configuration.getLanguage());
            }
        }
    }
}
