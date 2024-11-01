package com.google.android.gms.auth.api.signin;

import Q.AbstractC1396p;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes3.dex */
public class SignInAccount extends R.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInAccount> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    final String f16041a;

    /* renamed from: b, reason: collision with root package name */
    private final GoogleSignInAccount f16042b;

    /* renamed from: c, reason: collision with root package name */
    final String f16043c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f16042b = googleSignInAccount;
        this.f16041a = AbstractC1396p.g(str, "8.3 and 8.4 SDKs require non-null email");
        this.f16043c = AbstractC1396p.g(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final GoogleSignInAccount s() {
        return this.f16042b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f16041a;
        int a9 = R.c.a(parcel);
        R.c.q(parcel, 4, str, false);
        R.c.p(parcel, 7, this.f16042b, i8, false);
        R.c.q(parcel, 8, this.f16043c, false);
        R.c.b(parcel, a9);
    }
}
