package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.l3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class CallableC2388l3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f17925a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17926b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f17927c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ X2 f17928d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2388l3(X2 x22, String str, String str2, String str3) {
        this.f17925a = str;
        this.f17926b = str2;
        this.f17927c = str3;
        this.f17928d = x22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        H5 h52;
        H5 h53;
        h52 = this.f17928d.f17618a;
        h52.z0();
        h53 = this.f17928d.f17618a;
        return h53.l0().R(this.f17925a, this.f17926b, this.f17927c);
    }
}
