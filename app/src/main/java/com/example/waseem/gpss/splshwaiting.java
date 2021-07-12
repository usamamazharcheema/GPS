package com.dreamkodez.gps.location.finderr;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class splshwaiting extends Activity {

	private static int SPLASH_TIME_OUT = 1000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.layout_splshwaitihg);
		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				Intent i = new Intent(splshwaiting.this,
						com.dreamkodez.gps.location.finderr.MainActivity.class);

				startActivity(i);
				finish();
			}
		}, SPLASH_TIME_OUT);
	}

}
