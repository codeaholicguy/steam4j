package com.codeaholicguy.steam4j.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author hoangnn
 */
public class JsonUtil {

    private static final GsonBuilder builder = new GsonBuilder();
    private static final Gson gson = builder.create();

    /**
     * Serialize object to json string.
     *
     * @param object object to serialize.
     * @return String
     */
    public static String toJson(Object object) {
        return gson.toJson(object);
    }

    /**
     * Deserialize json to object.
     *
     * @param json  json to deserialize.
     * @param clazz class of object to deserialize.
     * @param <T>   object to return.
     * @return T
     */
    public static <T> T fromJson(String json, Class<T> clazz) {
        return gson.fromJson(json, clazz);
    }
}
