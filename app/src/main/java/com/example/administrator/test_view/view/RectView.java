package com.example.administrator.test_view.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2017/1/6.
 */

public class RectView extends View {
    public RectView(Context context) {
        super(context);
    }

    public RectView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RectView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(2);
        Rect rect = new Rect(100,100,300,500);
        canvas.drawRect(rect,paint);
    }
}
