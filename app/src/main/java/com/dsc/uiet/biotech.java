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

public class biotech extends Fragment{
    WebView wbbio1,wbbio2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_biotech,container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.wbbio1 = (WebView)getView().findViewById(R.id.wbbio);
        this.wbbio2 = (WebView)getView().findViewById(R.id.wbbio1);
        // wbece2.setScrollBarStyle(WebView.SCROLLBARS_INSIDE_OVERLAY);
        this.wbbio1.loadData(("<html><body bgcolor=#ffffbb33><p align=\"justify\">" + getString(R.string.bio1)) + "</p></body></html>", "text/html", "utf-8");
        this.wbbio2.loadData(("<html><body bgcolor=#ffffbb33><p align=\"justify\">" + getString(R.string.bio2)) + "</p></body></html>", "text/html", "utf-8");

    }
}
