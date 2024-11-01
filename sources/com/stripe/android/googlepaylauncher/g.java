package com.stripe.android.googlepaylauncher;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final N2.d f25080a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25081b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25082c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f25083d;

    /* renamed from: e, reason: collision with root package name */
    private f f25084e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f25085f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f25086g;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new g(N2.d.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, f.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g[] newArray(int i8) {
            return new g[i8];
        }
    }

    public g(N2.d environment, String merchantCountryCode, String merchantName, boolean z8, f billingAddressConfig, boolean z9, boolean z10) {
        AbstractC3292y.i(environment, "environment");
        AbstractC3292y.i(merchantCountryCode, "merchantCountryCode");
        AbstractC3292y.i(merchantName, "merchantName");
        AbstractC3292y.i(billingAddressConfig, "billingAddressConfig");
        this.f25080a = environment;
        this.f25081b = merchantCountryCode;
        this.f25082c = merchantName;
        this.f25083d = z8;
        this.f25084e = billingAddressConfig;
        this.f25085f = z9;
        this.f25086g = z10;
    }

    public final boolean a() {
        return this.f25086g;
    }

    public final f b() {
        return this.f25084e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f25080a == gVar.f25080a && AbstractC3292y.d(this.f25081b, gVar.f25081b) && AbstractC3292y.d(this.f25082c, gVar.f25082c) && this.f25083d == gVar.f25083d && AbstractC3292y.d(this.f25084e, gVar.f25084e) && this.f25085f == gVar.f25085f && this.f25086g == gVar.f25086g;
    }

    public final N2.d f() {
        return this.f25080a;
    }

    public final boolean h() {
        return this.f25085f;
    }

    public int hashCode() {
        return (((((((((((this.f25080a.hashCode() * 31) + this.f25081b.hashCode()) * 31) + this.f25082c.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f25083d)) * 31) + this.f25084e.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f25085f)) * 31) + androidx.compose.foundation.a.a(this.f25086g);
    }

    public final String i() {
        return this.f25081b;
    }

    public final String l() {
        return this.f25082c;
    }

    public final boolean p() {
        return this.f25083d;
    }

    public final boolean s() {
        return l6.n.s(this.f25081b, Locale.JAPAN.getCountry(), true);
    }

    public String toString() {
        return "Config(environment=" + this.f25080a + ", merchantCountryCode=" + this.f25081b + ", merchantName=" + this.f25082c + ", isEmailRequired=" + this.f25083d + ", billingAddressConfig=" + this.f25084e + ", existingPaymentMethodRequired=" + this.f25085f + ", allowCreditCards=" + this.f25086g + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f25080a.name());
        out.writeString(this.f25081b);
        out.writeString(this.f25082c);
        out.writeInt(this.f25083d ? 1 : 0);
        this.f25084e.writeToParcel(out, i8);
        out.writeInt(this.f25085f ? 1 : 0);
        out.writeInt(this.f25086g ? 1 : 0);
    }
}
