package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.c4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2326c4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Bundle f17755a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ F3 f17756b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2326c4(F3 f32, Bundle bundle) {
        this.f17755a = bundle;
        this.f17756b = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F3.Q0(this.f17756b, this.f17755a);
    }
}
