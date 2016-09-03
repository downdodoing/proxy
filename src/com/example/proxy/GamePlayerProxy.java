package com.example.proxy;

import java.util.Date;

import android.util.Log;

import com.example.proxy.myinterface.IGamePlayer;

public class GamePlayerProxy implements IGamePlayer {
	private IGamePlayer player;

	public GamePlayerProxy(IGamePlayer player) {
		this.player = player;
	}

	private void log() {
		Log.i("打怪时间", new Date().toString());
	}

	@Override
	public void killBoss() {
		this.log();
		player.killBoss();
	}

	@Override
	public void upGrade() {
		player.upGrade();
		this.count();
	}

	private void count() {
		Log.i("升级", "升级耗费了1个小时");
	}
}
