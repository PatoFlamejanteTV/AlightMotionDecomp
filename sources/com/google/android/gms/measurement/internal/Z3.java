package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class Z3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ long f17659a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ F3 f17660b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Z3(F3 f32, long j8) {
        this.f17659a = j8;
        this.f17660b = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17660b.M0(this.f17659a);
        this.f17660b.q().O(new AtomicReference());
    }
}
