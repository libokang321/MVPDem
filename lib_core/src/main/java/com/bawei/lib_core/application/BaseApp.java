package com.bawei.lib_core.application;

import android.app.Application;
import android.content.Context;

/*
 *@Auther:libokang
 *@Date: 时间
 *@Description:BaseApp
 * */
public class BaseApp extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
