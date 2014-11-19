package com.kickball.game;

import android.content.Context;
import android.graphics.Canvas;

import com.kickball.engine.GameController;

public class KickBallController extends GameController{
	
	
	private Bola bola;
	private Bola bola2;
	private Fundo fundo;
	

	public KickBallController(Context context) {
		super(context);
	}

	@Override
	public void startObjects(Context context) {
		bola = new Bola(context, 0,0);
		bola2 = new Bola(context,200,0);
		fundo = new Fundo(context,0,0);
		
	}


	@Override
	public void stepObjects(Canvas canvas) {
		bola.step(canvas);
		bola2.step(canvas);
	}
	
	@Override
	public void drawObjects(Canvas canvas) {

		fundo.draw(canvas);
		bola.draw(canvas);
		bola2.draw(canvas);
				
		
	}

	
	
	
}
