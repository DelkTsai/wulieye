package com.liao.showwuli;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	private EditText company;//快递公司名
	private EditText number;//快递单号
	private Button showWuli;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);

		init();

		showWuli.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(MainActivity.this,webView.class);
				intent.putExtra("company", company.getText().toString());
				intent.putExtra("number", number.getText().toString());
				startActivity(intent);
			}
		});

	}

	private void init() {
		company = (EditText) findViewById(R.id.company);
		number = (EditText) findViewById(R.id.number);
		showWuli = (Button) findViewById(R.id.showWuli);
	}



}
