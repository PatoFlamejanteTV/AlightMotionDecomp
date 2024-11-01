package Q;

import N.C1341d;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class h0 extends R.a {
    public static final Parcelable.Creator<h0> CREATOR = new i0();

    /* renamed from: a, reason: collision with root package name */
    Bundle f8265a;

    /* renamed from: b, reason: collision with root package name */
    C1341d[] f8266b;

    /* renamed from: c, reason: collision with root package name */
    int f8267c;

    /* renamed from: d, reason: collision with root package name */
    C1385e f8268d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(Bundle bundle, C1341d[] c1341dArr, int i8, C1385e c1385e) {
        this.f8265a = bundle;
        this.f8266b = c1341dArr;
        this.f8267c = i8;
        this.f8268d = c1385e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.e(parcel, 1, this.f8265a, false);
        R.c.t(parcel, 2, this.f8266b, i8, false);
        R.c.k(parcel, 3, this.f8267c);
        R.c.p(parcel, 4, this.f8268d, i8, false);
        R.c.b(parcel, a9);
    }
}
