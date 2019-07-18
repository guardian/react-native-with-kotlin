package com.rnappwithkotlin.greeting;

import android.util.Log;

import com.gu.ophan.Logger;

class LogcatLogger implements Logger {
    @Override
    public void debug(String tag, String message) {
        Log.d(tag, message);
    }

    @Override
    public void warn(String tag, String message, Throwable throwable) {
        Log.w(tag, message, throwable);
    }
}
