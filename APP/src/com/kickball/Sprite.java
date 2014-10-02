package com.kickball;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

public class Sprite {

	private GameObject gObject;
	
	private static int rows = 1;
	private static int columns = 1;

	
	private int wFrame;
	private int hFrame;

	public static final int DOWN  = 0;
	public static final int LEFT  = 1;
	public static final int RIGHT = 2;
	public static final int UP    = 3;

	private int currentFrame=0;

	public Sprite(GameObject gObject, int rows, int columns) {
		
		
		this.gObject = gObject;
		this.rows    = rows;
		this.columns = columns;
		
		
		this.wFrame = gObject.getBitmap().getWidth() / rows;
		this.hFrame = gObject.getBitmap().getHeight() / columns;
	}



	public void draw(Canvas canvas, int direction, int frame, int alpha) {

		Paint paint = new Paint();
		paint.setAlpha(alpha);
		
		
		int srcY = direction * hFrame;
		int srcX = frame * wFrame;
		
		int x = (int) gObject.getX();
		int y = (int) gObject.getY();
		int z = (int) gObject.getZ();
		

		int bottomX = (int) ((x + wFrame) * (1+z/10));
		int bottomY = (int) ((y + hFrame)* (1+z/10));
		
		
		//criar subimagem - cut
		Rect src = new Rect(srcX, srcY, srcX + wFrame, srcY + hFrame);
		
		//posiciona e amplia/reduz
		Rect dst = new Rect(x, y, bottomX, bottomY);

		
		canvas.drawBitmap(gObject.getBitmap(), src, dst, paint);
	}


	public static int getRows() {
		return rows;
	}



	public static void setRows(int rows) {
		Sprite.rows = rows;
	}



	public static int getColumns() {
		return columns;
	}



	public static void setColumns(int columns) {
		Sprite.columns = columns;
	}



	public int getCurrentFrame() {
		return currentFrame;
	}



	public void setCurrentFrame(int currentFrame) {
		this.currentFrame = currentFrame;
	}
	

	
	
}