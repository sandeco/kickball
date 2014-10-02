package com.kickball;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

public class Bola extends GameObject {

	
	private int raio = 50;
	
	public Bola(Context context, int x, int y, int z) {
		super(context, x, y, z);
		
	}

	@Override
	protected void onStart() {
		
		
	}

	
	@Override
	public void step(Canvas canvas) {
		
		/*
		incrementX();
		incrementY();
		
		if(getX()<raio || getX()>= (canvas.getWidth()-raio/2))
			invertXSpeed();
		if(getY()<raio || getY()>= (canvas.getHeight()-raio/2))
			invertYSpeed();
		*/
	}

	@Override
	public void draw(Canvas canvas) {		
		canvas.drawBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.ic_launcher), getX(), getY(), null);		
	}





	

}
