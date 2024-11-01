package Q;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: Q.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1393m extends R.a {

    @NonNull
    public static final Parcelable.Creator<C1393m> CREATOR = new H();

    /* renamed from: a, reason: collision with root package name */
    private final int f8277a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8278b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8279c;

    /* renamed from: d, reason: collision with root package name */
    private final long f8280d;

    /* renamed from: e, reason: collision with root package name */
    private final long f8281e;

    /* renamed from: f, reason: collision with root package name */
    private final String f8282f;

    /* renamed from: g, reason: collision with root package name */
    private final String f8283g;

    /* renamed from: h, reason: collision with root package name */
    private final int f8284h;

    /* renamed from: i, reason: collision with root package name */
    private final int f8285i;

    public C1393m(int i8, int i9, int i10, long j8, long j9, String str, String str2, int i11, int i12) {
        this.f8277a = i8;
        this.f8278b = i9;
        this.f8279c = i10;
        this.f8280d = j8;
        this.f8281e = j9;
        this.f8282f = str;
        this.f8283g = str2;
        this.f8284h = i11;
        this.f8285i = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f8277a;
        int a9 = R.c.a(parcel);
        R.c.k(parcel, 1, i9);
        R.c.k(parcel, 2, this.f8278b);
        R.c.k(parcel, 3, this.f8279c);
        R.c.n(parcel, 4, this.f8280d);
        R.c.n(parcel, 5, this.f8281e);
        R.c.q(parcel, 6, this.f8282f, false);
        R.c.q(parcel, 7, this.f8283g, false);
        R.c.k(parcel, 8, this.f8284h);
        R.c.k(parcel, 9, this.f8285i);
        R.c.b(parcel, a9);
    }
}
