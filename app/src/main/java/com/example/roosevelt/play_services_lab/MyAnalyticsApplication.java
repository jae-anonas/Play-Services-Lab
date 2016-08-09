package com.example.roosevelt.play_services_lab;

import android.app.Application;

import com.google.android.gms.analytics.Tracker;

/**
 * Created by roosevelt on 8/9/16.
 */
public class MyAnalyticsApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AnalyticsTrackers.initialize(this);
    }

    public static Tracker getDefaultTracker(){
        return AnalyticsTrackers.getInstance().get(AnalyticsTrackers.Target.APP);
    }
}