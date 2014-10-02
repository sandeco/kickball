package com.kickball;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public abstract class GameController extends SurfaceView implements Runnable{
	
	private Thread renderThread;
	private boolean running = false;
	private SurfaceHolder holder;
	private final int INTERVAL = 10;
	private BackGround bg;
	
	private boolean isGameObjectsLoaded = false;
	
	List<GameObject> gameObjects = new ArrayList<GameObject>();
	
	
	
	public GameController(Context context){
		super(context);
		holder = getHolder();
		load();
	}
	
	private void load(){
		onStart();
		isGameObjectsLoaded = true;
	}
	
	
	public abstract void onStart();

	
	public void addObject(GameObject go){
		gameObjects.add(go);
	}
	
	
	public void drawObjects(Canvas canvas){
		bg.draw(canvas);
		
		for(GameObject go : gameObjects)
			go.draw(canvas);
		
	}
	
	
	public void stepObjects(Canvas canvas) {
		bg.step(canvas);
		
		sortObjects();
		
		for(GameObject go : gameObjects)
			go.step(canvas);
	}

	
	private void sortObjects() {
		
	}

	public BackGround getBg() {
		return bg;
	}

	public void setBg(BackGround bg) {
		this.bg = bg;
	}



	public List<GameObject> getGameObjects() {
		return gameObjects;
	}



	public void setGameObjects(List<GameObject> gameObjects) {
		this.gameObjects = gameObjects;
	}



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
				
				if(isGameObjectsLoaded){
					stepObjects(canvas);
					drawObjects(canvas);
				}
				
				
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
