package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.measurement.c1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2107c1 extends R.a {
    public static final Parcelable.Creator<C2107c1> CREATOR = new C2098b1();

    /* renamed from: a, reason: collision with root package name */
    public final long f16607a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16608b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16609c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16610d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16611e;

    /* renamed from: f, reason: collision with root package name */
    public final String f16612f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f16613g;

    /* renamed from: h, reason: collision with root package name */
    public final String f16614h;

    public C2107c1(long j8, long j9, boolean z8, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f16607a = j8;
        this.f16608b = j9;
        this.f16609c = z8;
        this.f16610d = str;
        this.f16611e = str2;
        this.f16612f = str3;
        this.f16613g = bundle;
        this.f16614h = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.n(parcel, 1, this.f16607a);
        R.c.n(parcel, 2, this.f16608b);
        R.c.c(parcel, 3, this.f16609c);
        R.c.q(parcel, 4, this.f16610d, false);
        R.c.q(parcel, 5, this.f16611e, false);
        R.c.q(parcel, 6, this.f16612f, false);
        R.c.e(parcel, 7, this.f16613g, false);
        R.c.q(parcel, 8, this.f16614h, false);
        R.c.b(parcel, a9);
    }
}
