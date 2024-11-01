package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public final class an {
    public static boolean a(String str) {
        if (str != null && !TextUtils.isEmpty(str.trim()) && !"null".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean b(String str) {
        if (str != null && !TextUtils.isEmpty(str.trim()) && !"null".equals(str)) {
            return true;
        }
        return false;
    }
}
