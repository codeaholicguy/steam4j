package com.codeaholicguy.steam4j.util;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author hoangnn
 */
public class ParameterUtil {

    public static Map<String, Object> getParameters(Object request) throws IllegalAccessException {
        Map<String, Object> parameters = new HashMap<>();

        Field[] fields = ReflectionUtil.getFields(request);

        for (Field field : fields) {
            parameters.put(field.getName(), ReflectionUtil.getFieldValue(request, field));
        }

        return parameters;
    }

}
