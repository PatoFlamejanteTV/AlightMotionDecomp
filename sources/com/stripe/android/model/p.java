package com.stripe.android.model;

import R5.AbstractC1435t;
import R5.Q;
import R5.a0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.stripe.android.model.o;
import g3.C2901K;
import g3.C2905d;
import g3.InterfaceC2900J;
import g3.M;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class p implements InterfaceC2900J, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f25806a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f25807b;

    /* renamed from: c, reason: collision with root package name */
    private final c f25808c;

    /* renamed from: d, reason: collision with root package name */
    private final h f25809d;

    /* renamed from: e, reason: collision with root package name */
    private final g f25810e;

    /* renamed from: f, reason: collision with root package name */
    private final k f25811f;

    /* renamed from: g, reason: collision with root package name */
    private final a f25812g;

    /* renamed from: h, reason: collision with root package name */
    private final b f25813h;

    /* renamed from: i, reason: collision with root package name */
    private final l f25814i;

    /* renamed from: j, reason: collision with root package name */
    private final o f25815j;

    /* renamed from: k, reason: collision with root package name */
    private final j f25816k;

    /* renamed from: l, reason: collision with root package name */
    private final n f25817l;

    /* renamed from: m, reason: collision with root package name */
    private final i f25818m;

    /* renamed from: n, reason: collision with root package name */
    private final d f25819n;

    /* renamed from: o, reason: collision with root package name */
    private final m f25820o;

    /* renamed from: p, reason: collision with root package name */
    private final o.e f25821p;

    /* renamed from: q, reason: collision with root package name */
    private final o.b f25822q;

    /* renamed from: r, reason: collision with root package name */
    private final Map f25823r;

    /* renamed from: s, reason: collision with root package name */
    private final Set f25824s;

    /* renamed from: t, reason: collision with root package name */
    private final Map f25825t;

    /* renamed from: u, reason: collision with root package name */
    public static final e f25804u = new e(null);

    /* renamed from: v, reason: collision with root package name */
    public static final int f25805v = 8;
    public static final Parcelable.Creator<p> CREATOR = new f();

    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC2900J, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f25828a;

        /* renamed from: b, reason: collision with root package name */
        private String f25829b;

        /* renamed from: c, reason: collision with root package name */
        private static final C0518a f25826c = new C0518a(null);

        /* renamed from: d, reason: collision with root package name */
        public static final int f25827d = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.model.p$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        private static final class C0518a {
            private C0518a() {
            }

            public /* synthetic */ C0518a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String bsbNumber, String accountNumber) {
            AbstractC3292y.i(bsbNumber, "bsbNumber");
            AbstractC3292y.i(accountNumber, "accountNumber");
            this.f25828a = bsbNumber;
            this.f25829b = accountNumber;
        }

        @Override // g3.InterfaceC2900J
        public Map B() {
            return Q.k(Q5.x.a("bsb_number", this.f25828a), Q5.x.a("account_number", this.f25829b));
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
            return AbstractC3292y.d(this.f25828a, aVar.f25828a) && AbstractC3292y.d(this.f25829b, aVar.f25829b);
        }

        public int hashCode() {
            return (this.f25828a.hashCode() * 31) + this.f25829b.hashCode();
        }

        public String toString() {
            return "AuBecsDebit(bsbNumber=" + this.f25828a + ", accountNumber=" + this.f25829b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25828a);
            out.writeString(this.f25829b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC2900J, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f25832a;

        /* renamed from: b, reason: collision with root package name */
        private String f25833b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f25830c = new a(null);

        /* renamed from: d, reason: collision with root package name */
        public static final int f25831d = 8;
        public static final Parcelable.Creator<b> CREATOR = new C0519b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final b a(p params) {
                Map map;
                Object obj;
                String str;
                Object obj2;
                String str2;
                AbstractC3292y.i(params, "params");
                Object obj3 = params.B().get(o.p.f25761o.f25773a);
                if (obj3 instanceof Map) {
                    map = (Map) obj3;
                } else {
                    map = null;
                }
                if (map != null) {
                    obj = map.get("account_number");
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                if (map != null) {
                    obj2 = map.get("sort_code");
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof String) {
                    str2 = (String) obj2;
                } else {
                    str2 = null;
                }
                if (str == null || str2 == null) {
                    return null;
                }
                return new b(str, str2);
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* renamed from: com.stripe.android.model.p$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0519b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(String accountNumber, String sortCode) {
            AbstractC3292y.i(accountNumber, "accountNumber");
            AbstractC3292y.i(sortCode, "sortCode");
            this.f25832a = accountNumber;
            this.f25833b = sortCode;
        }

        @Override // g3.InterfaceC2900J
        public Map B() {
            return Q.k(Q5.x.a("account_number", this.f25832a), Q5.x.a("sort_code", this.f25833b));
        }

        public final String a() {
            return this.f25832a;
        }

        public final String b() {
            return this.f25833b;
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
            return AbstractC3292y.d(this.f25832a, bVar.f25832a) && AbstractC3292y.d(this.f25833b, bVar.f25833b);
        }

        public int hashCode() {
            return (this.f25832a.hashCode() * 31) + this.f25833b.hashCode();
        }

        public String toString() {
            return "BacsDebit(accountNumber=" + this.f25832a + ", sortCode=" + this.f25833b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25832a);
            out.writeString(this.f25833b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC2900J, Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                parcel.readInt();
                return new d();
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e {
        private e() {
        }

        public static /* synthetic */ p e(e eVar, c cVar, o.e eVar2, Map map, o.b bVar, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                eVar2 = null;
            }
            if ((i8 & 4) != 0) {
                map = null;
            }
            if ((i8 & 8) != 0) {
                bVar = null;
            }
            return eVar.a(cVar, eVar2, map, bVar);
        }

        public static /* synthetic */ p f(e eVar, g gVar, o.e eVar2, Map map, o.b bVar, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                eVar2 = null;
            }
            if ((i8 & 4) != 0) {
                map = null;
            }
            if ((i8 & 8) != 0) {
                bVar = null;
            }
            return eVar.b(gVar, eVar2, map, bVar);
        }

        public static /* synthetic */ p g(e eVar, j jVar, o.e eVar2, Map map, o.b bVar, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                eVar2 = null;
            }
            if ((i8 & 4) != 0) {
                map = null;
            }
            if ((i8 & 8) != 0) {
                bVar = null;
            }
            return eVar.c(jVar, eVar2, map, bVar);
        }

        public static /* synthetic */ p h(e eVar, n nVar, o.e eVar2, Map map, o.b bVar, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                eVar2 = null;
            }
            if ((i8 & 4) != 0) {
                map = null;
            }
            if ((i8 & 8) != 0) {
                bVar = null;
            }
            return eVar.d(nVar, eVar2, map, bVar);
        }

        public static /* synthetic */ p n(e eVar, o.e eVar2, Map map, o.b bVar, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                eVar2 = null;
            }
            if ((i8 & 2) != 0) {
                map = null;
            }
            if ((i8 & 4) != 0) {
                bVar = null;
            }
            return eVar.m(eVar2, map, bVar);
        }

        private final String p(p pVar, String str) {
            Object obj;
            Map map;
            Object obj2;
            Map map2 = pVar.f25825t;
            if (map2 != null) {
                obj = map2.get("billing_details");
            } else {
                obj = null;
            }
            if (obj instanceof Map) {
                map = (Map) obj;
            } else {
                map = null;
            }
            if (map != null) {
                obj2 = map.get(str);
            } else {
                obj2 = null;
            }
            if (!(obj2 instanceof String)) {
                return null;
            }
            return (String) obj2;
        }

        public final p a(c card, o.e eVar, Map map, o.b bVar) {
            AbstractC3292y.i(card, "card");
            return new p(card, bVar, eVar, map, (AbstractC3284p) null);
        }

        public final p b(g fpx, o.e eVar, Map map, o.b bVar) {
            AbstractC3292y.i(fpx, "fpx");
            return new p(fpx, bVar, eVar, map, (AbstractC3284p) null);
        }

        public final p c(j netbanking, o.e eVar, Map map, o.b bVar) {
            AbstractC3292y.i(netbanking, "netbanking");
            return new p(netbanking, bVar, eVar, map, (AbstractC3284p) null);
        }

        public final p d(n usBankAccount, o.e eVar, Map map, o.b bVar) {
            AbstractC3292y.i(usBankAccount, "usBankAccount");
            return new p(usBankAccount, bVar, eVar, map, (AbstractC3284p) null);
        }

        public final b i(p params) {
            AbstractC3292y.i(params, "params");
            return b.f25830c.a(params);
        }

        public final p j(JSONObject googlePayPaymentData) {
            String str;
            C2905d a9;
            M a10;
            AbstractC3292y.i(googlePayPaymentData, "googlePayPaymentData");
            com.stripe.android.model.k b9 = com.stripe.android.model.k.f25526g.b(googlePayPaymentData);
            C2901K i8 = b9.i();
            String str2 = null;
            if (i8 != null) {
                str = i8.getId();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            String str3 = str;
            if (i8 != null && (a9 = i8.a()) != null && (a10 = a9.a()) != null) {
                str2 = a10.toString();
            }
            return e(this, new c(null, null, null, null, str3, a0.j(str2), null, 79, null), new o.e(b9.a(), b9.b(), b9.f(), b9.h()), null, null, 12, null);
        }

        public final p k(String paymentMethodId, boolean z8, Set productUsage) {
            AbstractC3292y.i(paymentMethodId, "paymentMethodId");
            AbstractC3292y.i(productUsage, "productUsage");
            return new p(o.p.f25754h.f25773a, z8, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, productUsage, Q.e(Q5.x.a("link", Q.e(Q5.x.a("payment_method_id", paymentMethodId)))), 262140, null);
        }

        public final p l(String paymentDetailsId, String consumerSessionClientSecret, Map map) {
            AbstractC3292y.i(paymentDetailsId, "paymentDetailsId");
            AbstractC3292y.i(consumerSessionClientSecret, "consumerSessionClientSecret");
            return new p(o.p.f25754h, null, null, null, null, null, null, null, null, null, null, new i(paymentDetailsId, consumerSessionClientSecret, map), null, null, null, null, null, null, null, 522238, null);
        }

        public final p m(o.e eVar, Map map, o.b bVar) {
            return new p(o.p.f25745O, null, null, null, null, null, null, null, null, null, null, null, null, null, eVar, bVar, map, null, null, 409598, null);
        }

        public final p o(String code, o.e eVar, boolean z8, Map map, Set productUsage, o.b bVar) {
            AbstractC3292y.i(code, "code");
            AbstractC3292y.i(productUsage, "productUsage");
            return new p(code, z8, null, null, null, null, null, null, null, null, null, null, null, null, null, eVar, bVar, null, productUsage, map, 163836, null);
        }

        public final String q(p params) {
            String str;
            AbstractC3292y.i(params, "params");
            o.e l8 = params.l();
            if (l8 == null || (str = l8.f25672b) == null) {
                return p(params, NotificationCompat.CATEGORY_EMAIL);
            }
            return str;
        }

        public final String r(p params) {
            String str;
            AbstractC3292y.i(params, "params");
            o.e l8 = params.l();
            if (l8 == null || (str = l8.f25673c) == null) {
                return p(params, "name");
            }
            return str;
        }

        public /* synthetic */ e(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p createFromParcel(Parcel parcel) {
            i iVar;
            n nVar;
            LinkedHashMap linkedHashMap;
            LinkedHashSet linkedHashSet;
            LinkedHashMap linkedHashMap2;
            AbstractC3292y.i(parcel, "parcel");
            String readString = parcel.readString();
            boolean z8 = parcel.readInt() != 0;
            c createFromParcel = parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel);
            h createFromParcel2 = parcel.readInt() == 0 ? null : h.CREATOR.createFromParcel(parcel);
            g createFromParcel3 = parcel.readInt() == 0 ? null : g.CREATOR.createFromParcel(parcel);
            k createFromParcel4 = parcel.readInt() == 0 ? null : k.CREATOR.createFromParcel(parcel);
            a createFromParcel5 = parcel.readInt() == 0 ? null : a.CREATOR.createFromParcel(parcel);
            b createFromParcel6 = parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel);
            l createFromParcel7 = parcel.readInt() == 0 ? null : l.CREATOR.createFromParcel(parcel);
            o createFromParcel8 = parcel.readInt() == 0 ? null : o.CREATOR.createFromParcel(parcel);
            j createFromParcel9 = parcel.readInt() == 0 ? null : j.CREATOR.createFromParcel(parcel);
            n createFromParcel10 = parcel.readInt() == 0 ? null : n.CREATOR.createFromParcel(parcel);
            i createFromParcel11 = parcel.readInt() == 0 ? null : i.CREATOR.createFromParcel(parcel);
            d createFromParcel12 = parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel);
            m createFromParcel13 = parcel.readInt() == 0 ? null : m.CREATOR.createFromParcel(parcel);
            o.e createFromParcel14 = parcel.readInt() == 0 ? null : o.e.CREATOR.createFromParcel(parcel);
            o.b createFromParcel15 = parcel.readInt() == 0 ? null : o.b.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                nVar = createFromParcel10;
                iVar = createFromParcel11;
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt);
                iVar = createFromParcel11;
                int i8 = 0;
                while (i8 != readInt) {
                    linkedHashMap3.put(parcel.readString(), parcel.readString());
                    i8++;
                    readInt = readInt;
                    createFromParcel10 = createFromParcel10;
                }
                nVar = createFromParcel10;
                linkedHashMap = linkedHashMap3;
            }
            int readInt2 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt2);
            for (int i9 = 0; i9 != readInt2; i9++) {
                linkedHashSet2.add(parcel.readString());
            }
            if (parcel.readInt() == 0) {
                linkedHashSet = linkedHashSet2;
                linkedHashMap2 = null;
            } else {
                int readInt3 = parcel.readInt();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(readInt3);
                int i10 = 0;
                while (i10 != readInt3) {
                    linkedHashMap4.put(parcel.readString(), parcel.readValue(p.class.getClassLoader()));
                    i10++;
                    readInt3 = readInt3;
                    linkedHashSet2 = linkedHashSet2;
                }
                linkedHashSet = linkedHashSet2;
                linkedHashMap2 = linkedHashMap4;
            }
            return new p(readString, z8, createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, createFromParcel5, createFromParcel6, createFromParcel7, createFromParcel8, createFromParcel9, nVar, iVar, createFromParcel12, createFromParcel13, createFromParcel14, createFromParcel15, linkedHashMap, linkedHashSet, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p[] newArray(int i8) {
            return new p[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements InterfaceC2900J, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f25847a;

        /* renamed from: b, reason: collision with root package name */
        private static final a f25845b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f25846c = 8;
        public static final Parcelable.Creator<g> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new g(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i8) {
                return new g[i8];
            }
        }

        public g(String str) {
            this.f25847a = str;
        }

        @Override // g3.InterfaceC2900J
        public Map B() {
            Map map;
            String str = this.f25847a;
            if (str != null) {
                map = Q.e(Q5.x.a("bank", str));
            } else {
                map = null;
            }
            if (map == null) {
                return Q.h();
            }
            return map;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && AbstractC3292y.d(this.f25847a, ((g) obj).f25847a);
        }

        public int hashCode() {
            String str = this.f25847a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Fpx(bank=" + this.f25847a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25847a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements InterfaceC2900J, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f25850a;

        /* renamed from: b, reason: collision with root package name */
        private static final a f25848b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f25849c = 8;
        public static final Parcelable.Creator<h> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new h(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final h[] newArray(int i8) {
                return new h[i8];
            }
        }

        public h(String str) {
            this.f25850a = str;
        }

        @Override // g3.InterfaceC2900J
        public Map B() {
            Map map;
            String str = this.f25850a;
            if (str != null) {
                map = Q.e(Q5.x.a("bank", str));
            } else {
                map = null;
            }
            if (map == null) {
                return Q.h();
            }
            return map;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && AbstractC3292y.d(this.f25850a, ((h) obj).f25850a);
        }

        public int hashCode() {
            String str = this.f25850a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Ideal(bank=" + this.f25850a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25850a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class i implements InterfaceC2900J, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f25853a;

        /* renamed from: b, reason: collision with root package name */
        private String f25854b;

        /* renamed from: c, reason: collision with root package name */
        private Map f25855c;

        /* renamed from: d, reason: collision with root package name */
        private static final a f25851d = new a(null);

        /* renamed from: e, reason: collision with root package name */
        public static final int f25852e = 8;
        public static final Parcelable.Creator<i> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final i createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                AbstractC3292y.i(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readValue(i.class.getClassLoader()));
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new i(readString, readString2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final i[] newArray(int i8) {
                return new i[i8];
            }
        }

        public i(String paymentDetailsId, String consumerSessionClientSecret, Map map) {
            AbstractC3292y.i(paymentDetailsId, "paymentDetailsId");
            AbstractC3292y.i(consumerSessionClientSecret, "consumerSessionClientSecret");
            this.f25853a = paymentDetailsId;
            this.f25854b = consumerSessionClientSecret;
            this.f25855c = map;
        }

        @Override // g3.InterfaceC2900J
        public Map B() {
            Map k8 = Q.k(Q5.x.a("payment_details_id", this.f25853a), Q5.x.a("credentials", Q.e(Q5.x.a("consumer_session_client_secret", this.f25854b))));
            Map map = this.f25855c;
            if (map == null) {
                map = Q.h();
            }
            return Q.q(k8, map);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return AbstractC3292y.d(this.f25853a, iVar.f25853a) && AbstractC3292y.d(this.f25854b, iVar.f25854b) && AbstractC3292y.d(this.f25855c, iVar.f25855c);
        }

        public int hashCode() {
            int hashCode = ((this.f25853a.hashCode() * 31) + this.f25854b.hashCode()) * 31;
            Map map = this.f25855c;
            return hashCode + (map == null ? 0 : map.hashCode());
        }

        public String toString() {
            return "Link(paymentDetailsId=" + this.f25853a + ", consumerSessionClientSecret=" + this.f25854b + ", extraParams=" + this.f25855c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25853a);
            out.writeString(this.f25854b);
            Map map = this.f25855c;
            if (map == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                out.writeString((String) entry.getKey());
                out.writeValue(entry.getValue());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class j implements InterfaceC2900J, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f25858a;

        /* renamed from: b, reason: collision with root package name */
        private static final a f25856b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f25857c = 8;
        public static final Parcelable.Creator<j> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new j(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final j[] newArray(int i8) {
                return new j[i8];
            }
        }

        public j(String bank) {
            AbstractC3292y.i(bank, "bank");
            this.f25858a = bank;
        }

        @Override // g3.InterfaceC2900J
        public Map B() {
            String lowerCase = this.f25858a.toLowerCase(Locale.ROOT);
            AbstractC3292y.h(lowerCase, "toLowerCase(...)");
            return Q.e(Q5.x.a("bank", lowerCase));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && AbstractC3292y.d(this.f25858a, ((j) obj).f25858a);
        }

        public int hashCode() {
            return this.f25858a.hashCode();
        }

        public String toString() {
            return "Netbanking(bank=" + this.f25858a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25858a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements InterfaceC2900J, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f25861a;

        /* renamed from: b, reason: collision with root package name */
        private static final a f25859b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f25860c = 8;
        public static final Parcelable.Creator<k> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
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
                return new k(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final k[] newArray(int i8) {
                return new k[i8];
            }
        }

        public k(String str) {
            this.f25861a = str;
        }

        @Override // g3.InterfaceC2900J
        public Map B() {
            Map map;
            String str = this.f25861a;
            if (str != null) {
                map = Q.e(Q5.x.a("iban", str));
            } else {
                map = null;
            }
            if (map == null) {
                return Q.h();
            }
            return map;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && AbstractC3292y.d(this.f25861a, ((k) obj).f25861a);
        }

        public int hashCode() {
            String str = this.f25861a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "SepaDebit(iban=" + this.f25861a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25861a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class l implements InterfaceC2900J, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f25864a;

        /* renamed from: b, reason: collision with root package name */
        private static final a f25862b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f25863c = 8;
        public static final Parcelable.Creator<l> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new l(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final l[] newArray(int i8) {
                return new l[i8];
            }
        }

        public l(String country) {
            AbstractC3292y.i(country, "country");
            this.f25864a = country;
        }

        @Override // g3.InterfaceC2900J
        public Map B() {
            String upperCase = this.f25864a.toUpperCase(Locale.ROOT);
            AbstractC3292y.h(upperCase, "toUpperCase(...)");
            return Q.e(Q5.x.a("country", upperCase));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && AbstractC3292y.d(this.f25864a, ((l) obj).f25864a);
        }

        public int hashCode() {
            return this.f25864a.hashCode();
        }

        public String toString() {
            return "Sofort(country=" + this.f25864a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25864a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class m implements InterfaceC2900J, Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                parcel.readInt();
                return new m();
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final m[] newArray(int i8) {
                return new m[i8];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class n implements InterfaceC2900J, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f25867a;

        /* renamed from: b, reason: collision with root package name */
        private String f25868b;

        /* renamed from: c, reason: collision with root package name */
        private String f25869c;

        /* renamed from: d, reason: collision with root package name */
        private o.r.c f25870d;

        /* renamed from: e, reason: collision with root package name */
        private o.r.b f25871e;

        /* renamed from: f, reason: collision with root package name */
        private static final a f25865f = new a(null);

        /* renamed from: g, reason: collision with root package name */
        public static final int f25866g = 8;
        public static final Parcelable.Creator<n> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final n createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new n(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : o.r.c.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? o.r.b.CREATOR.createFromParcel(parcel) : null, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final n[] newArray(int i8) {
                return new n[i8];
            }
        }

        public /* synthetic */ n(String str, String str2, String str3, o.r.c cVar, o.r.b bVar, AbstractC3284p abstractC3284p) {
            this(str, str2, str3, cVar, bVar);
        }

        @Override // g3.InterfaceC2900J
        public Map B() {
            String str = this.f25867a;
            if (str != null) {
                AbstractC3292y.f(str);
                return Q.e(Q5.x.a("link_account_session", str));
            }
            String str2 = this.f25868b;
            AbstractC3292y.f(str2);
            Q5.r a9 = Q5.x.a("account_number", str2);
            String str3 = this.f25869c;
            AbstractC3292y.f(str3);
            Q5.r a10 = Q5.x.a("routing_number", str3);
            o.r.c cVar = this.f25870d;
            AbstractC3292y.f(cVar);
            Q5.r a11 = Q5.x.a("account_type", cVar.f());
            o.r.b bVar = this.f25871e;
            AbstractC3292y.f(bVar);
            return Q.k(a9, a10, a11, Q5.x.a("account_holder_type", bVar.f()));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return AbstractC3292y.d(this.f25867a, nVar.f25867a) && AbstractC3292y.d(this.f25868b, nVar.f25868b) && AbstractC3292y.d(this.f25869c, nVar.f25869c) && this.f25870d == nVar.f25870d && this.f25871e == nVar.f25871e;
        }

        public int hashCode() {
            String str = this.f25867a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f25868b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25869c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            o.r.c cVar = this.f25870d;
            int hashCode4 = (hashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            o.r.b bVar = this.f25871e;
            return hashCode4 + (bVar != null ? bVar.hashCode() : 0);
        }

        public String toString() {
            return "USBankAccount(linkAccountSessionId=" + this.f25867a + ", accountNumber=" + this.f25868b + ", routingNumber=" + this.f25869c + ", accountType=" + this.f25870d + ", accountHolderType=" + this.f25871e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25867a);
            out.writeString(this.f25868b);
            out.writeString(this.f25869c);
            o.r.c cVar = this.f25870d;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                cVar.writeToParcel(out, i8);
            }
            o.r.b bVar = this.f25871e;
            if (bVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                bVar.writeToParcel(out, i8);
            }
        }

        private n(String str, String str2, String str3, o.r.c cVar, o.r.b bVar) {
            this.f25867a = str;
            this.f25868b = str2;
            this.f25869c = str3;
            this.f25870d = cVar;
            this.f25871e = bVar;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public n(String linkAccountSessionId) {
            this(linkAccountSessionId, null, null, null, null);
            AbstractC3292y.i(linkAccountSessionId, "linkAccountSessionId");
        }
    }

    /* loaded from: classes4.dex */
    public static final class o implements InterfaceC2900J, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f25873a;

        /* renamed from: b, reason: collision with root package name */
        private static final a f25872b = new a(null);
        public static final Parcelable.Creator<o> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final o createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new o(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final o[] newArray(int i8) {
                return new o[i8];
            }
        }

        public o(String str) {
            this.f25873a = str;
        }

        @Override // g3.InterfaceC2900J
        public Map B() {
            Map map;
            String str = this.f25873a;
            if (str != null) {
                map = Q.e(Q5.x.a("vpa", str));
            } else {
                map = null;
            }
            if (map == null) {
                return Q.h();
            }
            return map;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && AbstractC3292y.d(this.f25873a, ((o) obj).f25873a);
        }

        public int hashCode() {
            String str = this.f25873a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Upi(vpa=" + this.f25873a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25873a);
        }
    }

    public /* synthetic */ p(c cVar, o.b bVar, o.e eVar, Map map, AbstractC3284p abstractC3284p) {
        this(cVar, bVar, eVar, map);
    }

    private final Map v() {
        i iVar;
        Map B8;
        String str = this.f25806a;
        Map map = null;
        if (AbstractC3292y.d(str, o.p.f25755i.f25773a)) {
            c cVar = this.f25808c;
            if (cVar != null) {
                B8 = cVar.B();
            }
            B8 = null;
        } else if (AbstractC3292y.d(str, o.p.f25758l.f25773a)) {
            h hVar = this.f25809d;
            if (hVar != null) {
                B8 = hVar.B();
            }
            B8 = null;
        } else if (AbstractC3292y.d(str, o.p.f25757k.f25773a)) {
            g gVar = this.f25810e;
            if (gVar != null) {
                B8 = gVar.B();
            }
            B8 = null;
        } else if (AbstractC3292y.d(str, o.p.f25759m.f25773a)) {
            k kVar = this.f25811f;
            if (kVar != null) {
                B8 = kVar.B();
            }
            B8 = null;
        } else if (AbstractC3292y.d(str, o.p.f25760n.f25773a)) {
            a aVar = this.f25812g;
            if (aVar != null) {
                B8 = aVar.B();
            }
            B8 = null;
        } else if (AbstractC3292y.d(str, o.p.f25761o.f25773a)) {
            b bVar = this.f25813h;
            if (bVar != null) {
                B8 = bVar.B();
            }
            B8 = null;
        } else if (AbstractC3292y.d(str, o.p.f25762p.f25773a)) {
            l lVar = this.f25814i;
            if (lVar != null) {
                B8 = lVar.B();
            }
            B8 = null;
        } else if (AbstractC3292y.d(str, o.p.f25763q.f25773a)) {
            o oVar = this.f25815j;
            if (oVar != null) {
                B8 = oVar.B();
            }
            B8 = null;
        } else if (AbstractC3292y.d(str, o.p.f25731A.f25773a)) {
            j jVar = this.f25816k;
            if (jVar != null) {
                B8 = jVar.B();
            }
            B8 = null;
        } else if (AbstractC3292y.d(str, o.p.f25745O.f25773a)) {
            n nVar = this.f25817l;
            if (nVar != null) {
                B8 = nVar.B();
            }
            B8 = null;
        } else {
            if (AbstractC3292y.d(str, o.p.f25754h.f25773a) && (iVar = this.f25818m) != null) {
                B8 = iVar.B();
            }
            B8 = null;
        }
        if (B8 == null || B8.isEmpty()) {
            B8 = null;
        }
        if (B8 != null) {
            map = Q.e(Q5.x.a(this.f25806a, B8));
        }
        if (map == null) {
            return Q.h();
        }
        return map;
    }

    @Override // g3.InterfaceC2900J
    public Map B() {
        Map map;
        Map map2;
        Map map3 = this.f25825t;
        Map map4 = null;
        if (map3 == null) {
            Map e8 = Q.e(Q5.x.a("type", this.f25806a));
            o.e eVar = this.f25821p;
            if (eVar != null) {
                map = Q.e(Q5.x.a("billing_details", eVar.B()));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            Map q8 = Q.q(Q.q(e8, map), v());
            Map map5 = this.f25823r;
            if (map5 != null) {
                map2 = Q.e(Q5.x.a(TtmlNode.TAG_METADATA, map5));
            } else {
                map2 = null;
            }
            if (map2 == null) {
                map2 = Q.h();
            }
            map3 = Q.q(q8, map2);
        }
        o.b bVar = this.f25822q;
        if (bVar != null) {
            map4 = Q.e(Q5.x.a("allow_redisplay", bVar.f()));
        }
        if (map4 == null) {
            map4 = Q.h();
        }
        return Q.q(map3, map4);
    }

    public final String b() {
        Map map;
        Object obj;
        String str;
        Object obj2 = B().get("card");
        if (obj2 instanceof Map) {
            map = (Map) obj2;
        } else {
            map = null;
        }
        if (map != null) {
            obj = map.get("number");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (str == null) {
            return null;
        }
        return l6.n.V0(str, 4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return AbstractC3292y.d(this.f25806a, pVar.f25806a) && this.f25807b == pVar.f25807b && AbstractC3292y.d(this.f25808c, pVar.f25808c) && AbstractC3292y.d(this.f25809d, pVar.f25809d) && AbstractC3292y.d(this.f25810e, pVar.f25810e) && AbstractC3292y.d(this.f25811f, pVar.f25811f) && AbstractC3292y.d(this.f25812g, pVar.f25812g) && AbstractC3292y.d(this.f25813h, pVar.f25813h) && AbstractC3292y.d(this.f25814i, pVar.f25814i) && AbstractC3292y.d(this.f25815j, pVar.f25815j) && AbstractC3292y.d(this.f25816k, pVar.f25816k) && AbstractC3292y.d(this.f25817l, pVar.f25817l) && AbstractC3292y.d(this.f25818m, pVar.f25818m) && AbstractC3292y.d(this.f25819n, pVar.f25819n) && AbstractC3292y.d(this.f25820o, pVar.f25820o) && AbstractC3292y.d(this.f25821p, pVar.f25821p) && this.f25822q == pVar.f25822q && AbstractC3292y.d(this.f25823r, pVar.f25823r) && AbstractC3292y.d(this.f25824s, pVar.f25824s) && AbstractC3292y.d(this.f25825t, pVar.f25825t);
    }

    public final p f(String code, boolean z8, c cVar, h hVar, g gVar, k kVar, a aVar, b bVar, l lVar, o oVar, j jVar, n nVar, i iVar, d dVar, m mVar, o.e eVar, o.b bVar2, Map map, Set productUsage, Map map2) {
        AbstractC3292y.i(code, "code");
        AbstractC3292y.i(productUsage, "productUsage");
        return new p(code, z8, cVar, hVar, gVar, kVar, aVar, bVar, lVar, oVar, jVar, nVar, iVar, dVar, mVar, eVar, bVar2, map, productUsage, map2);
    }

    public int hashCode() {
        int hashCode = ((this.f25806a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f25807b)) * 31;
        c cVar = this.f25808c;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        h hVar = this.f25809d;
        int hashCode3 = (hashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        g gVar = this.f25810e;
        int hashCode4 = (hashCode3 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        k kVar = this.f25811f;
        int hashCode5 = (hashCode4 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        a aVar = this.f25812g;
        int hashCode6 = (hashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.f25813h;
        int hashCode7 = (hashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        l lVar = this.f25814i;
        int hashCode8 = (hashCode7 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        o oVar = this.f25815j;
        int hashCode9 = (hashCode8 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        j jVar = this.f25816k;
        int hashCode10 = (hashCode9 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        n nVar = this.f25817l;
        int hashCode11 = (hashCode10 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        i iVar = this.f25818m;
        int hashCode12 = (hashCode11 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        d dVar = this.f25819n;
        int hashCode13 = (hashCode12 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        m mVar = this.f25820o;
        int hashCode14 = (hashCode13 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        o.e eVar = this.f25821p;
        int hashCode15 = (hashCode14 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        o.b bVar2 = this.f25822q;
        int hashCode16 = (hashCode15 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        Map map = this.f25823r;
        int hashCode17 = (((hashCode16 + (map == null ? 0 : map.hashCode())) * 31) + this.f25824s.hashCode()) * 31;
        Map map2 = this.f25825t;
        return hashCode17 + (map2 != null ? map2.hashCode() : 0);
    }

    public final /* synthetic */ Set i() {
        Set f8;
        if (AbstractC3292y.d(this.f25806a, o.p.f25755i.f25773a)) {
            c cVar = this.f25808c;
            if (cVar == null || (f8 = cVar.a()) == null) {
                f8 = a0.f();
            }
            return a0.m(f8, this.f25824s);
        }
        return this.f25824s;
    }

    public final o.e l() {
        return this.f25821p;
    }

    public final String p() {
        return this.f25806a;
    }

    public final boolean s() {
        return this.f25807b;
    }

    public String toString() {
        return "PaymentMethodCreateParams(code=" + this.f25806a + ", requiresMandate=" + this.f25807b + ", card=" + this.f25808c + ", ideal=" + this.f25809d + ", fpx=" + this.f25810e + ", sepaDebit=" + this.f25811f + ", auBecsDebit=" + this.f25812g + ", bacsDebit=" + this.f25813h + ", sofort=" + this.f25814i + ", upi=" + this.f25815j + ", netbanking=" + this.f25816k + ", usBankAccount=" + this.f25817l + ", link=" + this.f25818m + ", cashAppPay=" + this.f25819n + ", swish=" + this.f25820o + ", billingDetails=" + this.f25821p + ", allowRedisplay=" + this.f25822q + ", metadata=" + this.f25823r + ", productUsage=" + this.f25824s + ", overrideParamMap=" + this.f25825t + ")";
    }

    public final String u() {
        return this.f25806a;
    }

    public final String w() {
        Map map;
        Object obj = B().get("link");
        if (obj instanceof Map) {
            map = (Map) obj;
        } else {
            map = null;
        }
        if (map == null) {
            return null;
        }
        Object obj2 = map.get("payment_method_id");
        if (!(obj2 instanceof String)) {
            return null;
        }
        return (String) obj2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f25806a);
        out.writeInt(this.f25807b ? 1 : 0);
        c cVar = this.f25808c;
        if (cVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cVar.writeToParcel(out, i8);
        }
        h hVar = this.f25809d;
        if (hVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            hVar.writeToParcel(out, i8);
        }
        g gVar = this.f25810e;
        if (gVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            gVar.writeToParcel(out, i8);
        }
        k kVar = this.f25811f;
        if (kVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            kVar.writeToParcel(out, i8);
        }
        a aVar = this.f25812g;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            aVar.writeToParcel(out, i8);
        }
        b bVar = this.f25813h;
        if (bVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bVar.writeToParcel(out, i8);
        }
        l lVar = this.f25814i;
        if (lVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            lVar.writeToParcel(out, i8);
        }
        o oVar = this.f25815j;
        if (oVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            oVar.writeToParcel(out, i8);
        }
        j jVar = this.f25816k;
        if (jVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            jVar.writeToParcel(out, i8);
        }
        n nVar = this.f25817l;
        if (nVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            nVar.writeToParcel(out, i8);
        }
        i iVar = this.f25818m;
        if (iVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            iVar.writeToParcel(out, i8);
        }
        d dVar = this.f25819n;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
        m mVar = this.f25820o;
        if (mVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            mVar.writeToParcel(out, i8);
        }
        o.e eVar = this.f25821p;
        if (eVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            eVar.writeToParcel(out, i8);
        }
        o.b bVar2 = this.f25822q;
        if (bVar2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bVar2.writeToParcel(out, i8);
        }
        Map map = this.f25823r;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                out.writeString((String) entry.getKey());
                out.writeString((String) entry.getValue());
            }
        }
        Set set = this.f25824s;
        out.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            out.writeString((String) it.next());
        }
        Map map2 = this.f25825t;
        if (map2 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(map2.size());
        for (Map.Entry entry2 : map2.entrySet()) {
            out.writeString((String) entry2.getKey());
            out.writeValue(entry2.getValue());
        }
    }

    public /* synthetic */ p(g gVar, o.b bVar, o.e eVar, Map map, AbstractC3284p abstractC3284p) {
        this(gVar, bVar, eVar, map);
    }

    public /* synthetic */ p(j jVar, o.b bVar, o.e eVar, Map map, AbstractC3284p abstractC3284p) {
        this(jVar, bVar, eVar, map);
    }

    public /* synthetic */ p(n nVar, o.b bVar, o.e eVar, Map map, AbstractC3284p abstractC3284p) {
        this(nVar, bVar, eVar, map);
    }

    public p(String code, boolean z8, c cVar, h hVar, g gVar, k kVar, a aVar, b bVar, l lVar, o oVar, j jVar, n nVar, i iVar, d dVar, m mVar, o.e eVar, o.b bVar2, Map map, Set productUsage, Map map2) {
        AbstractC3292y.i(code, "code");
        AbstractC3292y.i(productUsage, "productUsage");
        this.f25806a = code;
        this.f25807b = z8;
        this.f25808c = cVar;
        this.f25809d = hVar;
        this.f25810e = gVar;
        this.f25811f = kVar;
        this.f25812g = aVar;
        this.f25813h = bVar;
        this.f25814i = lVar;
        this.f25815j = oVar;
        this.f25816k = jVar;
        this.f25817l = nVar;
        this.f25818m = iVar;
        this.f25819n = dVar;
        this.f25820o = mVar;
        this.f25821p = eVar;
        this.f25822q = bVar2;
        this.f25823r = map;
        this.f25824s = productUsage;
        this.f25825t = map2;
    }

    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC2900J, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f25836a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f25837b;

        /* renamed from: c, reason: collision with root package name */
        private final Integer f25838c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25839d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25840e;

        /* renamed from: f, reason: collision with root package name */
        private final Set f25841f;

        /* renamed from: g, reason: collision with root package name */
        private final C0520c f25842g;

        /* renamed from: h, reason: collision with root package name */
        public static final a f25834h = new a(null);

        /* renamed from: i, reason: collision with root package name */
        public static final int f25835i = 8;
        public static final Parcelable.Creator<c> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                LinkedHashSet linkedHashSet;
                AbstractC3292y.i(parcel, "parcel");
                String readString = parcel.readString();
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int readInt = parcel.readInt();
                    linkedHashSet = new LinkedHashSet(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        linkedHashSet.add(parcel.readString());
                    }
                }
                return new c(readString, valueOf, valueOf2, readString2, readString3, linkedHashSet, parcel.readInt() != 0 ? C0520c.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* renamed from: com.stripe.android.model.p$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0520c implements InterfaceC2900J, Parcelable {

            /* renamed from: a, reason: collision with root package name */
            private final String f25844a;

            /* renamed from: b, reason: collision with root package name */
            private static final a f25843b = new a(null);
            public static final Parcelable.Creator<C0520c> CREATOR = new b();

            /* renamed from: com.stripe.android.model.p$c$c$a */
            /* loaded from: classes4.dex */
            private static final class a {
                private a() {
                }

                public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                    this();
                }
            }

            /* renamed from: com.stripe.android.model.p$c$c$b */
            /* loaded from: classes4.dex */
            public static final class b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0520c createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new C0520c(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C0520c[] newArray(int i8) {
                    return new C0520c[i8];
                }
            }

            public C0520c(String str) {
                this.f25844a = str;
            }

            @Override // g3.InterfaceC2900J
            public Map B() {
                String str = this.f25844a;
                if (str != null) {
                    return Q.e(Q5.x.a("preferred", str));
                }
                return Q.h();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if ((obj instanceof C0520c) && AbstractC3292y.d(((C0520c) obj).f25844a, this.f25844a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return Objects.hash(this.f25844a);
            }

            public String toString() {
                return "PaymentMethodCreateParams.Card.Networks(preferred=" + this.f25844a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeString(this.f25844a);
            }
        }

        public c(String str, Integer num, Integer num2, String str2, String str3, Set set, C0520c c0520c) {
            this.f25836a = str;
            this.f25837b = num;
            this.f25838c = num2;
            this.f25839d = str2;
            this.f25840e = str3;
            this.f25841f = set;
            this.f25842g = c0520c;
        }

        @Override // g3.InterfaceC2900J
        public Map B() {
            Map map;
            Q5.r rVar;
            Q5.r a9 = Q5.x.a("number", this.f25836a);
            Q5.r a10 = Q5.x.a("exp_month", this.f25837b);
            Q5.r a11 = Q5.x.a("exp_year", this.f25838c);
            Q5.r a12 = Q5.x.a("cvc", this.f25839d);
            Q5.r a13 = Q5.x.a("token", this.f25840e);
            C0520c c0520c = this.f25842g;
            if (c0520c != null) {
                map = c0520c.B();
            } else {
                map = null;
            }
            List<Q5.r> p8 = AbstractC1435t.p(a9, a10, a11, a12, a13, Q5.x.a("networks", map));
            ArrayList arrayList = new ArrayList();
            for (Q5.r rVar2 : p8) {
                Object d8 = rVar2.d();
                if (d8 != null) {
                    rVar = Q5.x.a(rVar2.c(), d8);
                } else {
                    rVar = null;
                }
                if (rVar != null) {
                    arrayList.add(rVar);
                }
            }
            return Q.u(arrayList);
        }

        public final Set a() {
            return this.f25841f;
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
            return AbstractC3292y.d(this.f25836a, cVar.f25836a) && AbstractC3292y.d(this.f25837b, cVar.f25837b) && AbstractC3292y.d(this.f25838c, cVar.f25838c) && AbstractC3292y.d(this.f25839d, cVar.f25839d) && AbstractC3292y.d(this.f25840e, cVar.f25840e) && AbstractC3292y.d(this.f25841f, cVar.f25841f) && AbstractC3292y.d(this.f25842g, cVar.f25842g);
        }

        public int hashCode() {
            String str = this.f25836a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.f25837b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f25838c;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.f25839d;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25840e;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Set set = this.f25841f;
            int hashCode6 = (hashCode5 + (set == null ? 0 : set.hashCode())) * 31;
            C0520c c0520c = this.f25842g;
            return hashCode6 + (c0520c != null ? c0520c.hashCode() : 0);
        }

        public String toString() {
            return "Card(number=" + this.f25836a + ", expiryMonth=" + this.f25837b + ", expiryYear=" + this.f25838c + ", cvc=" + this.f25839d + ", token=" + this.f25840e + ", attribution=" + this.f25841f + ", networks=" + this.f25842g + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25836a);
            Integer num = this.f25837b;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Integer num2 = this.f25838c;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
            out.writeString(this.f25839d);
            out.writeString(this.f25840e);
            Set set = this.f25841f;
            if (set == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    out.writeString((String) it.next());
                }
            }
            C0520c c0520c = this.f25842g;
            if (c0520c == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                c0520c.writeToParcel(out, i8);
            }
        }

        public /* synthetic */ c(String str, Integer num, Integer num2, String str2, String str3, Set set, C0520c c0520c, int i8, AbstractC3284p abstractC3284p) {
            this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : num, (i8 & 4) != 0 ? null : num2, (i8 & 8) != 0 ? null : str2, (i8 & 16) != 0 ? null : str3, (i8 & 32) != 0 ? null : set, (i8 & 64) != 0 ? null : c0520c);
        }
    }

    public /* synthetic */ p(String str, boolean z8, c cVar, h hVar, g gVar, k kVar, a aVar, b bVar, l lVar, o oVar, j jVar, n nVar, i iVar, d dVar, m mVar, o.e eVar, o.b bVar2, Map map, Set set, Map map2, int i8, AbstractC3284p abstractC3284p) {
        this(str, z8, (i8 & 4) != 0 ? null : cVar, (i8 & 8) != 0 ? null : hVar, (i8 & 16) != 0 ? null : gVar, (i8 & 32) != 0 ? null : kVar, (i8 & 64) != 0 ? null : aVar, (i8 & 128) != 0 ? null : bVar, (i8 & 256) != 0 ? null : lVar, (i8 & 512) != 0 ? null : oVar, (i8 & 1024) != 0 ? null : jVar, (i8 & 2048) != 0 ? null : nVar, (i8 & 4096) != 0 ? null : iVar, (i8 & 8192) != 0 ? null : dVar, (i8 & 16384) != 0 ? null : mVar, (32768 & i8) != 0 ? null : eVar, (65536 & i8) != 0 ? null : bVar2, (131072 & i8) != 0 ? null : map, (262144 & i8) != 0 ? a0.f() : set, (i8 & 524288) != 0 ? null : map2);
    }

    public /* synthetic */ p(o.p pVar, c cVar, h hVar, g gVar, k kVar, a aVar, b bVar, l lVar, o oVar, j jVar, n nVar, i iVar, d dVar, m mVar, o.e eVar, o.b bVar2, Map map, Set set, Map map2, int i8, AbstractC3284p abstractC3284p) {
        this(pVar, (i8 & 2) != 0 ? null : cVar, (i8 & 4) != 0 ? null : hVar, (i8 & 8) != 0 ? null : gVar, (i8 & 16) != 0 ? null : kVar, (i8 & 32) != 0 ? null : aVar, (i8 & 64) != 0 ? null : bVar, (i8 & 128) != 0 ? null : lVar, (i8 & 256) != 0 ? null : oVar, (i8 & 512) != 0 ? null : jVar, (i8 & 1024) != 0 ? null : nVar, (i8 & 2048) != 0 ? null : iVar, (i8 & 4096) != 0 ? null : dVar, (i8 & 8192) != 0 ? null : mVar, (i8 & 16384) != 0 ? null : eVar, (i8 & 32768) != 0 ? null : bVar2, (i8 & 65536) != 0 ? null : map, (i8 & 131072) != 0 ? a0.f() : set, (i8 & 262144) == 0 ? map2 : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(o.p type, c cVar, h hVar, g gVar, k kVar, a aVar, b bVar, l lVar, o oVar, j jVar, n nVar, i iVar, d dVar, m mVar, o.e eVar, o.b bVar2, Map map, Set productUsage, Map map2) {
        this(type.f25773a, type.f25776d, cVar, hVar, gVar, kVar, aVar, bVar, lVar, oVar, jVar, nVar, iVar, dVar, mVar, eVar, bVar2, map, productUsage, map2);
        AbstractC3292y.i(type, "type");
        AbstractC3292y.i(productUsage, "productUsage");
    }

    private p(c cVar, o.b bVar, o.e eVar, Map map) {
        this(o.p.f25755i, cVar, null, null, null, null, null, null, null, null, null, null, null, null, eVar, bVar, map, null, null, 409596, null);
    }

    private p(g gVar, o.b bVar, o.e eVar, Map map) {
        this(o.p.f25757k, null, null, gVar, null, null, null, null, null, null, null, null, null, null, eVar, bVar, map, null, null, 409590, null);
    }

    private p(j jVar, o.b bVar, o.e eVar, Map map) {
        this(o.p.f25731A, null, null, null, null, null, null, null, null, jVar, null, null, null, null, eVar, bVar, map, null, null, 409086, null);
    }

    private p(n nVar, o.b bVar, o.e eVar, Map map) {
        this(o.p.f25745O, null, null, null, null, null, null, null, null, null, nVar, null, null, null, eVar, bVar, map, null, null, 408574, null);
    }
}
