package com.dsc.uiet;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tnpcell extends AppCompatActivity {
    Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tnpcell);
        FragmentManager fm = getFragmentManager();
        hideListner(fm.findFragmentById(R.id.fragmentplace1));
        hideListner(fm.findFragmentById(R.id.fragmentplace2));
        hideListner(fm.findFragmentById(R.id.fragmentplace3));
        addShowHideListener(R.id.btn1, fm.findFragmentById(R.id.fragmentplace1));
        addShowHideListener(R.id.btn2, fm.findFragmentById(R.id.fragmentplace2));
        addShowHideListener(R.id.btn3, fm.findFragmentById(R.id.fragmentplace3));
        button4 =(Button)findViewById(R.id.btn4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fbPageUrl = "https://www.facebook.com/trainingandplacementcell.UIETKUK/";

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
        Button btntnp = (Button) findViewById(R.id.btn5);
        btntnp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent a = new Intent(Tnpcell.this, TnpBacktrack.class);
                startActivity(a);
            }
        });
    }
    void addShowHideListener(int buttonId, final Fragment fragment) {
        final Button button1 = (Button) findViewById(buttonId);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.setCustomAnimations(android.R.animator.fade_in,
                        android.R.animator.fade_out);
                if (fragment.isHidden()) {
                    ft.show(fragment);
                    //button1.setText("Hide");
                } else {
                    ft.hide(fragment);
                    //button1.setText("Show");
                }
                ft.commit();
            }
        });
    }
    void hideListner(final Fragment frag){
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.hide(frag);
        ft.commit();
    }
   /* public void ChangeFragment(View view){
        android.app.Fragment fragment;
        if(view==findViewById(R.id.btn3)) {
            fragment = new Fragment1();
            android.app.FragmentManager fm = getFragmentManager();
            android.app.FragmentTransaction ft =fm.beginTransaction();
            ft.replace(R.id.fragmentplace3,fragment);
            ft.commit();
        }
        if(view==findViewById(R.id.btn1)) {
            fragment = new Fragment3();
            android.app.FragmentManager fm = getFragmentManager();
            android.app.FragmentTransaction ft =fm.beginTransaction();
            ft.replace(R.id.fragmentplace1,fragment);
            ft.commit();
        }
        if(view==findViewById(R.id.btn2)){
            fragment= new Fragment2();
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft =fm.beginTransaction();
            ft.replace(R.id.fragmentplace2,fragment);
            ft.commit();
        }
    }*/
}
