package com.kickball;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.MotionEvent;

public class Boneco extends GameObject {

	private Sprite sprite;
	
	
	public Boneco(Context context, int x, int y, int z) {
		super(context, x, y,z);
		
	}
	
	@Override
	protected void onStart() {
		setBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.bad1));
		sprite = new Sprite(this, 3, 4);
		setSpeedZ(1);
		setSpeedX(5);
		setSpeedY(5);
	}
	

	
	@Override
	public void step(Canvas canvas) {
		
		/*
		incrementX();
		incrementY();

		if(!isLimitX(0, 320))
			invertZSpeed();
		
		if(!isLimitY(0, 480))
			invertYSpeed();
		
		setAlpha(100);
		*/
		
		setZ(0);
	}


	@Override
	public void onDraw(Canvas canvas) {		
		sprite.draw(canvas, Sprite.DOWN, 1, 255); // alpha 0 - 255
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		return super.onTouchEvent(event);
	}

	
	
	
}
