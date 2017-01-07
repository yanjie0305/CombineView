package com.example.administrator.test_view.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2017/1/6.
 */

public class PointView extends View {
    public PointView(Context context) {
        super(context);
    }

    public PointView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PointView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(20);
       // canvas.drawPoint(100,100,paint);

        float[] pt = {100,100,200,200,300,300,400,400,460,580};
        canvas.drawPoints(pt,paint);
    }
}
