package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class X3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f17621a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17622b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ long f17623c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ Bundle f17624d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ boolean f17625e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ boolean f17626f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ boolean f17627g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ String f17628h;

    /* renamed from: i, reason: collision with root package name */
    private final /* synthetic */ F3 f17629i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public X3(F3 f32, String str, String str2, long j8, Bundle bundle, boolean z8, boolean z9, boolean z10, String str3) {
        this.f17621a = str;
        this.f17622b = str2;
        this.f17623c = j8;
        this.f17624d = bundle;
        this.f17625e = z8;
        this.f17626f = z9;
        this.f17627g = z10;
        this.f17628h = str3;
        this.f17629i = f32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17629i.d0(this.f17621a, this.f17622b, this.f17623c, this.f17624d, this.f17625e, this.f17626f, this.f17627g, this.f17628h);
    }
}
