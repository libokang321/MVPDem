package com.bawei.lib_core.base.mvp;

import com.bawei.lib_core.base.BaseActivity;

/*
 *@Auther:libokang
 *@Date: 时间
 *@Description:BaseMvpActivity
 * */
public abstract class BaseMvpActivity<M extends IBaseModel, P extends BasePresenter> extends BaseActivity implements IBaseView {

    public M model;
    public P presenter;

    protected void initData() {

        presenter = (P) initPresenter();
        if (presenter != null) {
            model = (M) presenter.getModel();
            if (model != null) {
                //绑定
                presenter.attach(model, this);
            }
        }
        init();
    }

    protected abstract void init();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            //解绑
            presenter.dettach();
        }
    }
}
