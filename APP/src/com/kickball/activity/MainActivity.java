package com.kickball.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.kickball.R;
import com.kickball.game.KickBallController;

public class MainActivity extends Activity {

	
	private KickBallController kickBall;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		kickBall = new KickBallController(this);
		setContentView(kickBall);
	}


	
	@Override
	protected void onResume() {
		super.onResume();
		
		kickBall.resume();
		
	}

	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	
	

}
