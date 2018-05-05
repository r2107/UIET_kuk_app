package com.dsc.uiet;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class notices extends AppCompatActivity {
    List<itemData> mylist = new ArrayList<>();
    ListView myListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notices);

        getListfromlink();
    }

    public void getListfromlink(){
        mylist.clear();
        VolleyHelper vh=new VolleyHelper(this.getApplicationContext());
        vh.getArr("all", null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray jsonArray) {

                for (int i = 0, size = jsonArray.length(); i < size; i++) {
                    try {
                        JSONObject j = jsonArray.getJSONObject(i);

                        itemData item = new itemData(j.getString("date"), j.getString("body"), j.getString("link"));
                        mylist.add(item);


                    } catch (Exception e) {
                        Toast.makeText(notices.this, "Some Error Occurred", Toast.LENGTH_SHORT).show();
                    }

                }
                init_list();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                Toast.makeText(notices.this, "Server Error Occurred", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void init_list()
    {

        myListView=(ListView)findViewById(R.id.mylist);
        myListView.setAdapter(new itemAdapter(notices.this, mylist));




//onclickListner

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {


                itemData item = (itemData) adapterView.getAdapter().getItem(position);
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(item.getLink()));
                startActivity(i);

            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu mymenu) {
        getMenuInflater().inflate(R.menu.menu, mymenu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.refresh:
                Toast.makeText(notices.this, "Refreshing", Toast.LENGTH_SHORT).show();
                getListfromlink();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }

}