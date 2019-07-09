package com.bawei.lib_core.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.bawei.lib_core.R;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/*
 *@Auther:libokang
 *@Date: 时间
 *@Description:BaseActivity
 * */
public abstract class BaseActivity extends AppCompatActivity {

    private Unbinder bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(bindLayout());
        Log.d("1", "onCreate");
        bind = ButterKnife.bind(this);
        bindView();
        bindData();
    }

    /**
     * 绑定布局
     *
     * @return
     */
    protected abstract int bindLayout();

    protected abstract void bindView();

    protected abstract void bindData();

    /**
     * 显示Tost
     */
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    /**
     * 无参跳转
     *
     * @param cls
     */
    public void startActivity(Class<?> cls) {
        startActivity(new Intent(this, cls));
    }

    /**
     * 有参跳转
     *
     * @param bundle
     * @param cls
     */
    public void startActivity(Bundle bundle, Class<?> cls) {
        Intent intent = new Intent(this, cls);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    /**
     * @param status
     */
    public void isStatus(boolean status) {
        if (status) {
            //沉浸式代码
        }
    }

    /**
     * 全屏
     *
     * @param fullscreen
     */
    public void isFullscreen(boolean fullscreen) {
        if (fullscreen) {

        }
    }
    //生命周期

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("1", "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("1", "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("1", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("1", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("1", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("1", "onDestroy");
        if (bind != null) {
            bind.unbind();
            bind = null;
        }
    }
}
