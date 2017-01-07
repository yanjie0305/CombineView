package com.example.slidelockview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.slidelockview.view.SlideLockView;

public class MainActivity extends AppCompatActivity {

    private ImageView img;
    private SlideLockView slideLockView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView) findViewById(R.id.img);
        slideLockView = (SlideLockView) findViewById(R.id.slideLockView);
        slideLockView.setOnUnLockListener(new OnUnLockListener() {
            @Override
            public void setOnLock(boolean unLock) {
                slideLockView.setVisibility(View.GONE);
                img.setVisibility(View.VISIBLE);
            }
        });
    }
}
