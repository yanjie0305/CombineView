package com.example.progressview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by ${郭艳杰} on 2017/1/6.
 */

public class ProgressView extends View {
    int progress;
    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (progress<100){
                progress++;
                invalidate();
                sendEmptyMessageDelayed(0,10);
            }
        }
    };
    public ProgressView(Context context) {
        super(context);
    }

    public ProgressView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ProgressView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);
        paint.setAntiAlias(true);
        canvas.drawCircle(100,100,100,paint);
        RectF rectF = new RectF(0,0,200,200);
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(3);
        canvas.drawArc(rectF,0,360*progress/100,false,paint);
        String text = progress+"%";
        paint.setTextSize(30);
        Rect rect = new Rect();
        paint.getTextBounds(text,0,text.length(),rect);
        paint.setColor(Color.BLACK);
        canvas.drawText(text,100-rect.width()/2,100+rect.height()/2,paint);

    }
    public void start(){
        progress=0;
        handler.sendEmptyMessageDelayed(0,10);
    }
}
