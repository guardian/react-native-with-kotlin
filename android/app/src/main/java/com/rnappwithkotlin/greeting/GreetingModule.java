package com.rnappwithkotlin.greeting;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.gu.ophan.OphanDispatcher;

import javax.annotation.Nonnull;

import greeting.GreetingKt;
import kotlinx.coroutines.Dispatchers;
import ophan.thrift.nativeapp.App;
import ophan.thrift.nativeapp.Device;
import ophan.thrift.nativeapp.Edition;

class GreetingModule extends ReactContextBaseJavaModule {

    private OphanDispatcher ophanDispatcher;

    public GreetingModule(@Nonnull ReactApplicationContext reactContext) {
        super(reactContext);
        ophanDispatcher = new OphanDispatcher(
                new App("0.0.1", "Test", "Android", Edition.UK),
                new Device("Unknown", "Unknown"),
                "testDeviceId",
                "testUserId",
                new MemoryRecordStore(),
                new LogcatLogger()
        );
    }

    @Nonnull
    @Override
    public String getName() {
        return "Greeting";
    }

    @ReactMethod
    public void getGreeting(Callback callback) {
        String kotlinGreeting = GreetingKt.hello();
        callback.invoke(kotlinGreeting);
    }

    @ReactMethod
    public void sendTestEvent() {
        ophanDispatcher.dispatchEvent(Dispatchers.getMain(), GreetingKt.testEvent());
    }
}