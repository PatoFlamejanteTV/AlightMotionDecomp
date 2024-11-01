package r0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: r0.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3874l extends R.a {

    @NonNull
    public static final Parcelable.Creator<C3874l> CREATOR = new C3851B();

    /* renamed from: a, reason: collision with root package name */
    int f37753a;

    /* renamed from: b, reason: collision with root package name */
    final Bundle f37754b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3874l(int i8, Bundle bundle) {
        new Bundle();
        this.f37753a = i8;
        this.f37754b = bundle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.k(parcel, 2, this.f37753a);
        R.c.e(parcel, 3, this.f37754b, false);
        R.c.b(parcel, a9);
    }
}
