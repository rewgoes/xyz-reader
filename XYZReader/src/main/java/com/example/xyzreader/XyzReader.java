package com.example.xyzreader;

import android.app.Application;

import timber.log.Timber;

public class XyzReader extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }
}
