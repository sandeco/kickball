package com.kickball;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;

public class KickBallController extends GameController{

	
	/**
	 * OBJETOS DO JOGO * 
	 *  */	
	private Boneco boneco;
	
	
	
	public KickBallController(Context context) {
		super(context);
		
	}


	@Override
	public void onStart() {
		
		setBg(new BackGround(getContext(),0,0,0));
			
		boneco = new Boneco(getContext(),50,50,2);
		gameObjects.add(boneco);
		

	}
	

}
