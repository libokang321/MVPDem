package com.bawei.lib_core.utils;

import android.app.ProgressDialog;
import android.content.Context;

/*
 *@Auther:libokang
 *@Date: 时间
 *@Description:DialogUtil
 * */
public class DialogUtil extends ProgressDialog {


    public DialogUtil(Context context) {
        super(context);
    }

    public DialogUtil(Context context, int theme) {
        super(context, theme);
    }
}
