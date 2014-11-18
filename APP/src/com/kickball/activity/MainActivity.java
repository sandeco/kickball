package com.kickball.activity;

import com.kickball.R;
import com.kickball.game.KickBallController;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {

	KickBallController kickball;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		kickball = new KickBallController(this);				
		setContentView(kickball);
	}



	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	protected void onResume() {
		super.onResume();
		kickball.resume();
	}
	
	
	

}
