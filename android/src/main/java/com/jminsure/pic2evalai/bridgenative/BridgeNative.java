package com.jminsure.pic2evalai.bridgenative;

import android.util.Log;

public class BridgeNative {

    public String echo(String value) {
        Log.i("Echo", value);
        return value;
    }
}
