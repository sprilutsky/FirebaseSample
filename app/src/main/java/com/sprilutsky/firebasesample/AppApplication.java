package com.sprilutsky.firebasesample;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Sergey Prilutsky on 09.02.16.
 */
public class AppApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
