package com.kickball.game;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

import com.kickball.R;
import com.kickball.engine.GameObject;

public class Bola extends GameObject {


	private Bitmap bit;
		
	private int passoX = 10;
	private int passoY = 10;
	Paint paint = new Paint();
	
	public Bola(Context context, int x, int y) {
		super(context, x, y);
		
		bit = BitmapFactory.decodeResource(getResources(), R.drawable.ball_blue);
		
		width  = bit.getWidth();
		height = bit.getHeight();

	}
	
	
	@Override
	public void step(Canvas canvas) {
		
		
		
		x = x+passoX;
		y = y+passoY;
		
		this.setX(x);
		this.setY(y);

		if(x<=0  || x>= (canvas.getWidth()-width))
			passoX = passoX*(-1);
		if(y<=0 || y>= (canvas.getHeight()-height))
			passoY = passoY*(-1);
		
	}

	@Override
	public void draw(Canvas canvas) {	
		canvas.drawBitmap(bit, x, y, null);		
	}


	public void inverterY(){
		passoY = passoY * (-1);
	}


	public boolean top(Canvas canvas) {
		if(y<=0)
			return true;
		else
			return false;
	}
	
	public boolean down(Canvas canvas){
		if(y>=canvas.getHeight()-height)
			return true;
		else
			return false;
		
	}


	public void onTouch(int xTch, int yTch) {
		
		if(xTch >=x && xTch<=(x+width))
			if(yTch >=y && yTch<=y+height)
				inverterY();
		
		
		
	}
	

}
