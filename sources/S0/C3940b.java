package s0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: s0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3940b extends R.a {
    public static final Parcelable.Creator<C3940b> CREATOR = new C3941c();

    /* renamed from: a, reason: collision with root package name */
    String f38905a;

    /* renamed from: b, reason: collision with root package name */
    int f38906b;

    /* renamed from: c, reason: collision with root package name */
    boolean f38907c;

    /* renamed from: d, reason: collision with root package name */
    String f38908d;

    /* renamed from: e, reason: collision with root package name */
    String f38909e;

    /* renamed from: f, reason: collision with root package name */
    String f38910f;

    /* renamed from: g, reason: collision with root package name */
    String f38911g;

    /* renamed from: h, reason: collision with root package name */
    String f38912h;

    /* renamed from: i, reason: collision with root package name */
    String f38913i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3940b(String str, int i8, boolean z8, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f38905a = str;
        this.f38906b = i8;
        this.f38907c = z8;
        this.f38908d = str2;
        this.f38909e = str3;
        this.f38910f = str4;
        this.f38911g = str5;
        this.f38912h = str6;
        this.f38913i = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.q(parcel, 1, this.f38905a, false);
        R.c.k(parcel, 2, this.f38906b);
        R.c.c(parcel, 3, this.f38907c);
        R.c.q(parcel, 4, this.f38908d, false);
        R.c.q(parcel, 5, this.f38909e, false);
        R.c.q(parcel, 6, this.f38910f, false);
        R.c.q(parcel, 7, this.f38911g, false);
        R.c.q(parcel, 8, this.f38912h, false);
        R.c.q(parcel, 9, this.f38913i, false);
        R.c.b(parcel, a9);
    }
}
