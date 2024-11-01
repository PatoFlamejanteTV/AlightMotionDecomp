package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.content.SharedPreferences;

/* loaded from: classes3.dex */
public final class A2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f17120a;

    /* renamed from: b, reason: collision with root package name */
    private final long f17121b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f17122c;

    /* renamed from: d, reason: collision with root package name */
    private long f17123d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C2484z2 f17124e;

    public A2(C2484z2 c2484z2, String str, long j8) {
        this.f17124e = c2484z2;
        AbstractC1396p.f(str);
        this.f17120a = str;
        this.f17121b = j8;
    }

    public final long a() {
        if (!this.f17122c) {
            this.f17122c = true;
            this.f17123d = this.f17124e.J().getLong(this.f17120a, this.f17121b);
        }
        return this.f17123d;
    }

    public final void b(long j8) {
        SharedPreferences.Editor edit = this.f17124e.J().edit();
        edit.putLong(this.f17120a, j8);
        edit.apply();
        this.f17123d = j8;
    }
}
