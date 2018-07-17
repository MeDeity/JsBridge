package com.deity.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.deity.jsbridge.entity.JSBridge;
import com.deity.jsbridge.entity.JSBridgeWebChromeClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView mWebView = (WebView) findViewById(R.id.webview);
        WebSettings settings = mWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        mWebView.setWebChromeClient(new JSBridgeWebChromeClient());
        mWebView.loadUrl("file:///android_asset/index.html");

        JSBridge.register("bridge", BridgeImpl.class);
    }
}
