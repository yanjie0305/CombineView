package com.example.countball.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by ${郭艳杰} on 2017/1/6.
 */

public class CountBall extends View implements View.OnClickListener {
    int count = 0;
    public CountBall(Context context) {
        super(context);
        init();
    }

    public CountBall(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CountBall(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        this.setOnClickListener(this);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(2);
        paint.setAntiAlias(true);
        canvas.drawCircle(getMeasuredWidth()/2,getMeasuredHeight()/2,100,paint);
        String text = count+"";
        paint.setColor(Color.BLACK);
        Rect rect = new Rect();
        paint.setTextSize(30);
        paint.getTextBounds(text,0,text.length(),rect);
        canvas.drawText(text,getMeasuredWidth()/2-rect.width()/2,getMeasuredHeight()/2+rect.height()/2,paint);

    }

    @Override
    public void onClick(View v) {
        count++;
       postInvalidate();

    }
}
