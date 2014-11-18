package com.kickball.engine;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

public abstract class GameObject extends View{

	
	protected int x;
	protected int y;
	
	protected int width;
	protected int height;

	
	
	public GameObject(Context context, int x, int y) {
		super(context);
		
		this.x = x;
		this.y = y;
		
	}
	
	
	public abstract void step(Canvas canvas);
	public abstract void draw(Canvas canvas);
	
	public Rect getRect(){
		return new Rect(x, y, x+width, y+height);		
	}
	
}
