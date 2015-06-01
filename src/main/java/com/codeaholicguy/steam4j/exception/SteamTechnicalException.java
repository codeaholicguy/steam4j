package com.codeaholicguy.steam4j.exception;

/**
 * @author hoangnn
 */
public class SteamTechnicalException extends SteamException {

    public SteamTechnicalException(int errorCode) {
        super(errorCode);
    }

    public SteamTechnicalException(String message, int errorCode) {
        super(message, errorCode);
    }

    public SteamTechnicalException(String message, Throwable cause, int errorCode) {
        super(message, cause, errorCode);
    }

    public SteamTechnicalException(Throwable cause, int errorCode) {
        super(cause, errorCode);
    }

    protected SteamTechnicalException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int errorCode) {
        super(message, cause, enableSuppression, writableStackTrace, errorCode);
    }

}
