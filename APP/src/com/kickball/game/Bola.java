package com.kickball.game;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

import com.kickball.R;
import com.kickball.engine.GameObject;

public class Bola extends GameObject{

	
	private Bitmap bitmap;
	
	private int passoX = 3;
	private int passoY = 3;
	
	
	public Bola(Context context, int x, int y) {
		super(context, x, y);
		bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher);
		
		width = bitmap.getWidth();
		height = bitmap.getHeight();
	}

	@Override
	public void step(Canvas canvas) {
		
		x = x + passoX;
		y = y + passoY;
	
		int w = canvas.getWidth()-width;
		int h = canvas.getHeight()-height;
		
		if(x<=0 || x>=w){
			passoX = passoX*(-1);
		}
		
		if(y<=0 || y>=h){
			passoY = passoY*(-1);
		}
		
		
		
	}

	@Override
	public void draw(Canvas canvas) {
		
		canvas.drawBitmap(bitmap, x, y, null);
		
	}
	
	

}
