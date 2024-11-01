package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.r3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class CallableC2429r3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ E f18031a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f18032b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ X2 f18033c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2429r3(X2 x22, E e8, String str) {
        this.f18031a = e8;
        this.f18032b = str;
        this.f18033c = x22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        H5 h52;
        H5 h53;
        h52 = this.f18033c.f17618a;
        h52.z0();
        h53 = this.f18033c.f17618a;
        return h53.u0().v(this.f18031a, this.f18032b);
    }
}
