package com.example.progressview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.progressview.view.ProgressView;

public class MainActivity extends AppCompatActivity {

    private ProgressView progressView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressView = (ProgressView) findViewById(R.id.progressView);
    }

    public void btn(View view) {
        progressView.start();
    }
}
