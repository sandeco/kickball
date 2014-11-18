package com.kickball.engine;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public abstract class GameController extends SurfaceView implements Runnable{
	
	private Thread renderThread;
	private boolean running = false;
	private SurfaceHolder holder;
	private final int INTERVAL = 10;
	
	public GameController(Context context){
		super(context);		
		holder = getHolder();
		startObjects(context);
		
	}
	

	
	public abstract void startObjects(Context context);
	public abstract void drawObjects(Canvas canvas);
	public abstract void stepObjects(Canvas canvas);

	
	@Override
	public void run() {
		
		try {
			renderThread.sleep(INTERVAL);
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
