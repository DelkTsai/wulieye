package com.liao.showwuli;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webView extends Activity{
	
	private WebView webView;
	private String url;
	private String company;
	private String number;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.web);
		
		init();
		
		Intent getIntent = getIntent();
		company = getIntent.getStringExtra("company");
		number = getIntent.getStringExtra("number");
		
		url = "http://m.kuaidi100.com/index_all.html?type="+company+"&postid="+number;
		
		webView.getSettings().setJavaScriptEnabled(true);
		webView.loadUrl(url);
		
		webView.setWebViewClient(new WebViewClient(){
			@Override
			public boolean shouldOverrideUrlLoading(WebView view, String url) {
				view.loadUrl(url);
				return super.shouldOverrideUrlLoading(view, url);
			}
			
		});
		
	}
	private void init() {
		webView = (WebView) findViewById(R.id.wuli);
	}
}
