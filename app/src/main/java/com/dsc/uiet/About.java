package com.dsc.uiet;

import android.content.Intent;
import android.icu.util.Calendar;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;
public class About extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_about);
        Element adsElement = new Element();
        adsElement.setTitle("Advertise here");
        Element adsElementrh1 = new Element();
        adsElementrh1.setTitle("Follow Rahul Lather on Twitter");
        adsElementrh1.setIcon(R.drawable.about_icon_twitter);
        adsElementrh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String twPageUrl = "https://www.twitter.com/ee2da842f1624bb?s=08";

                try {
                    getPackageManager().getPackageInfo("com.twitter.android", 0);
                    Intent tw = new Intent(Intent.ACTION_VIEW, Uri.parse("twitter://page/"));
                    startActivity(tw);
                } catch (Exception e) {
                    Intent twi = new Intent(Intent.ACTION_VIEW, Uri.parse(twPageUrl));
                    startActivity(twi);
                }
            }});
        Element adsElementrh2 = new Element();
        adsElementrh2.setTitle("Follow Rahul Lather on Instagram");
        adsElementrh2.setIcon(R.drawable.about_icon_instagram);
        adsElementrh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String instaProfileUrl = "https://www.instagram.com/lather_rahul/";

                try {
                    getPackageManager().getPackageInfo("com.instagram.android", 0);
                    Intent insta = new Intent(Intent.ACTION_VIEW, Uri.parse("instag://page/" ));
                    startActivity(insta);
                } catch (Exception e) {
                    Intent insta = new Intent(Intent.ACTION_VIEW, Uri.parse(instaProfileUrl));
                    startActivity(insta);
                }
            }});
       /* Element adsElementyg2 = new Element();
        adsElementyg2.setTitle("Follow Yogesh Yadav on Instagram");
        adsElementyg2.setIcon(R.drawable.about_icon_instagram);
        adsElementyg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String instaProfileUrl = "https://www.instagram.com/yadav.yogesh293/";

                try {
                    getPackageManager().getPackageInfo("com.instagram.android", 0);
                    Intent insta = new Intent(Intent.ACTION_VIEW, Uri.parse("instag://page/" ));
                    startActivity(insta);
                } catch (Exception e) {
                    Intent insta = new Intent(Intent.ACTION_VIEW, Uri.parse(instaProfileUrl));
                    startActivity(insta);
                }
            }});*/
        Element adsElementan1 = new Element();
        adsElementan1.setTitle("Follow Anubhav Gupta on Twitter");
        adsElementan1.setIcon(R.drawable.about_icon_twitter);
        adsElementan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String twitterPageUrl = "https://twitter.com/gupta_anubhav25?s=08";

                try {
                    getPackageManager().getPackageInfo("com.twitter.android", 0);
                    Intent tw = new Intent(Intent.ACTION_VIEW, Uri.parse("twitter://page/"));
                    startActivity(tw);
                } catch (Exception e) {
                    Intent twi = new Intent(Intent.ACTION_VIEW, Uri.parse(twitterPageUrl));
                    startActivity(twi);
                }
            }});
        Element adsElementan2 = new Element();
        adsElementan2.setTitle("Follow Anubhav Gupta on Instagram");
        adsElementan2.setIcon(R.drawable.about_icon_instagram);
        adsElementan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String instaProfileUrl = "https://www.instagram.com/gupta.anubhav25/";

                try {
                    getPackageManager().getPackageInfo("com.instagram.android", 0);
                    Intent insta = new Intent(Intent.ACTION_VIEW, Uri.parse("insta://page/" ));
                    startActivity(insta);
                } catch (Exception e) {
                    Intent insta = new Intent(Intent.ACTION_VIEW, Uri.parse(instaProfileUrl));
                    startActivity(insta);
                }
            }});
        Element adsElementmk1 = new Element();
        adsElementmk1.setTitle("Follow Mohit Sharma on Twitter");
        adsElementmk1.setIcon(R.drawable.about_icon_twitter);
        adsElementmk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String twPageUrl = "https://www.twitter.com/mksharma34?s=08";

                try {
                    getPackageManager().getPackageInfo("com.twitter.android", 0);
                    Intent tw = new Intent(Intent.ACTION_VIEW, Uri.parse("tw://page/"));
                    startActivity(tw);
                } catch (Exception e) {
                    Intent twi = new Intent(Intent.ACTION_VIEW, Uri.parse(twPageUrl));
                    startActivity(twi);
                }
            }});
        Element adsElementmk2 = new Element();
        adsElementmk2.setTitle("Follow Mohit Sharma on Instagram");
        adsElementmk2.setIcon(R.drawable.about_icon_instagram);
        adsElementmk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* String fbPageUrl = "https://www.facebook.com/uietkuk";

                try {
                    getPackageManager().getPackageInfo("com.facebook.katana", 0);
                    Intent fb = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/" ));
                    startActivity(fb);
                } catch (Exception e) {
                    Intent fb = new Intent(Intent.ACTION_VIEW, Uri.parse(fbPageUrl));
                    startActivity(fb);
                }*/
                 String instaProfileUrl = "https://www.instagram.com/mk_sharma1/";

                try {
                    getPackageManager().getPackageInfo("com.instagram.android", 0);
                    Intent insta = new Intent(Intent.ACTION_VIEW, Uri.parse("insta://page/" ));
                    startActivity(insta);
                } catch (Exception e) {
                    Intent insta = new Intent(Intent.ACTION_VIEW, Uri.parse(instaProfileUrl));
                    startActivity(insta);
                }
                /* Uri uri = Uri.parse("http://instagram.com/_u/lather_rahul");
                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

                likeIng.setPackage("com.instagram.android");

                try {
                    startActivity(likeIng);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://instagram.com/lather_rahul")));
                }*/

            }
        });


        View aboutPage =new AboutPage(this)
                .isRTL(false)
                .setImage(R.drawable.angry_nerds)
                .setDescription("Developed By Team: AngryNerds\n(2nd Year)\nMohit Sharma(251602134)\nRahul Lather(251602107)\nUnder the Guidance of:\nAnubhav Gupta(2514221)(4th Year)")
                .addItem(adsElement)
                .addGroup("Connect With Us")
                .addEmail("sachinlather49@gmail.com")
                //.addPlayStore("My PlayStore")
                .addItem(adsElementmk2)
                .addItem(adsElementmk1)
                .addItem(adsElementrh2)
                .addItem(adsElementrh1)
               // .addItem(adsElementyg2)
                .addItem(adsElementan2)
                .addItem(adsElementan1)
               // .addItem(createCopyright())
                .create();
        setContentView(aboutPage);
    }
  /*  private Element createCopyright(){
        final Element copyright =new Element();
        final String copyrightString =String.format("Copyright %d by AngryNerds", Calendar.getInstance().get(Calendar.YEAR));
        copyright.setTitle(copyrightString);
        copyright.setIcon(R.drawable.about_icon_copy_right);
        copyright.setGravity(Gravity.CENTER);
        copyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(About.this,copyrightString,Toast.LENGTH_SHORT).show();
            }
        });
        return copyright;
    }*/
}