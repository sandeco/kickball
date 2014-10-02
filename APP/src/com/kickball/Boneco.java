package com.kickball;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

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
		
		setZ(10);
	}


	@Override
	public void draw(Canvas canvas) {
		
		sprite.draw(canvas, Sprite.DOWN, 1, 100);
	}

	
}
