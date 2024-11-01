package com.google.android.gms.auth.api.signin.internal;

import K.b;
import K.w;
import Q.AbstractC1396p;
import R.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes3.dex */
public final class SignInConfiguration extends R.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new w();

    /* renamed from: a, reason: collision with root package name */
    private final String f16046a;

    /* renamed from: b, reason: collision with root package name */
    private final GoogleSignInOptions f16047b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f16046a = AbstractC1396p.f(str);
        this.f16047b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f16046a.equals(signInConfiguration.f16046a)) {
            GoogleSignInOptions googleSignInOptions = this.f16047b;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f16047b;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(googleSignInOptions2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new b().a(this.f16046a).a(this.f16047b).b();
    }

    public final GoogleSignInOptions s() {
        return this.f16047b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f16046a;
        int a9 = c.a(parcel);
        c.q(parcel, 2, str, false);
        c.p(parcel, 5, this.f16047b, i8, false);
        c.b(parcel, a9);
    }
}
