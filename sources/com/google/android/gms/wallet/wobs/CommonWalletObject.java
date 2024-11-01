package com.google.android.gms.wallet.wobs;

import R.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import java.util.ArrayList;
import u0.f;

@KeepName
/* loaded from: classes3.dex */
public class CommonWalletObject extends R.a {

    @NonNull
    public static final Parcelable.Creator<CommonWalletObject> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    String f18210a;

    /* renamed from: b, reason: collision with root package name */
    String f18211b;

    /* renamed from: c, reason: collision with root package name */
    String f18212c;

    /* renamed from: d, reason: collision with root package name */
    String f18213d;

    /* renamed from: e, reason: collision with root package name */
    String f18214e;

    /* renamed from: f, reason: collision with root package name */
    String f18215f;

    /* renamed from: g, reason: collision with root package name */
    String f18216g;

    /* renamed from: h, reason: collision with root package name */
    String f18217h;

    /* renamed from: i, reason: collision with root package name */
    int f18218i;

    /* renamed from: j, reason: collision with root package name */
    final ArrayList f18219j;

    /* renamed from: k, reason: collision with root package name */
    f f18220k;

    /* renamed from: l, reason: collision with root package name */
    final ArrayList f18221l;

    /* renamed from: m, reason: collision with root package name */
    String f18222m;

    /* renamed from: n, reason: collision with root package name */
    String f18223n;

    /* renamed from: o, reason: collision with root package name */
    final ArrayList f18224o;

    /* renamed from: p, reason: collision with root package name */
    boolean f18225p;

    /* renamed from: q, reason: collision with root package name */
    final ArrayList f18226q;

    /* renamed from: r, reason: collision with root package name */
    final ArrayList f18227r;

    /* renamed from: s, reason: collision with root package name */
    final ArrayList f18228s;

    CommonWalletObject() {
        this.f18219j = V.b.c();
        this.f18221l = V.b.c();
        this.f18224o = V.b.c();
        this.f18226q = V.b.c();
        this.f18227r = V.b.c();
        this.f18228s = V.b.c();
    }

    public static a s() {
        return new a(new CommonWalletObject(), null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a9 = c.a(parcel);
        c.q(parcel, 2, this.f18210a, false);
        c.q(parcel, 3, this.f18211b, false);
        c.q(parcel, 4, this.f18212c, false);
        c.q(parcel, 5, this.f18213d, false);
        c.q(parcel, 6, this.f18214e, false);
        c.q(parcel, 7, this.f18215f, false);
        c.q(parcel, 8, this.f18216g, false);
        c.q(parcel, 9, this.f18217h, false);
        c.k(parcel, 10, this.f18218i);
        c.u(parcel, 11, this.f18219j, false);
        c.p(parcel, 12, this.f18220k, i8, false);
        c.u(parcel, 13, this.f18221l, false);
        c.q(parcel, 14, this.f18222m, false);
        c.q(parcel, 15, this.f18223n, false);
        c.u(parcel, 16, this.f18224o, false);
        c.c(parcel, 17, this.f18225p);
        c.u(parcel, 18, this.f18226q, false);
        c.u(parcel, 19, this.f18227r, false);
        c.u(parcel, 20, this.f18228s, false);
        c.b(parcel, a9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CommonWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i8, ArrayList arrayList, f fVar, ArrayList arrayList2, String str9, String str10, ArrayList arrayList3, boolean z8, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.f18210a = str;
        this.f18211b = str2;
        this.f18212c = str3;
        this.f18213d = str4;
        this.f18214e = str5;
        this.f18215f = str6;
        this.f18216g = str7;
        this.f18217h = str8;
        this.f18218i = i8;
        this.f18219j = arrayList;
        this.f18220k = fVar;
        this.f18221l = arrayList2;
        this.f18222m = str9;
        this.f18223n = str10;
        this.f18224o = arrayList3;
        this.f18225p = z8;
        this.f18226q = arrayList4;
        this.f18227r = arrayList5;
        this.f18228s = arrayList6;
    }
}
