package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import l0.C3302b;

/* renamed from: com.google.android.gms.measurement.internal.q3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class CallableC2423q3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ M5 f18017a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ X2 f18018b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2423q3(X2 x22, M5 m52) {
        this.f18017a = m52;
        this.f18018b = x22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        H5 h52;
        H5 h53;
        h52 = this.f18018b.f17618a;
        h52.z0();
        h53 = this.f18018b.f17618a;
        return new C3302b(h53.d(this.f18017a.f17457a));
    }
}
