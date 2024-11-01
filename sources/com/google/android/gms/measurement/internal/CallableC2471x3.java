package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.x3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class CallableC2471x3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f18118a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ X2 f18119b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2471x3(X2 x22, String str) {
        this.f18118a = str;
        this.f18119b = x22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        H5 h52;
        H5 h53;
        h52 = this.f18119b.f17618a;
        h52.z0();
        h53 = this.f18119b.f17618a;
        return h53.l0().Y0(this.f18118a);
    }
}
