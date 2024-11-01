package l0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: l0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3302b extends R.a {
    public static final Parcelable.Creator<C3302b> CREATOR = new C3303c();

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f34610a;

    public C3302b(Bundle bundle) {
        this.f34610a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.e(parcel, 1, this.f34610a, false);
        R.c.b(parcel, a9);
    }
}
