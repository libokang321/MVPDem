package com.bawei.lib_core.interceptor;

import com.bawei.lib_core.utils.SpUtils;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/*
 *@Auther:libokang
 *@Date: 时间
 *@Description:自定义拦截器
 * */
public class HeaderInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        Request.Builder builder = request.newBuilder();

        builder.addHeader("userId", SpUtils.getInstance().getSP("userId"));
        builder.addHeader("sessionId", SpUtils.getInstance().getSP("sessionId"));
        /**
         * 修改过得request对象
         */
        Request burequest = builder.build();
        /**
         * 相应对象
         */
        Response response = chain.proceed(burequest);
        return response;
    }
}
