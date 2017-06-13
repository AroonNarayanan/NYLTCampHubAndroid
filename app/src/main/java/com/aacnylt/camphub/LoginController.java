package com.aacnylt.camphub;

import com.loopj.android.http.*;

import org.json.*;

import cz.msebera.android.httpclient.Header;

public class LoginController {
    public static String host;

    public static JSONObject authenticateUser(String username, String password, String server) {
        host = server;
        String url = "/authenticate?username=" + username + "&password=" + password;
        RestController.Companion.get(url, null, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject user) {

            }
        });
    }
}
