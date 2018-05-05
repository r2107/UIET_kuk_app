package com.dsc.uiet;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class Fragment3 extends Fragment {
    WebView webvw;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment3, container, false);
    }
    public void onViewCreated(View view,Bundle savedInsatanceState){
        super.onViewCreated(view,savedInsatanceState);
        this.webvw = (WebView)getView().findViewById(R.id.wbtxtvw1);
        this.webvw.loadData(("<html><body bgcolor=#DEDFE0><p align=\"justify\">" + getString(R.string.why_uietkuk)) + "</p></body></html>", "text/html", "utf-8");
    }
}
