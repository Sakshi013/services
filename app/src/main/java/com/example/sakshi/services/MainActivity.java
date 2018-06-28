package com.example.sakshi.services;

import android.animation.Animator;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;

public class MainActivity extends AppCompatActivity {
    Button play,pause,stop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play =findViewById(R.id.play);
        pause  =findViewById(R.id.pause);
        stop = findViewById(R.id.stop);

        play.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        startService(new Intent(MainActivity.this,myServices.class));

//                                        MediaPlayer myPlayer = MediaPlayer.create(MainActivity.this, R.raw.ankhon);
//
//                                        if (myPlayer.isPlaying()) {
//                                        } else {
//                                            myPlayer.seekTo(length);
//                                            myPlayer.start();
                                    }
        });

                pause.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View view) {

                                                 startService(new Intent(MainActivity.this, myServices.class));

//                    MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.ankhon);
//                    mediaPlayer.pause();
//                 length= mediaPlayer.getCurrentPosition();


                                             }
                                         });


        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(new Intent(MainActivity.this,myServices.class));
            }
        });
    }
}
