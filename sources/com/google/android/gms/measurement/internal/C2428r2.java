package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.r2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2428r2 {

    /* renamed from: a, reason: collision with root package name */
    public String f18027a;

    /* renamed from: b, reason: collision with root package name */
    public String f18028b;

    /* renamed from: c, reason: collision with root package name */
    private long f18029c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f18030d;

    public C2428r2(String str, String str2, Bundle bundle, long j8) {
        this.f18027a = str;
        this.f18028b = str2;
        this.f18030d = bundle == null ? new Bundle() : bundle;
        this.f18029c = j8;
    }

    public static C2428r2 b(E e8) {
        return new C2428r2(e8.f17192a, e8.f17194c, e8.f17193b.y(), e8.f17195d);
    }

    public final E a() {
        return new E(this.f18027a, new D(new Bundle(this.f18030d)), this.f18028b, this.f18029c);
    }

    public final String toString() {
        return "origin=" + this.f18028b + ",name=" + this.f18027a + ",params=" + String.valueOf(this.f18030d);
    }
}
