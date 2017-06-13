package com.aacnylt.camphub;

import com.loopj.android.http.*;
import com.google.gson.*;

public class LoginController {
    public static String host;

    public static void authenticateUser(String username, String password, String server, final RestCallback callback) {
        host = server;
        String url = "/authenticate?username=" + username + "&password=" + password;
        RestController.Companion.get(url, null, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(JsonObject userJson) {
                Gson gson = new Gson();
                Scout user = gson.fromJson(userJson, Scout.class);
                callback.onSuccess(user);
            }
        });
    }
}
