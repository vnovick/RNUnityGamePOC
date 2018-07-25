package com.VladimirNovick.ReactNextDemo;

import android.content.Intent;

import com.VladimirNovick.ReactNextDemo.MyReactActivity;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by vladimirnovick on 29/08/2017.
 */

public class UnityLauncherModule extends ReactContextBaseJavaModule {

    private ReactApplicationContext mContext;

    public UnityLauncherModule(ReactApplicationContext reactContext) {
        super(reactContext);
         mContext = reactContext;
    }

    @Override
    public String getName() {
        return "UnityLauncher";
    }

    @ReactMethod
    public void launchIntent() {
        Intent unityGameIntent = new Intent(mContext, UnityPlayerActivity.class);
        unityGameIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK |Intent.FLAG_ACTIVITY_CLEAR_TASK);
        getCurrentActivity().startActivity(unityGameIntent);
    }
}
