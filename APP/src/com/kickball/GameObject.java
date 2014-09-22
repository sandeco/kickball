package com.kickball;

import android.graphics.Canvas;

public abstract class GameObject {
	
	protected int x;
	protected int y;
	
	protected int width;
	protected int height;
	
	public abstract void step(Canvas canvas);
	public abstract void draw(Canvas canvas);
	
}
