package com.dsc.uiet;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatImageButton;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        TextView t = findViewById(R.id.textView7);
        t.setText("University Institute of Engineering And Technology");
        t.setTextSize(30);
        t.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        TextView k = findViewById(R.id.textView11);
        k.setText("Phone No. : 01744-239155\n" +
                "Fax. : 01744-238967\n" +
                "Kurukshetra, Haryana,India.\n"  +
                "Pin Code : 136119");
        k.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        k.setTextSize(22);
        TextView m= findViewById(R.id.textView10);
        m.setText("(Established by the State Legislature Act XII of 1956)");
        m.setTextSize(20);
        m.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        TextView n= findViewById(R.id.textView8);
        n.setText("(Recognized by UGC under Section 2(f) & 12(B) of the UGC act 1956)\n" +
                "A Constituent Autonomous Institute");
        n.setTextSize(20);
        n.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        TextView o= findViewById(R.id.textView9);
        o.setText("KURUKSHETRA UNIVERSITY KURUKSHETRA");
        o.setTextSize(25);
        o.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        ImageView button =  findViewById(R.id.imageViewfb);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fbPageUrl = "https://www.facebook.com/uietkuk/";

                try {
                    getPackageManager().getPackageInfo("com.facebook.katana", 0);
                    Intent fb = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/1490772567815224" ));
                    startActivity(fb);
                } catch (Exception e) {
                    Intent fb = new Intent(Intent.ACTION_VIEW, Uri.parse(fbPageUrl));
                    startActivity(fb);
                }

            }
        });
        ImageView button1 = findViewById(R.id.imageViewinsta);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2)
            {

                Uri uri = Uri.parse("http://instagram.com/uietkurukshetra/");
                Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

                likeIng.setPackage("com.instagram.android");

                try {
                    startActivity(likeIng);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://instagram.com/uietkurukshetra/")));
                }
            }

        });
        ImageView button2 = findViewById(R.id.imageViewgmail);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","uietkuk@mailinator.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Body");
                startActivity(Intent.createChooser(emailIntent, "Send email..."));
            }
        });
    }}

