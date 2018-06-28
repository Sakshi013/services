package com.example.sakshi.services;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class coustomReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals(""))
        Toast.makeText(context,"broadcast",Toast.LENGTH_SHORT).show();
    }
}