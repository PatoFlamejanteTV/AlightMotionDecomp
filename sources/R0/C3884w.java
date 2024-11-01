package r0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r0.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3884w extends R.a {
    public static final Parcelable.Creator<C3884w> CREATOR = new C3862M();

    /* renamed from: a, reason: collision with root package name */
    String f37786a;

    /* renamed from: b, reason: collision with root package name */
    String f37787b;

    /* renamed from: c, reason: collision with root package name */
    String f37788c;

    /* renamed from: d, reason: collision with root package name */
    String f37789d;

    /* renamed from: e, reason: collision with root package name */
    String f37790e;

    /* renamed from: f, reason: collision with root package name */
    String f37791f;

    /* renamed from: g, reason: collision with root package name */
    String f37792g;

    /* renamed from: h, reason: collision with root package name */
    String f37793h;

    /* renamed from: i, reason: collision with root package name */
    String f37794i;

    /* renamed from: j, reason: collision with root package name */
    boolean f37795j;

    /* renamed from: k, reason: collision with root package name */
    String f37796k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3884w(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z8, String str10) {
        this.f37786a = str;
        this.f37787b = str2;
        this.f37788c = str3;
        this.f37789d = str4;
        this.f37790e = str5;
        this.f37791f = str6;
        this.f37792g = str7;
        this.f37793h = str8;
        this.f37794i = str9;
        this.f37795j = z8;
        this.f37796k = str10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.q(parcel, 2, this.f37786a, false);
        R.c.q(parcel, 3, this.f37787b, false);
        R.c.q(parcel, 4, this.f37788c, false);
        R.c.q(parcel, 5, this.f37789d, false);
        R.c.q(parcel, 6, this.f37790e, false);
        R.c.q(parcel, 7, this.f37791f, false);
        R.c.q(parcel, 8, this.f37792g, false);
        R.c.q(parcel, 9, this.f37793h, false);
        R.c.q(parcel, 10, this.f37794i, false);
        R.c.c(parcel, 11, this.f37795j);
        R.c.q(parcel, 12, this.f37796k, false);
        R.c.b(parcel, a9);
    }
}
