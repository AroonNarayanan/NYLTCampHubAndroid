package com.aacnylt.camphub;

import com.loopj.android.http.*;
import com.google.gson.*;
import cz.msebera.android.httpclient.Header;

public class LoginController {
    public static String host;

    public static void authenticateUser(String username, String password, String server, final LoginCallback callback) {
        host = server;
        String url = "/authenticate?username=" + username + "&password=" + password;
        RestController.Companion.get(url, null, new TextHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, String r) {
                Gson gson = new Gson();
                Scout user = gson.fromJson(r, Scout.class);
                callback.onSuccess(user);
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, String res, Throwable t){
                callback.onFailure(statusCode);
            }
        });
    }
}
