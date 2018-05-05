package com.dsc.uiet;

import android.app.ActionBar;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.app.DownloadManager;
import android.webkit.DownloadListener;
import android.net.Uri;
import android.webkit.CookieManager;
import android.webkit.URLUtil;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Environment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //togallery
               Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ImageView imageCourses = (ImageView) findViewById(R.id.img_courses);

        imageCourses.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent a = new Intent(MainActivity.this, coarses.class);
                startActivity(a);

            }

        });
        //blinking
        Button myText = (Button) findViewById(R.id.anouncement);
        ImageButton myimg =(ImageButton)findViewById(R.id.contact_us);
        Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(500); //You can manage the blinking time with this parameter
        anim.setStartOffset(20);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        myText.startAnimation(anim);
        myimg.startAnimation(anim);
        //blinkng

        myText.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent a =new Intent(MainActivity.this,notices.class);
                startActivity(a);
            }
        });

        ImageButton imageCont = (ImageButton) findViewById(R.id.contact_us);

        imageCont.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent a = new Intent(MainActivity.this, contact.class);
                startActivity(a);

            }

        });
        ImageView imageGallery = (ImageView) findViewById(R.id.img_gallery);

        imageGallery.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent a = new Intent(MainActivity.this, gallery.class);
                startActivity(a);

            }

        });
        ImageView imageNotice = (ImageView) findViewById(R.id.img_notice);

        imageNotice.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent c = new Intent(MainActivity.this, notices.class);
                startActivity(c);

            }

        });
        ImageView imageREs = (ImageView) findViewById(R.id.img_exam);

        imageREs.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String url ="http://49.50.77.75/";
                Intent j= new Intent(Intent.ACTION_VIEW);
                j.setData(Uri.parse(url));
                startActivity(j);

            }

        });
        ImageView imagetnp = (ImageView) findViewById(R.id.img_placement);

        imagetnp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent a = new Intent(MainActivity.this, Tnpcell.class);
                startActivity(a);

            }

        });
        ImageView image = (ImageView) findViewById(R.id.img_online_fee);

        image.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent a = new Intent(MainActivity.this, Web.class);
                a.putExtra("url1","http://uietkuk.org/online-feepayment/");
                startActivity(a);

            }

        });
        ImageView imag = (ImageView) findViewById(R.id.img_research);

        imag.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent a = new Intent(MainActivity.this, departments.class);
                startActivity(a);

            }

        });
        ImageView ima = (ImageView) findViewById(R.id.img_about_us);

        ima.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent a = new Intent(MainActivity.this, atglance.class);
                startActivity(a);

            }

        });


    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        /*if (id == R.id.home) { Intent a = new Intent(this,MainActivity.class);
            startActivity(a);}*/

        if(id==R.id.panel)
        {
            String url ="http://49.50.77.75/";
            Intent j= new Intent(Intent.ACTION_VIEW);
            j.setData(Uri.parse(url));
            //Intent j = new Intent(this,Web.class);
            //j.putExtra("url5","http://49.50.77.75/");
            startActivity(j);
        }
        else if(id==R.id.gallery)
        {
            Intent i = new Intent(this, gallery.class);
           // i.putExtra("url4","http://www.uietkuk.org/Gallery.php");
            startActivity(i);

        }
        else if(id==R.id.fee)
        {

           Intent i = new Intent(MainActivity.this, Web.class);
           i.putExtra("url1","http://uietkuk.org/online-feepayment/");
           startActivity(i);
        }
        else if(id==R.id.calendar)
        {
            Intent i = new Intent(this,AcademicCalendar.class);
            i.putExtra("url","http://www.uietkuk.org/uploads/Academic%20Calender%202017-18.pdf");
            startActivity(i);
        }
        else if(id==R.id.admission)
        {
            Intent i = new Intent(MainActivity.this, coarses.class);
            //i.putExtra("url2","http://www.uietkuk.org/admissions.php");
            startActivity(i);
        }
        else if(id==R.id.downloads)
        {
            Intent i = new Intent(MainActivity.this, Web.class);
            i.putExtra("url3","http://www.uietkuk.org/downloads.php");
            startActivity(i);
        }
        else if (id==R.id.about)
        {
            Intent k = new Intent(this,About.class);
            // i.putExtra("url","http://www.uietkuk.org/uploads/Academic%20Calender%202017-18.pdf");
            startActivity(k);
        }
        else if(id==R.id.contact)
        {           Intent k = new Intent(this,contact.class);
            startActivity(k);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
