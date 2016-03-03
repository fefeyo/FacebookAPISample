package com.fefe.facebooksample;

import android.app.Application;

import com.facebook.FacebookSdk;

/**
 * Created by fefe on 16/03/03.
 */
public class FacebookApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(this);
    }
}
