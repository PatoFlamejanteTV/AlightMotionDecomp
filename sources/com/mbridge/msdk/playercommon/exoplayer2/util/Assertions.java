package com.mbridge.msdk.playercommon.exoplayer2.util;

import android.os.Looper;
import android.text.TextUtils;

/* loaded from: classes4.dex */
public final class Assertions {
    private Assertions() {
    }

    public static void checkArgument(boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException();
        }
    }

    public static int checkIndex(int i8, int i9, int i10) {
        if (i8 >= i9 && i8 < i10) {
            return i8;
        }
        throw new IndexOutOfBoundsException();
    }

    public static void checkMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
        } else {
            throw new IllegalStateException("Not in applications main thread");
        }
    }

    public static String checkNotEmpty(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    public static <T> T checkNotNull(T t8) {
        t8.getClass();
        return t8;
    }

    public static void checkState(boolean z8) {
        if (!z8) {
            throw new IllegalStateException();
        }
    }

    public static void checkArgument(boolean z8, Object obj) {
        if (!z8) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static <T> T checkNotNull(T t8, Object obj) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkState(boolean z8, Object obj) {
        if (!z8) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static String checkNotEmpty(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }
}
