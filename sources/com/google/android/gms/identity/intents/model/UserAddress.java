package com.google.android.gms.identity.intents.model;

import R.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes3.dex */
public final class UserAddress extends R.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<UserAddress> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    String f16204a;

    /* renamed from: b, reason: collision with root package name */
    String f16205b;

    /* renamed from: c, reason: collision with root package name */
    String f16206c;

    /* renamed from: d, reason: collision with root package name */
    String f16207d;

    /* renamed from: e, reason: collision with root package name */
    String f16208e;

    /* renamed from: f, reason: collision with root package name */
    String f16209f;

    /* renamed from: g, reason: collision with root package name */
    String f16210g;

    /* renamed from: h, reason: collision with root package name */
    String f16211h;

    /* renamed from: i, reason: collision with root package name */
    String f16212i;

    /* renamed from: j, reason: collision with root package name */
    String f16213j;

    /* renamed from: k, reason: collision with root package name */
    String f16214k;

    /* renamed from: l, reason: collision with root package name */
    String f16215l;

    /* renamed from: m, reason: collision with root package name */
    boolean f16216m;

    /* renamed from: n, reason: collision with root package name */
    String f16217n;

    /* renamed from: o, reason: collision with root package name */
    String f16218o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z8, String str13, String str14) {
        this.f16204a = str;
        this.f16205b = str2;
        this.f16206c = str3;
        this.f16207d = str4;
        this.f16208e = str5;
        this.f16209f = str6;
        this.f16210g = str7;
        this.f16211h = str8;
        this.f16212i = str9;
        this.f16213j = str10;
        this.f16214k = str11;
        this.f16215l = str12;
        this.f16216m = z8;
        this.f16217n = str13;
        this.f16218o = str14;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a9 = c.a(parcel);
        c.q(parcel, 2, this.f16204a, false);
        c.q(parcel, 3, this.f16205b, false);
        c.q(parcel, 4, this.f16206c, false);
        c.q(parcel, 5, this.f16207d, false);
        c.q(parcel, 6, this.f16208e, false);
        c.q(parcel, 7, this.f16209f, false);
        c.q(parcel, 8, this.f16210g, false);
        c.q(parcel, 9, this.f16211h, false);
        c.q(parcel, 10, this.f16212i, false);
        c.q(parcel, 11, this.f16213j, false);
        c.q(parcel, 12, this.f16214k, false);
        c.q(parcel, 13, this.f16215l, false);
        c.c(parcel, 14, this.f16216m);
        c.q(parcel, 15, this.f16217n, false);
        c.q(parcel, 16, this.f16218o, false);
        c.b(parcel, a9);
    }
}
