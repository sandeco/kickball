package com.kickball.game;

import com.kickball.engine.GameObject;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Fundo extends GameObject {

	public Fundo(Context context) {
		super(context);
	}

	Paint paint = new Paint();
	
	@Override
	public void step(Canvas canvas) {
	
	}

	@Override
	public void draw(Canvas canvas) {
		//pinta toda a tela de preto
		canvas.drawColor(Color.BLACK);
	}

}
