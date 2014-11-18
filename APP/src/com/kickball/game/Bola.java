package com.kickball.game;

import com.kickball.R;
import com.kickball.R.drawable;
import com.kickball.engine.GameObject;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.ImageView;

public class Bola extends GameObject {

	private ImageView image;
	
	
	
	private int passoX = 5;
	private int passoY = 5;
	Paint paint = new Paint();
	
	
	public Bola(Context context) {
		super(context);
		
			image = new ImageView(context);
			image.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.drawable.ic_launcher));
			
			x = 50;
			y = 50;
	
			width  = image.getWidth();
			height = image.getHeight();
			
			
	}

	
	
	@Override
	public void step(Canvas canvas) {

		x = x+passoX;
		y = y+passoY;
		
		this.setX(x);
		this.setY(y);

		if(x<width  || x>= (canvas.getWidth()-width/2))
			passoX = passoX*(-1);
		if(y<height || y>= (canvas.getHeight()-height/2))
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
