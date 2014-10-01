package com.kickball;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

public class Boneco extends GameObject {

	private Sprite sprite;
	
	public Boneco(Context context) {
		super(context);
		this.x = 0;
		this.y = 0;
		Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.bad1);
		sprite = new Sprite(bitmap,4,3);
	}

	@Override
	public void step(Canvas canvas) {
		

	}

	@Override
	public void draw(Canvas canvas) {
		sprite.draw(canvas,1,1);
	}

}
