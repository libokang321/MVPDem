package com.bawei.lib_core.utils;

import android.util.Log;

import com.bawei.lib_core.common.Constants;

/*
 *@Auther:libokang
 *@Date: 时间
 *@Description:LogUtils
 * */
public class LogUtils {

    private static String TAG = LogUtils.class.getSimpleName();

    public static void d(String msg) {
        //如果不是正式版环境
        if (!Constants.IS_RELEASE) {
            Log.d(TAG, msg);
        }
    }

    public static void e(String msg) {
        //不是正式版环境
        if (!Constants.IS_RELEASE) {
            Log.e(TAG, msg);
        }
    }
}
