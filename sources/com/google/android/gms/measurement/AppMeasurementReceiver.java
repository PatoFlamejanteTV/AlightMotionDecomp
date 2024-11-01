package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import l0.C3312l;

/* loaded from: classes3.dex */
public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements C3312l.a {

    /* renamed from: a, reason: collision with root package name */
    private C3312l f17104a;

    @Override // l0.C3312l.a
    public final void a(Context context, Intent intent) {
        WakefulBroadcastReceiver.startWakefulService(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f17104a == null) {
            this.f17104a = new C3312l(this);
        }
        this.f17104a.a(context, intent);
    }
}
