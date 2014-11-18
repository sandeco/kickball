package com.kickball.game;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;

public class Sprite {
	
	private Bitmap bitmap;
	private int lines;
	private int columns;

    
    private int width; //width
    private int height; //height
	
	
	public Sprite(Bitmap bitmap, int lines, int columns){
		this.bitmap = bitmap;
		this.lines = lines;
		this.columns = columns;
		
		this.width = bitmap.getWidth() / columns;
		this.height = bitmap.getHeight() / lines;
		
	}

	public void draw(Canvas canvas, int line, int column){
		int srcX = (line * width)+1;
        int srcY = (column * height)+1;
		
		
		Rect src = new Rect(srcX,srcY, srcX+width, srcY+height);
		Rect dst = new Rect(0,0,width,height);
		canvas.drawBitmap(bitmap, src, dst, null);
	}
}
