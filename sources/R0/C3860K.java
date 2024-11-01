package r0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r0.K, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3860K extends R.a {
    public static final Parcelable.Creator<C3860K> CREATOR = new C3861L();

    /* renamed from: a, reason: collision with root package name */
    String f37671a;

    /* renamed from: b, reason: collision with root package name */
    Bundle f37672b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3860K(String str, Bundle bundle) {
        this.f37671a = str;
        this.f37672b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.q(parcel, 2, this.f37671a, false);
        R.c.e(parcel, 3, this.f37672b, false);
        R.c.b(parcel, a9);
    }
}
