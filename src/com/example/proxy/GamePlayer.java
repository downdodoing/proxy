package com.example.proxy;

import android.util.Log;

import com.example.proxy.myinterface.IGamePlayer;

public class GamePlayer implements IGamePlayer {

	private String name;

	public GamePlayer(String name) {
		this.name = name;
	}

	@Override
	public void killBoss() {
		Log.i("杀怪", this.name + "在打怪");
	}

	@Override
	public void upGrade() {
		Log.i("升级", this.name + "成功升1级");
	}

}
