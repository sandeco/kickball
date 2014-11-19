package com.kickball.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.kickball.R;

public class MainActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
	}


	
	@Override
	protected void onResume() {
		super.onResume();
		
		//kickball.resume();
		
	}

	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	
	

}
