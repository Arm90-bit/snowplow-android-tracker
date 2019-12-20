package com.snowplowanalytics.snowplow.tracker;

public interface ErrorLogging {

    void log(String source, String errorMessage, Exception e);

}
