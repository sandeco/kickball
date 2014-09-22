package com.kickball;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Bola extends GameObject {

	private int raio = 10;
	private int passoX = 5;
	private int passoY = 5;
	
	
	public Bola(){
		x = raio;
		y = raio;
	}
	
	
	Paint paint = new Paint();
	
	
	@Override
	public void step(Canvas canvas) {

		x = x+passoX;
		y = y+passoY;

		if(x<raio || x>= (canvas.getWidth()-raio/2))
			passoX = passoX*(-1);
		if(y<raio || y>= (canvas.getHeight()-raio/2))
			passoY = passoY*(-1);
		
	}

	@Override
	public void draw(Canvas canvas) {
		paint.setColor(Color.GREEN);
		canvas.drawCircle(x, y, raio, paint);
	}

}
