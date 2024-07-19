package com.jminsure.pic2evalai.bridgenative;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BridgeNative {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }

    public void sendMessage(Context context, String message) {
        Intent intent = new Intent("com.example.ACTION_SEND_MESSAGE");
        intent.putExtra("message", message);
        context.sendBroadcast(intent);
    }
}
