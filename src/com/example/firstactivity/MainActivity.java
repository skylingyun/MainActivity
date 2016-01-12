package com.example.firstactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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
				//finish();
				
				  //Intent 显式用法
				/**
				 * String data = "Hello OtherActivity";
				 * Intent intent = new Intent(MainActivity.this,OtherActivity.class);
				 * intent.putExtra("extra_data",data);
				 */
				/*
				 * Intent 隐式用法
				 * Intent intent = new Intent("com.example.firstactivity.ACTION_START");
				 * intent.addCategory("com.example.firstactivity.MY_CATEGORY");
				 */
				/**
				 *   调用手机拨打电话和浏览器调用
				 *   Intent intent = new Intent(Intent.ACTION_DIAL);
				 *   intent.setData(Uri.parse("tel:10086"));
				 *   Intent intent = new Intent(Intent.ACTION_VIEW);
				 *   intent.setData(Uri.parse("http://www.baidu.com"));
				 */
				
				//startActivity(intent);
				Intent intent = new Intent(MainActivity.this,OtherActivity.class);
				startActivityForResult(intent, 1);
				
			}
		});
    }
    
    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
    	switch(requestCode){
    	case 1:
    		if(resultCode == RESULT_OK){
    			String returnedData = data.getStringExtra("data_return");
    			Log.d("MainActivity", returnedData);
    		}
    		break;
    		default:
    	}
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
