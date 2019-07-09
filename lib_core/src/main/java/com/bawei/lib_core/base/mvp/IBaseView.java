package com.bawei.lib_core.base.mvp;

/*
 *@Auther:libokang
 *@Date: 时间
 *@Description:Base View层
 * */
public interface IBaseView {
    //初始化presenter方法
    BasePresenter initPresenter();

    //显示加载框
    void showLoading();

    //隐藏加载框
    void hideLoading();

    //请求失败
    void failure(String msg);
}
