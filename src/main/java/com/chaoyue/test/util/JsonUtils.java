package com.chaoyue.test.util;

import com.fasterxml.jackson.databind.DeserializationFeature;
import lombok.extern.slf4j.Slf4j;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
public class JsonUtils {
    public static String objectToJSON(Object obj) {
        ObjectMapper mapper = new ObjectMapper();
        String json = "";
        try {
            json = mapper.writeValueAsString(obj);
        } catch (IOException e) {
            log.error("object to json error ", e);
        }
        return json;
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static <K, V> Map<K, V> jsonToMap(String json, boolean isUsingDecimal) {
        Map<K, V> resultMap = new HashMap<>();
        if (StringUtils.isEmpty(json)) {
            return resultMap;
        }
        ObjectMapper mapper = new ObjectMapper();
        if (isUsingDecimal) {
            //在财务等关键数字上，避免反系列化时默认使用的double精度问题
            mapper.enable(DeserializationConfig.Feature.USE_BIG_DECIMAL_FOR_FLOATS);
        }
        try {
            resultMap = mapper.readValue(json, Map.class);
        } catch (IOException e) {
            log.error("json to map error ", e);
            return resultMap;
        }
        return resultMap;
    }

    public static <K, V> Map<K, V> jsonToMap(String json) {
        return jsonToMap(json, false);
    }

    public static <T> List<T> jsonToList(String json) {
        List<T> resultList = new ArrayList<>();
        if (StringUtils.isEmpty(json)) {
            return resultList;
        }
        ObjectMapper mapper = new ObjectMapper();
        try {
            //noinspection unchecked
            resultList = mapper.readValue(json, List.class);
        } catch (IOException e) {
            log.error("json to map error ", e);
            return resultList;
        }
        return resultList;
    }

    public static <T> T toObject(String json, Class<T> objectType) {
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            return mapper.readValue(json, objectType);
        } catch (IOException e) {
            log.error("json to object error ", e);
        }
        return null;
    }
}
