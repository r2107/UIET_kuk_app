package com.dsc.uiet;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class AcademicCalendar extends AppCompatActivity  {

    PDFView pdf;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academic_calendar);

        if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {

            requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
        }

        Intent i = getIntent();
        final String url = i.getStringExtra("url");
        final String name = url.substring(url.lastIndexOf('/')+1);
        pdf = (PDFView) findViewById(R.id.pdfView);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                DownloadFiles(url,name);
            }
        });


        t.start();
    }
    private void displayfomFile(File f) {


        pdf.fromFile(f)
                .defaultPage(0)
                .enableSwipe(true)
                .swipeHorizontal(false)
                .enableAnnotationRendering(true)
                .scrollHandle(new DefaultScrollHandle(this))
                .load();
    }
    public void DownloadFiles(String url, final String name){

        try {
            URL u = new URL(url);
            InputStream is = u.openStream();
            final File uietDirectory = new File(Environment.getExternalStorageDirectory().getAbsolutePath() +File.separator+ "uiet");

            if (!uietDirectory.exists()) {
                uietDirectory.mkdirs();
            }

            DataInputStream dis = new DataInputStream(is);

            byte[] buffer = new byte[10240];
            int length;
            File file = new File(uietDirectory+File.separator+name);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(file);
            while ((length = dis.read(buffer))>0) {
                Log.i("abc",length+"");
                fos.write(buffer, 0, length);
            }
            Log.i("abc","finished");
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    displayfomFile(new File(uietDirectory+File.separator+name));
                    Log.i("abc","shownn"+pdf);
                }

            });

        } catch (MalformedURLException mue) {
            Log.e("SYNC getUpdate", "malformed url error", mue);
        } catch (IOException ioe) {
            Log.e("SYNC getUpdate", "io error", ioe);
        } catch (SecurityException se) {
            Log.e("SYNC getUpdate", "security error", se);
        }
    }
}

