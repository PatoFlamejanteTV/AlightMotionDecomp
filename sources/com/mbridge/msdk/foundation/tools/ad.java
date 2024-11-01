package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;

/* loaded from: classes4.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f21209a = true;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f21210b = true;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f21211c = true;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f21212d = false;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f21213e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f21214f = false;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f21215g = true;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f21216h = true;

    static {
        if (!MBridgeConstans.DEBUG) {
            f21215g = false;
            f21209a = false;
            f21211c = false;
            f21216h = false;
            f21210b = false;
            f21214f = false;
            f21213e = false;
            f21212d = false;
        }
    }

    public static void a(String str, String str2) {
        if (!f21209a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2);
    }

    public static void b(String str, String str2) {
        if (!f21210b || str2 == null) {
            return;
        }
        Log.e(a(str), str2);
    }

    public static void c(String str, String str2) {
        if (f21211c && !TextUtils.isEmpty(str2)) {
            Log.i(a(str), str2);
        }
    }

    public static void d(String str, String str2) {
        if (f21216h && !TextUtils.isEmpty(str2)) {
            Log.w(a(str), str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        if (!f21216h || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2, th);
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return "MBRIDGE_" + str;
    }

    public static void a(String str, String str2, Throwable th) {
        if (!f21210b || str2 == null || th == null) {
            return;
        }
        Log.e(a(str), str2, th);
    }

    public static void a(String str, Throwable th) {
        if (!f21216h || th == null) {
            return;
        }
        Log.w(a(str), th);
    }
}
