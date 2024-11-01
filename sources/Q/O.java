package Q;

import N.C1339b;
import Q.InterfaceC1390j;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class O extends R.a {
    public static final Parcelable.Creator<O> CREATOR = new P();

    /* renamed from: a, reason: collision with root package name */
    final int f8164a;

    /* renamed from: b, reason: collision with root package name */
    final IBinder f8165b;

    /* renamed from: c, reason: collision with root package name */
    private final C1339b f8166c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f8167d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f8168e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O(int i8, IBinder iBinder, C1339b c1339b, boolean z8, boolean z9) {
        this.f8164a = i8;
        this.f8165b = iBinder;
        this.f8166c = c1339b;
        this.f8167d = z8;
        this.f8168e = z9;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o8 = (O) obj;
        if (!this.f8166c.equals(o8.f8166c) || !AbstractC1394n.a(u(), o8.u())) {
            return false;
        }
        return true;
    }

    public final C1339b s() {
        return this.f8166c;
    }

    public final InterfaceC1390j u() {
        IBinder iBinder = this.f8165b;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC1390j.a.i(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.k(parcel, 1, this.f8164a);
        R.c.j(parcel, 2, this.f8165b, false);
        R.c.p(parcel, 3, this.f8166c, i8, false);
        R.c.c(parcel, 4, this.f8167d);
        R.c.c(parcel, 5, this.f8168e);
        R.c.b(parcel, a9);
    }
}
