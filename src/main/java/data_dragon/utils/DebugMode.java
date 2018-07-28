package data_dragon.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DebugMode {


    public static boolean IsDebugMode() {

        return java.lang.management.ManagementFactory.getRuntimeMXBean().
                getInputArguments().toString().contains("jdwp");
    }

    public static ObjectMapper RunOrDebugObjectMapper() {

        ObjectMapper objectMapper = new ObjectMapper();

        if (!IsDebugMode()) {
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
        } else {
            objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
        }

        return objectMapper;
    }
}
