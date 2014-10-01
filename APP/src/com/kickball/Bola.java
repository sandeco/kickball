package com.kickball;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.ImageView;

public class Bola extends GameObject {

	private ImageView image;
	private int raio = 50;
	private int passoX = 5;
	private int passoY = 5;
	Paint paint = new Paint();
	
	
	public Bola(Context context) {
		super(context);
		
			x = raio;
			y = raio;
			this.setX(x);
			this.setY(y);

			image = new ImageView(context);
			image.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.ic_launcher));
	}

	
	
	@Override
	public void step(Canvas canvas) {

		x = x+passoX;
		y = y+passoY;
		
		this.setX(x);
		this.setY(y);

		if(x<raio || x>= (canvas.getWidth()-raio/2))
			passoX = passoX*(-1);
		if(y<raio || y>= (canvas.getHeight()-raio/2))
			passoY = passoY*(-1);
		
	}

	@Override
	public void draw(Canvas canvas) {		
		canvas.drawBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.ic_launcher), x, y, null);		
	}


	public void inverterY(){
		passoY = passoY * (-1);
	}
	

}
