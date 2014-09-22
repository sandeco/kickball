package com.kickball;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Fundo extends GameObject {

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
