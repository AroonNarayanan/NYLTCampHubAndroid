package com.aacnylt.camphub;

import com.loopj.android.http.*;

import cz.msebera.android.httpclient.Header;

import com.google.gson.*;

public class LoginController {
    public static String host;

    public static Scout authenticateUser(String username, String password, String server) {
        host = server;
        String url = "/authenticate?username=" + username + "&password=" + password;
        RestController.Companion.get(url, null, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JsonObject userJson) {
                Gson gson = new Gson();
                Scout user = gson.fromJson(userJson, Scout.class);

            }
        });
    }
}
