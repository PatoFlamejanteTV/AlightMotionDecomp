package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.measurement.internal.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2335e extends R.a {
    public static final Parcelable.Creator<C2335e> CREATOR = new C2328d();

    /* renamed from: a, reason: collision with root package name */
    public String f17779a;

    /* renamed from: b, reason: collision with root package name */
    public String f17780b;

    /* renamed from: c, reason: collision with root package name */
    public Y5 f17781c;

    /* renamed from: d, reason: collision with root package name */
    public long f17782d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17783e;

    /* renamed from: f, reason: collision with root package name */
    public String f17784f;

    /* renamed from: g, reason: collision with root package name */
    public E f17785g;

    /* renamed from: h, reason: collision with root package name */
    public long f17786h;

    /* renamed from: i, reason: collision with root package name */
    public E f17787i;

    /* renamed from: j, reason: collision with root package name */
    public long f17788j;

    /* renamed from: k, reason: collision with root package name */
    public E f17789k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2335e(C2335e c2335e) {
        AbstractC1396p.l(c2335e);
        this.f17779a = c2335e.f17779a;
        this.f17780b = c2335e.f17780b;
        this.f17781c = c2335e.f17781c;
        this.f17782d = c2335e.f17782d;
        this.f17783e = c2335e.f17783e;
        this.f17784f = c2335e.f17784f;
        this.f17785g = c2335e.f17785g;
        this.f17786h = c2335e.f17786h;
        this.f17787i = c2335e.f17787i;
        this.f17788j = c2335e.f17788j;
        this.f17789k = c2335e.f17789k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.q(parcel, 2, this.f17779a, false);
        R.c.q(parcel, 3, this.f17780b, false);
        R.c.p(parcel, 4, this.f17781c, i8, false);
        R.c.n(parcel, 5, this.f17782d);
        R.c.c(parcel, 6, this.f17783e);
        R.c.q(parcel, 7, this.f17784f, false);
        R.c.p(parcel, 8, this.f17785g, i8, false);
        R.c.n(parcel, 9, this.f17786h);
        R.c.p(parcel, 10, this.f17787i, i8, false);
        R.c.n(parcel, 11, this.f17788j);
        R.c.p(parcel, 12, this.f17789k, i8, false);
        R.c.b(parcel, a9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2335e(String str, String str2, Y5 y52, long j8, boolean z8, String str3, E e8, long j9, E e9, long j10, E e10) {
        this.f17779a = str;
        this.f17780b = str2;
        this.f17781c = y52;
        this.f17782d = j8;
        this.f17783e = z8;
        this.f17784f = str3;
        this.f17785g = e8;
        this.f17786h = j9;
        this.f17787i = e9;
        this.f17788j = j10;
        this.f17789k = e10;
    }
}
