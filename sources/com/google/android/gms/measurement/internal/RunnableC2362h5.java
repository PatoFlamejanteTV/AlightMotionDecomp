package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.measurement.internal.h5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2362h5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ServiceConnectionC2334d5 f17843a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2362h5(ServiceConnectionC2334d5 serviceConnectionC2334d5) {
        this.f17843a = serviceConnectionC2334d5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F4.K(this.f17843a.f17770c, new ComponentName(this.f17843a.f17770c.w(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
