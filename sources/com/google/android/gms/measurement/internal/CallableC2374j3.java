package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.j3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class CallableC2374j3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f17871a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17872b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f17873c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ X2 f17874d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2374j3(X2 x22, String str, String str2, String str3) {
        this.f17871a = str;
        this.f17872b = str2;
        this.f17873c = str3;
        this.f17874d = x22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        H5 h52;
        H5 h53;
        h52 = this.f17874d.f17618a;
        h52.z0();
        h53 = this.f17874d.f17618a;
        return h53.l0().D0(this.f17871a, this.f17872b, this.f17873c);
    }
}
