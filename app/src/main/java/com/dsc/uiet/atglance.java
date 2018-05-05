package com.dsc.uiet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class atglance extends AppCompatActivity {
    WebView wb1,wb2,wb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atglance);
        this.wb1=(WebView) findViewById(R.id.wbvwglance1);
        this.wb2=(WebView) findViewById(R.id.wbvwglance2);
        this.wb3=(WebView) findViewById(R.id.wbvwglance3);
        this.wb1.loadData(("<html><body bgcolor=#DEDFE0><p align=\"justify\">" + getString(R.string.atglance1)) + "</p></body></html>", "text/html", "utf-8");
        this.wb2.loadData(("<html><body bgcolor=#DEDFE0><p align=\"justify\">" + getString(R.string.atglance2)) + "</p></body></html>", "text/html", "utf-8");
        this.wb3.loadData(("<html><body bgcolor=#DEDFE0><p align=\"justify\">" + getString(R.string.atglance3)) + "</p></body></html>", "text/html", "utf-8");

    }
}
