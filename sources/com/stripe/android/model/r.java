package com.stripe.android.model;

import R5.AbstractC1435t;
import R5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import com.stripe.android.model.b;
import com.stripe.android.model.o;
import g3.InterfaceC2900J;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class r implements InterfaceC2900J, Parcelable {

    /* renamed from: b */
    public static final int f25879b = 0;

    /* renamed from: a */
    private final o.p f25880a;

    /* loaded from: classes4.dex */
    public static final class a extends r {

        /* renamed from: c */
        private String f25883c;

        /* renamed from: d */
        public static final C0522a f25881d = new C0522a(null);

        /* renamed from: e */
        public static final int f25882e = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.model.r$a$a */
        /* loaded from: classes4.dex */
        public static final class C0522a {
            private C0522a() {
            }

            public /* synthetic */ C0522a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new a(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String code) {
            super(o.p.f25732B, null);
            AbstractC3292y.i(code, "code");
            this.f25883c = code;
        }

        @Override // com.stripe.android.model.r
        public List a() {
            return AbstractC1435t.e(Q5.x.a("code", this.f25883c));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3292y.d(this.f25883c, ((a) obj).f25883c);
        }

        public int hashCode() {
            return this.f25883c.hashCode();
        }

        public String toString() {
            return "Blik(code=" + this.f25883c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25883c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends r {

        /* renamed from: c */
        private String f25886c;

        /* renamed from: d */
        private String f25887d;

        /* renamed from: e */
        private b.c f25888e;

        /* renamed from: f */
        private Boolean f25889f;

        /* renamed from: g */
        private static final a f25884g = new a(null);

        /* renamed from: h */
        public static final int f25885h = 8;
        public static final Parcelable.Creator<b> CREATOR = new C0523b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* renamed from: com.stripe.android.model.r$b$b */
        /* loaded from: classes4.dex */
        public static final class C0523b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Boolean bool = null;
                b.c valueOf = parcel.readInt() == 0 ? null : b.c.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new b(readString, readString2, valueOf, bool);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public /* synthetic */ b(String str, String str2, b.c cVar, Boolean bool, int i8, AbstractC3284p abstractC3284p) {
            this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : cVar, (i8 & 8) != 0 ? null : bool);
        }

        public static /* synthetic */ b f(b bVar, String str, String str2, b.c cVar, Boolean bool, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = bVar.f25886c;
            }
            if ((i8 & 2) != 0) {
                str2 = bVar.f25887d;
            }
            if ((i8 & 4) != 0) {
                cVar = bVar.f25888e;
            }
            if ((i8 & 8) != 0) {
                bool = bVar.f25889f;
            }
            return bVar.b(str, str2, cVar, bool);
        }

        @Override // com.stripe.android.model.r
        public List a() {
            String str;
            Q5.r a9 = Q5.x.a("cvc", this.f25886c);
            Q5.r a10 = Q5.x.a("network", this.f25887d);
            Q5.r a11 = Q5.x.a("moto", this.f25889f);
            b.c cVar = this.f25888e;
            if (cVar != null) {
                str = cVar.b();
            } else {
                str = null;
            }
            return AbstractC1435t.p(a9, a10, a11, Q5.x.a("setup_future_usage", str));
        }

        public final b b(String str, String str2, b.c cVar, Boolean bool) {
            return new b(str, str2, cVar, bool);
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
            return AbstractC3292y.d(this.f25886c, bVar.f25886c) && AbstractC3292y.d(this.f25887d, bVar.f25887d) && this.f25888e == bVar.f25888e && AbstractC3292y.d(this.f25889f, bVar.f25889f);
        }

        public final b.c h() {
            return this.f25888e;
        }

        public int hashCode() {
            String str = this.f25886c;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f25887d;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            b.c cVar = this.f25888e;
            int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            Boolean bool = this.f25889f;
            return hashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "Card(cvc=" + this.f25886c + ", network=" + this.f25887d + ", setupFutureUsage=" + this.f25888e + ", moto=" + this.f25889f + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25886c);
            out.writeString(this.f25887d);
            b.c cVar = this.f25888e;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(cVar.name());
            }
            Boolean bool = this.f25889f;
            if (bool == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(bool.booleanValue() ? 1 : 0);
            }
        }

        public b(String str, String str2, b.c cVar, Boolean bool) {
            super(o.p.f25755i, null);
            this.f25886c = str;
            this.f25887d = str2;
            this.f25888e = cVar;
            this.f25889f = bool;
        }

        public /* synthetic */ b(String str, String str2, b.c cVar, int i8, AbstractC3284p abstractC3284p) {
            this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : cVar);
        }

        public b(String str, String str2, b.c cVar) {
            this(str, str2, cVar, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends r {

        /* renamed from: c */
        private final String f25891c;

        /* renamed from: d */
        public static final a f25890d = new a(null);
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
            /* renamed from: a */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new c(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String confirmationNumber) {
            super(o.p.f25748R, null);
            AbstractC3292y.i(confirmationNumber, "confirmationNumber");
            this.f25891c = confirmationNumber;
        }

        @Override // com.stripe.android.model.r
        public List a() {
            return AbstractC1435t.e(Q5.x.a("confirmation_number", this.f25891c));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3292y.d(this.f25891c, ((c) obj).f25891c);
        }

        public int hashCode() {
            return this.f25891c.hashCode();
        }

        public String toString() {
            return "Konbini(confirmationNumber=" + this.f25891c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25891c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends r {

        /* renamed from: c */
        private b.c f25894c;

        /* renamed from: d */
        public static final a f25892d = new a(null);

        /* renamed from: e */
        public static final int f25893e = 8;
        public static final Parcelable.Creator<d> CREATOR = new b();

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
            /* renamed from: a */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new d(parcel.readInt() == 0 ? null : b.c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(b.c cVar) {
            super(o.p.f25745O, null);
            this.f25894c = cVar;
        }

        @Override // com.stripe.android.model.r
        public List a() {
            String str;
            b.c cVar = this.f25894c;
            if (cVar != null) {
                str = cVar.b();
            } else {
                str = null;
            }
            return AbstractC1435t.e(Q5.x.a("setup_future_usage", str));
        }

        public final b.c b() {
            return this.f25894c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f25894c == ((d) obj).f25894c;
        }

        public int hashCode() {
            b.c cVar = this.f25894c;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public String toString() {
            return "USBankAccount(setupFutureUsage=" + this.f25894c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            b.c cVar = this.f25894c;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(cVar.name());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends r {

        /* renamed from: c */
        private String f25897c;

        /* renamed from: d */
        public static final a f25895d = new a(null);

        /* renamed from: e */
        public static final int f25896e = 8;
        public static final Parcelable.Creator<e> CREATOR = new b();

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
            /* renamed from: a */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new e(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String appId) {
            super(o.p.f25733C, null);
            AbstractC3292y.i(appId, "appId");
            this.f25897c = appId;
        }

        @Override // com.stripe.android.model.r
        public List a() {
            return AbstractC1435t.p(Q5.x.a("client", "android"), Q5.x.a(MBridgeConstans.APP_ID, this.f25897c));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && AbstractC3292y.d(this.f25897c, ((e) obj).f25897c);
        }

        public int hashCode() {
            return this.f25897c.hashCode();
        }

        public String toString() {
            return "WeChatPay(appId=" + this.f25897c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25897c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends r {

        /* renamed from: c */
        public static final f f25898c = new f();
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final f createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                parcel.readInt();
                return f.f25898c;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final f[] newArray(int i8) {
                return new f[i8];
            }
        }

        private f() {
            super(o.p.f25733C, null);
        }

        @Override // com.stripe.android.model.r
        public List a() {
            return AbstractC1435t.e(Q5.x.a("client", "mobile_web"));
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

    public /* synthetic */ r(o.p pVar, AbstractC3284p abstractC3284p) {
        this(pVar);
    }

    @Override // g3.InterfaceC2900J
    public Map B() {
        Map map;
        List<Q5.r> a9 = a();
        Map h8 = Q.h();
        for (Q5.r rVar : a9) {
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
        if (!h8.isEmpty()) {
            return Q.e(Q5.x.a(this.f25880a.f25773a, h8));
        }
        return Q.h();
    }

    public abstract List a();

    private r(o.p pVar) {
        this.f25880a = pVar;
    }
}
