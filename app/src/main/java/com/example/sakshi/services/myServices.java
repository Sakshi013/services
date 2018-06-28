package com.example.sakshi.services;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

public class myServices extends Service {

    MediaPlayer myPlayer;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        myPlayer =MediaPlayer.create(this,R.raw.ankhon);
        myPlayer.setLooping(false);



    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        myPlayer.start();

        return super.onStartCommand(intent,flags,startId);
    }



    @Override
    public void onDestroy() {
        super.onDestroy();
        myPlayer.stop();
    }
}
