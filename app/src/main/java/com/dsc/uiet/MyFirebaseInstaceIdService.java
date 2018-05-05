package com.dsc.uiet;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.google.firebase.messaging.FirebaseMessaging;


/**
 * Created by ANUBHAV on 25-Dec-16.
 */

public class MyFirebaseInstaceIdService extends FirebaseInstanceIdService {
    private static final String RegToken="REG_TOKEN";
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String recentToken= FirebaseInstanceId.getInstance().getToken();
        FirebaseMessaging.getInstance().subscribeToTopic("uietnews");
        Log.d(RegToken,recentToken);
    }
}