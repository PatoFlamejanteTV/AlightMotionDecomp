package com.stripe.android.model;

import R5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import androidx.core.os.EnvironmentCompat;
import g3.C2895E;
import g3.EnumC2906e;
import g3.InterfaceC2900J;
import i3.AbstractC2970a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class o implements z2.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f25631a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f25632b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25633c;

    /* renamed from: d, reason: collision with root package name */
    public final String f25634d;

    /* renamed from: e, reason: collision with root package name */
    public final p f25635e;

    /* renamed from: f, reason: collision with root package name */
    public final e f25636f;

    /* renamed from: g, reason: collision with root package name */
    public final String f25637g;

    /* renamed from: h, reason: collision with root package name */
    public final g f25638h;

    /* renamed from: i, reason: collision with root package name */
    public final h f25639i;

    /* renamed from: j, reason: collision with root package name */
    public final k f25640j;

    /* renamed from: k, reason: collision with root package name */
    public final l f25641k;

    /* renamed from: l, reason: collision with root package name */
    public final n f25642l;

    /* renamed from: m, reason: collision with root package name */
    public final c f25643m;

    /* renamed from: n, reason: collision with root package name */
    public final d f25644n;

    /* renamed from: o, reason: collision with root package name */
    public final C0517o f25645o;

    /* renamed from: p, reason: collision with root package name */
    public final s f25646p;

    /* renamed from: q, reason: collision with root package name */
    public final m f25647q;

    /* renamed from: r, reason: collision with root package name */
    public final r f25648r;

    /* renamed from: s, reason: collision with root package name */
    public final b f25649s;

    /* renamed from: t, reason: collision with root package name */
    public static final i f25629t = new i(null);

    /* renamed from: u, reason: collision with root package name */
    public static final int f25630u = 8;
    public static final Parcelable.Creator<o> CREATOR = new j();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class b implements z2.f {
        public static final Parcelable.Creator<b> CREATOR;

        /* renamed from: b, reason: collision with root package name */
        public static final b f25657b = new b("UNSPECIFIED", 0, "unspecified");

        /* renamed from: c, reason: collision with root package name */
        public static final b f25658c = new b("LIMITED", 1, "limited");

        /* renamed from: d, reason: collision with root package name */
        public static final b f25659d = new b("ALWAYS", 2, "always");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ b[] f25660e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ W5.a f25661f;

        /* renamed from: a, reason: collision with root package name */
        private final String f25662a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return b.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        static {
            b[] a9 = a();
            f25660e = a9;
            f25661f = W5.b.a(a9);
            CREATOR = new a();
        }

        private b(String str, int i8, String str2) {
            this.f25662a = str2;
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f25657b, f25658c, f25659d};
        }

        public static W5.a b() {
            return f25661f;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f25660e.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String f() {
            return this.f25662a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(name());
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends q {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f25663a;

        /* renamed from: b, reason: collision with root package name */
        public final String f25664b;

        /* renamed from: c, reason: collision with root package name */
        public final String f25665c;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new c(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(String str, String str2, String str3) {
            super(null);
            this.f25663a = str;
            this.f25664b = str2;
            this.f25665c = str3;
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
            return AbstractC3292y.d(this.f25663a, cVar.f25663a) && AbstractC3292y.d(this.f25664b, cVar.f25664b) && AbstractC3292y.d(this.f25665c, cVar.f25665c);
        }

        public int hashCode() {
            String str = this.f25663a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f25664b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25665c;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "AuBecsDebit(bsbNumber=" + this.f25663a + ", fingerprint=" + this.f25664b + ", last4=" + this.f25665c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25663a);
            out.writeString(this.f25664b);
            out.writeString(this.f25665c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends q {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f25666a;

        /* renamed from: b, reason: collision with root package name */
        public final String f25667b;

        /* renamed from: c, reason: collision with root package name */
        public final String f25668c;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new d(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(String str, String str2, String str3) {
            super(null);
            this.f25666a = str;
            this.f25667b = str2;
            this.f25668c = str3;
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
            return AbstractC3292y.d(this.f25666a, dVar.f25666a) && AbstractC3292y.d(this.f25667b, dVar.f25667b) && AbstractC3292y.d(this.f25668c, dVar.f25668c);
        }

        public int hashCode() {
            String str = this.f25666a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f25667b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25668c;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "BacsDebit(fingerprint=" + this.f25666a + ", last4=" + this.f25667b + ", sortCode=" + this.f25668c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25666a);
            out.writeString(this.f25667b);
            out.writeString(this.f25668c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        private String f25679a;

        /* renamed from: b, reason: collision with root package name */
        private Long f25680b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f25681c;

        /* renamed from: d, reason: collision with root package name */
        private p f25682d;

        /* renamed from: e, reason: collision with root package name */
        private String f25683e;

        /* renamed from: f, reason: collision with root package name */
        private e f25684f;

        /* renamed from: g, reason: collision with root package name */
        private b f25685g;

        /* renamed from: h, reason: collision with root package name */
        private String f25686h;

        /* renamed from: i, reason: collision with root package name */
        private g f25687i;

        /* renamed from: j, reason: collision with root package name */
        private h f25688j;

        /* renamed from: k, reason: collision with root package name */
        private l f25689k;

        /* renamed from: l, reason: collision with root package name */
        private k f25690l;

        /* renamed from: m, reason: collision with root package name */
        private n f25691m;

        /* renamed from: n, reason: collision with root package name */
        private c f25692n;

        /* renamed from: o, reason: collision with root package name */
        private d f25693o;

        /* renamed from: p, reason: collision with root package name */
        private C0517o f25694p;

        /* renamed from: q, reason: collision with root package name */
        private m f25695q;

        /* renamed from: r, reason: collision with root package name */
        private r f25696r;

        /* renamed from: s, reason: collision with root package name */
        private s f25697s;

        public final o a() {
            String str = this.f25679a;
            Long l8 = this.f25680b;
            boolean z8 = this.f25681c;
            p pVar = this.f25682d;
            return new o(str, l8, z8, this.f25683e, pVar, this.f25684f, this.f25686h, this.f25687i, this.f25688j, this.f25690l, this.f25689k, this.f25691m, this.f25692n, this.f25693o, this.f25694p, null, this.f25695q, this.f25696r, this.f25685g, 32768, null);
        }

        public final f b(b bVar) {
            this.f25685g = bVar;
            return this;
        }

        public final f c(c cVar) {
            this.f25692n = cVar;
            return this;
        }

        public final f d(d dVar) {
            this.f25693o = dVar;
            return this;
        }

        public final f e(e eVar) {
            this.f25684f = eVar;
            return this;
        }

        public final f f(g gVar) {
            this.f25687i = gVar;
            return this;
        }

        public final f g(h hVar) {
            this.f25688j = hVar;
            return this;
        }

        public final f h(String str) {
            this.f25683e = str;
            return this;
        }

        public final f i(Long l8) {
            this.f25680b = l8;
            return this;
        }

        public final f j(String str) {
            this.f25686h = str;
            return this;
        }

        public final f k(k kVar) {
            this.f25690l = kVar;
            return this;
        }

        public final f l(String str) {
            this.f25679a = str;
            return this;
        }

        public final f m(l lVar) {
            this.f25689k = lVar;
            return this;
        }

        public final f n(boolean z8) {
            this.f25681c = z8;
            return this;
        }

        public final f o(m mVar) {
            this.f25695q = mVar;
            return this;
        }

        public final f p(n nVar) {
            this.f25691m = nVar;
            return this;
        }

        public final f q(C0517o c0517o) {
            this.f25694p = c0517o;
            return this;
        }

        public final f r(p pVar) {
            this.f25682d = pVar;
            return this;
        }

        public final f s(r rVar) {
            this.f25696r = rVar;
            return this;
        }

        public final f t(s sVar) {
            this.f25697s = sVar;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends q {
        public static final Parcelable.Creator<h> CREATOR = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final a f25717b;

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ h f25718c;

        /* renamed from: a, reason: collision with root package name */
        private final boolean f25719a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final h a() {
                return h.f25718c;
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
                return new h(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final h[] newArray(int i8) {
                return new h[i8];
            }
        }

        static {
            AbstractC3284p abstractC3284p = null;
            f25717b = new a(abstractC3284p);
            f25718c = new h(false, 1, abstractC3284p);
        }

        public /* synthetic */ h(boolean z8, int i8, AbstractC3284p abstractC3284p) {
            this((i8 & 1) != 0 ? true : z8);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f25719a == ((h) obj).f25719a;
        }

        public int hashCode() {
            return androidx.compose.foundation.a.a(this.f25719a);
        }

        public String toString() {
            return "CardPresent(ignore=" + this.f25719a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeInt(this.f25719a ? 1 : 0);
        }

        public h(boolean z8) {
            super(null);
            this.f25719a = z8;
        }
    }

    /* loaded from: classes4.dex */
    public static final class i {
        private i() {
        }

        public /* synthetic */ i(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class j implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new o(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : p.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : g.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : h.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : k.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : l.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : n.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C0517o.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : s.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : m.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : r.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? b.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o[] newArray(int i8) {
            return new o[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends q {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f25720a;

        /* renamed from: b, reason: collision with root package name */
        public final String f25721b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new k(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final k[] newArray(int i8) {
                return new k[i8];
            }
        }

        public k(String str, String str2) {
            super(null);
            this.f25720a = str;
            this.f25721b = str2;
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
            return AbstractC3292y.d(this.f25720a, kVar.f25720a) && AbstractC3292y.d(this.f25721b, kVar.f25721b);
        }

        public int hashCode() {
            String str = this.f25720a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f25721b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Fpx(bank=" + this.f25720a + ", accountHolderType=" + this.f25721b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25720a);
            out.writeString(this.f25721b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class l extends q {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f25722a;

        /* renamed from: b, reason: collision with root package name */
        public final String f25723b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new l(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final l[] newArray(int i8) {
                return new l[i8];
            }
        }

        public l(String str, String str2) {
            super(null);
            this.f25722a = str;
            this.f25723b = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return AbstractC3292y.d(this.f25722a, lVar.f25722a) && AbstractC3292y.d(this.f25723b, lVar.f25723b);
        }

        public int hashCode() {
            String str = this.f25722a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f25723b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Ideal(bank=" + this.f25722a + ", bankIdentifierCode=" + this.f25723b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25722a);
            out.writeString(this.f25723b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class m extends q {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f25724a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new m(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final m[] newArray(int i8) {
                return new m[i8];
            }
        }

        public m(String str) {
            super(null);
            this.f25724a = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && AbstractC3292y.d(this.f25724a, ((m) obj).f25724a);
        }

        public int hashCode() {
            String str = this.f25724a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Netbanking(bank=" + this.f25724a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25724a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class n extends q {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f25725a;

        /* renamed from: b, reason: collision with root package name */
        public final String f25726b;

        /* renamed from: c, reason: collision with root package name */
        public final String f25727c;

        /* renamed from: d, reason: collision with root package name */
        public final String f25728d;

        /* renamed from: e, reason: collision with root package name */
        public final String f25729e;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final n createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new n(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final n[] newArray(int i8) {
                return new n[i8];
            }
        }

        public n(String str, String str2, String str3, String str4, String str5) {
            super(null);
            this.f25725a = str;
            this.f25726b = str2;
            this.f25727c = str3;
            this.f25728d = str4;
            this.f25729e = str5;
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
            return AbstractC3292y.d(this.f25725a, nVar.f25725a) && AbstractC3292y.d(this.f25726b, nVar.f25726b) && AbstractC3292y.d(this.f25727c, nVar.f25727c) && AbstractC3292y.d(this.f25728d, nVar.f25728d) && AbstractC3292y.d(this.f25729e, nVar.f25729e);
        }

        public int hashCode() {
            String str = this.f25725a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f25726b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25727c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f25728d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f25729e;
            return hashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "SepaDebit(bankCode=" + this.f25725a + ", branchCode=" + this.f25726b + ", country=" + this.f25727c + ", fingerprint=" + this.f25728d + ", last4=" + this.f25729e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25725a);
            out.writeString(this.f25726b);
            out.writeString(this.f25727c);
            out.writeString(this.f25728d);
            out.writeString(this.f25729e);
        }
    }

    /* renamed from: com.stripe.android.model.o$o, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0517o extends q {
        public static final Parcelable.Creator<C0517o> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f25730a;

        /* renamed from: com.stripe.android.model.o$o$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0517o createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new C0517o(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0517o[] newArray(int i8) {
                return new C0517o[i8];
            }
        }

        public C0517o(String str) {
            super(null);
            this.f25730a = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0517o) && AbstractC3292y.d(this.f25730a, ((C0517o) obj).f25730a);
        }

        public int hashCode() {
            String str = this.f25730a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Sofort(country=" + this.f25730a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25730a);
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class q implements z2.f {
        private q() {
        }

        public /* synthetic */ q(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class r extends q {
        public static final Parcelable.Creator<r> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final b f25779a;

        /* renamed from: b, reason: collision with root package name */
        public final c f25780b;

        /* renamed from: c, reason: collision with root package name */
        public final String f25781c;

        /* renamed from: d, reason: collision with root package name */
        public final String f25782d;

        /* renamed from: e, reason: collision with root package name */
        public final String f25783e;

        /* renamed from: f, reason: collision with root package name */
        public final String f25784f;

        /* renamed from: g, reason: collision with root package name */
        public final d f25785g;

        /* renamed from: h, reason: collision with root package name */
        public final String f25786h;

        /* renamed from: i, reason: collision with root package name */
        public final String f25787i;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new r(b.CREATOR.createFromParcel(parcel), c.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final r[] newArray(int i8) {
                return new r[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class b implements z2.f {
            public static final Parcelable.Creator<b> CREATOR;

            /* renamed from: b, reason: collision with root package name */
            public static final b f25788b = new b("UNKNOWN", 0, EnvironmentCompat.MEDIA_UNKNOWN);

            /* renamed from: c, reason: collision with root package name */
            public static final b f25789c = new b("INDIVIDUAL", 1, "individual");

            /* renamed from: d, reason: collision with root package name */
            public static final b f25790d = new b("COMPANY", 2, "company");

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ b[] f25791e;

            /* renamed from: f, reason: collision with root package name */
            private static final /* synthetic */ W5.a f25792f;

            /* renamed from: a, reason: collision with root package name */
            private final String f25793a;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return b.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            static {
                b[] a9 = a();
                f25791e = a9;
                f25792f = W5.b.a(a9);
                CREATOR = new a();
            }

            private b(String str, int i8, String str2) {
                this.f25793a = str2;
            }

            private static final /* synthetic */ b[] a() {
                return new b[]{f25788b, f25789c, f25790d};
            }

            public static W5.a b() {
                return f25792f;
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) f25791e.clone();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String f() {
                return this.f25793a;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeString(name());
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class c implements z2.f {
            public static final Parcelable.Creator<c> CREATOR;

            /* renamed from: b, reason: collision with root package name */
            public static final c f25794b = new c("UNKNOWN", 0, EnvironmentCompat.MEDIA_UNKNOWN);

            /* renamed from: c, reason: collision with root package name */
            public static final c f25795c = new c("CHECKING", 1, "checking");

            /* renamed from: d, reason: collision with root package name */
            public static final c f25796d = new c("SAVINGS", 2, "savings");

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ c[] f25797e;

            /* renamed from: f, reason: collision with root package name */
            private static final /* synthetic */ W5.a f25798f;

            /* renamed from: a, reason: collision with root package name */
            private final String f25799a;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return c.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            static {
                c[] a9 = a();
                f25797e = a9;
                f25798f = W5.b.a(a9);
                CREATOR = new a();
            }

            private c(String str, int i8, String str2) {
                this.f25799a = str2;
            }

            private static final /* synthetic */ c[] a() {
                return new c[]{f25794b, f25795c, f25796d};
            }

            public static W5.a b() {
                return f25798f;
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) f25797e.clone();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String f() {
                return this.f25799a;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeString(name());
            }
        }

        /* loaded from: classes4.dex */
        public static final class d implements z2.f {
            public static final Parcelable.Creator<d> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final String f25800a;

            /* renamed from: b, reason: collision with root package name */
            private final List f25801b;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new d(parcel.readString(), parcel.createStringArrayList());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final d[] newArray(int i8) {
                    return new d[i8];
                }
            }

            public d(String str, List supported) {
                AbstractC3292y.i(supported, "supported");
                this.f25800a = str;
                this.f25801b = supported;
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
                return AbstractC3292y.d(this.f25800a, dVar.f25800a) && AbstractC3292y.d(this.f25801b, dVar.f25801b);
            }

            public int hashCode() {
                String str = this.f25800a;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.f25801b.hashCode();
            }

            public String toString() {
                return "USBankNetworks(preferred=" + this.f25800a + ", supported=" + this.f25801b + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeString(this.f25800a);
                out.writeStringList(this.f25801b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(b accountHolderType, c accountType, String str, String str2, String str3, String str4, d dVar, String str5) {
            super(null);
            AbstractC3292y.i(accountHolderType, "accountHolderType");
            AbstractC3292y.i(accountType, "accountType");
            this.f25779a = accountHolderType;
            this.f25780b = accountType;
            this.f25781c = str;
            this.f25782d = str2;
            this.f25783e = str3;
            this.f25784f = str4;
            this.f25785g = dVar;
            this.f25786h = str5;
            this.f25787i = str4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return this.f25779a == rVar.f25779a && this.f25780b == rVar.f25780b && AbstractC3292y.d(this.f25781c, rVar.f25781c) && AbstractC3292y.d(this.f25782d, rVar.f25782d) && AbstractC3292y.d(this.f25783e, rVar.f25783e) && AbstractC3292y.d(this.f25784f, rVar.f25784f) && AbstractC3292y.d(this.f25785g, rVar.f25785g) && AbstractC3292y.d(this.f25786h, rVar.f25786h);
        }

        public int hashCode() {
            int hashCode = ((this.f25779a.hashCode() * 31) + this.f25780b.hashCode()) * 31;
            String str = this.f25781c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f25782d;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25783e;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f25784f;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            d dVar = this.f25785g;
            int hashCode6 = (hashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            String str5 = this.f25786h;
            return hashCode6 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "USBankAccount(accountHolderType=" + this.f25779a + ", accountType=" + this.f25780b + ", bankName=" + this.f25781c + ", fingerprint=" + this.f25782d + ", last4=" + this.f25783e + ", financialConnectionsAccount=" + this.f25784f + ", networks=" + this.f25785g + ", routingNumber=" + this.f25786h + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            this.f25779a.writeToParcel(out, i8);
            this.f25780b.writeToParcel(out, i8);
            out.writeString(this.f25781c);
            out.writeString(this.f25782d);
            out.writeString(this.f25783e);
            out.writeString(this.f25784f);
            d dVar = this.f25785g;
            if (dVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                dVar.writeToParcel(out, i8);
            }
            out.writeString(this.f25786h);
        }
    }

    /* loaded from: classes4.dex */
    public static final class s extends q {
        public static final Parcelable.Creator<s> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f25802a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final s createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new s(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final s[] newArray(int i8) {
                return new s[i8];
            }
        }

        public s(String str) {
            super(null);
            this.f25802a = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && AbstractC3292y.d(this.f25802a, ((s) obj).f25802a);
        }

        public int hashCode() {
            String str = this.f25802a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Upi(vpa=" + this.f25802a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25802a);
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class t {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25803a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.f25755i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.f25756j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.f25757k.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p.f25758l.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[p.f25759m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[p.f25760n.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[p.f25761o.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[p.f25762p.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[p.f25745O.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f25803a = iArr;
        }
    }

    public o(String str, Long l8, boolean z8, String str2, p pVar, e eVar, String str3, g gVar, h hVar, k kVar, l lVar, n nVar, c cVar, d dVar, C0517o c0517o, s sVar, m mVar, r rVar, b bVar) {
        this.f25631a = str;
        this.f25632b = l8;
        this.f25633c = z8;
        this.f25634d = str2;
        this.f25635e = pVar;
        this.f25636f = eVar;
        this.f25637g = str3;
        this.f25638h = gVar;
        this.f25639i = hVar;
        this.f25640j = kVar;
        this.f25641k = lVar;
        this.f25642l = nVar;
        this.f25643m = cVar;
        this.f25644n = dVar;
        this.f25645o = c0517o;
        this.f25646p = sVar;
        this.f25647q = mVar;
        this.f25648r = rVar;
        this.f25649s = bVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0013 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() {
        /*
            r3 = this;
            com.stripe.android.model.o$p r0 = r3.f25635e
            if (r0 != 0) goto L6
            r0 = -1
            goto Le
        L6:
            int[] r1 = com.stripe.android.model.o.t.f25803a
            int r0 = r0.ordinal()
            r0 = r1[r0]
        Le:
            r1 = 0
            r2 = 1
            switch(r0) {
                case 1: goto L3d;
                case 2: goto L38;
                case 3: goto L33;
                case 4: goto L2e;
                case 5: goto L29;
                case 6: goto L24;
                case 7: goto L1f;
                case 8: goto L1a;
                case 9: goto L15;
                default: goto L13;
            }
        L13:
            r1 = 1
            goto L42
        L15:
            com.stripe.android.model.o$r r0 = r3.f25648r
            if (r0 == 0) goto L42
            goto L13
        L1a:
            com.stripe.android.model.o$o r0 = r3.f25645o
            if (r0 == 0) goto L42
            goto L13
        L1f:
            com.stripe.android.model.o$d r0 = r3.f25644n
            if (r0 == 0) goto L42
            goto L13
        L24:
            com.stripe.android.model.o$c r0 = r3.f25643m
            if (r0 == 0) goto L42
            goto L13
        L29:
            com.stripe.android.model.o$n r0 = r3.f25642l
            if (r0 == 0) goto L42
            goto L13
        L2e:
            com.stripe.android.model.o$l r0 = r3.f25641k
            if (r0 == 0) goto L42
            goto L13
        L33:
            com.stripe.android.model.o$k r0 = r3.f25640j
            if (r0 == 0) goto L42
            goto L13
        L38:
            com.stripe.android.model.o$h r0 = r3.f25639i
            if (r0 == 0) goto L42
            goto L13
        L3d:
            com.stripe.android.model.o$g r0 = r3.f25638h
            if (r0 == 0) goto L42
            goto L13
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.o.a():boolean");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return AbstractC3292y.d(this.f25631a, oVar.f25631a) && AbstractC3292y.d(this.f25632b, oVar.f25632b) && this.f25633c == oVar.f25633c && AbstractC3292y.d(this.f25634d, oVar.f25634d) && this.f25635e == oVar.f25635e && AbstractC3292y.d(this.f25636f, oVar.f25636f) && AbstractC3292y.d(this.f25637g, oVar.f25637g) && AbstractC3292y.d(this.f25638h, oVar.f25638h) && AbstractC3292y.d(this.f25639i, oVar.f25639i) && AbstractC3292y.d(this.f25640j, oVar.f25640j) && AbstractC3292y.d(this.f25641k, oVar.f25641k) && AbstractC3292y.d(this.f25642l, oVar.f25642l) && AbstractC3292y.d(this.f25643m, oVar.f25643m) && AbstractC3292y.d(this.f25644n, oVar.f25644n) && AbstractC3292y.d(this.f25645o, oVar.f25645o) && AbstractC3292y.d(this.f25646p, oVar.f25646p) && AbstractC3292y.d(this.f25647q, oVar.f25647q) && AbstractC3292y.d(this.f25648r, oVar.f25648r) && this.f25649s == oVar.f25649s;
    }

    public int hashCode() {
        String str = this.f25631a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l8 = this.f25632b;
        int hashCode2 = (((hashCode + (l8 == null ? 0 : l8.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f25633c)) * 31;
        String str2 = this.f25634d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        p pVar = this.f25635e;
        int hashCode4 = (hashCode3 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        e eVar = this.f25636f;
        int hashCode5 = (hashCode4 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str3 = this.f25637g;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        g gVar = this.f25638h;
        int hashCode7 = (hashCode6 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        h hVar = this.f25639i;
        int hashCode8 = (hashCode7 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        k kVar = this.f25640j;
        int hashCode9 = (hashCode8 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        l lVar = this.f25641k;
        int hashCode10 = (hashCode9 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        n nVar = this.f25642l;
        int hashCode11 = (hashCode10 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        c cVar = this.f25643m;
        int hashCode12 = (hashCode11 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        d dVar = this.f25644n;
        int hashCode13 = (hashCode12 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        C0517o c0517o = this.f25645o;
        int hashCode14 = (hashCode13 + (c0517o == null ? 0 : c0517o.hashCode())) * 31;
        s sVar = this.f25646p;
        int hashCode15 = (hashCode14 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        m mVar = this.f25647q;
        int hashCode16 = (hashCode15 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        r rVar = this.f25648r;
        int hashCode17 = (hashCode16 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        b bVar = this.f25649s;
        return hashCode17 + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "PaymentMethod(id=" + this.f25631a + ", created=" + this.f25632b + ", liveMode=" + this.f25633c + ", code=" + this.f25634d + ", type=" + this.f25635e + ", billingDetails=" + this.f25636f + ", customerId=" + this.f25637g + ", card=" + this.f25638h + ", cardPresent=" + this.f25639i + ", fpx=" + this.f25640j + ", ideal=" + this.f25641k + ", sepaDebit=" + this.f25642l + ", auBecsDebit=" + this.f25643m + ", bacsDebit=" + this.f25644n + ", sofort=" + this.f25645o + ", upi=" + this.f25646p + ", netbanking=" + this.f25647q + ", usBankAccount=" + this.f25648r + ", allowRedisplay=" + this.f25649s + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f25631a);
        Long l8 = this.f25632b;
        if (l8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l8.longValue());
        }
        out.writeInt(this.f25633c ? 1 : 0);
        out.writeString(this.f25634d);
        p pVar = this.f25635e;
        if (pVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            pVar.writeToParcel(out, i8);
        }
        e eVar = this.f25636f;
        if (eVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            eVar.writeToParcel(out, i8);
        }
        out.writeString(this.f25637g);
        g gVar = this.f25638h;
        if (gVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            gVar.writeToParcel(out, i8);
        }
        h hVar = this.f25639i;
        if (hVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            hVar.writeToParcel(out, i8);
        }
        k kVar = this.f25640j;
        if (kVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            kVar.writeToParcel(out, i8);
        }
        l lVar = this.f25641k;
        if (lVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            lVar.writeToParcel(out, i8);
        }
        n nVar = this.f25642l;
        if (nVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            nVar.writeToParcel(out, i8);
        }
        c cVar = this.f25643m;
        if (cVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cVar.writeToParcel(out, i8);
        }
        d dVar = this.f25644n;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
        C0517o c0517o = this.f25645o;
        if (c0517o == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c0517o.writeToParcel(out, i8);
        }
        s sVar = this.f25646p;
        if (sVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            sVar.writeToParcel(out, i8);
        }
        m mVar = this.f25647q;
        if (mVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            mVar.writeToParcel(out, i8);
        }
        r rVar = this.f25648r;
        if (rVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            rVar.writeToParcel(out, i8);
        }
        b bVar = this.f25649s;
        if (bVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bVar.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public interface a extends Parcelable {

        /* renamed from: com.stripe.android.model.o$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0512a implements a {

            /* renamed from: b, reason: collision with root package name */
            private static final boolean f25651b = false;

            /* renamed from: a, reason: collision with root package name */
            public static final C0512a f25650a = new C0512a();

            /* renamed from: c, reason: collision with root package name */
            private static final int f25652c = 5;
            public static final Parcelable.Creator<C0512a> CREATOR = new C0513a();

            /* renamed from: com.stripe.android.model.o$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0513a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0512a createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    parcel.readInt();
                    return C0512a.f25650a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C0512a[] newArray(int i8) {
                    return new C0512a[i8];
                }
            }

            private C0512a() {
            }

            @Override // com.stripe.android.model.o.a
            public int M() {
                return f25652c;
            }

            @Override // com.stripe.android.model.o.a
            public boolean T() {
                return f25651b;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0512a);
            }

            public int hashCode() {
                return -1728259977;
            }

            public String toString() {
                return "None";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeInt(1);
            }
        }

        int M();

        boolean T();

        /* loaded from: classes4.dex */
        public static final class b implements a {
            public static final Parcelable.Creator<b> CREATOR = new C0514a();

            /* renamed from: a, reason: collision with root package name */
            private final int f25653a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f25654b;

            /* renamed from: com.stripe.android.model.o$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0514a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new b(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            public b(int i8) {
                this.f25653a = i8;
                this.f25654b = true;
            }

            @Override // com.stripe.android.model.o.a
            public int M() {
                return this.f25653a;
            }

            @Override // com.stripe.android.model.o.a
            public boolean T() {
                return this.f25654b;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f25653a == ((b) obj).f25653a;
            }

            public int hashCode() {
                return this.f25653a;
            }

            public String toString() {
                return "Poll(retryCount=" + this.f25653a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeInt(this.f25653a);
            }

            public /* synthetic */ b(int i8, int i9, AbstractC3284p abstractC3284p) {
                this((i9 & 1) != 0 ? 5 : i8);
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements a {
            public static final Parcelable.Creator<c> CREATOR = new C0515a();

            /* renamed from: a, reason: collision with root package name */
            private final int f25655a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f25656b;

            /* renamed from: com.stripe.android.model.o$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0515a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new c(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            public c(int i8) {
                this.f25655a = i8;
                this.f25656b = true;
            }

            @Override // com.stripe.android.model.o.a
            public int M() {
                return this.f25655a;
            }

            @Override // com.stripe.android.model.o.a
            public boolean T() {
                return this.f25656b;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f25655a == ((c) obj).f25655a;
            }

            public int hashCode() {
                return this.f25655a;
            }

            public String toString() {
                return "Refresh(retryCount=" + this.f25655a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeInt(this.f25655a);
            }

            public /* synthetic */ c(int i8, int i9, AbstractC3284p abstractC3284p) {
                this((i9 & 1) != 0 ? 1 : i8);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends q {
        public static final Parcelable.Creator<g> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        public final EnumC2906e f25698a;

        /* renamed from: b, reason: collision with root package name */
        public final a f25699b;

        /* renamed from: c, reason: collision with root package name */
        public final String f25700c;

        /* renamed from: d, reason: collision with root package name */
        public final Integer f25701d;

        /* renamed from: e, reason: collision with root package name */
        public final Integer f25702e;

        /* renamed from: f, reason: collision with root package name */
        public final String f25703f;

        /* renamed from: g, reason: collision with root package name */
        public final String f25704g;

        /* renamed from: h, reason: collision with root package name */
        public final String f25705h;

        /* renamed from: i, reason: collision with root package name */
        public final d f25706i;

        /* renamed from: j, reason: collision with root package name */
        public final AbstractC2970a f25707j;

        /* renamed from: k, reason: collision with root package name */
        public final c f25708k;

        /* renamed from: l, reason: collision with root package name */
        public final String f25709l;

        /* loaded from: classes4.dex */
        public static final class a implements z2.f {
            public static final Parcelable.Creator<a> CREATOR = new C0516a();

            /* renamed from: a, reason: collision with root package name */
            public final String f25710a;

            /* renamed from: b, reason: collision with root package name */
            public final String f25711b;

            /* renamed from: c, reason: collision with root package name */
            public final String f25712c;

            /* renamed from: com.stripe.android.model.o$g$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0516a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new a(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public a(String str, String str2, String str3) {
                this.f25710a = str;
                this.f25711b = str2;
                this.f25712c = str3;
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
                return AbstractC3292y.d(this.f25710a, aVar.f25710a) && AbstractC3292y.d(this.f25711b, aVar.f25711b) && AbstractC3292y.d(this.f25712c, aVar.f25712c);
            }

            public int hashCode() {
                String str = this.f25710a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f25711b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f25712c;
                return hashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "Checks(addressLine1Check=" + this.f25710a + ", addressPostalCodeCheck=" + this.f25711b + ", cvcCheck=" + this.f25712c + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeString(this.f25710a);
                out.writeString(this.f25711b);
                out.writeString(this.f25712c);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new g(EnumC2906e.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel), (AbstractC2970a) parcel.readParcelable(g.class.getClassLoader()), parcel.readInt() != 0 ? c.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i8) {
                return new g[i8];
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements z2.f {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final Set f25713a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f25714b;

            /* renamed from: c, reason: collision with root package name */
            private final String f25715c;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new c(linkedHashSet, parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            public c(Set available, boolean z8, String str) {
                AbstractC3292y.i(available, "available");
                this.f25713a = available;
                this.f25714b = z8;
                this.f25715c = str;
            }

            public final Set a() {
                return this.f25713a;
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
                return AbstractC3292y.d(this.f25713a, cVar.f25713a) && this.f25714b == cVar.f25714b && AbstractC3292y.d(this.f25715c, cVar.f25715c);
            }

            public int hashCode() {
                int hashCode = ((this.f25713a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f25714b)) * 31;
                String str = this.f25715c;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "Networks(available=" + this.f25713a + ", selectionMandatory=" + this.f25714b + ", preferred=" + this.f25715c + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                Set set = this.f25713a;
                out.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    out.writeString((String) it.next());
                }
                out.writeInt(this.f25714b ? 1 : 0);
                out.writeString(this.f25715c);
            }
        }

        /* loaded from: classes4.dex */
        public static final class d implements z2.f {
            public static final Parcelable.Creator<d> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            public final boolean f25716a;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new d(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final d[] newArray(int i8) {
                    return new d[i8];
                }
            }

            public d(boolean z8) {
                this.f25716a = z8;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.f25716a == ((d) obj).f25716a;
            }

            public int hashCode() {
                return androidx.compose.foundation.a.a(this.f25716a);
            }

            public String toString() {
                return "ThreeDSecureUsage(isSupported=" + this.f25716a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeInt(this.f25716a ? 1 : 0);
            }
        }

        public /* synthetic */ g(EnumC2906e enumC2906e, a aVar, String str, Integer num, Integer num2, String str2, String str3, String str4, d dVar, AbstractC2970a abstractC2970a, c cVar, String str5, int i8, AbstractC3284p abstractC3284p) {
            this((i8 & 1) != 0 ? EnumC2906e.f32125w : enumC2906e, (i8 & 2) != 0 ? null : aVar, (i8 & 4) != 0 ? null : str, (i8 & 8) != 0 ? null : num, (i8 & 16) != 0 ? null : num2, (i8 & 32) != 0 ? null : str2, (i8 & 64) != 0 ? null : str3, (i8 & 128) != 0 ? null : str4, (i8 & 256) != 0 ? null : dVar, (i8 & 512) != 0 ? null : abstractC2970a, (i8 & 1024) != 0 ? null : cVar, (i8 & 2048) == 0 ? str5 : null);
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
            return this.f25698a == gVar.f25698a && AbstractC3292y.d(this.f25699b, gVar.f25699b) && AbstractC3292y.d(this.f25700c, gVar.f25700c) && AbstractC3292y.d(this.f25701d, gVar.f25701d) && AbstractC3292y.d(this.f25702e, gVar.f25702e) && AbstractC3292y.d(this.f25703f, gVar.f25703f) && AbstractC3292y.d(this.f25704g, gVar.f25704g) && AbstractC3292y.d(this.f25705h, gVar.f25705h) && AbstractC3292y.d(this.f25706i, gVar.f25706i) && AbstractC3292y.d(this.f25707j, gVar.f25707j) && AbstractC3292y.d(this.f25708k, gVar.f25708k) && AbstractC3292y.d(this.f25709l, gVar.f25709l);
        }

        public int hashCode() {
            int hashCode = this.f25698a.hashCode() * 31;
            a aVar = this.f25699b;
            int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str = this.f25700c;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.f25701d;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f25702e;
            int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.f25703f;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25704g;
            int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f25705h;
            int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            d dVar = this.f25706i;
            int hashCode9 = (hashCode8 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            AbstractC2970a abstractC2970a = this.f25707j;
            int hashCode10 = (hashCode9 + (abstractC2970a == null ? 0 : abstractC2970a.hashCode())) * 31;
            c cVar = this.f25708k;
            int hashCode11 = (hashCode10 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            String str5 = this.f25709l;
            return hashCode11 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "Card(brand=" + this.f25698a + ", checks=" + this.f25699b + ", country=" + this.f25700c + ", expiryMonth=" + this.f25701d + ", expiryYear=" + this.f25702e + ", fingerprint=" + this.f25703f + ", funding=" + this.f25704g + ", last4=" + this.f25705h + ", threeDSecureUsage=" + this.f25706i + ", wallet=" + this.f25707j + ", networks=" + this.f25708k + ", displayBrand=" + this.f25709l + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25698a.name());
            a aVar = this.f25699b;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f25700c);
            Integer num = this.f25701d;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Integer num2 = this.f25702e;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
            out.writeString(this.f25703f);
            out.writeString(this.f25704g);
            out.writeString(this.f25705h);
            d dVar = this.f25706i;
            if (dVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                dVar.writeToParcel(out, i8);
            }
            out.writeParcelable(this.f25707j, i8);
            c cVar = this.f25708k;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                cVar.writeToParcel(out, i8);
            }
            out.writeString(this.f25709l);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(EnumC2906e brand, a aVar, String str, Integer num, Integer num2, String str2, String str3, String str4, d dVar, AbstractC2970a abstractC2970a, c cVar, String str5) {
            super(null);
            AbstractC3292y.i(brand, "brand");
            this.f25698a = brand;
            this.f25699b = aVar;
            this.f25700c = str;
            this.f25701d = num;
            this.f25702e = num2;
            this.f25703f = str2;
            this.f25704g = str3;
            this.f25705h = str4;
            this.f25706i = dVar;
            this.f25707j = abstractC2970a;
            this.f25708k = cVar;
            this.f25709l = str5;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements z2.f, InterfaceC2900J {

        /* renamed from: f, reason: collision with root package name */
        public static final int f25670f = 0;

        /* renamed from: a, reason: collision with root package name */
        public final com.stripe.android.model.a f25671a;

        /* renamed from: b, reason: collision with root package name */
        public final String f25672b;

        /* renamed from: c, reason: collision with root package name */
        public final String f25673c;

        /* renamed from: d, reason: collision with root package name */
        public final String f25674d;

        /* renamed from: e, reason: collision with root package name */
        public static final b f25669e = new b(null);
        public static final Parcelable.Creator<e> CREATOR = new c();

        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private com.stripe.android.model.a f25675a;

            /* renamed from: b, reason: collision with root package name */
            private String f25676b;

            /* renamed from: c, reason: collision with root package name */
            private String f25677c;

            /* renamed from: d, reason: collision with root package name */
            private String f25678d;

            public final e a() {
                return new e(this.f25675a, this.f25676b, this.f25677c, this.f25678d);
            }

            public final a b(com.stripe.android.model.a aVar) {
                this.f25675a = aVar;
                return this;
            }

            public final a c(String str) {
                this.f25676b = str;
                return this;
            }

            public final a d(String str) {
                this.f25677c = str;
                return this;
            }

            public final a e(String str) {
                this.f25678d = str;
                return this;
            }
        }

        /* loaded from: classes4.dex */
        public static final class b {
            private b() {
            }

            public final e a(C2895E shippingInformation) {
                AbstractC3292y.i(shippingInformation, "shippingInformation");
                return new e(shippingInformation.a(), null, shippingInformation.b(), shippingInformation.f(), 2, null);
            }

            public /* synthetic */ b(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new e(parcel.readInt() == 0 ? null : com.stripe.android.model.a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        public e(com.stripe.android.model.a aVar, String str, String str2, String str3) {
            this.f25671a = aVar;
            this.f25672b = str;
            this.f25673c = str2;
            this.f25674d = str3;
        }

        @Override // g3.InterfaceC2900J
        public Map B() {
            Map map;
            Map map2;
            Map map3;
            Map h8 = Q.h();
            com.stripe.android.model.a aVar = this.f25671a;
            Map map4 = null;
            if (aVar != null) {
                map = Q.e(Q5.x.a("address", aVar.B()));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            Map q8 = Q.q(h8, map);
            String str = this.f25672b;
            if (str != null) {
                map2 = Q.e(Q5.x.a(NotificationCompat.CATEGORY_EMAIL, str));
            } else {
                map2 = null;
            }
            if (map2 == null) {
                map2 = Q.h();
            }
            Map q9 = Q.q(q8, map2);
            String str2 = this.f25673c;
            if (str2 != null) {
                map3 = Q.e(Q5.x.a("name", str2));
            } else {
                map3 = null;
            }
            if (map3 == null) {
                map3 = Q.h();
            }
            Map q10 = Q.q(q9, map3);
            String str3 = this.f25674d;
            if (str3 != null) {
                map4 = Q.e(Q5.x.a(HintConstants.AUTOFILL_HINT_PHONE, str3));
            }
            if (map4 == null) {
                map4 = Q.h();
            }
            return Q.q(q10, map4);
        }

        public final boolean a() {
            com.stripe.android.model.a aVar = this.f25671a;
            if ((aVar == null || !aVar.p()) && this.f25672b == null && this.f25673c == null && this.f25674d == null) {
                return false;
            }
            return true;
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
            return AbstractC3292y.d(this.f25671a, eVar.f25671a) && AbstractC3292y.d(this.f25672b, eVar.f25672b) && AbstractC3292y.d(this.f25673c, eVar.f25673c) && AbstractC3292y.d(this.f25674d, eVar.f25674d);
        }

        public int hashCode() {
            com.stripe.android.model.a aVar = this.f25671a;
            int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            String str = this.f25672b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f25673c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25674d;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "BillingDetails(address=" + this.f25671a + ", email=" + this.f25672b + ", name=" + this.f25673c + ", phone=" + this.f25674d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            com.stripe.android.model.a aVar = this.f25671a;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f25672b);
            out.writeString(this.f25673c);
            out.writeString(this.f25674d);
        }

        public /* synthetic */ e(com.stripe.android.model.a aVar, String str, String str2, String str3, int i8, AbstractC3284p abstractC3284p) {
            this((i8 & 1) != 0 ? null : aVar, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : str3);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class p implements Parcelable {

        /* renamed from: A, reason: collision with root package name */
        public static final p f25731A;

        /* renamed from: B, reason: collision with root package name */
        public static final p f25732B;
        public static final Parcelable.Creator<p> CREATOR;

        /* renamed from: D, reason: collision with root package name */
        public static final p f25734D;

        /* renamed from: E, reason: collision with root package name */
        public static final p f25735E;

        /* renamed from: F, reason: collision with root package name */
        public static final p f25736F;

        /* renamed from: G, reason: collision with root package name */
        public static final p f25737G;

        /* renamed from: H, reason: collision with root package name */
        public static final p f25738H;

        /* renamed from: I, reason: collision with root package name */
        public static final p f25739I;

        /* renamed from: J, reason: collision with root package name */
        public static final p f25740J;

        /* renamed from: K, reason: collision with root package name */
        public static final p f25741K;

        /* renamed from: L, reason: collision with root package name */
        public static final p f25742L;

        /* renamed from: M, reason: collision with root package name */
        public static final p f25743M;

        /* renamed from: N, reason: collision with root package name */
        public static final p f25744N;

        /* renamed from: O, reason: collision with root package name */
        public static final p f25745O;

        /* renamed from: P, reason: collision with root package name */
        public static final p f25746P;

        /* renamed from: R, reason: collision with root package name */
        public static final p f25748R;

        /* renamed from: S, reason: collision with root package name */
        public static final p f25749S;

        /* renamed from: T, reason: collision with root package name */
        public static final p f25750T;

        /* renamed from: U, reason: collision with root package name */
        private static final /* synthetic */ p[] f25751U;

        /* renamed from: V, reason: collision with root package name */
        private static final /* synthetic */ W5.a f25752V;

        /* renamed from: g, reason: collision with root package name */
        public static final a f25753g;

        /* renamed from: h, reason: collision with root package name */
        public static final p f25754h;

        /* renamed from: i, reason: collision with root package name */
        public static final p f25755i;

        /* renamed from: j, reason: collision with root package name */
        public static final p f25756j;

        /* renamed from: k, reason: collision with root package name */
        public static final p f25757k;

        /* renamed from: l, reason: collision with root package name */
        public static final p f25758l;

        /* renamed from: m, reason: collision with root package name */
        public static final p f25759m;

        /* renamed from: n, reason: collision with root package name */
        public static final p f25760n;

        /* renamed from: o, reason: collision with root package name */
        public static final p f25761o;

        /* renamed from: p, reason: collision with root package name */
        public static final p f25762p;

        /* renamed from: q, reason: collision with root package name */
        public static final p f25763q;

        /* renamed from: s, reason: collision with root package name */
        public static final p f25765s;

        /* renamed from: t, reason: collision with root package name */
        public static final p f25766t;

        /* renamed from: u, reason: collision with root package name */
        public static final p f25767u;

        /* renamed from: v, reason: collision with root package name */
        public static final p f25768v;

        /* renamed from: w, reason: collision with root package name */
        public static final p f25769w;

        /* renamed from: x, reason: collision with root package name */
        public static final p f25770x;

        /* renamed from: y, reason: collision with root package name */
        public static final p f25771y;

        /* renamed from: z, reason: collision with root package name */
        public static final p f25772z;

        /* renamed from: a, reason: collision with root package name */
        public final String f25773a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f25774b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f25775c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f25776d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f25777e;

        /* renamed from: f, reason: collision with root package name */
        private final a f25778f;

        /* renamed from: r, reason: collision with root package name */
        public static final p f25764r = new p("P24", 10, "p24", false, false, false, false, null, 32, null);

        /* renamed from: C, reason: collision with root package name */
        public static final p f25733C = new p("WeChatPay", 21, "wechat_pay", false, false, false, false, new a.c(5));

        /* renamed from: Q, reason: collision with root package name */
        public static final p f25747Q = new p("Boleto", 35, "boleto", false, true, false, true, null, 32, 0 == true ? 1 : 0);

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final /* synthetic */ p a(String str) {
                Object obj;
                Iterator<E> it = p.f().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3292y.d(((p) obj).f25773a, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (p) obj;
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return p.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final p[] newArray(int i8) {
                return new p[i8];
            }
        }

        static {
            boolean z8 = false;
            boolean z9 = false;
            f25754h = new p("Link", 0, "link", false, z8, true, z9, null, 32, null);
            int i8 = 32;
            AbstractC3284p abstractC3284p = null;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            a aVar = null;
            f25755i = new p("Card", 1, "card", true, z10, z11, z12, aVar, i8, abstractC3284p);
            int i9 = 32;
            AbstractC3284p abstractC3284p2 = null;
            boolean z13 = false;
            boolean z14 = false;
            a aVar2 = null;
            f25756j = new p("CardPresent", 2, "card_present", z8, z13, z9, z14, aVar2, i9, abstractC3284p2);
            boolean z15 = false;
            f25757k = new p("Fpx", 3, "fpx", z15, z10, z11, z12, aVar, i8, abstractC3284p);
            boolean z16 = true;
            f25758l = new p("Ideal", 4, "ideal", z8, z13, z16, z14, aVar2, i9, abstractC3284p2);
            boolean z17 = true;
            boolean z18 = true;
            f25759m = new p("SepaDebit", 5, "sepa_debit", z15, z10, z17, z18, aVar, i8, abstractC3284p);
            boolean z19 = true;
            f25760n = new p("AuBecsDebit", 6, "au_becs_debit", true, z13, z16, z19, aVar2, i9, abstractC3284p2);
            f25761o = new p("BacsDebit", 7, "bacs_debit", true, z10, z17, z18, aVar, i8, abstractC3284p);
            f25762p = new p("Sofort", 8, "sofort", false, z13, z16, z19, aVar2, i9, abstractC3284p2);
            int i10 = 0;
            int i11 = 1;
            AbstractC3284p abstractC3284p3 = null;
            f25763q = new p("Upi", 9, "upi", false, false, false, false, new a.c(i10, i11, abstractC3284p3));
            int i12 = 32;
            AbstractC3284p abstractC3284p4 = null;
            boolean z20 = false;
            boolean z21 = false;
            boolean z22 = true;
            boolean z23 = false;
            a aVar3 = null;
            f25765s = new p("Bancontact", 11, "bancontact", z20, z21, z22, z23, aVar3, i12, abstractC3284p4);
            int i13 = 32;
            AbstractC3284p abstractC3284p5 = null;
            boolean z24 = false;
            boolean z25 = false;
            f25766t = new p("Giropay", 12, "giropay", z24, false, z25, false, null, i13, abstractC3284p5);
            f25767u = new p("Eps", 13, "eps", z20, z21, z22, z23, aVar3, i12, abstractC3284p4);
            f25768v = new p("Oxxo", 14, "oxxo", z24, true, z25, true, 0 == true ? 1 : 0, i13, abstractC3284p5);
            boolean z26 = false;
            f25769w = new p("Alipay", 15, "alipay", z20, z21, z26, z23, aVar3, i12, abstractC3284p4);
            boolean z27 = false;
            boolean z28 = false;
            f25770x = new p("GrabPay", 16, "grabpay", z24, z27, z25, z28, 0 == true ? 1 : 0, i13, abstractC3284p5);
            f25771y = new p("PayPal", 17, "paypal", z20, z21, z26, z23, aVar3, i12, abstractC3284p4);
            f25772z = new p("AfterpayClearpay", 18, "afterpay_clearpay", z24, z27, z25, z28, 0 == true ? 1 : 0, i13, abstractC3284p5);
            f25731A = new p("Netbanking", 19, "netbanking", z20, z21, z26, z23, aVar3, i12, abstractC3284p4);
            f25732B = new p("Blik", 20, "blik", z24, z27, z25, z28, 0 == true ? 1 : 0, i13, abstractC3284p5);
            f25734D = new p("Klarna", 22, "klarna", false, false, z24, z27, null, 32, 0 == true ? 1 : 0);
            int i14 = 32;
            AbstractC3284p abstractC3284p6 = null;
            boolean z29 = false;
            boolean z30 = false;
            a aVar4 = null;
            f25735E = new p("Affirm", 23, "affirm", z29, false, z30, false, aVar4, i14, abstractC3284p6);
            int i15 = 32;
            AbstractC3284p abstractC3284p7 = null;
            a aVar5 = null;
            f25736F = new p("RevolutPay", 24, "revolut_pay", z20, z21, z26, z23, aVar5, i15, abstractC3284p7);
            int i16 = 32;
            AbstractC3284p abstractC3284p8 = null;
            boolean z31 = false;
            boolean z32 = false;
            f25737G = new p("Sunbit", 25, "sunbit", z24, z27, z31, z32, 0 == true ? 1 : 0, i16, abstractC3284p8);
            f25738H = new p("Billie", 26, "billie", z20, z21, z26, z23, aVar5, i15, abstractC3284p7);
            f25739I = new p("Satispay", 27, "satispay", z24, z27, z31, z32, 0 == true ? 1 : 0, i16, abstractC3284p8);
            f25740J = new p("AmazonPay", 28, "amazon_pay", z20, z21, z26, z23, aVar5, i15, abstractC3284p7);
            f25741K = new p("Alma", 29, "alma", z24, z27, z31, z32, 0 == true ? 1 : 0, i16, abstractC3284p8);
            f25742L = new p("MobilePay", 30, "mobilepay", z20, z21, z26, z23, aVar5, i15, abstractC3284p7);
            boolean z33 = true;
            f25743M = new p("Multibanco", 31, "multibanco", z24, true, z31, z33, 0 == true ? 1 : 0, i16, abstractC3284p8);
            f25744N = new p("Zip", 32, "zip", z20, z21, z26, z23, aVar5, i15, abstractC3284p7);
            f25745O = new p("USBankAccount", 33, "us_bank_account", true, false, true, z33, 0 == true ? 1 : 0, i16, abstractC3284p8);
            f25746P = new p("CashAppPay", 34, "cashapp", false, false, false, false, new a.c(i10, i11, abstractC3284p3));
            f25748R = new p("Konbini", 36, "konbini", z29, true, z30, true, aVar4, i14, abstractC3284p6);
            f25749S = new p("Swish", 37, "swish", false, false, false, false, new a.b(i10, i11, abstractC3284p3));
            f25750T = new p("Twint", 38, "twint", false, false, false, false, new a.b(i10, i11, abstractC3284p3));
            p[] a9 = a();
            f25751U = a9;
            f25752V = W5.b.a(a9);
            f25753g = new a(abstractC3284p3);
            CREATOR = new b();
        }

        private p(String str, int i8, String str2, boolean z8, boolean z9, boolean z10, boolean z11, a aVar) {
            this.f25773a = str2;
            this.f25774b = z8;
            this.f25775c = z9;
            this.f25776d = z10;
            this.f25777e = z11;
            this.f25778f = aVar;
        }

        private static final /* synthetic */ p[] a() {
            return new p[]{f25754h, f25755i, f25756j, f25757k, f25758l, f25759m, f25760n, f25761o, f25762p, f25763q, f25764r, f25765s, f25766t, f25767u, f25768v, f25769w, f25770x, f25771y, f25772z, f25731A, f25732B, f25733C, f25734D, f25735E, f25736F, f25737G, f25738H, f25739I, f25740J, f25741K, f25742L, f25743M, f25744N, f25745O, f25746P, f25747Q, f25748R, f25749S, f25750T};
        }

        public static W5.a f() {
            return f25752V;
        }

        public static p valueOf(String str) {
            return (p) Enum.valueOf(p.class, str);
        }

        public static p[] values() {
            return (p[]) f25751U.clone();
        }

        public final a b() {
            return this.f25778f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final boolean h() {
            return this.f25777e;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f25773a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(name());
        }

        /* synthetic */ p(String str, int i8, String str2, boolean z8, boolean z9, boolean z10, boolean z11, a aVar, int i9, AbstractC3284p abstractC3284p) {
            this(str, i8, str2, z8, z9, z10, z11, (i9 & 32) != 0 ? a.C0512a.f25650a : aVar);
        }
    }

    public /* synthetic */ o(String str, Long l8, boolean z8, String str2, p pVar, e eVar, String str3, g gVar, h hVar, k kVar, l lVar, n nVar, c cVar, d dVar, C0517o c0517o, s sVar, m mVar, r rVar, b bVar, int i8, AbstractC3284p abstractC3284p) {
        this(str, l8, z8, str2, pVar, (i8 & 32) != 0 ? null : eVar, (i8 & 64) != 0 ? null : str3, (i8 & 128) != 0 ? null : gVar, (i8 & 256) != 0 ? null : hVar, (i8 & 512) != 0 ? null : kVar, (i8 & 1024) != 0 ? null : lVar, (i8 & 2048) != 0 ? null : nVar, (i8 & 4096) != 0 ? null : cVar, (i8 & 8192) != 0 ? null : dVar, (i8 & 16384) != 0 ? null : c0517o, (32768 & i8) != 0 ? null : sVar, (65536 & i8) != 0 ? null : mVar, (131072 & i8) != 0 ? null : rVar, (i8 & 262144) != 0 ? null : bVar);
    }
}
