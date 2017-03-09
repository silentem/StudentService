package com.whaletail.util;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;

/**
 * @author Whaletail
 */
public class JsonUtil {
    public static JsonElement parseJson(HttpServletRequest request){
        StringBuffer jb = new StringBuffer();
        String line = null;
        try {
            BufferedReader reader = request.getReader();
            while ((line = reader.readLine()) != null)
                jb.append(line);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(jb.toString());
        JsonParser jsonParser = new JsonParser();
        return jsonParser.parse(jb.toString());
    }
}
