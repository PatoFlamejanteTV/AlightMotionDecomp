package o0;

import N.C1339b;
import Q.O;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class l extends R.a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    final int f35835a;

    /* renamed from: b, reason: collision with root package name */
    private final C1339b f35836b;

    /* renamed from: c, reason: collision with root package name */
    private final O f35837c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(int i8, C1339b c1339b, O o8) {
        this.f35835a = i8;
        this.f35836b = c1339b;
        this.f35837c = o8;
    }

    public final C1339b s() {
        return this.f35836b;
    }

    public final O u() {
        return this.f35837c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.k(parcel, 1, this.f35835a);
        R.c.p(parcel, 2, this.f35836b, i8, false);
        R.c.p(parcel, 3, this.f35837c, i8, false);
        R.c.b(parcel, a9);
    }
}
