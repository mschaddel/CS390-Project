package com.example.testing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

public class Congrats extends Activity{
public void onCreate(Bundle savedInstanceState) {
		
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.congrats);
	    
	    new CountDownTimer(3000,1000){
	        @Override
	        public void onTick(long millisUntilFinished){} 

	        @Override
	        public void onFinish(){
	               //set the new Content of your activity
	        	Intent nextScreen = new Intent(getApplicationContext(), Main_Menu_2.class);
			    // TODO Auto-generated method stub
		            startActivity(nextScreen);
	        }
	   }.start();
	}

}