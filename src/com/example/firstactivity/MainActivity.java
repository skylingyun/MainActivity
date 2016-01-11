package com.example.firstactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        
        Button button1 = (Button)findViewById(R.id.button_1);
        button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Toast.makeText(MainActivity.this, "You clicked Button 1", Toast.LENGTH_LONG).show();
				finish();
			}
		});
    }
    public boolean onCreateOptionsMenu(Menu menu){
    	getMenuInflater().inflate(R.menu.main, menu);
		return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
    	switch(item.getItemId()){
    	case R.id.add_item:
    		Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show();
    		break;
    	case R.id.remove_item:
    		Toast.makeText(this, "You clicked Remove", Toast.LENGTH_SHORT).show();
    		break;
    		default:
    	}
		return true;
    	
    }
}
