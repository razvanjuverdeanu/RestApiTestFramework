package Utility;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class JsonTransformer {

    ObjectMapper objectMapper = new ObjectMapper();

    public String transformObjectToJson(Object object) {

        String objectAsString = null;

        try {
            objectAsString = objectMapper.writeValueAsString(object);
            return objectAsString;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return objectAsString;
    }

    public Map<?, ?> transformObjectToMap(Object object) {
        Map<?, ?> mapObject = objectMapper.convertValue(object, Map.class);
        return mapObject;
    }
}
