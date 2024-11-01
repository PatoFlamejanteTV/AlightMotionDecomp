package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.internal.measurement.z0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2300z0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f17091a = new C2292y0();

    public static SharedPreferences a(Context context, String str, int i8, AbstractC2236r0 abstractC2236r0) {
        SharedPreferencesC2260u0 sharedPreferencesC2260u0;
        if (AbstractC2178k0.a().a(str, abstractC2236r0, EnumC2213o0.SHARED_PREFS_TYPE).equals("")) {
            sharedPreferencesC2260u0 = new SharedPreferencesC2260u0();
        } else {
            sharedPreferencesC2260u0 = null;
        }
        if (sharedPreferencesC2260u0 != null) {
            return sharedPreferencesC2260u0;
        }
        ThreadLocal threadLocal = f17091a;
        w0.h.d(((Boolean) threadLocal.get()).booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            threadLocal.set(Boolean.TRUE);
            return sharedPreferences;
        } catch (Throwable th) {
            f17091a.set(Boolean.TRUE);
            throw th;
        }
    }
}
