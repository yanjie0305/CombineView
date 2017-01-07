package com.example.administrator.test_view.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2017/1/6.
 */

public class MyTextView extends View {
    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(1);
        paint.setTextSize(40);
        String text = "我爱你亲爱的祖国，我爱你亲爱的姑娘";
        //canvas.drawText(text,100,100,paint);
        Path path = new Path();
        path.addCircle(400,400,200, Path.Direction.CW);
        canvas.drawTextOnPath(text,path,0,0,paint);
    }
}
