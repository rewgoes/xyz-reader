package com.example.xyzreader.remote;

import java.net.MalformedURLException;
import java.net.URL;

import timber.log.Timber;

class Config {
    static final URL BASE_URL;

    static {
        URL url = null;
        try {
            url = new URL("https://go.udacity.com/xyz-reader-json");
        } catch (MalformedURLException ignored) {
            // TODO: throw a real error
            Timber.e(ignored, "Please check your internet connection.");
        }

        BASE_URL = url;
    }
}
