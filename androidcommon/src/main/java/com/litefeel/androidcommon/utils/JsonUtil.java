package com.litefeel.androidcommon.utils;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by litefeel on 2017/12/29.
 */

public class JsonUtil {


    public static String getString(@NonNull JSONObject jsonObject, @NonNull String key) {
        return getString(jsonObject, key, null);
    }

    public static String getString(@NonNull JSONObject jsonObject, @NonNull String key, @Nullable String defaultValue) {
        try {
            return jsonObject.getString(key);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return defaultValue;
    }

    public static boolean getBoolean(@NonNull JSONObject jsonObject, @NonNull String key) {
        return getBoolean(jsonObject, key, false);
    }

    public static boolean getBoolean(@NonNull JSONObject jsonObject, @NonNull String key, boolean defaultValue) {
        try {
            return jsonObject.getBoolean(key);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return defaultValue;
    }

    public static int getInt(@NonNull JSONObject jsonObject, @NonNull String key) {
        return getInt(jsonObject, key, 0);
    }

    public static int getInt(@NonNull JSONObject jsonObject, @NonNull String key, int defaultValue) {
        try {
            return jsonObject.getInt(key);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return defaultValue;
    }

    public static long getLong(@NonNull JSONObject jsonObject, @NonNull String key) {
        return getLong(jsonObject, key, 0);
    }

    public static long getLong(@NonNull JSONObject jsonObject, @NonNull String key, long defaultValue) {
        try {
            return jsonObject.getLong(key);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return defaultValue;
    }

    public static double getDouble(@NonNull JSONObject jsonObject, @NonNull String key) {
        return getDouble(jsonObject, key, 0);
    }

    public static double getDouble(@NonNull JSONObject jsonObject, @NonNull String key, double defaultValue) {
        try {
            return jsonObject.getDouble(key);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return defaultValue;
    }

    @Nullable
    public static JSONObject getJSONObject(@NonNull JSONObject jsonObject, @NonNull String key) {
        try {
            return jsonObject.getJSONObject(key);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Nullable
    public static JSONArray getJSONArray(@NonNull JSONObject jsonObject, @NonNull String key) {
        try {
            return jsonObject.getJSONArray(key);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

}
