package com.aacnylt.camphub

import android.app.ProgressDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.widget.AppCompatButton
import android.widget.EditText

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton: AppCompatButton = findViewById(R.id.login) as AppCompatButton
        val usernameBox: EditText = findViewById(R.id.username) as EditText
        val passwordBox: EditText = findViewById(R.id.password) as EditText

        loginButton.setOnClickListener {
            val loading = ProgressDialog.show(this@LoginActivity, "Processing", "Logging you in...", true)
            LoginController.authenticateUser(usernameBox.text.toString(), passwordBox.text.toString(), "http://nyltcamphub.azurewebsites.net", object : LoginCallback {
                override fun onSuccess(result: Scout) {
                    loading.hide()
                    val builder = AlertDialog.Builder(this@LoginActivity)
                    builder.setTitle("Success").setMessage("Hello " + result.FirstName + " " + result.LastName).setPositiveButton(android.R.string.ok, null).show()
                }

                override fun onFailure(error: Any) {
                    loading.hide()
                    val builder = AlertDialog.Builder(this@LoginActivity)
                    builder.setTitle("Error").setMessage("Could not log in.").setPositiveButton(android.R.string.ok, null).show()
                }
            })
        }

    }
}
