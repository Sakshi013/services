package com.example.sakshi.services;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

public class myServices extends Service {

    MediaPlayer myPlayer;
    int playPosition;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        myPlayer =MediaPlayer.create(this,R.raw.ankhon);
        myPlayer.setLooping(true);



    }

    @Override
    public int onStartCommand(Intent intent,int flag, int startId) {
        myPlayer.start();

        if(intent.getStringExtra("order").equalsIgnoreCase("play")) {
            myPlayer.start();
            myPlayer.setLooping(true);

        }
        else if(intent.getStringExtra("order").equals("pause")){
            playPosition = myPlayer.getCurrentPosition();
            myPlayer.pause();
        }
        else if(intent.getStringExtra("order").equalsIgnoreCase("resume")){
            myPlayer.seekTo(playPosition);
            myPlayer.start();
        }

        return START_STICKY;

    }



    @Override
    public void onDestroy() {
        super.onDestroy();
        myPlayer.stop();
    }
}
