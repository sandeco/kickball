package com.kickball;

import android.content.Context;
import android.graphics.Canvas;

public class KickBallController extends GameController{

	
	/**
	 * OBJETOS DO JOGO * 
	 *  */	
	private Bola bola;
	private Fundo fundo;
	

	public KickBallController(Context context) {
		super(context);
		bola = new Bola();
		fundo = new Fundo();
	}


	@Override
	public void stepObjects(Canvas canvas) {
		fundo.step(canvas);
		bola.step(canvas);
	}

	
	@Override
	public void drawObjects(Canvas canvas) {
		fundo.draw(canvas);
		bola.draw(canvas);
	}
	
}
