package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;

/* renamed from: com.google.android.gms.measurement.internal.n3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2402n3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ M5 f17972a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ X2 f17973b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2402n3(X2 x22, M5 m52) {
        this.f17972a = m52;
        this.f17973b = x22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        H5 h52;
        H5 h53;
        h52 = this.f17973b.f17618a;
        h52.z0();
        h53 = this.f17973b.f17618a;
        M5 m52 = this.f17972a;
        h53.f().k();
        h53.A0();
        AbstractC1396p.f(m52.f17457a);
        h53.o0(m52);
        h53.m0(m52);
    }
}
