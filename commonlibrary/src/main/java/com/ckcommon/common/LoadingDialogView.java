package com.ckcommon.common;

/**
 * Created by Administrator on 2017/3/6.
 */

public interface LoadingDialogView {
    void showLoadingDialog(String title,int color);

    void dismissLoadingDialog();
}