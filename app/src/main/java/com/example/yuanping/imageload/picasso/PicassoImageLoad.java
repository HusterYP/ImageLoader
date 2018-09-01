package com.example.yuanping.imageload.picasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.android.displayingbitmaps.R;

public class PicassoImageLoad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso_image_load);
        init();
    }

    private void init() {
        GridView gridView = findViewById(R.id.gridView_root);
        gridView.setAdapter(new GridAdapter(this));
        gridView.setOnScrollListener(new GridScrollListener(this));
    }
}
