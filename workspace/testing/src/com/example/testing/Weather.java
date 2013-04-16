package com.example.testing;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Weather extends Activity{
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather);
        Intent i = getIntent();
        

        Button btnWeatherSubmit = (Button) findViewById(R.id.Weather_Submit);
        
        //Listening to button event
        btnWeatherSubmit.setOnClickListener(new View.OnClickListener() {

    		public void onClick(View arg0) {
    	        //Starting a new Intent
    				Uri uri = Uri.parse("http://www.weather.com/");
    				Intent intent = new Intent(Intent.ACTION_VIEW, uri);
    				startActivity(intent);
    	       
    		}
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.third_page, menu);
        return true;
			
  
    }
}

	

	
