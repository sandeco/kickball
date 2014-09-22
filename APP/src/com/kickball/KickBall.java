package com.kickball;

import android.content.Context;
import android.graphics.Canvas;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class KickBall extends SurfaceView implements GameController{

	
	/**
	 * OBJETOS DO JOGO * 
	 *  */
	
	private Bola bola;
	private Fundo fundo;
	
	
	private Thread renderThread;
	private boolean running = false;
	private SurfaceHolder holder;
	
	public KickBall(Context context) {
		super(context);
		bola = new Bola();
		fundo = new Fundo();
		holder = getHolder();
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


	
	

	
	@Override
	public void run() {
		
		try {
			renderThread.sleep(1);
			while(running){
				//verifica se a tela já está pronta
				if(!holder.getSurface().isValid())
					continue;				
				//bloqueia o canvas
				Canvas canvas = holder.lockCanvas();
				
				
				stepObjects(canvas);
				drawObjects(canvas);
				
				
				// atualiza e libera o canvas
				holder.unlockCanvasAndPost(canvas);
				
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	
	public void resume() {
		running = true;
		renderThread = new Thread(this);
		renderThread.start();
	}
	
	
}
