package com.kickball;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Fundo extends GameObject {

	
	Paint paint = new Paint();
	
	public Fundo(Context context, int x, int y , int z) {
		super(context, x, y, z);
	}

	@Override
	protected void onStart() {
		
	}

	
	
	@Override
	public void step(Canvas canvas) {
	
	}

	@Override
	public void draw(Canvas canvas) {
		//canvas.drawColor(Color.BLACK);
	}


}
