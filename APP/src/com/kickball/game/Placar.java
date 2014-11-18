package com.kickball.game;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import com.kickball.engine.GameObject;

public class Placar extends GameObject {

	private int player1 = 0;
	private int player2 = 0;
	
	private int rotate = 0;
	
	
	public Placar(Context context, int x, int y) {
		super(context, x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void step(Canvas canvas) {
		x = 0;
		y = canvas.getHeight()/2;
		
	}

	
	@Override
	public void draw(Canvas canvas) {
		
		Paint paint = new Paint();
		paint.setColor(Color.BLUE);			
		paint.setTextSize(40);
		canvas.drawText(player1 + "x" + player2, x, y, paint);
		
			

	}

	public void addPlayer2() {
		player2++;
	}

	public void addPlayer1() {
		player1++;
	}

	public int getPlayer1() {
		return player1;
	}

	public int getPlayer2() {
		return player2;
	}

	public void mostrarVencedor(Canvas canvas) {
		Paint paint = new Paint();
		paint.setColor(Color.BLUE);			
		paint.setTextSize(40);
		
		if(player1>player2)
			canvas.drawText(player1 + "x" + player2 + " - Player 2 foi o vencedor!", x, y, paint);
		else
			canvas.drawText(player1 + "x" + player2 + " - Player 1 foi o vencedor!", x, y, paint);
		
	}
	
	

	
}
