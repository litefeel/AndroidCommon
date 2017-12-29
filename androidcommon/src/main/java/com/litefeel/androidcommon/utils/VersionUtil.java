package com.litefeel.androidcommon.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by litefeel on 2017/12/29.
 */

public final class VersionUtil {

    private VersionUtil() {
    }

    public static int getVersionCode(@NonNull Context context) {
        PackageInfo info = getPackageInfo(context);
        return info != null ? info.versionCode : 0;
    }

    @Nullable
    public static String getVersionName(@NonNull Context context) {
        PackageInfo info = getPackageInfo(context);
        return info != null ? info.versionName : null;
    }

    @Nullable
    private static PackageInfo getPackageInfo(@NonNull Context context) {
        PackageManager manager = context.getPackageManager();
        try {
            return manager.getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
