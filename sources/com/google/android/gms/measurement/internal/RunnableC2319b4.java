package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.b4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2319b4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Bundle f17701a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ F3 f17702b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2319b4(F3 f32, Bundle bundle) {
        this.f17701a = bundle;
        this.f17702b = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F3.U(this.f17702b, this.f17701a);
    }
}
