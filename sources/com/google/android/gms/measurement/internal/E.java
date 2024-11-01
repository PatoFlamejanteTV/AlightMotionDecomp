package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.os.Parcel;
import android.os.Parcelable;
import l0.C3304d;

/* loaded from: classes3.dex */
public final class E extends R.a {
    public static final Parcelable.Creator<E> CREATOR = new C3304d();

    /* renamed from: a, reason: collision with root package name */
    public final String f17192a;

    /* renamed from: b, reason: collision with root package name */
    public final D f17193b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17194c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17195d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public E(E e8, long j8) {
        AbstractC1396p.l(e8);
        this.f17192a = e8.f17192a;
        this.f17193b = e8.f17193b;
        this.f17194c = e8.f17194c;
        this.f17195d = j8;
    }

    public final String toString() {
        return "origin=" + this.f17194c + ",name=" + this.f17192a + ",params=" + String.valueOf(this.f17193b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.q(parcel, 2, this.f17192a, false);
        R.c.p(parcel, 3, this.f17193b, i8, false);
        R.c.q(parcel, 4, this.f17194c, false);
        R.c.n(parcel, 5, this.f17195d);
        R.c.b(parcel, a9);
    }

    public E(String str, D d8, String str2, long j8) {
        this.f17192a = str;
        this.f17193b = d8;
        this.f17194c = str2;
        this.f17195d = j8;
    }
}
