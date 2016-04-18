package com.example.wordgame;


import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class MusicServer extends Service{
	private MediaPlayer mediaPlayer; 
	@Override
	public IBinder onBind(Intent intent) {
		
		return null;
	}
	@Override 
	public void onStart(Intent intent,int startId){ 
	super.onStart(intent, startId); 
	if(mediaPlayer==null){ 
	mediaPlayer = MediaPlayer.create(this, R.raw.mengmengda); 
	mediaPlayer.setLooping(true); 
	mediaPlayer.start(); 
	} 
	} 
	
    //πÿ±’“Ù¿÷
	public void Destroy() { 
	//super.onDestroy(); 
	mediaPlayer.stop(); 
	}  
}
