package com.example.testing;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class Open_Page extends Activity {

	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.new_file);
	    Button btnNextScreen = (Button) findViewById(R.id.Button05);
	    
        //Listening to button event
        btnNextScreen.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
		        //Starting a new Intent
		            Intent nextScreen = new Intent(getApplicationContext(), MainActivity.class);
			    // TODO Auto-generated method stub
		            startActivity(nextScreen);
			}
        });
	}
}

