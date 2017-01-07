package com.example.slidelockview.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.example.slidelockview.OnUnLockListener;
import com.example.slidelockview.R;

/**
 * Created by ${郭艳杰} on 2017/1/7.
 */

public class SlideLockView extends View {

    private int bg_height;
    private int bg_width;
    private int block_width;
    private int measuredHeight;
    private int measuredWidth;
    private int left;
    private int top;
    private int right;
    private int currentX = 0;
    private int currentY = 0;
    private Bitmap slide_bg;
    private Bitmap slide_block;
    private float downX;
    private float downY;
    private boolean onBlock;
    private OnUnLockListener onUnLockListener;
Handler handler = new Handler(){
    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);
        if (currentX>left){
            currentX=currentX-10;
            invalidate();
            sendEmptyMessageDelayed(0,5);
        }
        
    }
};

    public SlideLockView(Context context) {
        super(context);
        init();
    }

    public SlideLockView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SlideLockView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        slide_bg = BitmapFactory.decodeResource(getResources(), R.mipmap.jiesuo_bg);
        slide_block = BitmapFactory.decodeResource(getResources(), R.mipmap.jiesuo_button);
        //计算出两张图的宽高
        bg_height = slide_bg.getHeight();
        bg_width = slide_bg.getWidth();
        block_width = slide_block.getWidth();


    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        measuredHeight = getMeasuredHeight();
        measuredWidth = getMeasuredWidth();
        left = measuredWidth/2-bg_width/2;
        top = measuredHeight/2-bg_height/2;
        right = measuredWidth/2+bg_width/2-block_width;
        currentX=left;
        currentY = top;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(slide_bg,left,top,null);
        if (currentX<left){
            currentX=left;
        }else if (currentX>right){
            currentX=right;
        }
        canvas.drawBitmap(slide_block,currentX,currentY,null);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                downX = event.getX();
                downY = event.getY();
                onBlock = isOnBlock(downX,downY);
                if (onBlock){
                    Toast.makeText(getContext(), "按到了", Toast.LENGTH_SHORT).show();

                handler.removeCallbacksAndMessages(null);
                }
                break;
            case MotionEvent.ACTION_MOVE:
                if (onBlock){
                    float moveX = event.getX();
                    float moveY = event.getY();
                    currentX = (int) (moveX-block_width/2);
                    invalidate();
                }
                break;
            case MotionEvent.ACTION_UP:
            case MotionEvent.ACTION_CANCEL:
                onBlock=false;
                if (currentX>=right-3){
                    if (onUnLockListener!=null){
                        onUnLockListener.setOnLock(true);
                    }
                    Toast.makeText(getContext(), "解锁了", Toast.LENGTH_SHORT).show();
                }else {
                    handler.sendEmptyMessageDelayed(0,5);
                }
                invalidate();
                break;

        }
        return true;
    }

    private boolean isOnBlock(float downX, float downY) {
        int rx = currentX+block_width/2;
        int ry = currentY+block_width/2;
        double sqrt = Math.sqrt((downX-rx)*(downX-rx)+(downY-ry)*(downY-ry));
        if (sqrt<=block_width/2){
            return true;
        }
        return false;
    }
    public void setOnUnLockListener(OnUnLockListener onUnLockListener){
        this.onUnLockListener = onUnLockListener;
    }

}
