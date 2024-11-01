package r0;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identity.intents.model.UserAddress;

/* renamed from: r0.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3871i extends R.a {

    @NonNull
    public static final Parcelable.Creator<C3871i> CREATOR = new x();

    /* renamed from: a, reason: collision with root package name */
    String f37730a;

    /* renamed from: b, reason: collision with root package name */
    C3864b f37731b;

    /* renamed from: c, reason: collision with root package name */
    UserAddress f37732c;

    /* renamed from: d, reason: collision with root package name */
    C3873k f37733d;

    /* renamed from: e, reason: collision with root package name */
    String f37734e;

    /* renamed from: f, reason: collision with root package name */
    Bundle f37735f;

    /* renamed from: g, reason: collision with root package name */
    String f37736g;

    /* renamed from: h, reason: collision with root package name */
    Bundle f37737h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3871i(String str, C3864b c3864b, UserAddress userAddress, C3873k c3873k, String str2, Bundle bundle, String str3, Bundle bundle2) {
        this.f37730a = str;
        this.f37731b = c3864b;
        this.f37732c = userAddress;
        this.f37733d = c3873k;
        this.f37734e = str2;
        this.f37735f = bundle;
        this.f37736g = str3;
        this.f37737h = bundle2;
    }

    public static C3871i s(Intent intent) {
        return (C3871i) R.e.b(intent, "com.google.android.gms.wallet.PaymentData", CREATOR);
    }

    public String u() {
        return this.f37736g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a9 = R.c.a(parcel);
        R.c.q(parcel, 1, this.f37730a, false);
        R.c.p(parcel, 2, this.f37731b, i8, false);
        R.c.p(parcel, 3, this.f37732c, i8, false);
        R.c.p(parcel, 4, this.f37733d, i8, false);
        R.c.q(parcel, 5, this.f37734e, false);
        R.c.e(parcel, 6, this.f37735f, false);
        R.c.q(parcel, 7, this.f37736g, false);
        R.c.e(parcel, 8, this.f37737h, false);
        R.c.b(parcel, a9);
    }
}
