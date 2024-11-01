package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* renamed from: com.google.android.gms.internal.measurement.q3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2232q3 {

    /* renamed from: a, reason: collision with root package name */
    final String f16938a;

    /* renamed from: b, reason: collision with root package name */
    final Uri f16939b;

    /* renamed from: c, reason: collision with root package name */
    final String f16940c;

    /* renamed from: d, reason: collision with root package name */
    final String f16941d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f16942e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f16943f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f16944g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f16945h;

    /* renamed from: i, reason: collision with root package name */
    final w0.c f16946i;

    public C2232q3(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public final AbstractC2163i3 a(String str, double d8) {
        return AbstractC2163i3.b(this, str, Double.valueOf(-3.0d), true);
    }

    public final AbstractC2163i3 b(String str, long j8) {
        return AbstractC2163i3.c(this, str, Long.valueOf(j8), true);
    }

    public final AbstractC2163i3 c(String str, String str2) {
        return AbstractC2163i3.d(this, str, str2, true);
    }

    public final AbstractC2163i3 d(String str, boolean z8) {
        return AbstractC2163i3.a(this, str, Boolean.valueOf(z8), true);
    }

    public final C2232q3 e() {
        return new C2232q3(this.f16938a, this.f16939b, this.f16940c, this.f16941d, this.f16942e, this.f16943f, true, this.f16945h, this.f16946i);
    }

    public final C2232q3 f() {
        if (this.f16940c.isEmpty()) {
            w0.c cVar = this.f16946i;
            if (cVar == null) {
                return new C2232q3(this.f16938a, this.f16939b, this.f16940c, this.f16941d, true, this.f16943f, this.f16944g, this.f16945h, cVar);
            }
            throw new IllegalStateException("Cannot skip gservices both always and conditionally");
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    private C2232q3(String str, Uri uri, String str2, String str3, boolean z8, boolean z9, boolean z10, boolean z11, w0.c cVar) {
        this.f16938a = str;
        this.f16939b = uri;
        this.f16940c = str2;
        this.f16941d = str3;
        this.f16942e = z8;
        this.f16943f = z9;
        this.f16944g = z10;
        this.f16945h = z11;
        this.f16946i = cVar;
    }
}
