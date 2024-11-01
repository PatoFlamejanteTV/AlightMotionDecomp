package r0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: r0.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3882u extends R.a {

    @NonNull
    public static final Parcelable.Creator<C3882u> CREATOR = new C3857H();

    /* renamed from: a, reason: collision with root package name */
    int f37770a;

    /* renamed from: b, reason: collision with root package name */
    String f37771b;

    /* renamed from: c, reason: collision with root package name */
    String f37772c;

    public C3882u(int i8, String str, String str2) {
        this.f37770a = i8;
        this.f37771b = str;
        this.f37772c = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.k(parcel, 1, this.f37770a);
        R.c.q(parcel, 2, this.f37771b, false);
        R.c.q(parcel, 3, this.f37772c, false);
        R.c.b(parcel, a9);
    }
}
