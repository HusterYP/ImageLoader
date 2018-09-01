package com.example.yuanping.imageload;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.android.displayingbitmaps.R;
import com.example.yuanping.imageload.ui.ImageGridActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void googleImageLoader(View view) {
        Intent intent = new Intent(this, ImageGridActivity.class);
        startActivity(intent);
    }
}
