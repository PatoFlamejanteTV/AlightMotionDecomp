package r0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* renamed from: r0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3868f extends R.a {

    @NonNull
    public static final Parcelable.Creator<C3868f> CREATOR = new U();

    /* renamed from: a, reason: collision with root package name */
    String f37703a;

    /* renamed from: b, reason: collision with root package name */
    String f37704b;

    /* renamed from: c, reason: collision with root package name */
    String f37705c;

    /* renamed from: d, reason: collision with root package name */
    String f37706d;

    /* renamed from: e, reason: collision with root package name */
    String f37707e;

    /* renamed from: f, reason: collision with root package name */
    String f37708f;

    /* renamed from: g, reason: collision with root package name */
    String f37709g;

    /* renamed from: h, reason: collision with root package name */
    String f37710h;

    /* renamed from: i, reason: collision with root package name */
    String f37711i;

    /* renamed from: j, reason: collision with root package name */
    String f37712j;

    /* renamed from: k, reason: collision with root package name */
    int f37713k;

    /* renamed from: l, reason: collision with root package name */
    final ArrayList f37714l;

    /* renamed from: m, reason: collision with root package name */
    u0.f f37715m;

    /* renamed from: n, reason: collision with root package name */
    final ArrayList f37716n;

    /* renamed from: o, reason: collision with root package name */
    String f37717o;

    /* renamed from: p, reason: collision with root package name */
    String f37718p;

    /* renamed from: q, reason: collision with root package name */
    final ArrayList f37719q;

    /* renamed from: r, reason: collision with root package name */
    boolean f37720r;

    /* renamed from: s, reason: collision with root package name */
    final ArrayList f37721s;

    /* renamed from: t, reason: collision with root package name */
    final ArrayList f37722t;

    /* renamed from: u, reason: collision with root package name */
    final ArrayList f37723u;

    /* renamed from: v, reason: collision with root package name */
    u0.c f37724v;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3868f(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i8, ArrayList arrayList, u0.f fVar, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z8, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, u0.c cVar) {
        this.f37703a = str;
        this.f37704b = str2;
        this.f37705c = str3;
        this.f37706d = str4;
        this.f37707e = str5;
        this.f37708f = str6;
        this.f37709g = str7;
        this.f37710h = str8;
        this.f37711i = str9;
        this.f37712j = str10;
        this.f37713k = i8;
        this.f37714l = arrayList;
        this.f37715m = fVar;
        this.f37716n = arrayList2;
        this.f37717o = str11;
        this.f37718p = str12;
        this.f37719q = arrayList3;
        this.f37720r = z8;
        this.f37721s = arrayList4;
        this.f37722t = arrayList5;
        this.f37723u = arrayList6;
        this.f37724v = cVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.q(parcel, 2, this.f37703a, false);
        R.c.q(parcel, 3, this.f37704b, false);
        R.c.q(parcel, 4, this.f37705c, false);
        R.c.q(parcel, 5, this.f37706d, false);
        R.c.q(parcel, 6, this.f37707e, false);
        R.c.q(parcel, 7, this.f37708f, false);
        R.c.q(parcel, 8, this.f37709g, false);
        R.c.q(parcel, 9, this.f37710h, false);
        R.c.q(parcel, 10, this.f37711i, false);
        R.c.q(parcel, 11, this.f37712j, false);
        R.c.k(parcel, 12, this.f37713k);
        R.c.u(parcel, 13, this.f37714l, false);
        R.c.p(parcel, 14, this.f37715m, i8, false);
        R.c.u(parcel, 15, this.f37716n, false);
        R.c.q(parcel, 16, this.f37717o, false);
        R.c.q(parcel, 17, this.f37718p, false);
        R.c.u(parcel, 18, this.f37719q, false);
        R.c.c(parcel, 19, this.f37720r);
        R.c.u(parcel, 20, this.f37721s, false);
        R.c.u(parcel, 21, this.f37722t, false);
        R.c.u(parcel, 22, this.f37723u, false);
        R.c.p(parcel, 23, this.f37724v, i8, false);
        R.c.b(parcel, a9);
    }
}
