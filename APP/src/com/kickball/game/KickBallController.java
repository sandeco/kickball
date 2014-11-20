package com.kickball.game;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;

import com.kickball.engine.Collision;
import com.kickball.engine.GameController;

public class KickBallController extends GameController{
	
	
	private Bola bola;
	private Bola bola2;
	private Fundo fundo;
	private Placar placar;
	

	public KickBallController(Context context) {
		super(context);
	}

	@Override
	public void startObjects(Context context) {
		bola = new Bola(context, 0,0);
		bola2 = new Bola(context,200,0);
		fundo = new Fundo(context,0,0);
		placar = new Placar(context, 0, 0);
	}


	@Override
	public void stepObjects(Canvas canvas) {
		
		//posicionar objetos
		bola.step(canvas);
		bola2.step(canvas);
		placar.step(canvas);
		
		
		//verificar colisões
		if(Collision.collided(bola, bola2)){
			bola.inverterX();
			bola2.inverterX();
		}
		
		
		//verificar pontuação
		if(bola.isTop() || bola2.isTop()){
			placar.addPlayerBottom();
		}
		
		if(bola.isBottom(canvas) || bola2.isBottom(canvas)){
			placar.addPlayerTop();
		}	
		
	}
	
	@Override
	public void drawObjects(Canvas canvas) {

		fundo.draw(canvas);
		placar.draw(canvas);
		bola.draw(canvas);
		bola2.draw(canvas);
		
		
	}

	
	@Override
	public boolean onTouchEvent(MotionEvent event) {

		int xTc = (int)event.getX();
		int yTc = (int)event.getY();
		
		bola.onTouch(xTc, yTc);
		bola2.onTouch(xTc, yTc);
		
		return super.onTouchEvent(event);
	}

	
}
