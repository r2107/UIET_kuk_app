package com.dsc.uiet;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import java.util.List;

/**
 * Created by ANUBHAV on 4/13/2017.
 */

class itemAdapter extends BaseAdapter {

    private Context context;
    private List<itemData> list;


    itemAdapter(Context context, List<itemData> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        System.gc();
        FolderHolder holder = new FolderHolder();
        convertView= LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);


        itemData item=(itemData) getItem(position);
        holder.date = (TextView) convertView.findViewById(R.id.date);
        holder.body = (TextView) convertView.findViewById(R.id.body);


        holder.date.setText(item.getDate());
        holder.body.setText(item.getBody());

        return convertView;
    }
    private static class FolderHolder {

        TextView date,body;

    }

}