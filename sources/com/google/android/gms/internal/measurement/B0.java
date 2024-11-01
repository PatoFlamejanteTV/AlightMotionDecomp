package com.google.android.gms.internal.measurement;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* loaded from: classes3.dex */
public abstract class B0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f16229a;

    static {
        int i8;
        if (Build.VERSION.SDK_INT >= 31) {
            i8 = 33554432;
        } else {
            i8 = 0;
        }
        f16229a = i8;
    }

    public static PendingIntent a(Context context, int i8, Intent intent, int i9) {
        return PendingIntent.getBroadcast(context, 0, intent, i9);
    }
}
