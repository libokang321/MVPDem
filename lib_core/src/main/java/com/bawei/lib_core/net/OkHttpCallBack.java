package com.bawei.lib_core.net;

/*
 *@Auther:libokang
 *@Date: 时间
 *@Description:OkHttpCallBack
 * */
public interface OkHttpCallBack {
    //数据合法
    void success(String result);

    //服务器请求失败
    void failure(String msg);
}
