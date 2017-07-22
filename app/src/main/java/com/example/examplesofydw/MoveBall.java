package com.example.examplesofydw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * 跟随手指移动的小球
 */

public class MoveBall extends View {
    public float currentX = 100;
    public float currentY = 150;

    private float radius = 50;
    private Paint paint = new Paint();

    public MoveBall(Context context, float radius) {
        super(context);
        this.radius = radius;
    }

    public MoveBall(Context context, AttributeSet set) {
        super(context, set);
    }

    @Override
    public void onDraw(Canvas canvas){
        super.onDraw(canvas);
        paint.setColor(Color.GREEN);
        canvas.drawCircle(currentX, currentY, radius, paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        currentX = event.getX();
        currentY = event.getY();
        invalidate();
        return true;
    }
}
