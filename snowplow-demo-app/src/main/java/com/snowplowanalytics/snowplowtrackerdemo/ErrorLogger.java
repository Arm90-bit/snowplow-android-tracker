package com.snowplowanalytics.snowplowtrackerdemo;

import android.util.Log;

import com.snowplowanalytics.snowplow.tracker.ErrorLogging;

public class ErrorLogger implements ErrorLogging {
    @Override
    public void log(String source, String errorMessage, Exception e) {
        Log.e("MyLog - "+source, errorMessage);
    }
}
