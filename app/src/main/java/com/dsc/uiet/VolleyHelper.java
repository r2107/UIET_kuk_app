package com.dsc.uiet;

import org.json.JSONArray;
import org.json.JSONObject;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request.Method;
import com.android.volley.RequestQueue;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

public class VolleyHelper {

    private final Context mContext;
    private final RequestQueue mRequestQueue;
    // private final ImageLoader mImageLoader;
    public  final static String mBaseUrl="http://uietnotification.herokuapp.com";
    //public  final static String mBaseUrl="http://192.168.43.154:5000";

    public VolleyHelper(Context c){
        mContext = c;
        mRequestQueue = Volley.newRequestQueue(mContext);
        //  mBaseUrl = baseUrl;
        // mImageLoader = new ImageLoader(mRequestQueue, new BitmapLruCache());
    }

    private String contructUrl(String method){
        return mBaseUrl + "/" + method;
    }

   /* public ImageLoader getImageLoader(){
        return mImageLoader;
    }*/

    public void get(String method, JSONObject jsonRequest,
                    Listener<JSONObject> listener, ErrorListener errorListener){

        JsonObjectRequest objRequest = new JsonObjectRequest(Method.GET, contructUrl(method), jsonRequest, listener, errorListener);
        mRequestQueue.add(objRequest);
    }
    public void getArr(String method, JSONArray jsonRequest,
                       Listener<JSONArray> listener, ErrorListener errorListener){

        JsonArrayRequest objRequest = new JsonArrayRequest(Method.GET, contructUrl(method), jsonRequest, listener, errorListener);
        mRequestQueue.add(objRequest);
    }


    public void post(String method, JSONObject jsonRequest,
                     Listener<JSONObject> listener, ErrorListener errorListener){

        JsonObjectRequest objRequest = new JsonObjectRequest(Method.POST, contructUrl(method), jsonRequest, listener, errorListener);
        mRequestQueue.add(objRequest);
    }
    public void postArr(String method, JSONArray jsonRequest,
                        Listener<JSONArray> listener, ErrorListener errorListener){

        JsonArrayRequest objRequest = new JsonArrayRequest(Method.POST, contructUrl(method), jsonRequest, listener, errorListener);
        mRequestQueue.add(objRequest);
    }


}