package com.codeaholicguy.steam4j.constant;

/**
 * Steam API Connection Information.
 *
 * @author hoangnn
 */
public class SteamAPI {

    public static final String HOST = "api.steampowered.com";

    public class Parameter {
        public static final String API_KEY = "key";
        public static final String FORMAT = "format";
        public static final String LANGUAGE = "language";
    }

    /**
     * Methods relating to Steam Apps in general.
     */
    public class SteamApps {
        public static final String PATH = "/ISteamApps";

        public static final String GET_APP_LIST = "/GetAppList/v2";
        public static final String GET_SERVER_AT_ADDRESS = "/GetServersAtAddress/v1";
        public static final String UP_TO_DATE_CHECK = "/UpToDateCheck/v1";
    }

    /**
     * Methods relating to games' store's assets.
     */
    public class SteamEconomy {
        public static final String PATH = "/ISteamEconomy";

        public static final String GET_ASSET_CLASS_INFO = "/GetAssetClassInfo/v0001";
        public static final String GET_ASSET_PRICES = "/GetAssetPrices/v0001";
    }


}
