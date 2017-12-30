package com.litefeel.androidcommon.utils;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by litefeel on 2017/12/30.
 */

public class CryptoUtil {
    @Nullable
    public static String md5(@NonNull String str) {
        return md5(str, "UTF-8");
    }

    @Nullable
    public static String md5(@NonNull String str, @NonNull String charset) {
        return md5(str.getBytes(Charset.forName(charset)));
    }

    @Nullable
    public static String md5(@NonNull byte[] input) {
        MessageDigest md5 = null;

        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
        byte[] bytes = md5.digest(input);
        StringBuilder result = new StringBuilder();
        for (byte b : bytes) {
            String temp = Integer.toHexString(b & 0xFF);
            if (1 == temp.length()) {
                result.append(0);
            }
            result.append(temp);
        }
        return result.toString().toUpperCase();
    }
}
