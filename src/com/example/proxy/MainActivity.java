package com.example.proxy;

import com.example.proxy.myinterface.IGamePlayer;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		IGamePlayer player = new GamePlayer("李四");
		IGamePlayer proxy = new GamePlayerProxy(player);
		proxy.killBoss();
		proxy.upGrade();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
