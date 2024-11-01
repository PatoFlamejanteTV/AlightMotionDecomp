package com.google.android.gms.wallet;

import R.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import r0.C3866d;
import r0.C3868f;
import r0.C3869g;
import r0.C3884w;

/* loaded from: classes3.dex */
public final class MaskedWallet extends R.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    String f18187a;

    /* renamed from: b, reason: collision with root package name */
    String f18188b;

    /* renamed from: c, reason: collision with root package name */
    String[] f18189c;

    /* renamed from: d, reason: collision with root package name */
    String f18190d;

    /* renamed from: e, reason: collision with root package name */
    C3884w f18191e;

    /* renamed from: f, reason: collision with root package name */
    C3884w f18192f;

    /* renamed from: g, reason: collision with root package name */
    C3868f[] f18193g;

    /* renamed from: h, reason: collision with root package name */
    C3869g[] f18194h;

    /* renamed from: i, reason: collision with root package name */
    UserAddress f18195i;

    /* renamed from: j, reason: collision with root package name */
    UserAddress f18196j;

    /* renamed from: k, reason: collision with root package name */
    C3866d[] f18197k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MaskedWallet(String str, String str2, String[] strArr, String str3, C3884w c3884w, C3884w c3884w2, C3868f[] c3868fArr, C3869g[] c3869gArr, UserAddress userAddress, UserAddress userAddress2, C3866d[] c3866dArr) {
        this.f18187a = str;
        this.f18188b = str2;
        this.f18189c = strArr;
        this.f18190d = str3;
        this.f18191e = c3884w;
        this.f18192f = c3884w2;
        this.f18193g = c3868fArr;
        this.f18194h = c3869gArr;
        this.f18195i = userAddress;
        this.f18196j = userAddress2;
        this.f18197k = c3866dArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a9 = c.a(parcel);
        c.q(parcel, 2, this.f18187a, false);
        c.q(parcel, 3, this.f18188b, false);
        c.r(parcel, 4, this.f18189c, false);
        c.q(parcel, 5, this.f18190d, false);
        c.p(parcel, 6, this.f18191e, i8, false);
        c.p(parcel, 7, this.f18192f, i8, false);
        c.t(parcel, 8, this.f18193g, i8, false);
        c.t(parcel, 9, this.f18194h, i8, false);
        c.p(parcel, 10, this.f18195i, i8, false);
        c.p(parcel, 11, this.f18196j, i8, false);
        c.t(parcel, 12, this.f18197k, i8, false);
        c.b(parcel, a9);
    }
}
