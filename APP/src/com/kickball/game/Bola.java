package com.kickball.game;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

import com.kickball.R;
import com.kickball.engine.GameObject;

public class Bola extends GameObject{

	
	private Bitmap bitmap;
	
	private int passoX = 7;
	private int passoY = 7;
	
	
	public Bola(Context context, int x, int y) {
		super(context, x, y);
		bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ball_blue);
		
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
			inverterX();
		}
		
		if(y<=0 || y>=h){
			inverterY();
		}
		
	}

	
	public void inverterX(){
		passoX = passoX*(-1);
	}
	
	public void inverterY(){
		passoY = passoY*(-1);
	}
	
	@Override
	public void draw(Canvas canvas) {
		canvas.drawBitmap(bitmap, x, y, null);
	}
	
	
	public void onTouch(int xTc, int yTc){
		if(xTc>=x && xTc<=(x+width)){
			if(yTc>=y && yTc<=(y+height)){
				inverterY();
			}
		}
	}
	
	public boolean isTop(){		
		if(y<=0){
			return true;
		}		
		return false;		
	}
	
	public boolean isBottom(Canvas canvas){
		if(y+height>=canvas.getHeight()){
			return true;
		}
		return false;
	}
}
