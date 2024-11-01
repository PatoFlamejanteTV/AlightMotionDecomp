package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.k3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class CallableC2381k3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f17906a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17907b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f17908c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ X2 f17909d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2381k3(X2 x22, String str, String str2, String str3) {
        this.f17906a = str;
        this.f17907b = str2;
        this.f17908c = str3;
        this.f17909d = x22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        H5 h52;
        H5 h53;
        h52 = this.f17909d.f17618a;
        h52.z0();
        h53 = this.f17909d.f17618a;
        return h53.l0().D0(this.f17906a, this.f17907b, this.f17908c);
    }
}
