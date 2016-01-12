package com.example.firstactivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class OtherActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.other_main);
		Intent intent = getIntent();
		String data = intent.getStringExtra("extra_data");
		Log.d("OtherActivity",data);
	}
}
