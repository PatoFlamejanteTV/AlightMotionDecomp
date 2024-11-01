package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class D extends R.a implements Iterable {
    public static final Parcelable.Creator<D> CREATOR = new F();

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f17170a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public D(Bundle bundle) {
        this.f17170a = bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object I(String str) {
        return this.f17170a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String Q(String str) {
        return this.f17170a.getString(str);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C(this);
    }

    public final int s() {
        return this.f17170a.size();
    }

    public final String toString() {
        return this.f17170a.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Double v(String str) {
        return Double.valueOf(this.f17170a.getDouble(str));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.e(parcel, 2, y(), false);
        R.c.b(parcel, a9);
    }

    public final Bundle y() {
        return new Bundle(this.f17170a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Long z(String str) {
        return Long.valueOf(this.f17170a.getLong(str));
    }
}
