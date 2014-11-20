package com.kickball.game;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import com.kickball.engine.GameObject;

public class Placar extends GameObject{

	private int playerTop    = 0;
	private int playerBottom = 0;
	
	public Placar(Context context, int x, int y) {
		super(context, x, y);

	}

	@Override
	public void step(Canvas canvas) {

		y = canvas.getHeight()/2;
		x = 10;
		
	}

	@Override
	public void draw(Canvas canvas) {
		
		Paint paint = new Paint();
		paint.setColor(Color.GREEN);
		paint.setTextSize(90);
		canvas.drawText(playerTop + "x"+playerBottom, x, y, paint);
	}
	
	
	
	public void addPlayerTop(){
		playerTop++;
	}
	
	public void addPlayerBottom(){
		playerBottom++;
	}
	

	
}
