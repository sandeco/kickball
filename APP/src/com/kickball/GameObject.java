package com.kickball;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;

public abstract class GameObject extends View{
	
	
	private int z;

	private int speedX = 1;
	private int speedY = 1;
	private int speedZ = 1;
	
	private Bitmap bitmap;

	
	public GameObject(Context context, int x, int y, int z) {
		super(context);
		setX((float)x);
		setY((float)y);
		setZ(z);
		onStart();
	}

	public abstract void step(Canvas canvas);
	public abstract void draw(Canvas canvas);

	protected abstract void onStart();
	

	public void incrementX(){
		setX(getX()+getSpeedX());
	}
	
	public void incrementY(){
		setX(getX()+getSpeedY());
	}

	public void incrementZ(){
		setX(getX()+getSpeedZ());
	}

	
	public void invertXSpeed(){
		setX(getX()*(-1));
	}
	
	public void invertYSpeed(){
		setY(getY()*(-1));
	}
	
	public void invertZSpeed(){
		setZ(getZ()*(-1));
	}

	
	public int getZ() {
		return z;
	}
	
	public void setZ(int z) {
		this.z = z;
	}

	public int getSpeedX() {
		return speedX;
	}

	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}

	public int getSpeedY() {
		return speedY;
	}

	public void setSpeedY(int speedY) {
		this.speedY = speedY;
	}

	public int getSpeedZ() {
		return speedZ;
	}

	public void setSpeedZ(int speedZ) {
		this.speedZ = speedZ;
	}

	public Bitmap getBitmap() {
		return bitmap;
	}

	public void setBitmap(Bitmap bitmap) {
		this.bitmap = bitmap;
	}
	
	
	
	
	public boolean isLimitX(int left, int right){
		if(getX()>=left && getX() <=right)
			return true;
		return false;
	}
	
	public boolean isLimitY(int top, int bottom){
		if(getX()>=top && getX() <=bottom)
			return true;
		return false;
	}
	

	public boolean isLimitZ(int out, int in){
		if(getX()>=out && getX() <=in)
			return true;
		return false;
	}

	
}
