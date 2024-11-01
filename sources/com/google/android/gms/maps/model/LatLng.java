package com.google.android.gms.maps.model;

import R.a;
import R.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j0.C3145a;

/* loaded from: classes3.dex */
public final class LatLng extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LatLng> CREATOR = new C3145a();

    /* renamed from: a, reason: collision with root package name */
    public final double f17099a;

    /* renamed from: b, reason: collision with root package name */
    public final double f17100b;

    public LatLng(double d8, double d9) {
        if (d9 >= -180.0d && d9 < 180.0d) {
            this.f17100b = d9;
        } else {
            this.f17100b = ((((d9 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        }
        this.f17099a = Math.max(-90.0d, Math.min(90.0d, d8));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        if (Double.doubleToLongBits(this.f17099a) == Double.doubleToLongBits(latLng.f17099a) && Double.doubleToLongBits(this.f17100b) == Double.doubleToLongBits(latLng.f17100b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f17099a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f17100b);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        double d8 = this.f17099a;
        double d9 = this.f17100b;
        StringBuilder sb = new StringBuilder(60);
        sb.append("lat/lng: (");
        sb.append(d8);
        sb.append(",");
        sb.append(d9);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a9 = c.a(parcel);
        c.g(parcel, 2, this.f17099a);
        c.g(parcel, 3, this.f17100b);
        c.b(parcel, a9);
    }
}
