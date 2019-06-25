package com.rnappwithkotlin.greeting;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import javax.annotation.Nonnull;

class GreetingModule extends ReactContextBaseJavaModule {

    public GreetingModule(@Nonnull ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Nonnull
    @Override
    public String getName() {
        return "Greeting";
    }

    @ReactMethod
    public void getGreeting(Callback callback) {
        callback.invoke("Hello from Android's Greeting Module!");
    }
}