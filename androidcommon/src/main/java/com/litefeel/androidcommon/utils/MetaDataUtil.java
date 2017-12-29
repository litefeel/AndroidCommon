package com.litefeel.androidcommon.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by litefeel on 2017/12/21.
 */
public final class MetaDataUtil {

    private MetaDataUtil() {
    }

    static public boolean getBoolean(@NonNull Context context, @NonNull String key, boolean defaultValue) {
        Bundle metaData = getMetaData(context);
        return metaData != null ? metaData.getBoolean(key, defaultValue) : defaultValue;
    }

    static public boolean getBoolean(@NonNull Context context, @NonNull String key) {
        return getBoolean(context, key, false);
    }

    static public int getInt(@NonNull Context context, @NonNull String key, int defaultValue) {
        Bundle metaData = getMetaData(context);
        return metaData != null ? metaData.getInt(key, defaultValue) : defaultValue;
    }

    static public int getInt(@NonNull Context context, @NonNull String key) {
        return getInt(context, key, 0);
    }

    static public long getLong(@NonNull Context context, @NonNull String key, long defaultValue) {
        Bundle metaData = getMetaData(context);
        return metaData != null ? metaData.getLong(key, defaultValue) : defaultValue;
    }

    static public long getLong(@NonNull Context context, @NonNull String key) {
        return getLong(context, key, 0);
    }

    static public double getDouble(@NonNull Context context, @NonNull String key, double defaultValue) {
        Bundle metaData = getMetaData(context);
        return metaData != null ? metaData.getDouble(key, defaultValue) : defaultValue;
    }

    static public double getDouble(@NonNull Context context, @NonNull String key) {
        return getDouble(context, key, 0);
    }

    static public String getString(@NonNull Context context, @NonNull String key, @Nullable String defaultValue) {
        Bundle metaData = getMetaData(context);
        return metaData != null ? metaData.getString(key, defaultValue) : defaultValue;
    }

    static public String getString(@NonNull Context context, @NonNull String key) {
        return getString(context, key, null);
    }

    @Nullable
    static public boolean[] getBooleanArray(@NonNull Context context, @NonNull String key) {
        Bundle metaData = getMetaData(context);
        return metaData != null ? metaData.getBooleanArray(key) : null;
    }

    @Nullable
    static public int[] getIntArray(@NonNull Context context, @NonNull String key) {
        Bundle metaData = getMetaData(context);
        return metaData != null ? metaData.getIntArray(key) : null;
    }

    @Nullable
    static public long[] getLongArray(@NonNull Context context, @NonNull String key) {
        Bundle metaData = getMetaData(context);
        return metaData != null ? metaData.getLongArray(key) : null;
    }

    @Nullable
    static public double[] getDoubleArray(@NonNull Context context, @NonNull String key) {
        Bundle metaData = getMetaData(context);
        return metaData != null ? metaData.getDoubleArray(key) : null;
    }

    @Nullable
    static public String[] getStringArray(@NonNull Context context, @NonNull String key) {
        Bundle metaData = getMetaData(context);
        return metaData != null ? metaData.getStringArray(key) : null;
    }

    @Nullable
    static private Bundle getMetaData(@NonNull Context context) {
        try {
            ApplicationInfo appInfo = context.getPackageManager()
                .getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA);
            return appInfo.metaData;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}

