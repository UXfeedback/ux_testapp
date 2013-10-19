package com.example.ux_testapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void button_click(View v)
	{		
		String action = "ACTION_MEASURE_UX";
		
		Intent intent = new Intent(action);
		intent.putExtra("UserAction", "OK_Clicked");
		sendBroadcast(intent);
		
		TextView view = (TextView)findViewById(R.id.textView);
		view.setText("Broadcast sent.");
	}

}
