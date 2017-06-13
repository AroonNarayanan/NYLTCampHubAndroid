package com.aacnylt.camphub

import com.loopj.android.http.AsyncHttpClient
import com.loopj.android.http.AsyncHttpResponseHandler
import com.loopj.android.http.RequestParams

class RestController {
    companion object {
        val client = AsyncHttpClient()

        fun get(url: String, params: RequestParams, responseHandler: AsyncHttpResponseHandler) {
            client.get(LoginController.host + url, params, responseHandler)
        }

        fun post(url: String, params: RequestParams, responseHandler: AsyncHttpResponseHandler) {
            client.post(LoginController.host + url, params, responseHandler)
        }

        fun put(url: String, params: RequestParams, responseHandler: AsyncHttpResponseHandler) {
            client.put(LoginController.host + url, params, responseHandler)
        }

        fun delete(url: String, params: RequestParams, responseHandler: AsyncHttpResponseHandler) {
            client.delete(LoginController.host + url, params, responseHandler)
        }
    }
}

interface RestCallback {
    fun onSuccess(result: Any)

    fun onFailure(error: Any)
}