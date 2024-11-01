package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.m3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class CallableC2395m3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f17944a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17945b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f17946c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ X2 f17947d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC2395m3(X2 x22, String str, String str2, String str3) {
        this.f17944a = str;
        this.f17945b = str2;
        this.f17946c = str3;
        this.f17947d = x22;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        H5 h52;
        H5 h53;
        h52 = this.f17947d.f17618a;
        h52.z0();
        h53 = this.f17947d.f17618a;
        return h53.l0().R(this.f17944a, this.f17945b, this.f17946c);
    }
}
