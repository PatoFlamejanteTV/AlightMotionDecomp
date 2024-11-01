package com.stripe.android.paymentsheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.o;
import com.stripe.android.paymentsheet.w;
import kotlin.jvm.internal.AbstractC3292y;
import w3.C4154a;

/* loaded from: classes4.dex */
public interface n extends Parcelable {

    /* loaded from: classes4.dex */
    public static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        private final w.l f27365a;

        /* renamed from: b, reason: collision with root package name */
        private final C4154a f27366b;

        /* renamed from: c, reason: collision with root package name */
        private final com.stripe.android.model.p f27367c;

        /* renamed from: d, reason: collision with root package name */
        private final com.stripe.android.model.r f27368d;

        /* renamed from: e, reason: collision with root package name */
        private final w.b f27369e;

        /* renamed from: f, reason: collision with root package name */
        public static final int f27364f = com.stripe.android.model.r.f25879b | com.stripe.android.model.p.f25805v;
        public static final Parcelable.Creator<a> CREATOR = new C0612a();

        /* renamed from: com.stripe.android.paymentsheet.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0612a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new a((w.l) parcel.readParcelable(a.class.getClassLoader()), parcel.readInt() == 0 ? null : C4154a.CREATOR.createFromParcel(parcel), (com.stripe.android.model.p) parcel.readParcelable(a.class.getClassLoader()), (com.stripe.android.model.r) parcel.readParcelable(a.class.getClassLoader()), w.b.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(w.l initializationMode, C4154a c4154a, com.stripe.android.model.p createParams, com.stripe.android.model.r rVar, w.b appearance) {
            AbstractC3292y.i(initializationMode, "initializationMode");
            AbstractC3292y.i(createParams, "createParams");
            AbstractC3292y.i(appearance, "appearance");
            this.f27365a = initializationMode;
            this.f27366b = c4154a;
            this.f27367c = createParams;
            this.f27368d = rVar;
            this.f27369e = appearance;
        }

        public final w.l D() {
            return this.f27365a;
        }

        public final w.b a() {
            return this.f27369e;
        }

        public final com.stripe.android.model.p b() {
            return this.f27367c;
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
            return AbstractC3292y.d(this.f27365a, aVar.f27365a) && AbstractC3292y.d(this.f27366b, aVar.f27366b) && AbstractC3292y.d(this.f27367c, aVar.f27367c) && AbstractC3292y.d(this.f27368d, aVar.f27368d) && AbstractC3292y.d(this.f27369e, aVar.f27369e);
        }

        public int hashCode() {
            int hashCode = this.f27365a.hashCode() * 31;
            C4154a c4154a = this.f27366b;
            int hashCode2 = (((hashCode + (c4154a == null ? 0 : c4154a.hashCode())) * 31) + this.f27367c.hashCode()) * 31;
            com.stripe.android.model.r rVar = this.f27368d;
            return ((hashCode2 + (rVar != null ? rVar.hashCode() : 0)) * 31) + this.f27369e.hashCode();
        }

        public final C4154a q() {
            return this.f27366b;
        }

        public String toString() {
            return "BacsPaymentMethod(initializationMode=" + this.f27365a + ", shippingDetails=" + this.f27366b + ", createParams=" + this.f27367c + ", optionsParams=" + this.f27368d + ", appearance=" + this.f27369e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeParcelable(this.f27365a, i8);
            C4154a c4154a = this.f27366b;
            if (c4154a == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                c4154a.writeToParcel(out, i8);
            }
            out.writeParcelable(this.f27367c, i8);
            out.writeParcelable(this.f27368d, i8);
            this.f27369e.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        private final String f27371a;

        /* renamed from: b, reason: collision with root package name */
        private final o.e f27372b;

        /* renamed from: c, reason: collision with root package name */
        public static final int f27370c = o.e.f25670f;
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new b(parcel.readString(), (o.e) parcel.readParcelable(b.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(String type, o.e eVar) {
            AbstractC3292y.i(type, "type");
            this.f27371a = type;
            this.f27372b = eVar;
        }

        public final o.e a() {
            return this.f27372b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3292y.d(this.f27371a, bVar.f27371a) && AbstractC3292y.d(this.f27372b, bVar.f27372b);
        }

        public final String getType() {
            return this.f27371a;
        }

        public int hashCode() {
            int hashCode = this.f27371a.hashCode() * 31;
            o.e eVar = this.f27372b;
            return hashCode + (eVar == null ? 0 : eVar.hashCode());
        }

        public String toString() {
            return "ExternalPaymentMethod(type=" + this.f27371a + ", billingDetails=" + this.f27372b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f27371a);
            out.writeParcelable(this.f27372b, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements n {
        public static final Parcelable.Creator<c> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        private final w.l f27373a;

        /* renamed from: b, reason: collision with root package name */
        private final C4154a f27374b;

        /* renamed from: c, reason: collision with root package name */
        private final a f27375c;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0613a();

            /* renamed from: a, reason: collision with root package name */
            private final w.k.c f27376a;

            /* renamed from: b, reason: collision with root package name */
            private final String f27377b;

            /* renamed from: c, reason: collision with root package name */
            private final String f27378c;

            /* renamed from: d, reason: collision with root package name */
            private final String f27379d;

            /* renamed from: e, reason: collision with root package name */
            private final Long f27380e;

            /* renamed from: f, reason: collision with root package name */
            private final String f27381f;

            /* renamed from: g, reason: collision with root package name */
            private final w.d f27382g;

            /* renamed from: com.stripe.android.paymentsheet.n$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0613a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new a(parcel.readInt() == 0 ? null : w.k.c.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), w.d.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public a(w.k.c cVar, String merchantName, String merchantCountryCode, String str, Long l8, String str2, w.d billingDetailsCollectionConfiguration) {
                AbstractC3292y.i(merchantName, "merchantName");
                AbstractC3292y.i(merchantCountryCode, "merchantCountryCode");
                AbstractC3292y.i(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
                this.f27376a = cVar;
                this.f27377b = merchantName;
                this.f27378c = merchantCountryCode;
                this.f27379d = str;
                this.f27380e = l8;
                this.f27381f = str2;
                this.f27382g = billingDetailsCollectionConfiguration;
            }

            public final w.d a() {
                return this.f27382g;
            }

            public final Long b() {
                return this.f27380e;
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
                return this.f27376a == aVar.f27376a && AbstractC3292y.d(this.f27377b, aVar.f27377b) && AbstractC3292y.d(this.f27378c, aVar.f27378c) && AbstractC3292y.d(this.f27379d, aVar.f27379d) && AbstractC3292y.d(this.f27380e, aVar.f27380e) && AbstractC3292y.d(this.f27381f, aVar.f27381f) && AbstractC3292y.d(this.f27382g, aVar.f27382g);
            }

            public final String f() {
                return this.f27381f;
            }

            public final w.k.c h() {
                return this.f27376a;
            }

            public int hashCode() {
                w.k.c cVar = this.f27376a;
                int hashCode = (((((cVar == null ? 0 : cVar.hashCode()) * 31) + this.f27377b.hashCode()) * 31) + this.f27378c.hashCode()) * 31;
                String str = this.f27379d;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Long l8 = this.f27380e;
                int hashCode3 = (hashCode2 + (l8 == null ? 0 : l8.hashCode())) * 31;
                String str2 = this.f27381f;
                return ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f27382g.hashCode();
            }

            public final String i() {
                return this.f27378c;
            }

            public final String l() {
                return this.f27379d;
            }

            public final String p() {
                return this.f27377b;
            }

            public String toString() {
                return "Config(environment=" + this.f27376a + ", merchantName=" + this.f27377b + ", merchantCountryCode=" + this.f27378c + ", merchantCurrencyCode=" + this.f27379d + ", customAmount=" + this.f27380e + ", customLabel=" + this.f27381f + ", billingDetailsCollectionConfiguration=" + this.f27382g + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                w.k.c cVar = this.f27376a;
                if (cVar == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeString(cVar.name());
                }
                out.writeString(this.f27377b);
                out.writeString(this.f27378c);
                out.writeString(this.f27379d);
                Long l8 = this.f27380e;
                if (l8 == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeLong(l8.longValue());
                }
                out.writeString(this.f27381f);
                this.f27382g.writeToParcel(out, i8);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new c((w.l) parcel.readParcelable(c.class.getClassLoader()), parcel.readInt() == 0 ? null : C4154a.CREATOR.createFromParcel(parcel), a.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(w.l initializationMode, C4154a c4154a, a config) {
            AbstractC3292y.i(initializationMode, "initializationMode");
            AbstractC3292y.i(config, "config");
            this.f27373a = initializationMode;
            this.f27374b = c4154a;
            this.f27375c = config;
        }

        public final w.l D() {
            return this.f27373a;
        }

        public final a a() {
            return this.f27375c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC3292y.d(this.f27373a, cVar.f27373a) && AbstractC3292y.d(this.f27374b, cVar.f27374b) && AbstractC3292y.d(this.f27375c, cVar.f27375c);
        }

        public int hashCode() {
            int hashCode = this.f27373a.hashCode() * 31;
            C4154a c4154a = this.f27374b;
            return ((hashCode + (c4154a == null ? 0 : c4154a.hashCode())) * 31) + this.f27375c.hashCode();
        }

        public final C4154a q() {
            return this.f27374b;
        }

        public String toString() {
            return "GooglePay(initializationMode=" + this.f27373a + ", shippingDetails=" + this.f27374b + ", config=" + this.f27375c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeParcelable(this.f27373a, i8);
            C4154a c4154a = this.f27374b;
            if (c4154a == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                c4154a.writeToParcel(out, i8);
            }
            this.f27375c.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public interface d extends n {

        /* loaded from: classes4.dex */
        public static final class a implements d {

            /* renamed from: a, reason: collision with root package name */
            private final w.l f27384a;

            /* renamed from: b, reason: collision with root package name */
            private final C4154a f27385b;

            /* renamed from: c, reason: collision with root package name */
            private final com.stripe.android.model.p f27386c;

            /* renamed from: d, reason: collision with root package name */
            private final com.stripe.android.model.r f27387d;

            /* renamed from: e, reason: collision with root package name */
            private final boolean f27388e;

            /* renamed from: f, reason: collision with root package name */
            public static final int f27383f = com.stripe.android.model.r.f25879b | com.stripe.android.model.p.f25805v;
            public static final Parcelable.Creator<a> CREATOR = new C0614a();

            /* renamed from: com.stripe.android.paymentsheet.n$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0614a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new a((w.l) parcel.readParcelable(a.class.getClassLoader()), parcel.readInt() == 0 ? null : C4154a.CREATOR.createFromParcel(parcel), (com.stripe.android.model.p) parcel.readParcelable(a.class.getClassLoader()), (com.stripe.android.model.r) parcel.readParcelable(a.class.getClassLoader()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public a(w.l initializationMode, C4154a c4154a, com.stripe.android.model.p createParams, com.stripe.android.model.r rVar, boolean z8) {
                AbstractC3292y.i(initializationMode, "initializationMode");
                AbstractC3292y.i(createParams, "createParams");
                this.f27384a = initializationMode;
                this.f27385b = c4154a;
                this.f27386c = createParams;
                this.f27387d = rVar;
                this.f27388e = z8;
            }

            @Override // com.stripe.android.paymentsheet.n.d
            public w.l D() {
                return this.f27384a;
            }

            public final com.stripe.android.model.p a() {
                return this.f27386c;
            }

            public final com.stripe.android.model.r b() {
                return this.f27387d;
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
                return AbstractC3292y.d(this.f27384a, aVar.f27384a) && AbstractC3292y.d(this.f27385b, aVar.f27385b) && AbstractC3292y.d(this.f27386c, aVar.f27386c) && AbstractC3292y.d(this.f27387d, aVar.f27387d) && this.f27388e == aVar.f27388e;
            }

            public final boolean f() {
                return this.f27388e;
            }

            public int hashCode() {
                int hashCode = this.f27384a.hashCode() * 31;
                C4154a c4154a = this.f27385b;
                int hashCode2 = (((hashCode + (c4154a == null ? 0 : c4154a.hashCode())) * 31) + this.f27386c.hashCode()) * 31;
                com.stripe.android.model.r rVar = this.f27387d;
                return ((hashCode2 + (rVar != null ? rVar.hashCode() : 0)) * 31) + androidx.compose.foundation.a.a(this.f27388e);
            }

            @Override // com.stripe.android.paymentsheet.n.d
            public C4154a q() {
                return this.f27385b;
            }

            public String toString() {
                return "New(initializationMode=" + this.f27384a + ", shippingDetails=" + this.f27385b + ", createParams=" + this.f27386c + ", optionsParams=" + this.f27387d + ", shouldSave=" + this.f27388e + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeParcelable(this.f27384a, i8);
                C4154a c4154a = this.f27385b;
                if (c4154a == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    c4154a.writeToParcel(out, i8);
                }
                out.writeParcelable(this.f27386c, i8);
                out.writeParcelable(this.f27387d, i8);
                out.writeInt(this.f27388e ? 1 : 0);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements d {

            /* renamed from: a, reason: collision with root package name */
            private final w.l f27390a;

            /* renamed from: b, reason: collision with root package name */
            private final C4154a f27391b;

            /* renamed from: c, reason: collision with root package name */
            private final com.stripe.android.model.o f27392c;

            /* renamed from: d, reason: collision with root package name */
            private final com.stripe.android.model.r f27393d;

            /* renamed from: e, reason: collision with root package name */
            public static final int f27389e = com.stripe.android.model.r.f25879b | com.stripe.android.model.o.f25630u;
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new b((w.l) parcel.readParcelable(b.class.getClassLoader()), parcel.readInt() == 0 ? null : C4154a.CREATOR.createFromParcel(parcel), (com.stripe.android.model.o) parcel.readParcelable(b.class.getClassLoader()), (com.stripe.android.model.r) parcel.readParcelable(b.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            public b(w.l initializationMode, C4154a c4154a, com.stripe.android.model.o paymentMethod, com.stripe.android.model.r rVar) {
                AbstractC3292y.i(initializationMode, "initializationMode");
                AbstractC3292y.i(paymentMethod, "paymentMethod");
                this.f27390a = initializationMode;
                this.f27391b = c4154a;
                this.f27392c = paymentMethod;
                this.f27393d = rVar;
            }

            @Override // com.stripe.android.paymentsheet.n.d
            public w.l D() {
                return this.f27390a;
            }

            public final com.stripe.android.model.r a() {
                return this.f27393d;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return AbstractC3292y.d(this.f27390a, bVar.f27390a) && AbstractC3292y.d(this.f27391b, bVar.f27391b) && AbstractC3292y.d(this.f27392c, bVar.f27392c) && AbstractC3292y.d(this.f27393d, bVar.f27393d);
            }

            public int hashCode() {
                int hashCode = this.f27390a.hashCode() * 31;
                C4154a c4154a = this.f27391b;
                int hashCode2 = (((hashCode + (c4154a == null ? 0 : c4154a.hashCode())) * 31) + this.f27392c.hashCode()) * 31;
                com.stripe.android.model.r rVar = this.f27393d;
                return hashCode2 + (rVar != null ? rVar.hashCode() : 0);
            }

            @Override // com.stripe.android.paymentsheet.n.d
            public C4154a q() {
                return this.f27391b;
            }

            public final com.stripe.android.model.o r() {
                return this.f27392c;
            }

            public String toString() {
                return "Saved(initializationMode=" + this.f27390a + ", shippingDetails=" + this.f27391b + ", paymentMethod=" + this.f27392c + ", optionsParams=" + this.f27393d + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeParcelable(this.f27390a, i8);
                C4154a c4154a = this.f27391b;
                if (c4154a == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    c4154a.writeToParcel(out, i8);
                }
                out.writeParcelable(this.f27392c, i8);
                out.writeParcelable(this.f27393d, i8);
            }
        }

        w.l D();

        C4154a q();
    }
}
