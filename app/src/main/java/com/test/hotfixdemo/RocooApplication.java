package com.test.hotfixdemo;

import android.app.Application;
import android.content.Context;

import com.dodola.rocoofix.RocooFix;

/**
 * Created by turbo on 2016/7/6.
 */
public class RocooApplication extends Application {
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

        //需要打补丁时开启
        RocooFix.init(this);
        //测试从assets文件夹读取补丁
        RocooFix.initPathFromAssets(this, "patch.jar");
    }
}
