package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class B5 extends R.a {
    public static final Parcelable.Creator<B5> CREATOR = new A5();

    /* renamed from: a, reason: collision with root package name */
    public final String f17158a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17159b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17160c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B5(String str, long j8, int i8) {
        this.f17158a = str;
        this.f17159b = j8;
        this.f17160c = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.q(parcel, 1, this.f17158a, false);
        R.c.n(parcel, 2, this.f17159b);
        R.c.k(parcel, 3, this.f17160c);
        R.c.b(parcel, a9);
    }
}
