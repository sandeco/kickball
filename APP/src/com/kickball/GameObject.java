package com.kickball;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

public abstract class GameObject extends View{
	
	
	
	public GameObject(Context context) {
		super(context);
	}
	
	protected int x;
	protected int y;
	
	protected int width;
	protected int height;
	
	public abstract void step(Canvas canvas);
	public abstract void draw(Canvas canvas);
	
}
