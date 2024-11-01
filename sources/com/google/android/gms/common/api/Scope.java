package com.google.android.gms.common.api;

import Q.AbstractC1396p;
import R.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes3.dex */
public final class Scope extends R.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Scope> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final int f16057a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16058b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Scope(int i8, String str) {
        AbstractC1396p.g(str, "scopeUri must not be null or empty");
        this.f16057a = i8;
        this.f16058b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f16058b.equals(((Scope) obj).f16058b);
    }

    public int hashCode() {
        return this.f16058b.hashCode();
    }

    public String s() {
        return this.f16058b;
    }

    public String toString() {
        return this.f16058b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f16057a;
        int a9 = c.a(parcel);
        c.k(parcel, 1, i9);
        c.q(parcel, 2, s(), false);
        c.b(parcel, a9);
    }

    public Scope(String str) {
        this(1, str);
    }
}
