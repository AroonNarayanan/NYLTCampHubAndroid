package com.aacnylt.camphub

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        LoginController.authenticateUser("admin", "1234", "http://nyltcamphub.azurewebsites.net", RestCallback {
            fun onSuccess(result: Any) {
            }
        })
    }
}
