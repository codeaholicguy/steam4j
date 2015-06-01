package com.codeaholicguy.steam4j.exception;

/**
 * @author hoangnn
 */
public class SteamException extends Exception {

    int errorCode;

    public SteamException(int errorCode) {
        super();
        this.errorCode = errorCode;
    }

    public SteamException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public SteamException(String message, Throwable cause, int errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public SteamException(Throwable cause, int errorCode) {
        super(cause);
        this.errorCode = errorCode;
    }

    protected SteamException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int errorCode) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.errorCode = errorCode;
    }

}
