package com.kickball.game;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;

import com.kickball.engine.Collision;
import com.kickball.engine.GameController;

public class KickBallController extends GameController{


	/**
	 * OBJETOS DO JOGO * 
	 *  */	
	private Bola bola1;
	private Bola bola2;
	private Fundo fundo;
	private Placar placar;
	private boolean stop;


	public KickBallController(Context context) {
		super(context);
	}



	@Override
	public void startObjects(Context context) {
		bola1  = new Bola(context, 0, 0);
		bola2  = new Bola(context, 200,200);
		fundo  = new Fundo(context, 0, 0);
		placar = new Placar(context, 0,30); 


	}



	@Override
	public void stepObjects(Canvas canvas) {


		if(!stop){
			fundo.step(canvas);

			placar.step(canvas);


			bola1.step(canvas);
			bola2.step(canvas);


			/*testes de colisão*/

			if(Collision.collided(bola1, bola2)){
				bola1.inverterY();
				bola2.inverterY();
			}

			if(bola1.top(canvas) || bola2.top(canvas)){
				placar.addPlayer1();

			}

			if(bola1.down(canvas) || bola2.down(canvas)){
				placar.addPlayer2();
			}


			if(placar.getPlayer1()>=10)
				stop = true;

			if(placar.getPlayer2()>=10)
				stop = true;

		}
		
		

	}


	@Override
	public void drawObjects(Canvas canvas) {
		fundo.draw(canvas);
		
		if(!stop){
			placar.draw(canvas);
		}else{
			placar.mostrarVencedor(canvas);
		}

		bola1.draw(canvas);
		bola2.draw(canvas);

	}


	@Override
	public boolean onTouchEvent(MotionEvent event) {


		int xTch = (int)event.getX();
		int yTch = (int)event.getY();


		bola1.onTouch(xTch, yTch);
		bola2.onTouch(xTch, yTch);





		return super.onTouchEvent(event);
	}


}
