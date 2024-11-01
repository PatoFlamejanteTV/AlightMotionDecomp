package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.measurement.internal.x2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2470x2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f18113a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f18114b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18115c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f18116d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ C2484z2 f18117e;

    public C2470x2(C2484z2 c2484z2, String str, boolean z8) {
        this.f18117e = c2484z2;
        AbstractC1396p.f(str);
        this.f18113a = str;
        this.f18114b = z8;
    }

    public final void a(boolean z8) {
        SharedPreferences.Editor edit = this.f18117e.J().edit();
        edit.putBoolean(this.f18113a, z8);
        edit.apply();
        this.f18116d = z8;
    }

    public final boolean b() {
        if (!this.f18115c) {
            this.f18115c = true;
            this.f18116d = this.f18117e.J().getBoolean(this.f18113a, this.f18114b);
        }
        return this.f18116d;
    }
}
