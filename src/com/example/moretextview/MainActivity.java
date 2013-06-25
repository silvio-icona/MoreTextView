package com.example.moretextview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button start = (Button) findViewById(R.id.startreflection);
		start.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		ReflectingLayout mirror = (ReflectingLayout) findViewById(R.id.reflectedplain);
		TextView textbase = (TextView) findViewById(R.id.textbase);
		
		LayoutParams params = (LayoutParams) mirror.getLayoutParams();
		
		params.height = textbase.getMeasuredHeight() * 2;
		mirror.setLayoutParams(params);
	}

}
