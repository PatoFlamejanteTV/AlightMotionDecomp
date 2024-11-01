package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes3.dex */
public final class M5 extends R.a {
    public static final Parcelable.Creator<M5> CREATOR = new e6();

    /* renamed from: A, reason: collision with root package name */
    public final int f17451A;

    /* renamed from: B, reason: collision with root package name */
    public final String f17452B;

    /* renamed from: C, reason: collision with root package name */
    public final int f17453C;

    /* renamed from: D, reason: collision with root package name */
    public final long f17454D;

    /* renamed from: E, reason: collision with root package name */
    public final String f17455E;

    /* renamed from: F, reason: collision with root package name */
    public final String f17456F;

    /* renamed from: a, reason: collision with root package name */
    public final String f17457a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17458b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17459c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17460d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17461e;

    /* renamed from: f, reason: collision with root package name */
    public final long f17462f;

    /* renamed from: g, reason: collision with root package name */
    public final String f17463g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f17464h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f17465i;

    /* renamed from: j, reason: collision with root package name */
    public final long f17466j;

    /* renamed from: k, reason: collision with root package name */
    public final String f17467k;

    /* renamed from: l, reason: collision with root package name */
    private final long f17468l;

    /* renamed from: m, reason: collision with root package name */
    public final long f17469m;

    /* renamed from: n, reason: collision with root package name */
    public final int f17470n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f17471o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f17472p;

    /* renamed from: q, reason: collision with root package name */
    public final String f17473q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f17474r;

    /* renamed from: s, reason: collision with root package name */
    public final long f17475s;

    /* renamed from: t, reason: collision with root package name */
    public final List f17476t;

    /* renamed from: u, reason: collision with root package name */
    private final String f17477u;

    /* renamed from: v, reason: collision with root package name */
    public final String f17478v;

    /* renamed from: w, reason: collision with root package name */
    public final String f17479w;

    /* renamed from: x, reason: collision with root package name */
    public final String f17480x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f17481y;

    /* renamed from: z, reason: collision with root package name */
    public final long f17482z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public M5(String str, String str2, String str3, long j8, String str4, long j9, long j10, String str5, boolean z8, boolean z9, String str6, long j11, long j12, int i8, boolean z10, boolean z11, String str7, Boolean bool, long j13, List list, String str8, String str9, String str10, String str11, boolean z12, long j14, int i9, String str12, int i10, long j15, String str13, String str14) {
        AbstractC1396p.f(str);
        this.f17457a = str;
        this.f17458b = TextUtils.isEmpty(str2) ? null : str2;
        this.f17459c = str3;
        this.f17466j = j8;
        this.f17460d = str4;
        this.f17461e = j9;
        this.f17462f = j10;
        this.f17463g = str5;
        this.f17464h = z8;
        this.f17465i = z9;
        this.f17467k = str6;
        this.f17468l = j11;
        this.f17469m = j12;
        this.f17470n = i8;
        this.f17471o = z10;
        this.f17472p = z11;
        this.f17473q = str7;
        this.f17474r = bool;
        this.f17475s = j13;
        this.f17476t = list;
        this.f17477u = null;
        this.f17478v = str9;
        this.f17479w = str10;
        this.f17480x = str11;
        this.f17481y = z12;
        this.f17482z = j14;
        this.f17451A = i9;
        this.f17452B = str12;
        this.f17453C = i10;
        this.f17454D = j15;
        this.f17455E = str13;
        this.f17456F = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.q(parcel, 2, this.f17457a, false);
        R.c.q(parcel, 3, this.f17458b, false);
        R.c.q(parcel, 4, this.f17459c, false);
        R.c.q(parcel, 5, this.f17460d, false);
        R.c.n(parcel, 6, this.f17461e);
        R.c.n(parcel, 7, this.f17462f);
        R.c.q(parcel, 8, this.f17463g, false);
        R.c.c(parcel, 9, this.f17464h);
        R.c.c(parcel, 10, this.f17465i);
        R.c.n(parcel, 11, this.f17466j);
        R.c.q(parcel, 12, this.f17467k, false);
        R.c.n(parcel, 13, this.f17468l);
        R.c.n(parcel, 14, this.f17469m);
        R.c.k(parcel, 15, this.f17470n);
        R.c.c(parcel, 16, this.f17471o);
        R.c.c(parcel, 18, this.f17472p);
        R.c.q(parcel, 19, this.f17473q, false);
        R.c.d(parcel, 21, this.f17474r, false);
        R.c.n(parcel, 22, this.f17475s);
        R.c.s(parcel, 23, this.f17476t, false);
        R.c.q(parcel, 24, this.f17477u, false);
        R.c.q(parcel, 25, this.f17478v, false);
        R.c.q(parcel, 26, this.f17479w, false);
        R.c.q(parcel, 27, this.f17480x, false);
        R.c.c(parcel, 28, this.f17481y);
        R.c.n(parcel, 29, this.f17482z);
        R.c.k(parcel, 30, this.f17451A);
        R.c.q(parcel, 31, this.f17452B, false);
        R.c.k(parcel, 32, this.f17453C);
        R.c.n(parcel, 34, this.f17454D);
        R.c.q(parcel, 35, this.f17455E, false);
        R.c.q(parcel, 36, this.f17456F, false);
        R.c.b(parcel, a9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public M5(String str, String str2, String str3, String str4, long j8, long j9, String str5, boolean z8, boolean z9, long j10, String str6, long j11, long j12, int i8, boolean z10, boolean z11, String str7, Boolean bool, long j13, List list, String str8, String str9, String str10, String str11, boolean z12, long j14, int i9, String str12, int i10, long j15, String str13, String str14) {
        this.f17457a = str;
        this.f17458b = str2;
        this.f17459c = str3;
        this.f17466j = j10;
        this.f17460d = str4;
        this.f17461e = j8;
        this.f17462f = j9;
        this.f17463g = str5;
        this.f17464h = z8;
        this.f17465i = z9;
        this.f17467k = str6;
        this.f17468l = j11;
        this.f17469m = j12;
        this.f17470n = i8;
        this.f17471o = z10;
        this.f17472p = z11;
        this.f17473q = str7;
        this.f17474r = bool;
        this.f17475s = j13;
        this.f17476t = list;
        this.f17477u = str8;
        this.f17478v = str9;
        this.f17479w = str10;
        this.f17480x = str11;
        this.f17481y = z12;
        this.f17482z = j14;
        this.f17451A = i9;
        this.f17452B = str12;
        this.f17453C = i10;
        this.f17454D = j15;
        this.f17455E = str13;
        this.f17456F = str14;
    }
}
