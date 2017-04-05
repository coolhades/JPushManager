package com.hades.jpushmanager;

import android.content.Context;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by Hades on 2017/4/5.
 */

public class JPushManager {
    public static void init(Context applicationContext){
        JPushInterface.init(applicationContext);
        JPushInterface.setDebugMode(true);
    }
}
