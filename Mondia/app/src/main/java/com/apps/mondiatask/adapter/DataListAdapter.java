package com.apps.mondiatask.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.apps.mondiatask.R;
import com.apps.mondiatask.models.flatresponse.FlatResponse;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class DataListAdapter extends BaseAdapter {

    Context context;
    List<List<FlatResponse>>flatResponseList=new ArrayList<>();

    public DataListAdapter(Context context, List<List<FlatResponse>> flatResponseList) {
        this.context = context;
        this.flatResponseList = flatResponseList;
    }

    @Override
    public int getCount() {

        return flatResponseList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_data_flat,parent,false);



        ImageView imageView=view.findViewById(R.id.item_data_flat_iv_flat);
        TextView tital=view.findViewById(R.id.item_data_flat_tv_tital);
        TextView type=view.findViewById(R.id.item_data_flat_tv_type_flat);
        TextView name=view.findViewById(R.id.item_data_flat_tv_name);

        Glide.with(context).load(flatResponseList.get(position).get(0).getCover().getMedium()).into(imageView);
        tital.setText(flatResponseList.get(position).get(0).getTitle());
        type.setText(flatResponseList.get(position).get(0).getType());
        name.setText(flatResponseList.get(position).get(0).getMainArtist().getName());


        return view;
    }
}
