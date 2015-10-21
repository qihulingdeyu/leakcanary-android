package com.squareup.leakcanary;

import android.app.Application;

import com.squareup.leakcanary.watcher.RefWatcher;

/**
 * Created by zwq on 2015/10/08 12:04.<br/><br/>
 */
public class LeakCanaryUtils {

    private static final String TAG = LeakCanaryUtils.class.getName();

    public static void LeakCanaryType(boolean release){
        if (release){

        }else {

        }
    }
    public static RefWatcher install(Application application) {
        return RefWatcher.DISABLED;
    }

//    private LeakCanary() {
//        throw new AssertionError();
//    }

//    public static final RefWatcher DISABLED = new RefWatcher();

//    private RefWatcher() {
//    }

    public void watch(Object watchedReference) {
    }

    public void watch(Object watchedReference, String referenceName) {
    }

}
