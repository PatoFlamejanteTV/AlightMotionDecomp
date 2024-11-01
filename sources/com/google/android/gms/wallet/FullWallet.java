package com.google.android.gms.wallet;

import R.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import r0.C3854E;
import r0.C3866d;
import r0.C3873k;
import r0.C3884w;

/* loaded from: classes3.dex */
public final class FullWallet extends R.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<FullWallet> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    String f18176a;

    /* renamed from: b, reason: collision with root package name */
    String f18177b;

    /* renamed from: c, reason: collision with root package name */
    C3854E f18178c;

    /* renamed from: d, reason: collision with root package name */
    String f18179d;

    /* renamed from: e, reason: collision with root package name */
    C3884w f18180e;

    /* renamed from: f, reason: collision with root package name */
    C3884w f18181f;

    /* renamed from: g, reason: collision with root package name */
    String[] f18182g;

    /* renamed from: h, reason: collision with root package name */
    UserAddress f18183h;

    /* renamed from: i, reason: collision with root package name */
    UserAddress f18184i;

    /* renamed from: j, reason: collision with root package name */
    C3866d[] f18185j;

    /* renamed from: k, reason: collision with root package name */
    C3873k f18186k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FullWallet(String str, String str2, C3854E c3854e, String str3, C3884w c3884w, C3884w c3884w2, String[] strArr, UserAddress userAddress, UserAddress userAddress2, C3866d[] c3866dArr, C3873k c3873k) {
        this.f18176a = str;
        this.f18177b = str2;
        this.f18178c = c3854e;
        this.f18179d = str3;
        this.f18180e = c3884w;
        this.f18181f = c3884w2;
        this.f18182g = strArr;
        this.f18183h = userAddress;
        this.f18184i = userAddress2;
        this.f18185j = c3866dArr;
        this.f18186k = c3873k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a9 = c.a(parcel);
        c.q(parcel, 2, this.f18176a, false);
        c.q(parcel, 3, this.f18177b, false);
        c.p(parcel, 4, this.f18178c, i8, false);
        c.q(parcel, 5, this.f18179d, false);
        c.p(parcel, 6, this.f18180e, i8, false);
        c.p(parcel, 7, this.f18181f, i8, false);
        c.r(parcel, 8, this.f18182g, false);
        c.p(parcel, 9, this.f18183h, i8, false);
        c.p(parcel, 10, this.f18184i, i8, false);
        c.t(parcel, 11, this.f18185j, i8, false);
        c.p(parcel, 12, this.f18186k, i8, false);
        c.b(parcel, a9);
    }
}
