package com.example.administrator.test_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.test_view.view.ArcView;
import com.example.administrator.test_view.view.LineView;
import com.example.administrator.test_view.view.MyTextView;
import com.example.administrator.test_view.view.OvalView;
import com.example.administrator.test_view.view.PointView;
import com.example.administrator.test_view.view.RectView;

public class MainActivity extends AppCompatActivity {

    private ArcView arcView;
    private LineView lineView;
    private OvalView ovalView;
    private MyTextView myTextView;
    private PointView pointView;
    private RectView rectView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arcView = (ArcView) findViewById(R.id.arcView);
        lineView = (LineView) findViewById(R.id.lineView);
        ovalView = (OvalView) findViewById(R.id.ovalView);
        myTextView = (MyTextView) findViewById(R.id.myTextView);
        pointView = (PointView) findViewById(R.id.pointView);
        rectView = (RectView) findViewById(R.id.rectView);
    }

    public void drawPoint(View view) {
        pointView.setVisibility(View.VISIBLE);
        arcView.setVisibility(View.GONE);
        lineView.setVisibility(View.GONE);
        ovalView.setVisibility(View.GONE);
        rectView.setVisibility(View.GONE);
        myTextView.setVisibility(View.GONE);
    }

    public void drawCircle(View view) {
        pointView.setVisibility(View.GONE);
        arcView.setVisibility(View.VISIBLE);
        lineView.setVisibility(View.GONE);
        ovalView.setVisibility(View.GONE);
        rectView.setVisibility(View.GONE);
        myTextView.setVisibility(View.GONE);
    }

    public void drawLine(View view) {
        pointView.setVisibility(View.GONE);
        arcView.setVisibility(View.GONE);
        lineView.setVisibility(View.VISIBLE);
        ovalView.setVisibility(View.GONE);
        rectView.setVisibility(View.GONE);
        myTextView.setVisibility(View.GONE);

    }

    public void drawoval(View view) {
        pointView.setVisibility(View.GONE);
        arcView.setVisibility(View.GONE);
        lineView.setVisibility(View.GONE);
        ovalView.setVisibility(View.VISIBLE);
        rectView.setVisibility(View.GONE);
        myTextView.setVisibility(View.GONE);
    }

    public void drawrect(View view) {
        pointView.setVisibility(View.GONE);
        arcView.setVisibility(View.GONE);
        lineView.setVisibility(View.GONE);
        ovalView.setVisibility(View.GONE);
        rectView.setVisibility(View.VISIBLE);
        myTextView.setVisibility(View.GONE);

    }

    public void drawtext(View view) {
        pointView.setVisibility(View.GONE);
        arcView.setVisibility(View.GONE);
        lineView.setVisibility(View.GONE);
        ovalView.setVisibility(View.GONE);
        rectView.setVisibility(View.GONE);
        myTextView.setVisibility(View.VISIBLE);

    }
}
