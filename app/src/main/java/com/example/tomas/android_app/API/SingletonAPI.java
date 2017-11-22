package com.example.tomas.android_app.API;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class SingletonAPI {

    public static String BASE_URL = "http://192.168.1.13:8080/api/";
    private static SingletonAPI mSingletonAPIInstance;
    private RequestQueue mRequestQueue;
    private static Context mContext;

    private SingletonAPI(Context context) {
        mContext = context;
        mRequestQueue = getRequestQueue();
    }

    public static synchronized SingletonAPI getInstance(Context context) {
        if (mSingletonAPIInstance == null) {
            mSingletonAPIInstance = new SingletonAPI(context);
        }
        return mSingletonAPIInstance;
    }

    public RequestQueue getRequestQueue() {
        if (mRequestQueue == null) {
            // getApplicationContext() is key, it keeps you from leaking the
            // Activity or BroadcastReceiver if someone passes one in.
            mRequestQueue = Volley.newRequestQueue(mContext.getApplicationContext());
        }
        return mRequestQueue;
    }

    public <T> void addToRequestQueue(Request<T> req, String tag) {
        req.setTag(tag);
        getRequestQueue().add(req);
    }

    public void cancelPendingRequests(Object tag) {
        if (mRequestQueue != null) {
            mRequestQueue.cancelAll(tag);
        }
    }
}
