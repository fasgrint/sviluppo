package com.fasandsy.we;

import com.fasandsy.debugLib.debug;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	// Valore per il Tag del Log
	private final static String ACTIVITY_TAG = "LIFECYCLE_TEST";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// Visualizziamo messaggio di Log
				debug.i(ACTIVITY_TAG, "ON_CREATE " + getActivityName());
		//identifico il bottone con il suo id
		Button btnHome = (Button) findViewById(R.id.button1);
        btnHome.setOnClickListener(new OnClickListener(){  
            public void onClick(View arg0) {  
                //definisco l'intenzione
				Intent openPage1 = new Intent(MainActivity.this, Page1.class);
				//passo all'attivazione dell'activity page1.java
				startActivity(openPage1);
            }  
        });   
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	protected String getActivityName() {
		return "FIRST ACTIVITY";
	}


}
