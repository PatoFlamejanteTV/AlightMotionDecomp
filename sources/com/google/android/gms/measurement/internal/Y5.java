package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class Y5 extends R.a {
    public static final Parcelable.Creator<Y5> CREATOR = new b6();

    /* renamed from: a, reason: collision with root package name */
    private final int f17649a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17650b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17651c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f17652d;

    /* renamed from: e, reason: collision with root package name */
    public final String f17653e;

    /* renamed from: f, reason: collision with root package name */
    public final String f17654f;

    /* renamed from: g, reason: collision with root package name */
    public final Double f17655g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Y5(a6 a6Var) {
        this(a6Var.f17682c, a6Var.f17683d, a6Var.f17684e, a6Var.f17681b);
    }

    public final Object s() {
        Long l8 = this.f17652d;
        if (l8 != null) {
            return l8;
        }
        Double d8 = this.f17655g;
        if (d8 != null) {
            return d8;
        }
        String str = this.f17653e;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.k(parcel, 1, this.f17649a);
        R.c.q(parcel, 2, this.f17650b, false);
        R.c.n(parcel, 3, this.f17651c);
        R.c.o(parcel, 4, this.f17652d, false);
        R.c.i(parcel, 5, null, false);
        R.c.q(parcel, 6, this.f17653e, false);
        R.c.q(parcel, 7, this.f17654f, false);
        R.c.h(parcel, 8, this.f17655g, false);
        R.c.b(parcel, a9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Y5(String str, long j8, Object obj, String str2) {
        AbstractC1396p.f(str);
        this.f17649a = 2;
        this.f17650b = str;
        this.f17651c = j8;
        this.f17654f = str2;
        if (obj == null) {
            this.f17652d = null;
            this.f17655g = null;
            this.f17653e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f17652d = (Long) obj;
            this.f17655g = null;
            this.f17653e = null;
        } else if (obj instanceof String) {
            this.f17652d = null;
            this.f17655g = null;
            this.f17653e = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f17652d = null;
                this.f17655g = (Double) obj;
                this.f17653e = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Y5(int i8, String str, long j8, Long l8, Float f8, String str2, String str3, Double d8) {
        this.f17649a = i8;
        this.f17650b = str;
        this.f17651c = j8;
        this.f17652d = l8;
        if (i8 == 1) {
            this.f17655g = f8 != null ? Double.valueOf(f8.doubleValue()) : null;
        } else {
            this.f17655g = d8;
        }
        this.f17653e = str2;
        this.f17654f = str3;
    }
}
