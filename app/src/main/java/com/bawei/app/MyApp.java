package com.bawei.app;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/*
 *@Auther:libokang
 *@Date: 时间
 *@Description:功能
 * */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Bugly
        CrashReport.UserStrategy strategy = new CrashReport.UserStrategy(this);
        strategy.setAppChannel("myChannel");
        strategy.setAppVersion("1.0.1");
        strategy.setAppPackageName("com.bawei");
        CrashReport.initCrashReport(this,"08aa35eaa8",false,strategy);
    }
}
