package com.dsc.uiet;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by pc on 09-03-2018.
 */

public class mechanical extends Fragment{
    WebView wbmech,wbmech2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_mechanical,container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.wbmech = (WebView)getView().findViewById(R.id.wbmech);
        this.wbmech2 = (WebView)getView().findViewById(R.id.wbmech1);
        //wbmech2.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
        this.wbmech.loadData(("<html><body bgcolor=#ffffbb33><p align=\"justify\">" + getString(R.string.mech1)) + "</p></body></html>", "text/html", "utf-8");
        this.wbmech2.loadData(("<html><body bgcolor=#ffffbb33><p align=\"justify\">" + getString(R.string.mech2)) + "</p></body></html>", "text/html", "utf-8");

    }
}
