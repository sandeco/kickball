package com.kickball.game;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;

import com.kickball.engine.GameObject;

public class Fundo extends GameObject{

	public Fundo(Context context, int x, int y) {
		super(context, x, y);

	}

	@Override
	public void step(Canvas canvas) {

		
	}

	@Override
	public void draw(Canvas canvas) {
		canvas.drawColor(Color.BLACK);
	}
	
	
}
