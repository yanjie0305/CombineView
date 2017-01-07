package com.example.administrator.test_view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by ${郭艳杰} on 2017/1/6.
 */

public class BitmapView extends View {
    public BitmapView(Context context) {
        super(context);
    }

    public BitmapView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BitmapView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
        

    }
}
