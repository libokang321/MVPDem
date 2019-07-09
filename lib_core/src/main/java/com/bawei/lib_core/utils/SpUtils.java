package com.bawei.lib_core.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.bawei.lib_core.application.BaseApp;

/*
 *@Auther:libokang
 *@Date: 时间
 *@Description:工具类
 * */
public class SpUtils {
    private static SpUtils mInstance;
    private final String SP_NAME = "my_sp";

    private SpUtils() {
    }

    /**
     * 双重检验锁
     *
     * @return
     */
    public static SpUtils getInstance() {
        if (mInstance == null) {
            synchronized (SpUtils.class) {
                if (mInstance == null) {
                    mInstance = new SpUtils();
                }
            }
        }
        return mInstance;
    }

    /**
     * SharedPreferences实例
     */
    private SharedPreferences getSP() {
        SharedPreferences sharedPreferences = BaseApp.getContext().getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        return null;
    }

    /**
     * 存储数据
     */
    public void putSp(String key, String value) {
        getSP().edit().putString(key, value).commit();
    }

    /**
     * 取sp数据
     */
    public String getSP(String key) {
        return getSP().getString(key, "");
    }
}
