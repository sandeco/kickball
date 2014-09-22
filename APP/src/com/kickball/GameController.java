package com.kickball;

import android.graphics.Canvas;

public interface GameController extends Runnable {
	
	
	
	public void drawObjects(Canvas canvas);
	public void stepObjects(Canvas canvas);
	public void resume();

}
