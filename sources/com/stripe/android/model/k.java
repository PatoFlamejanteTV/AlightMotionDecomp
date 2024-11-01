package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import g3.C2895E;
import g3.C2901K;
import h3.C2936E;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class k implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final C2901K f25528a;

    /* renamed from: b, reason: collision with root package name */
    private final com.stripe.android.model.a f25529b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25530c;

    /* renamed from: d, reason: collision with root package name */
    private final String f25531d;

    /* renamed from: e, reason: collision with root package name */
    private final String f25532e;

    /* renamed from: f, reason: collision with root package name */
    private final C2895E f25533f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f25526g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f25527h = 8;
    public static final Parcelable.Creator<k> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        private final C2895E a(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("shippingAddress");
            if (optJSONObject != null) {
                String l8 = z2.e.l(optJSONObject, "address1");
                String l9 = z2.e.l(optJSONObject, "address2");
                String l10 = z2.e.l(optJSONObject, HintConstants.AUTOFILL_HINT_POSTAL_CODE);
                return new C2895E(new com.stripe.android.model.a(z2.e.l(optJSONObject, "locality"), z2.e.l(optJSONObject, "countryCode"), l8, l9, l10, z2.e.l(optJSONObject, "administrativeArea")), z2.e.l(optJSONObject, "name"), z2.e.l(optJSONObject, HintConstants.AUTOFILL_HINT_PHONE_NUMBER));
            }
            return null;
        }

        public final k b(JSONObject paymentDataJson) {
            com.stripe.android.model.a aVar;
            AbstractC3292y.i(paymentDataJson, "paymentDataJson");
            JSONObject jSONObject = paymentDataJson.getJSONObject("paymentMethodData");
            C2901K a9 = new C2936E().a(new JSONObject(jSONObject.getJSONObject("tokenizationData").getString("token")));
            JSONObject optJSONObject = jSONObject.getJSONObject("info").optJSONObject("billingAddress");
            if (optJSONObject != null) {
                aVar = new com.stripe.android.model.a(z2.e.l(optJSONObject, "locality"), z2.e.l(optJSONObject, "countryCode"), z2.e.l(optJSONObject, "address1"), z2.e.l(optJSONObject, "address2"), z2.e.l(optJSONObject, HintConstants.AUTOFILL_HINT_POSTAL_CODE), z2.e.l(optJSONObject, "administrativeArea"));
            } else {
                aVar = null;
            }
            return new k(a9, aVar, z2.e.l(optJSONObject, "name"), z2.e.l(paymentDataJson, NotificationCompat.CATEGORY_EMAIL), z2.e.l(optJSONObject, HintConstants.AUTOFILL_HINT_PHONE_NUMBER), a(paymentDataJson));
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new k((C2901K) parcel.readParcelable(k.class.getClassLoader()), parcel.readInt() == 0 ? null : com.stripe.android.model.a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? C2895E.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k[] newArray(int i8) {
            return new k[i8];
        }
    }

    public k(C2901K c2901k, com.stripe.android.model.a aVar, String str, String str2, String str3, C2895E c2895e) {
        this.f25528a = c2901k;
        this.f25529b = aVar;
        this.f25530c = str;
        this.f25531d = str2;
        this.f25532e = str3;
        this.f25533f = c2895e;
    }

    public final com.stripe.android.model.a a() {
        return this.f25529b;
    }

    public final String b() {
        return this.f25531d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return AbstractC3292y.d(this.f25528a, kVar.f25528a) && AbstractC3292y.d(this.f25529b, kVar.f25529b) && AbstractC3292y.d(this.f25530c, kVar.f25530c) && AbstractC3292y.d(this.f25531d, kVar.f25531d) && AbstractC3292y.d(this.f25532e, kVar.f25532e) && AbstractC3292y.d(this.f25533f, kVar.f25533f);
    }

    public final String f() {
        return this.f25530c;
    }

    public final String h() {
        return this.f25532e;
    }

    public int hashCode() {
        C2901K c2901k = this.f25528a;
        int hashCode = (c2901k == null ? 0 : c2901k.hashCode()) * 31;
        com.stripe.android.model.a aVar = this.f25529b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f25530c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25531d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25532e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C2895E c2895e = this.f25533f;
        return hashCode5 + (c2895e != null ? c2895e.hashCode() : 0);
    }

    public final C2901K i() {
        return this.f25528a;
    }

    public String toString() {
        return "GooglePayResult(token=" + this.f25528a + ", address=" + this.f25529b + ", name=" + this.f25530c + ", email=" + this.f25531d + ", phoneNumber=" + this.f25532e + ", shippingInformation=" + this.f25533f + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeParcelable(this.f25528a, i8);
        com.stripe.android.model.a aVar = this.f25529b;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            aVar.writeToParcel(out, i8);
        }
        out.writeString(this.f25530c);
        out.writeString(this.f25531d);
        out.writeString(this.f25532e);
        C2895E c2895e = this.f25533f;
        if (c2895e == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c2895e.writeToParcel(out, i8);
        }
    }
}
