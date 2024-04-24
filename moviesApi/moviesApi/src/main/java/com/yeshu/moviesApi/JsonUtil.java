package com.yeshu.moviesApi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonUtil {

    /**
     * Prettifies a raw JSON string.
     *
     * @param rawJson the raw JSON string to prettify
     * @return a prettified JSON string
     */
    public static String prettifyJson(String rawJson) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
            Object json = objectMapper.readValue(rawJson, Object.class);
            return objectMapper.writeValueAsString(json);
        } catch (Exception e) {
            e.printStackTrace();
            return null; // Consider appropriate error handling
        }
    }
}
