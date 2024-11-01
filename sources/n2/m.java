package n2;

import R5.AbstractC1435t;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.googlepaylauncher.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    private static final b f35354c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final List f35355d = AbstractC1435t.p("PAN_ONLY", "CRYPTOGRAM_3DS");

    /* renamed from: e, reason: collision with root package name */
    private static final List f35356e = AbstractC1435t.p("AMEX", "DISCOVER", "MASTERCARD", "VISA");

    /* renamed from: a, reason: collision with root package name */
    private final C3409l f35357a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f35358b;

    /* loaded from: classes4.dex */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f35368a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new c(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(String str) {
            this.f35368a = str;
        }

        public final String a() {
            return this.f35368a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3292y.d(this.f35368a, ((c) obj).f35368a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f35368a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "MerchantInfo(merchantName=" + this.f35368a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f35368a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final boolean f35369a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f35370b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f35371c;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                boolean z8;
                AbstractC3292y.i(parcel, "parcel");
                boolean z9 = false;
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    linkedHashSet.add(parcel.readString());
                }
                if (parcel.readInt() != 0) {
                    z9 = true;
                }
                return new d(z8, linkedHashSet, z9);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(boolean z8, Set allowedCountryCodes, boolean z9) {
            AbstractC3292y.i(allowedCountryCodes, "allowedCountryCodes");
            this.f35369a = z8;
            this.f35370b = allowedCountryCodes;
            this.f35371c = z9;
            String[] iSOCountries = Locale.getISOCountries();
            for (String str : a()) {
                AbstractC3292y.f(iSOCountries);
                for (String str2 : iSOCountries) {
                    if (AbstractC3292y.d(str, str2)) {
                        break;
                    }
                }
                throw new IllegalArgumentException(("'" + str + "' is not a valid country code").toString());
            }
        }

        public final Set a() {
            Set set = this.f35370b;
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String upperCase = ((String) it.next()).toUpperCase(Locale.ROOT);
                AbstractC3292y.h(upperCase, "toUpperCase(...)");
                arrayList.add(upperCase);
            }
            return AbstractC1435t.b1(arrayList);
        }

        public final boolean b() {
            return this.f35371c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f35369a == dVar.f35369a && AbstractC3292y.d(this.f35370b, dVar.f35370b) && this.f35371c == dVar.f35371c) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            return this.f35369a;
        }

        public int hashCode() {
            return (((androidx.compose.foundation.a.a(this.f35369a) * 31) + this.f35370b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f35371c);
        }

        public String toString() {
            return "ShippingAddressParameters(isRequired=" + this.f35369a + ", allowedCountryCodes=" + this.f35370b + ", phoneNumberRequired=" + this.f35371c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeInt(this.f35369a ? 1 : 0);
            Set set = this.f35370b;
            out.writeInt(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                out.writeString((String) it.next());
            }
            out.writeInt(this.f35371c ? 1 : 0);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        private final String f35372a;

        /* renamed from: b, reason: collision with root package name */
        private final c f35373b;

        /* renamed from: c, reason: collision with root package name */
        private final String f35374c;

        /* renamed from: d, reason: collision with root package name */
        private final String f35375d;

        /* renamed from: e, reason: collision with root package name */
        private final Long f35376e;

        /* renamed from: f, reason: collision with root package name */
        private final String f35377f;

        /* renamed from: g, reason: collision with root package name */
        private final a f35378g;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: b, reason: collision with root package name */
            public static final a f35379b = new a("Default", 0, "DEFAULT");

            /* renamed from: c, reason: collision with root package name */
            public static final a f35380c = new a("CompleteImmediatePurchase", 1, "COMPLETE_IMMEDIATE_PURCHASE");

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ a[] f35381d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ W5.a f35382e;

            /* renamed from: a, reason: collision with root package name */
            private final String f35383a;

            static {
                a[] a9 = a();
                f35381d = a9;
                f35382e = W5.b.a(a9);
            }

            private a(String str, int i8, String str2) {
                this.f35383a = str2;
            }

            private static final /* synthetic */ a[] a() {
                return new a[]{f35379b, f35380c};
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) f35381d.clone();
            }

            public final String b() {
                return this.f35383a;
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                Long valueOf;
                a valueOf2;
                AbstractC3292y.i(parcel, "parcel");
                String readString = parcel.readString();
                c valueOf3 = c.valueOf(parcel.readString());
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(parcel.readLong());
                }
                String readString4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = a.valueOf(parcel.readString());
                }
                return new e(readString, valueOf3, readString2, readString3, valueOf, readString4, valueOf2);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class c {

            /* renamed from: b, reason: collision with root package name */
            public static final c f35384b = new c("NotCurrentlyKnown", 0, "NOT_CURRENTLY_KNOWN");

            /* renamed from: c, reason: collision with root package name */
            public static final c f35385c = new c("Estimated", 1, "ESTIMATED");

            /* renamed from: d, reason: collision with root package name */
            public static final c f35386d = new c("Final", 2, "FINAL");

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ c[] f35387e;

            /* renamed from: f, reason: collision with root package name */
            private static final /* synthetic */ W5.a f35388f;

            /* renamed from: a, reason: collision with root package name */
            private final String f35389a;

            static {
                c[] a9 = a();
                f35387e = a9;
                f35388f = W5.b.a(a9);
            }

            private c(String str, int i8, String str2) {
                this.f35389a = str2;
            }

            private static final /* synthetic */ c[] a() {
                return new c[]{f35384b, f35385c, f35386d};
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) f35387e.clone();
            }

            public final String b() {
                return this.f35389a;
            }
        }

        public e(String currencyCode, c totalPriceStatus, String str, String str2, Long l8, String str3, a aVar) {
            AbstractC3292y.i(currencyCode, "currencyCode");
            AbstractC3292y.i(totalPriceStatus, "totalPriceStatus");
            this.f35372a = currencyCode;
            this.f35373b = totalPriceStatus;
            this.f35374c = str;
            this.f35375d = str2;
            this.f35376e = l8;
            this.f35377f = str3;
            this.f35378g = aVar;
        }

        public final a a() {
            return this.f35378g;
        }

        public final String b() {
            return this.f35374c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (AbstractC3292y.d(this.f35372a, eVar.f35372a) && this.f35373b == eVar.f35373b && AbstractC3292y.d(this.f35374c, eVar.f35374c) && AbstractC3292y.d(this.f35375d, eVar.f35375d) && AbstractC3292y.d(this.f35376e, eVar.f35376e) && AbstractC3292y.d(this.f35377f, eVar.f35377f) && this.f35378g == eVar.f35378g) {
                return true;
            }
            return false;
        }

        public final String f() {
            return this.f35372a;
        }

        public final Long h() {
            return this.f35376e;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5 = ((this.f35372a.hashCode() * 31) + this.f35373b.hashCode()) * 31;
            String str = this.f35374c;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = (hashCode5 + hashCode) * 31;
            String str2 = this.f35375d;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            Long l8 = this.f35376e;
            if (l8 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = l8.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            String str3 = this.f35377f;
            if (str3 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str3.hashCode();
            }
            int i12 = (i11 + hashCode4) * 31;
            a aVar = this.f35378g;
            if (aVar != null) {
                i8 = aVar.hashCode();
            }
            return i12 + i8;
        }

        public final String i() {
            return this.f35377f;
        }

        public final c l() {
            return this.f35373b;
        }

        public final String p() {
            return this.f35375d;
        }

        public String toString() {
            return "TransactionInfo(currencyCode=" + this.f35372a + ", totalPriceStatus=" + this.f35373b + ", countryCode=" + this.f35374c + ", transactionId=" + this.f35375d + ", totalPrice=" + this.f35376e + ", totalPriceLabel=" + this.f35377f + ", checkoutOption=" + this.f35378g + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f35372a);
            out.writeString(this.f35373b.name());
            out.writeString(this.f35374c);
            out.writeString(this.f35375d);
            Long l8 = this.f35376e;
            if (l8 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeLong(l8.longValue());
            }
            out.writeString(this.f35377f);
            a aVar = this.f35378g;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(aVar.name());
            }
        }
    }

    public m(C3409l googlePayConfig, boolean z8) {
        AbstractC3292y.i(googlePayConfig, "googlePayConfig");
        this.f35357a = googlePayConfig;
        this.f35358b = z8;
    }

    private final JSONObject a() {
        JSONObject put = new JSONObject().put("allowedAuthMethods", new JSONArray((Collection) f35355d));
        List list = f35356e;
        List e8 = AbstractC1435t.e("JCB");
        if (!this.f35358b) {
            e8 = null;
        }
        if (e8 == null) {
            e8 = AbstractC1435t.m();
        }
        JSONObject put2 = put.put("allowedCardNetworks", new JSONArray((Collection) AbstractC1435t.G0(list, e8)));
        AbstractC3292y.h(put2, "put(...)");
        return put2;
    }

    public static /* synthetic */ JSONObject e(m mVar, e eVar, a aVar, d dVar, boolean z8, c cVar, Boolean bool, int i8, Object obj) {
        a aVar2;
        d dVar2;
        boolean z9;
        c cVar2;
        Boolean bool2 = null;
        if ((i8 & 2) != 0) {
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        if ((i8 & 4) != 0) {
            dVar2 = null;
        } else {
            dVar2 = dVar;
        }
        if ((i8 & 8) != 0) {
            z9 = false;
        } else {
            z9 = z8;
        }
        if ((i8 & 16) != 0) {
            cVar2 = null;
        } else {
            cVar2 = cVar;
        }
        if ((i8 & 32) == 0) {
            bool2 = bool;
        }
        return mVar.d(eVar, aVar2, dVar2, z9, cVar2, bool2);
    }

    private final JSONObject f(d dVar) {
        JSONObject put = new JSONObject().put("allowedCountryCodes", new JSONArray((Collection) dVar.a())).put("phoneNumberRequired", dVar.b());
        AbstractC3292y.h(put, "put(...)");
        return put;
    }

    private final JSONObject g(e eVar) {
        JSONObject jSONObject = new JSONObject();
        String f8 = eVar.f();
        Locale locale = Locale.ROOT;
        String upperCase = f8.toUpperCase(locale);
        AbstractC3292y.h(upperCase, "toUpperCase(...)");
        JSONObject put = jSONObject.put("currencyCode", upperCase).put("totalPriceStatus", eVar.l().b());
        String b9 = eVar.b();
        if (b9 != null) {
            String upperCase2 = b9.toUpperCase(locale);
            AbstractC3292y.h(upperCase2, "toUpperCase(...)");
            put.put("countryCode", upperCase2);
        }
        String p8 = eVar.p();
        if (p8 != null) {
            put.put("transactionId", p8);
        }
        Long h8 = eVar.h();
        if (h8 != null) {
            long longValue = h8.longValue();
            String upperCase3 = eVar.f().toUpperCase(locale);
            AbstractC3292y.h(upperCase3, "toUpperCase(...)");
            Currency currency = Currency.getInstance(upperCase3);
            AbstractC3292y.h(currency, "getInstance(...)");
            put.put("totalPrice", o.a(longValue, currency));
        }
        String i8 = eVar.i();
        if (i8 != null) {
            put.put("totalPriceLabel", i8);
        }
        e.a a9 = eVar.a();
        if (a9 != null) {
            put.put("checkoutOption", a9.b());
        }
        AbstractC3292y.h(put, "apply(...)");
        return put;
    }

    public final JSONObject b(a aVar, Boolean bool) {
        JSONObject a9 = a();
        if (aVar != null && aVar.f()) {
            a9.put("billingAddressRequired", true);
            a9.put("billingAddressParameters", new JSONObject().put("phoneNumberRequired", aVar.b()).put("format", aVar.a().b()));
        }
        if (bool != null) {
            a9.put("allowCreditCards", bool.booleanValue());
        }
        JSONObject put = new JSONObject().put("type", "CARD").put("parameters", a9).put("tokenizationSpecification", this.f35357a.b());
        AbstractC3292y.h(put, "put(...)");
        return put;
    }

    public final JSONObject c(a aVar, Boolean bool, Boolean bool2) {
        JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0).put("allowedPaymentMethods", new JSONArray().put(b(aVar, bool2)));
        if (bool != null) {
            put.put("existingPaymentMethodRequired", bool.booleanValue());
        }
        AbstractC3292y.h(put, "apply(...)");
        return put;
    }

    public final JSONObject d(e transactionInfo, a aVar, d dVar, boolean z8, c cVar, Boolean bool) {
        String a9;
        AbstractC3292y.i(transactionInfo, "transactionInfo");
        JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0).put("allowedPaymentMethods", new JSONArray().put(b(aVar, bool))).put("transactionInfo", g(transactionInfo)).put("emailRequired", z8);
        if (dVar != null && dVar.f()) {
            put.put("shippingAddressRequired", true);
            put.put("shippingAddressParameters", f(dVar));
        }
        if (cVar != null && (a9 = cVar.a()) != null && a9.length() != 0) {
            put.put("merchantInfo", new JSONObject().put("merchantName", cVar.a()));
        }
        AbstractC3292y.h(put, "apply(...)");
        return put;
    }

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0807a();

        /* renamed from: d, reason: collision with root package name */
        public static final int f35359d = 0;

        /* renamed from: a, reason: collision with root package name */
        private final boolean f35360a;

        /* renamed from: b, reason: collision with root package name */
        private final b f35361b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f35362c;

        /* renamed from: n2.m$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0807a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                boolean z8;
                AbstractC3292y.i(parcel, "parcel");
                boolean z9 = false;
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                b valueOf = b.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    z9 = true;
                }
                return new a(z8, valueOf, z9);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class b {

            /* renamed from: b, reason: collision with root package name */
            public static final b f35363b = new b("Min", 0, "MIN");

            /* renamed from: c, reason: collision with root package name */
            public static final b f35364c = new b("Full", 1, "FULL");

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ b[] f35365d;

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ W5.a f35366e;

            /* renamed from: a, reason: collision with root package name */
            private final String f35367a;

            static {
                b[] a9 = a();
                f35365d = a9;
                f35366e = W5.b.a(a9);
            }

            private b(String str, int i8, String str2) {
                this.f35367a = str2;
            }

            private static final /* synthetic */ b[] a() {
                return new b[]{f35363b, f35364c};
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) f35365d.clone();
            }

            public final String b() {
                return this.f35367a;
            }
        }

        public a(boolean z8, b format, boolean z9) {
            AbstractC3292y.i(format, "format");
            this.f35360a = z8;
            this.f35361b = format;
            this.f35362c = z9;
        }

        public final b a() {
            return this.f35361b;
        }

        public final boolean b() {
            return this.f35362c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f35360a == aVar.f35360a && this.f35361b == aVar.f35361b && this.f35362c == aVar.f35362c) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            return this.f35360a;
        }

        public int hashCode() {
            return (((androidx.compose.foundation.a.a(this.f35360a) * 31) + this.f35361b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f35362c);
        }

        public String toString() {
            return "BillingAddressParameters(isRequired=" + this.f35360a + ", format=" + this.f35361b + ", isPhoneNumberRequired=" + this.f35362c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeInt(this.f35360a ? 1 : 0);
            out.writeString(this.f35361b.name());
            out.writeInt(this.f35362c ? 1 : 0);
        }

        public /* synthetic */ a(boolean z8, b bVar, boolean z9, int i8, AbstractC3284p abstractC3284p) {
            this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? b.f35363b : bVar, (i8 & 4) != 0 ? false : z9);
        }
    }

    public /* synthetic */ m(Context context, boolean z8, int i8, AbstractC3284p abstractC3284p) {
        this(context, (i8 & 2) != 0 ? false : z8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(Context context, boolean z8) {
        this(new C3409l(context), z8);
        AbstractC3292y.i(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(Function0 publishableKeyProvider, Function0 stripeAccountIdProvider, j.d googlePayConfig) {
        this(new C3409l((String) publishableKeyProvider.invoke(), (String) stripeAccountIdProvider.invoke()), googlePayConfig.s());
        AbstractC3292y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3292y.i(stripeAccountIdProvider, "stripeAccountIdProvider");
        AbstractC3292y.i(googlePayConfig, "googlePayConfig");
    }
}
