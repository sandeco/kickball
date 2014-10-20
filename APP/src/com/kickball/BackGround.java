package com.kickball;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class BackGround extends GameObject{
	
	
	public BackGround(Context context, int x, int y, int z) {
		super(context, x, y, z);
		// TODO Auto-generated constructor stub
	}

	Paint paint = new Paint();
	

	@Override
	protected void onStart() {
		
	}

	
	
	@Override
	public void step(Canvas canvas) {
	
	}

	@Override
	public void onDraw(Canvas canvas) {
		canvas.drawColor(Color.WHITE);
	}


}
