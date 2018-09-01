package com.example.yuanping.imageload.picasso;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.android.displayingbitmaps.R;
import com.example.yuanping.imageload.Data;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Collections;

import static android.widget.ImageView.ScaleType.CENTER_CROP;

/**
 * @created by PingYuan at 9/1/18
 * @email: husteryp@gmail.com
 * @description:
 */
public class GridAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<String> urls = new ArrayList<>();

    public GridAdapter(Context context) {
        this.mContext = context;
        Collections.addAll(urls, Data.URLS);
        urls.addAll(urls);
        urls.addAll(urls);
        urls.addAll(urls);
        Collections.shuffle(urls);
    }

    @Override
    public int getCount() {
        return urls.size();
    }

    @Override
    public String getItem(int position) {
        return urls.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView img = (ImageView) convertView;
        if (img == null) {
            img = new ImageView(mContext);
            img.setScaleType(CENTER_CROP);
        }
        String curUrl = getItem(position);
        Picasso.get()
                .load(curUrl)
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.error)
                .fit()
                .tag(mContext)
                .into(img);
        return img;
    }
}
