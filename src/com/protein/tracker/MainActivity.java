package com.protein.tracker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private OnClickListener buttonListener = new OnClickListener() {
		
		public void onClick(View v) {
			EditText editText = (EditText)findViewById(R.id.editText1);
			Log.d("ProteinTracker", editText.getText().toString());
			
			
		}
	};
	private OnClickListener helpButtonListener = new OnClickListener() {
		
		public void onClick(View v) {
			Intent intent = new Intent(MainActivity.this, HelpActivity.class);
			startActivity(intent); 
			
		}
	};

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        if(savedInstanceState != null)
        	Log.d("ProteinTracker", savedInstanceState.getString("abc"));
        
        
        
        TextView textView = (TextView) findViewById(R.id.mainActivityTextView);
        textView.setText("Test updatin of view");
        
        Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(buttonListener);
        
        Button helpButton = (Button)findViewById(R.id.helpButton);
        helpButton.setOnClickListener(helpButtonListener);
    }
	
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		outState.putString("abc", "test");
	};

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
