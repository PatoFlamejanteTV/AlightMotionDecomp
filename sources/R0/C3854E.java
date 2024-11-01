package r0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r0.E, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3854E extends R.a {
    public static final Parcelable.Creator<C3854E> CREATOR = new C3855F();

    /* renamed from: a, reason: collision with root package name */
    final String f37667a;

    /* renamed from: b, reason: collision with root package name */
    final String f37668b;

    /* renamed from: c, reason: collision with root package name */
    final int f37669c;

    /* renamed from: d, reason: collision with root package name */
    final int f37670d;

    public C3854E(String str, String str2, int i8, int i9) {
        this.f37667a = str;
        this.f37668b = str2;
        this.f37669c = i8;
        this.f37670d = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f37667a;
        int a9 = R.c.a(parcel);
        R.c.q(parcel, 2, str, false);
        R.c.q(parcel, 3, this.f37668b, false);
        R.c.k(parcel, 4, this.f37669c);
        R.c.k(parcel, 5, this.f37670d);
        R.c.b(parcel, a9);
    }
}
