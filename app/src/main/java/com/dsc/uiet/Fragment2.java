package com.dsc.uiet;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

public class Fragment2 extends Fragment {
    WebView mytxtvw;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment2, container, false);
    }
    public void onViewCreated(View view,Bundle savedInsatanceState){
        super.onViewCreated(view,savedInsatanceState);
        this.mytxtvw = (WebView)getView().findViewById(R.id.mytxtview1);
        this.mytxtvw.loadData(("<html><body bgcolor=#DEDFE0><p align=\"justify\">" + getString(R.string.message_tpo)) + "</p></body></html>", "text/html", "utf-8");
    }

}
