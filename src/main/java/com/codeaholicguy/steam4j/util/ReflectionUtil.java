package com.codeaholicguy.steam4j.util;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;

/**
 * @author hoangnn
 */
public class ReflectionUtil {

    public static Object getFieldValue(Object instance, Field field) throws IllegalAccessException {
        field.setAccessible(true);

        return field.get(instance);
    }

    public static Field[] getFields(Object instance) {
        return instance.getClass().getDeclaredFields();
    }

}
