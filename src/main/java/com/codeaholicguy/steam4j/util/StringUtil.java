package com.codeaholicguy.steam4j.util;

/**
 * @author hoangnn
 */
public class StringUtil {

    public static final String EMPTY = "";

    public static boolean isNullorEmpty(String value) {
        if (value == null || value.equals(EMPTY)) {
            return true;
        }
        return false;
    }
}
