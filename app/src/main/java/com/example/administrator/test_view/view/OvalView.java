package com.example.administrator.test_view.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2017/1/6.
 */

public class OvalView extends View {
    public OvalView(Context context) {
        super(context);
    }

    public OvalView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public OvalView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(2);
        RectF rect = new RectF(100,100,300,500) ;
        canvas.drawOval(rect,paint);
    }
}
