package com.codeaholicguy.steam4j.exception;

/**
 * @author hoangnn
 */
public class SteamConfigurationException extends SteamException {

    public SteamConfigurationException(int errorCode) {
        super(errorCode);
    }

    public SteamConfigurationException(String message, int errorCode) {
        super(message, errorCode);
    }

    public SteamConfigurationException(String message, Throwable cause, int errorCode) {
        super(message, cause, errorCode);
    }

    public SteamConfigurationException(Throwable cause, int errorCode) {
        super(cause, errorCode);
    }

    protected SteamConfigurationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int errorCode) {
        super(message, cause, enableSuppression, writableStackTrace, errorCode);
    }

}
