package com.stripe.android.model;

import R5.AbstractC1435t;
import R5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import com.stripe.android.model.m;
import com.stripe.android.model.r;
import g3.InterfaceC2900J;
import g3.InterfaceC2910i;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class b implements InterfaceC2910i {

    /* renamed from: a, reason: collision with root package name */
    private final p f25435a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25436b;

    /* renamed from: c, reason: collision with root package name */
    private final w f25437c;

    /* renamed from: d, reason: collision with root package name */
    private final String f25438d;

    /* renamed from: e, reason: collision with root package name */
    private final String f25439e;

    /* renamed from: f, reason: collision with root package name */
    private String f25440f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f25441g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f25442h;

    /* renamed from: i, reason: collision with root package name */
    private r f25443i;

    /* renamed from: j, reason: collision with root package name */
    private String f25444j;

    /* renamed from: k, reason: collision with root package name */
    private m f25445k;

    /* renamed from: l, reason: collision with root package name */
    private c f25446l;

    /* renamed from: m, reason: collision with root package name */
    private d f25447m;

    /* renamed from: n, reason: collision with root package name */
    private String f25448n;

    /* renamed from: o, reason: collision with root package name */
    public static final a f25433o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    public static final int f25434p = 8;
    public static final Parcelable.Creator<b> CREATOR = new C0497b();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public static /* synthetic */ b c(a aVar, p pVar, String str, Boolean bool, String str2, m mVar, c cVar, d dVar, r rVar, int i8, Object obj) {
            Boolean bool2;
            String str3;
            m mVar2;
            c cVar2;
            d dVar2;
            r rVar2;
            if ((i8 & 4) != 0) {
                bool2 = null;
            } else {
                bool2 = bool;
            }
            if ((i8 & 8) != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            if ((i8 & 16) != 0) {
                mVar2 = null;
            } else {
                mVar2 = mVar;
            }
            if ((i8 & 32) != 0) {
                cVar2 = null;
            } else {
                cVar2 = cVar;
            }
            if ((i8 & 64) != 0) {
                dVar2 = null;
            } else {
                dVar2 = dVar;
            }
            if ((i8 & 128) != 0) {
                rVar2 = null;
            } else {
                rVar2 = rVar;
            }
            return aVar.b(pVar, str, bool2, str3, mVar2, cVar2, dVar2, rVar2);
        }

        public static /* synthetic */ b e(a aVar, String str, String str2, Boolean bool, r rVar, String str3, m mVar, c cVar, d dVar, int i8, Object obj) {
            Boolean bool2;
            r rVar2;
            String str4;
            m mVar2;
            c cVar2;
            d dVar2;
            if ((i8 & 4) != 0) {
                bool2 = null;
            } else {
                bool2 = bool;
            }
            if ((i8 & 8) != 0) {
                rVar2 = null;
            } else {
                rVar2 = rVar;
            }
            if ((i8 & 16) != 0) {
                str4 = null;
            } else {
                str4 = str3;
            }
            if ((i8 & 32) != 0) {
                mVar2 = null;
            } else {
                mVar2 = mVar;
            }
            if ((i8 & 64) != 0) {
                cVar2 = null;
            } else {
                cVar2 = cVar;
            }
            if ((i8 & 128) != 0) {
                dVar2 = null;
            } else {
                dVar2 = dVar;
            }
            return aVar.d(str, str2, bool2, rVar2, str4, mVar2, cVar2, dVar2);
        }

        public final b a(String clientSecret, String paymentMethodId, r rVar) {
            r.b bVar;
            AbstractC3292y.i(clientSecret, "clientSecret");
            AbstractC3292y.i(paymentMethodId, "paymentMethodId");
            c cVar = null;
            if (rVar instanceof r.b) {
                bVar = (r.b) rVar;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                cVar = bVar.h();
            }
            AbstractC3284p abstractC3284p = null;
            return new b(null, paymentMethodId, null, null, clientSecret, null, Boolean.FALSE, true, new r.b(null, null, cVar, Boolean.TRUE, 3, abstractC3284p), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, null, 15917, abstractC3284p);
        }

        public final b b(p paymentMethodCreateParams, String clientSecret, Boolean bool, String str, m mVar, c cVar, d dVar, r rVar) {
            AbstractC3292y.i(paymentMethodCreateParams, "paymentMethodCreateParams");
            AbstractC3292y.i(clientSecret, "clientSecret");
            return new b(paymentMethodCreateParams, null, null, null, clientSecret, null, bool, false, rVar, str, mVar, cVar, dVar, null, 8366, null);
        }

        public final b d(String paymentMethodId, String clientSecret, Boolean bool, r rVar, String str, m mVar, c cVar, d dVar) {
            AbstractC3292y.i(paymentMethodId, "paymentMethodId");
            AbstractC3292y.i(clientSecret, "clientSecret");
            return new b(null, paymentMethodId, null, null, clientSecret, null, bool, false, rVar, str, mVar, cVar, dVar, null, 8365, null);
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: com.stripe.android.model.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0497b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b createFromParcel(Parcel parcel) {
            Boolean valueOf;
            AbstractC3292y.i(parcel, "parcel");
            p createFromParcel = parcel.readInt() == 0 ? null : p.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            w createFromParcel2 = parcel.readInt() == 0 ? null : w.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new b(createFromParcel, readString, createFromParcel2, readString2, readString3, readString4, valueOf, parcel.readInt() != 0, (r) parcel.readParcelable(b.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : m.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()), parcel.readInt() != 0 ? d.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b[] newArray(int i8) {
            return new b[i8];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f25449b = new c("OnSession", 0, "on_session");

        /* renamed from: c, reason: collision with root package name */
        public static final c f25450c = new c("OffSession", 1, "off_session");

        /* renamed from: d, reason: collision with root package name */
        public static final c f25451d = new c("Blank", 2, "");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ c[] f25452e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ W5.a f25453f;

        /* renamed from: a, reason: collision with root package name */
        private final String f25454a;

        static {
            c[] a9 = a();
            f25452e = a9;
            f25453f = W5.b.a(a9);
        }

        private c(String str, int i8, String str2) {
            this.f25454a = str2;
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f25449b, f25450c, f25451d};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f25452e.clone();
        }

        public final String b() {
            return this.f25454a;
        }
    }

    public b(p pVar, String str, w wVar, String str2, String clientSecret, String str3, Boolean bool, boolean z8, r rVar, String str4, m mVar, c cVar, d dVar, String str5) {
        AbstractC3292y.i(clientSecret, "clientSecret");
        this.f25435a = pVar;
        this.f25436b = str;
        this.f25437c = wVar;
        this.f25438d = str2;
        this.f25439e = clientSecret;
        this.f25440f = str3;
        this.f25441g = bool;
        this.f25442h = z8;
        this.f25443i = rVar;
        this.f25444j = str4;
        this.f25445k = mVar;
        this.f25446l = cVar;
        this.f25447m = dVar;
        this.f25448n = str5;
    }

    public static /* synthetic */ b b(b bVar, p pVar, String str, w wVar, String str2, String str3, String str4, Boolean bool, boolean z8, r rVar, String str5, m mVar, c cVar, d dVar, String str6, int i8, Object obj) {
        return bVar.a((i8 & 1) != 0 ? bVar.f25435a : pVar, (i8 & 2) != 0 ? bVar.f25436b : str, (i8 & 4) != 0 ? bVar.f25437c : wVar, (i8 & 8) != 0 ? bVar.f25438d : str2, (i8 & 16) != 0 ? bVar.f25439e : str3, (i8 & 32) != 0 ? bVar.f25440f : str4, (i8 & 64) != 0 ? bVar.f25441g : bool, (i8 & 128) != 0 ? bVar.f25442h : z8, (i8 & 256) != 0 ? bVar.f25443i : rVar, (i8 & 512) != 0 ? bVar.f25444j : str5, (i8 & 1024) != 0 ? bVar.f25445k : mVar, (i8 & 2048) != 0 ? bVar.f25446l : cVar, (i8 & 4096) != 0 ? bVar.f25447m : dVar, (i8 & 8192) != 0 ? bVar.f25448n : str6);
    }

    private final Map f() {
        Map B8;
        m mVar = this.f25445k;
        if (mVar == null || (B8 = mVar.B()) == null) {
            p pVar = this.f25435a;
            if (pVar != null && pVar.s() && this.f25444j == null) {
                return new m(m.c.a.f25543e.a()).B();
            }
            return null;
        }
        return B8;
    }

    private final Map l() {
        p pVar = this.f25435a;
        if (pVar != null) {
            return Q.e(Q5.x.a("payment_method_data", pVar.B()));
        }
        String str = this.f25436b;
        if (str != null) {
            return Q.e(Q5.x.a("payment_method", str));
        }
        w wVar = this.f25437c;
        if (wVar != null) {
            return Q.e(Q5.x.a("source_data", wVar.B()));
        }
        String str2 = this.f25438d;
        if (str2 != null) {
            return Q.e(Q5.x.a("source", str2));
        }
        return Q.h();
    }

    @Override // g3.InterfaceC2910i
    public String A() {
        return this.f25440f;
    }

    @Override // g3.InterfaceC2900J
    public Map B() {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        Map map5;
        Map map6;
        Map map7;
        Map k8 = Q.k(Q5.x.a("client_secret", d()), Q5.x.a("use_stripe_sdk", Boolean.valueOf(this.f25442h)));
        Boolean bool = this.f25441g;
        Map map8 = null;
        if (bool != null) {
            map = Q.e(Q5.x.a("save_payment_method", bool));
        } else {
            map = null;
        }
        if (map == null) {
            map = Q.h();
        }
        Map q8 = Q.q(k8, map);
        String str = this.f25444j;
        if (str != null) {
            map2 = Q.e(Q5.x.a("mandate", str));
        } else {
            map2 = null;
        }
        if (map2 == null) {
            map2 = Q.h();
        }
        Map q9 = Q.q(q8, map2);
        Map f8 = f();
        if (f8 != null) {
            map3 = Q.e(Q5.x.a("mandate_data", f8));
        } else {
            map3 = null;
        }
        if (map3 == null) {
            map3 = Q.h();
        }
        Map q10 = Q.q(q9, map3);
        String A8 = A();
        if (A8 != null) {
            map4 = Q.e(Q5.x.a("return_url", A8));
        } else {
            map4 = null;
        }
        if (map4 == null) {
            map4 = Q.h();
        }
        Map q11 = Q.q(q10, map4);
        r rVar = this.f25443i;
        if (rVar != null) {
            map5 = Q.e(Q5.x.a("payment_method_options", rVar.B()));
        } else {
            map5 = null;
        }
        if (map5 == null) {
            map5 = Q.h();
        }
        Map q12 = Q.q(q11, map5);
        c cVar = this.f25446l;
        if (cVar != null) {
            map6 = Q.e(Q5.x.a("setup_future_usage", cVar.b()));
        } else {
            map6 = null;
        }
        if (map6 == null) {
            map6 = Q.h();
        }
        Map q13 = Q.q(q12, map6);
        d dVar = this.f25447m;
        if (dVar != null) {
            map7 = Q.e(Q5.x.a("shipping", dVar.B()));
        } else {
            map7 = null;
        }
        if (map7 == null) {
            map7 = Q.h();
        }
        Map q14 = Q.q(Q.q(q13, map7), l());
        String str2 = this.f25448n;
        if (str2 != null) {
            map8 = Q.e(Q5.x.a("receipt_email", str2));
        }
        if (map8 == null) {
            map8 = Q.h();
        }
        return Q.q(q14, map8);
    }

    @Override // g3.InterfaceC2910i
    public void V(String str) {
        this.f25440f = str;
    }

    public final b a(p pVar, String str, w wVar, String str2, String clientSecret, String str3, Boolean bool, boolean z8, r rVar, String str4, m mVar, c cVar, d dVar, String str5) {
        AbstractC3292y.i(clientSecret, "clientSecret");
        return new b(pVar, str, wVar, str2, clientSecret, str3, bool, z8, rVar, str4, mVar, cVar, dVar, str5);
    }

    @Override // g3.InterfaceC2910i
    public String d() {
        return this.f25439e;
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
        return AbstractC3292y.d(this.f25435a, bVar.f25435a) && AbstractC3292y.d(this.f25436b, bVar.f25436b) && AbstractC3292y.d(this.f25437c, bVar.f25437c) && AbstractC3292y.d(this.f25438d, bVar.f25438d) && AbstractC3292y.d(this.f25439e, bVar.f25439e) && AbstractC3292y.d(this.f25440f, bVar.f25440f) && AbstractC3292y.d(this.f25441g, bVar.f25441g) && this.f25442h == bVar.f25442h && AbstractC3292y.d(this.f25443i, bVar.f25443i) && AbstractC3292y.d(this.f25444j, bVar.f25444j) && AbstractC3292y.d(this.f25445k, bVar.f25445k) && this.f25446l == bVar.f25446l && AbstractC3292y.d(this.f25447m, bVar.f25447m) && AbstractC3292y.d(this.f25448n, bVar.f25448n);
    }

    public final p h() {
        return this.f25435a;
    }

    public int hashCode() {
        p pVar = this.f25435a;
        int hashCode = (pVar == null ? 0 : pVar.hashCode()) * 31;
        String str = this.f25436b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        w wVar = this.f25437c;
        int hashCode3 = (hashCode2 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        String str2 = this.f25438d;
        int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f25439e.hashCode()) * 31;
        String str3 = this.f25440f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f25441g;
        int hashCode6 = (((hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f25442h)) * 31;
        r rVar = this.f25443i;
        int hashCode7 = (hashCode6 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        String str4 = this.f25444j;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        m mVar = this.f25445k;
        int hashCode9 = (hashCode8 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        c cVar = this.f25446l;
        int hashCode10 = (hashCode9 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        d dVar = this.f25447m;
        int hashCode11 = (hashCode10 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str5 = this.f25448n;
        return hashCode11 + (str5 != null ? str5.hashCode() : 0);
    }

    public final r i() {
        return this.f25443i;
    }

    public final w p() {
        return this.f25437c;
    }

    @Override // g3.InterfaceC2910i
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public b E(boolean z8) {
        return b(this, null, null, null, null, null, null, null, z8, null, null, null, null, null, null, 16255, null);
    }

    public String toString() {
        return "ConfirmPaymentIntentParams(paymentMethodCreateParams=" + this.f25435a + ", paymentMethodId=" + this.f25436b + ", sourceParams=" + this.f25437c + ", sourceId=" + this.f25438d + ", clientSecret=" + this.f25439e + ", returnUrl=" + this.f25440f + ", savePaymentMethod=" + this.f25441g + ", useStripeSdk=" + this.f25442h + ", paymentMethodOptions=" + this.f25443i + ", mandateId=" + this.f25444j + ", mandateData=" + this.f25445k + ", setupFutureUsage=" + this.f25446l + ", shipping=" + this.f25447m + ", receiptEmail=" + this.f25448n + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        p pVar = this.f25435a;
        if (pVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            pVar.writeToParcel(out, i8);
        }
        out.writeString(this.f25436b);
        w wVar = this.f25437c;
        if (wVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            wVar.writeToParcel(out, i8);
        }
        out.writeString(this.f25438d);
        out.writeString(this.f25439e);
        out.writeString(this.f25440f);
        Boolean bool = this.f25441g;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        out.writeInt(this.f25442h ? 1 : 0);
        out.writeParcelable(this.f25443i, i8);
        out.writeString(this.f25444j);
        m mVar = this.f25445k;
        if (mVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            mVar.writeToParcel(out, i8);
        }
        c cVar = this.f25446l;
        if (cVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(cVar.name());
        }
        d dVar = this.f25447m;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
        out.writeString(this.f25448n);
    }

    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC2900J, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final com.stripe.android.model.a f25456a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25457b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25458c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25459d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25460e;

        /* renamed from: f, reason: collision with root package name */
        private static final a f25455f = new a(null);
        public static final Parcelable.Creator<d> CREATOR = new C0498b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* renamed from: com.stripe.android.model.b$d$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0498b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new d(com.stripe.android.model.a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(com.stripe.android.model.a address, String name, String str, String str2, String str3) {
            AbstractC3292y.i(address, "address");
            AbstractC3292y.i(name, "name");
            this.f25456a = address;
            this.f25457b = name;
            this.f25458c = str;
            this.f25459d = str2;
            this.f25460e = str3;
        }

        @Override // g3.InterfaceC2900J
        public Map B() {
            Map map;
            List<Q5.r> p8 = AbstractC1435t.p(Q5.x.a("address", this.f25456a.B()), Q5.x.a("name", this.f25457b), Q5.x.a("carrier", this.f25458c), Q5.x.a(HintConstants.AUTOFILL_HINT_PHONE, this.f25459d), Q5.x.a("tracking_number", this.f25460e));
            Map h8 = Q.h();
            for (Q5.r rVar : p8) {
                String str = (String) rVar.a();
                Object b9 = rVar.b();
                if (b9 != null) {
                    map = Q.e(Q5.x.a(str, b9));
                } else {
                    map = null;
                }
                if (map == null) {
                    map = Q.h();
                }
                h8 = Q.q(h8, map);
            }
            return h8;
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
            return AbstractC3292y.d(this.f25456a, dVar.f25456a) && AbstractC3292y.d(this.f25457b, dVar.f25457b) && AbstractC3292y.d(this.f25458c, dVar.f25458c) && AbstractC3292y.d(this.f25459d, dVar.f25459d) && AbstractC3292y.d(this.f25460e, dVar.f25460e);
        }

        public int hashCode() {
            int hashCode = ((this.f25456a.hashCode() * 31) + this.f25457b.hashCode()) * 31;
            String str = this.f25458c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f25459d;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25460e;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Shipping(address=" + this.f25456a + ", name=" + this.f25457b + ", carrier=" + this.f25458c + ", phone=" + this.f25459d + ", trackingNumber=" + this.f25460e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            this.f25456a.writeToParcel(out, i8);
            out.writeString(this.f25457b);
            out.writeString(this.f25458c);
            out.writeString(this.f25459d);
            out.writeString(this.f25460e);
        }

        public /* synthetic */ d(com.stripe.android.model.a aVar, String str, String str2, String str3, String str4, int i8, AbstractC3284p abstractC3284p) {
            this(aVar, str, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : str3, (i8 & 16) != 0 ? null : str4);
        }
    }

    public /* synthetic */ b(p pVar, String str, w wVar, String str2, String str3, String str4, Boolean bool, boolean z8, r rVar, String str5, m mVar, c cVar, d dVar, String str6, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? null : pVar, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : wVar, (i8 & 8) != 0 ? null : str2, str3, (i8 & 32) != 0 ? null : str4, (i8 & 64) != 0 ? null : bool, (i8 & 128) != 0 ? false : z8, (i8 & 256) != 0 ? null : rVar, (i8 & 512) != 0 ? null : str5, (i8 & 1024) != 0 ? null : mVar, (i8 & 2048) != 0 ? null : cVar, (i8 & 4096) != 0 ? null : dVar, (i8 & 8192) != 0 ? null : str6);
    }
}
