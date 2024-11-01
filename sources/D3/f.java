package D3;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.b;
import com.stripe.android.model.o;
import com.stripe.android.model.p;
import com.stripe.android.model.q;
import com.stripe.android.model.r;
import g3.C2912k;
import g3.EnumC2906e;
import g4.n;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import v3.t;

/* loaded from: classes4.dex */
public abstract class f implements Parcelable {

    /* loaded from: classes4.dex */
    public static final class a extends Enum {

        /* renamed from: b */
        public static final a f1246b = new a("RequestReuse", 0, b.c.f25450c);

        /* renamed from: c */
        public static final a f1247c = new a("RequestNoReuse", 1, b.c.f25451d);

        /* renamed from: d */
        public static final a f1248d = new a("NoRequest", 2, null);

        /* renamed from: e */
        private static final /* synthetic */ a[] f1249e;

        /* renamed from: f */
        private static final /* synthetic */ W5.a f1250f;

        /* renamed from: a */
        private final b.c f1251a;

        static {
            a[] a9 = a();
            f1249e = a9;
            f1250f = W5.b.a(a9);
        }

        private a(String str, int i8, b.c cVar) {
            super(str, i8);
            this.f1251a = cVar;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f1246b, f1247c, f1248d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f1249e.clone();
        }

        public final b.c b() {
            return this.f1251a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends f {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a */
        private final String f1252a;

        /* renamed from: b */
        private final o.e f1253b;

        /* renamed from: c */
        private final C2.c f1254c;

        /* renamed from: d */
        private final int f1255d;

        /* renamed from: e */
        private final String f1256e;

        /* renamed from: f */
        private final String f1257f;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new b(parcel.readString(), (o.e) parcel.readParcelable(b.class.getClassLoader()), (C2.c) parcel.readParcelable(b.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String type, o.e eVar, C2.c label, int i8, String str, String str2) {
            super(null);
            AbstractC3292y.i(type, "type");
            AbstractC3292y.i(label, "label");
            this.f1252a = type;
            this.f1253b = eVar;
            this.f1254c = label;
            this.f1255d = i8;
            this.f1256e = str;
            this.f1257f = str2;
        }

        @Override // D3.f
        public boolean a() {
            return false;
        }

        @Override // D3.f
        public C2.c b(String merchantName, boolean z8) {
            AbstractC3292y.i(merchantName, "merchantName");
            return null;
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
            if (AbstractC3292y.d(this.f1252a, bVar.f1252a) && AbstractC3292y.d(this.f1253b, bVar.f1253b) && AbstractC3292y.d(this.f1254c, bVar.f1254c) && this.f1255d == bVar.f1255d && AbstractC3292y.d(this.f1256e, bVar.f1256e) && AbstractC3292y.d(this.f1257f, bVar.f1257f)) {
                return true;
            }
            return false;
        }

        public final o.e f() {
            return this.f1253b;
        }

        public final String getType() {
            return this.f1252a;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = this.f1252a.hashCode() * 31;
            o.e eVar = this.f1253b;
            int i8 = 0;
            if (eVar == null) {
                hashCode = 0;
            } else {
                hashCode = eVar.hashCode();
            }
            int hashCode4 = (((((hashCode3 + hashCode) * 31) + this.f1254c.hashCode()) * 31) + this.f1255d) * 31;
            String str = this.f1256e;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i9 = (hashCode4 + hashCode2) * 31;
            String str2 = this.f1257f;
            if (str2 != null) {
                i8 = str2.hashCode();
            }
            return i9 + i8;
        }

        public String toString() {
            return "ExternalPaymentMethod(type=" + this.f1252a + ", billingDetails=" + this.f1253b + ", label=" + this.f1254c + ", iconResource=" + this.f1255d + ", lightThemeIconUrl=" + this.f1256e + ", darkThemeIconUrl=" + this.f1257f + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f1252a);
            out.writeParcelable(this.f1253b, i8);
            out.writeParcelable(this.f1254c, i8);
            out.writeInt(this.f1255d);
            out.writeString(this.f1256e);
            out.writeString(this.f1257f);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends f {

        /* renamed from: a */
        public static final c f1258a = new c();
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                parcel.readInt();
                return c.f1258a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        private c() {
            super(null);
        }

        @Override // D3.f
        public boolean a() {
            return false;
        }

        @Override // D3.f
        public C2.c b(String merchantName, boolean z8) {
            AbstractC3292y.i(merchantName, "merchantName");
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -61554386;
        }

        public String toString() {
            return "GooglePay";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends f {

        /* renamed from: a */
        public static final d f1259a = new d();
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                parcel.readInt();
                return d.f1259a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        private d() {
            super(null);
        }

        @Override // D3.f
        public boolean a() {
            return false;
        }

        @Override // D3.f
        public C2.c b(String merchantName, boolean z8) {
            AbstractC3292y.i(merchantName, "merchantName");
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj || (obj instanceof d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -395165925;
        }

        public String toString() {
            return "Link";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class e extends f {

        /* loaded from: classes4.dex */
        public static final class a extends e {

            /* renamed from: a */
            private final p f1261a;

            /* renamed from: b */
            private final EnumC2906e f1262b;

            /* renamed from: c */
            private final a f1263c;

            /* renamed from: d */
            private final r f1264d;

            /* renamed from: e */
            private final q f1265e;

            /* renamed from: f */
            private final String f1266f;

            /* renamed from: g */
            public static final int f1260g = (q.f25874b | r.f25879b) | p.f25805v;
            public static final Parcelable.Creator<a> CREATOR = new C0022a();

            /* renamed from: D3.f$e$a$a */
            /* loaded from: classes4.dex */
            public static final class C0022a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new a((p) parcel.readParcelable(a.class.getClassLoader()), EnumC2906e.valueOf(parcel.readString()), a.valueOf(parcel.readString()), (r) parcel.readParcelable(a.class.getClassLoader()), (q) parcel.readParcelable(a.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public /* synthetic */ a(p pVar, EnumC2906e enumC2906e, a aVar, r rVar, q qVar, int i8, AbstractC3284p abstractC3284p) {
                this(pVar, enumC2906e, aVar, (i8 & 8) != 0 ? null : rVar, (i8 & 16) != 0 ? null : qVar);
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
                if (AbstractC3292y.d(this.f1261a, aVar.f1261a) && this.f1262b == aVar.f1262b && this.f1263c == aVar.f1263c && AbstractC3292y.d(this.f1264d, aVar.f1264d) && AbstractC3292y.d(this.f1265e, aVar.f1265e)) {
                    return true;
                }
                return false;
            }

            @Override // D3.f.e
            public a f() {
                return this.f1263c;
            }

            @Override // D3.f.e
            public p h() {
                return this.f1261a;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = ((((this.f1261a.hashCode() * 31) + this.f1262b.hashCode()) * 31) + this.f1263c.hashCode()) * 31;
                r rVar = this.f1264d;
                int i8 = 0;
                if (rVar == null) {
                    hashCode = 0;
                } else {
                    hashCode = rVar.hashCode();
                }
                int i9 = (hashCode2 + hashCode) * 31;
                q qVar = this.f1265e;
                if (qVar != null) {
                    i8 = qVar.hashCode();
                }
                return i9 + i8;
            }

            @Override // D3.f.e
            public q i() {
                return this.f1265e;
            }

            @Override // D3.f.e
            public r l() {
                return this.f1264d;
            }

            public String toString() {
                return "Card(paymentMethodCreateParams=" + this.f1261a + ", brand=" + this.f1262b + ", customerRequestedSave=" + this.f1263c + ", paymentMethodOptionsParams=" + this.f1264d + ", paymentMethodExtraParams=" + this.f1265e + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeParcelable(this.f1261a, i8);
                out.writeString(this.f1262b.name());
                out.writeString(this.f1263c.name());
                out.writeParcelable(this.f1264d, i8);
                out.writeParcelable(this.f1265e, i8);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p paymentMethodCreateParams, EnumC2906e brand, a customerRequestedSave, r rVar, q qVar) {
                super(null);
                AbstractC3292y.i(paymentMethodCreateParams, "paymentMethodCreateParams");
                AbstractC3292y.i(brand, "brand");
                AbstractC3292y.i(customerRequestedSave, "customerRequestedSave");
                this.f1261a = paymentMethodCreateParams;
                this.f1262b = brand;
                this.f1263c = customerRequestedSave;
                this.f1264d = rVar;
                this.f1265e = qVar;
                String b9 = h().b();
                this.f1266f = b9 == null ? "" : b9;
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends e {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: a */
            private final C2.c f1267a;

            /* renamed from: b */
            private final int f1268b;

            /* renamed from: c */
            private final String f1269c;

            /* renamed from: d */
            private final String f1270d;

            /* renamed from: e */
            private final p f1271e;

            /* renamed from: f */
            private final a f1272f;

            /* renamed from: g */
            private final r f1273g;

            /* renamed from: h */
            private final q f1274h;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new b((C2.c) parcel.readParcelable(b.class.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readString(), (p) parcel.readParcelable(b.class.getClassLoader()), a.valueOf(parcel.readString()), (r) parcel.readParcelable(b.class.getClassLoader()), (q) parcel.readParcelable(b.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C2.c label, int i8, String str, String str2, p paymentMethodCreateParams, a customerRequestedSave, r rVar, q qVar) {
                super(null);
                AbstractC3292y.i(label, "label");
                AbstractC3292y.i(paymentMethodCreateParams, "paymentMethodCreateParams");
                AbstractC3292y.i(customerRequestedSave, "customerRequestedSave");
                this.f1267a = label;
                this.f1268b = i8;
                this.f1269c = str;
                this.f1270d = str2;
                this.f1271e = paymentMethodCreateParams;
                this.f1272f = customerRequestedSave;
                this.f1273g = rVar;
                this.f1274h = qVar;
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
                if (AbstractC3292y.d(this.f1267a, bVar.f1267a) && this.f1268b == bVar.f1268b && AbstractC3292y.d(this.f1269c, bVar.f1269c) && AbstractC3292y.d(this.f1270d, bVar.f1270d) && AbstractC3292y.d(this.f1271e, bVar.f1271e) && this.f1272f == bVar.f1272f && AbstractC3292y.d(this.f1273g, bVar.f1273g) && AbstractC3292y.d(this.f1274h, bVar.f1274h)) {
                    return true;
                }
                return false;
            }

            @Override // D3.f.e
            public a f() {
                return this.f1272f;
            }

            @Override // D3.f.e
            public p h() {
                return this.f1271e;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                int hashCode3;
                int hashCode4 = ((this.f1267a.hashCode() * 31) + this.f1268b) * 31;
                String str = this.f1269c;
                int i8 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i9 = (hashCode4 + hashCode) * 31;
                String str2 = this.f1270d;
                if (str2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str2.hashCode();
                }
                int hashCode5 = (((((i9 + hashCode2) * 31) + this.f1271e.hashCode()) * 31) + this.f1272f.hashCode()) * 31;
                r rVar = this.f1273g;
                if (rVar == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = rVar.hashCode();
                }
                int i10 = (hashCode5 + hashCode3) * 31;
                q qVar = this.f1274h;
                if (qVar != null) {
                    i8 = qVar.hashCode();
                }
                return i10 + i8;
            }

            @Override // D3.f.e
            public q i() {
                return this.f1274h;
            }

            @Override // D3.f.e
            public r l() {
                return this.f1273g;
            }

            public String toString() {
                return "GenericPaymentMethod(label=" + this.f1267a + ", iconResource=" + this.f1268b + ", lightThemeIconUrl=" + this.f1269c + ", darkThemeIconUrl=" + this.f1270d + ", paymentMethodCreateParams=" + this.f1271e + ", customerRequestedSave=" + this.f1272f + ", paymentMethodOptionsParams=" + this.f1273g + ", paymentMethodExtraParams=" + this.f1274h + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeParcelable(this.f1267a, i8);
                out.writeInt(this.f1268b);
                out.writeString(this.f1269c);
                out.writeString(this.f1270d);
                out.writeParcelable(this.f1271e, i8);
                out.writeString(this.f1272f.name());
                out.writeParcelable(this.f1273g, i8);
                out.writeParcelable(this.f1274h, i8);
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends e {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* renamed from: a */
            private final P2.f f1275a;

            /* renamed from: b */
            private final a f1276b;

            /* renamed from: c */
            private final C2912k.e f1277c;

            /* renamed from: d */
            private final p f1278d;

            /* renamed from: e */
            private final r.b f1279e;

            /* renamed from: f */
            private final Void f1280f;

            /* renamed from: g */
            private final int f1281g;

            /* renamed from: h */
            private final String f1282h;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new c((P2.f) parcel.readParcelable(c.class.getClassLoader()), a.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(P2.f linkPaymentDetails, a customerRequestedSave) {
                super(null);
                AbstractC3292y.i(linkPaymentDetails, "linkPaymentDetails");
                AbstractC3292y.i(customerRequestedSave, "customerRequestedSave");
                this.f1275a = linkPaymentDetails;
                this.f1276b = customerRequestedSave;
                C2912k.e a9 = linkPaymentDetails.a();
                this.f1277c = a9;
                this.f1278d = linkPaymentDetails.b();
                this.f1279e = new r.b(null, null, f().b(), 3, null);
                this.f1281g = t.f40566u;
                this.f1282h = "····" + a9.a();
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
                if (AbstractC3292y.d(this.f1275a, cVar.f1275a) && this.f1276b == cVar.f1276b) {
                    return true;
                }
                return false;
            }

            @Override // D3.f.e
            public a f() {
                return this.f1276b;
            }

            @Override // D3.f.e
            public p h() {
                return this.f1278d;
            }

            public int hashCode() {
                return (this.f1275a.hashCode() * 31) + this.f1276b.hashCode();
            }

            @Override // D3.f.e
            public /* bridge */ /* synthetic */ q i() {
                return (q) p();
            }

            public Void p() {
                return this.f1280f;
            }

            @Override // D3.f.e
            /* renamed from: s */
            public r.b l() {
                return this.f1279e;
            }

            public String toString() {
                return "LinkInline(linkPaymentDetails=" + this.f1275a + ", customerRequestedSave=" + this.f1276b + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeParcelable(this.f1275a, i8);
                out.writeString(this.f1276b.name());
            }
        }

        /* loaded from: classes4.dex */
        public static final class d extends e {
            public static final Parcelable.Creator<d> CREATOR = new a();

            /* renamed from: a */
            private final String f1283a;

            /* renamed from: b */
            private final int f1284b;

            /* renamed from: c */
            private final b f1285c;

            /* renamed from: d */
            private final G3.f f1286d;

            /* renamed from: e */
            private final c f1287e;

            /* renamed from: f */
            private final p f1288f;

            /* renamed from: g */
            private final a f1289g;

            /* renamed from: h */
            private final r f1290h;

            /* renamed from: i */
            private final q f1291i;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public final d createFromParcel(Parcel parcel) {
                    c createFromParcel;
                    AbstractC3292y.i(parcel, "parcel");
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    b createFromParcel2 = b.CREATOR.createFromParcel(parcel);
                    G3.f fVar = (G3.f) parcel.readParcelable(d.class.getClassLoader());
                    if (parcel.readInt() == 0) {
                        createFromParcel = null;
                    } else {
                        createFromParcel = c.CREATOR.createFromParcel(parcel);
                    }
                    return new d(readString, readInt, createFromParcel2, fVar, createFromParcel, (p) parcel.readParcelable(d.class.getClassLoader()), a.valueOf(parcel.readString()), (r) parcel.readParcelable(d.class.getClassLoader()), (q) parcel.readParcelable(d.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public final d[] newArray(int i8) {
                    return new d[i8];
                }
            }

            /* loaded from: classes4.dex */
            public static final class b implements Parcelable {

                /* renamed from: a */
                private final String f1293a;

                /* renamed from: b */
                private final String f1294b;

                /* renamed from: c */
                private final String f1295c;

                /* renamed from: d */
                private final com.stripe.android.model.a f1296d;

                /* renamed from: e */
                private final boolean f1297e;

                /* renamed from: f */
                public static final int f1292f = com.stripe.android.model.a.f25420h;
                public static final Parcelable.Creator<b> CREATOR = new a();

                /* loaded from: classes4.dex */
                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a */
                    public final b createFromParcel(Parcel parcel) {
                        boolean z8;
                        AbstractC3292y.i(parcel, "parcel");
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        String readString3 = parcel.readString();
                        com.stripe.android.model.a aVar = (com.stripe.android.model.a) parcel.readParcelable(b.class.getClassLoader());
                        if (parcel.readInt() != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        return new b(readString, readString2, readString3, aVar, z8);
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b */
                    public final b[] newArray(int i8) {
                        return new b[i8];
                    }
                }

                public b(String name, String str, String str2, com.stripe.android.model.a aVar, boolean z8) {
                    AbstractC3292y.i(name, "name");
                    this.f1293a = name;
                    this.f1294b = str;
                    this.f1295c = str2;
                    this.f1296d = aVar;
                    this.f1297e = z8;
                }

                public final com.stripe.android.model.a a() {
                    return this.f1296d;
                }

                public final String b() {
                    return this.f1294b;
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
                    if (AbstractC3292y.d(this.f1293a, bVar.f1293a) && AbstractC3292y.d(this.f1294b, bVar.f1294b) && AbstractC3292y.d(this.f1295c, bVar.f1295c) && AbstractC3292y.d(this.f1296d, bVar.f1296d) && this.f1297e == bVar.f1297e) {
                        return true;
                    }
                    return false;
                }

                public final String f() {
                    return this.f1293a;
                }

                public final String h() {
                    return this.f1295c;
                }

                public int hashCode() {
                    int hashCode;
                    int hashCode2;
                    int hashCode3 = this.f1293a.hashCode() * 31;
                    String str = this.f1294b;
                    int i8 = 0;
                    if (str == null) {
                        hashCode = 0;
                    } else {
                        hashCode = str.hashCode();
                    }
                    int i9 = (hashCode3 + hashCode) * 31;
                    String str2 = this.f1295c;
                    if (str2 == null) {
                        hashCode2 = 0;
                    } else {
                        hashCode2 = str2.hashCode();
                    }
                    int i10 = (i9 + hashCode2) * 31;
                    com.stripe.android.model.a aVar = this.f1296d;
                    if (aVar != null) {
                        i8 = aVar.hashCode();
                    }
                    return ((i10 + i8) * 31) + androidx.compose.foundation.a.a(this.f1297e);
                }

                public final boolean i() {
                    return this.f1297e;
                }

                public String toString() {
                    return "Input(name=" + this.f1293a + ", email=" + this.f1294b + ", phone=" + this.f1295c + ", address=" + this.f1296d + ", saveForFutureUse=" + this.f1297e + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i8) {
                    AbstractC3292y.i(out, "out");
                    out.writeString(this.f1293a);
                    out.writeString(this.f1294b);
                    out.writeString(this.f1295c);
                    out.writeParcelable(this.f1296d, i8);
                    out.writeInt(this.f1297e ? 1 : 0);
                }
            }

            /* loaded from: classes4.dex */
            public static final class c implements Parcelable {
                public static final Parcelable.Creator<c> CREATOR = new a();

                /* renamed from: a */
                private final String f1298a;

                /* loaded from: classes4.dex */
                public static final class a implements Parcelable.Creator {
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

                public c(String paymentMethodId) {
                    AbstractC3292y.i(paymentMethodId, "paymentMethodId");
                    this.f1298a = paymentMethodId;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if ((obj instanceof c) && AbstractC3292y.d(this.f1298a, ((c) obj).f1298a)) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    return this.f1298a.hashCode();
                }

                public String toString() {
                    return "InstantDebitsInfo(paymentMethodId=" + this.f1298a + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i8) {
                    AbstractC3292y.i(out, "out");
                    out.writeString(this.f1298a);
                }
            }

            public /* synthetic */ d(String str, int i8, b bVar, G3.f fVar, c cVar, p pVar, a aVar, r rVar, q qVar, int i9, AbstractC3284p abstractC3284p) {
                this(str, i8, bVar, fVar, cVar, pVar, aVar, (i9 & 128) != 0 ? null : rVar, (i9 & 256) != 0 ? null : qVar);
            }

            @Override // D3.f.e, D3.f
            public C2.c b(String merchantName, boolean z8) {
                AbstractC3292y.i(merchantName, "merchantName");
                return this.f1286d.b();
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
                if (AbstractC3292y.d(this.f1283a, dVar.f1283a) && this.f1284b == dVar.f1284b && AbstractC3292y.d(this.f1285c, dVar.f1285c) && AbstractC3292y.d(this.f1286d, dVar.f1286d) && AbstractC3292y.d(this.f1287e, dVar.f1287e) && AbstractC3292y.d(this.f1288f, dVar.f1288f) && this.f1289g == dVar.f1289g && AbstractC3292y.d(this.f1290h, dVar.f1290h) && AbstractC3292y.d(this.f1291i, dVar.f1291i)) {
                    return true;
                }
                return false;
            }

            @Override // D3.f.e
            public a f() {
                return this.f1289g;
            }

            @Override // D3.f.e
            public p h() {
                return this.f1288f;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                int hashCode3 = ((((((this.f1283a.hashCode() * 31) + this.f1284b) * 31) + this.f1285c.hashCode()) * 31) + this.f1286d.hashCode()) * 31;
                c cVar = this.f1287e;
                int i8 = 0;
                if (cVar == null) {
                    hashCode = 0;
                } else {
                    hashCode = cVar.hashCode();
                }
                int hashCode4 = (((((hashCode3 + hashCode) * 31) + this.f1288f.hashCode()) * 31) + this.f1289g.hashCode()) * 31;
                r rVar = this.f1290h;
                if (rVar == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = rVar.hashCode();
                }
                int i9 = (hashCode4 + hashCode2) * 31;
                q qVar = this.f1291i;
                if (qVar != null) {
                    i8 = qVar.hashCode();
                }
                return i9 + i8;
            }

            @Override // D3.f.e
            public q i() {
                return this.f1291i;
            }

            @Override // D3.f.e
            public r l() {
                return this.f1290h;
            }

            public final b p() {
                return this.f1285c;
            }

            public final c s() {
                return this.f1287e;
            }

            public String toString() {
                return "USBankAccount(labelResource=" + this.f1283a + ", iconResource=" + this.f1284b + ", input=" + this.f1285c + ", screenState=" + this.f1286d + ", instantDebits=" + this.f1287e + ", paymentMethodCreateParams=" + this.f1288f + ", customerRequestedSave=" + this.f1289g + ", paymentMethodOptionsParams=" + this.f1290h + ", paymentMethodExtraParams=" + this.f1291i + ")";
            }

            public final G3.f u() {
                return this.f1286d;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeString(this.f1283a);
                out.writeInt(this.f1284b);
                this.f1285c.writeToParcel(out, i8);
                out.writeParcelable(this.f1286d, i8);
                c cVar = this.f1287e;
                if (cVar == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    cVar.writeToParcel(out, i8);
                }
                out.writeParcelable(this.f1288f, i8);
                out.writeString(this.f1289g.name());
                out.writeParcelable(this.f1290h, i8);
                out.writeParcelable(this.f1291i, i8);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String labelResource, int i8, b input, G3.f screenState, c cVar, p paymentMethodCreateParams, a customerRequestedSave, r rVar, q qVar) {
                super(null);
                AbstractC3292y.i(labelResource, "labelResource");
                AbstractC3292y.i(input, "input");
                AbstractC3292y.i(screenState, "screenState");
                AbstractC3292y.i(paymentMethodCreateParams, "paymentMethodCreateParams");
                AbstractC3292y.i(customerRequestedSave, "customerRequestedSave");
                this.f1283a = labelResource;
                this.f1284b = i8;
                this.f1285c = input;
                this.f1286d = screenState;
                this.f1287e = cVar;
                this.f1288f = paymentMethodCreateParams;
                this.f1289g = customerRequestedSave;
                this.f1290h = rVar;
                this.f1291i = qVar;
            }
        }

        public /* synthetic */ e(AbstractC3284p abstractC3284p) {
            this();
        }

        @Override // D3.f
        public boolean a() {
            return false;
        }

        @Override // D3.f
        public C2.c b(String merchantName, boolean z8) {
            AbstractC3292y.i(merchantName, "merchantName");
            return null;
        }

        public abstract a f();

        public abstract p h();

        public abstract q i();

        public abstract r l();

        private e() {
            super(null);
        }
    }

    /* renamed from: D3.f$f */
    /* loaded from: classes4.dex */
    public static final class C0023f extends f {

        /* renamed from: a */
        private final o f1300a;

        /* renamed from: b */
        private final b f1301b;

        /* renamed from: c */
        private final r f1302c;

        /* renamed from: d */
        public static final int f1299d = r.f25879b | o.f25630u;
        public static final Parcelable.Creator<C0023f> CREATOR = new a();

        /* renamed from: D3.f$f$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final C0023f createFromParcel(Parcel parcel) {
                b valueOf;
                AbstractC3292y.i(parcel, "parcel");
                o oVar = (o) parcel.readParcelable(C0023f.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = b.valueOf(parcel.readString());
                }
                return new C0023f(oVar, valueOf, (r) parcel.readParcelable(C0023f.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final C0023f[] newArray(int i8) {
                return new C0023f[i8];
            }
        }

        /* renamed from: D3.f$f$b */
        /* loaded from: classes4.dex */
        public static final class b extends Enum {

            /* renamed from: b */
            public static final b f1303b = new b("GooglePay", 0, c.f1258a);

            /* renamed from: c */
            public static final b f1304c = new b("Link", 1, d.f1259a);

            /* renamed from: d */
            private static final /* synthetic */ b[] f1305d;

            /* renamed from: e */
            private static final /* synthetic */ W5.a f1306e;

            /* renamed from: a */
            private final f f1307a;

            static {
                b[] a9 = a();
                f1305d = a9;
                f1306e = W5.b.a(a9);
            }

            private b(String str, int i8, f fVar) {
                super(str, i8);
                this.f1307a = fVar;
            }

            private static final /* synthetic */ b[] a() {
                return new b[]{f1303b, f1304c};
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) f1305d.clone();
            }

            public final f b() {
                return this.f1307a;
            }
        }

        /* renamed from: D3.f$f$c */
        /* loaded from: classes4.dex */
        public /* synthetic */ class c {

            /* renamed from: a */
            public static final /* synthetic */ int[] f1308a;

            static {
                int[] iArr = new int[o.p.values().length];
                try {
                    iArr[o.p.f25745O.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[o.p.f25759m.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f1308a = iArr;
            }
        }

        public /* synthetic */ C0023f(o oVar, b bVar, r rVar, int i8, AbstractC3284p abstractC3284p) {
            this(oVar, (i8 & 2) != 0 ? null : bVar, (i8 & 4) != 0 ? null : rVar);
        }

        public static /* synthetic */ C0023f h(C0023f c0023f, o oVar, b bVar, r rVar, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                oVar = c0023f.f1300a;
            }
            if ((i8 & 2) != 0) {
                bVar = c0023f.f1301b;
            }
            if ((i8 & 4) != 0) {
                rVar = c0023f.f1302c;
            }
            return c0023f.f(oVar, bVar, rVar);
        }

        @Override // D3.f
        public boolean a() {
            o.p pVar = this.f1300a.f25635e;
            if (pVar != o.p.f25745O && pVar != o.p.f25759m) {
                return false;
            }
            return true;
        }

        @Override // D3.f
        public C2.c b(String merchantName, boolean z8) {
            int i8;
            AbstractC3292y.i(merchantName, "merchantName");
            o.p pVar = this.f1300a.f25635e;
            if (pVar == null) {
                i8 = -1;
            } else {
                i8 = c.f1308a[pVar.ordinal()];
            }
            if (i8 != 1) {
                if (i8 != 2) {
                    return null;
                }
                return C2.d.g(n.f32363B0, new Object[]{merchantName}, null, 4, null);
            }
            return G3.j.f3047a.a(merchantName, false, false, false, z8);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0023f)) {
                return false;
            }
            C0023f c0023f = (C0023f) obj;
            if (AbstractC3292y.d(this.f1300a, c0023f.f1300a) && this.f1301b == c0023f.f1301b && AbstractC3292y.d(this.f1302c, c0023f.f1302c)) {
                return true;
            }
            return false;
        }

        public final C0023f f(o paymentMethod, b bVar, r rVar) {
            AbstractC3292y.i(paymentMethod, "paymentMethod");
            return new C0023f(paymentMethod, bVar, rVar);
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f1300a.hashCode() * 31;
            b bVar = this.f1301b;
            int i8 = 0;
            if (bVar == null) {
                hashCode = 0;
            } else {
                hashCode = bVar.hashCode();
            }
            int i9 = (hashCode2 + hashCode) * 31;
            r rVar = this.f1302c;
            if (rVar != null) {
                i8 = rVar.hashCode();
            }
            return i9 + i8;
        }

        public final r i() {
            return this.f1302c;
        }

        public final boolean l() {
            if (this.f1300a.f25635e == o.p.f25759m) {
                return true;
            }
            return false;
        }

        public final b p() {
            return this.f1301b;
        }

        public final o r() {
            return this.f1300a;
        }

        public String toString() {
            return "Saved(paymentMethod=" + this.f1300a + ", walletType=" + this.f1301b + ", paymentMethodOptionsParams=" + this.f1302c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeParcelable(this.f1300a, i8);
            b bVar = this.f1301b;
            if (bVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(bVar.name());
            }
            out.writeParcelable(this.f1302c, i8);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0023f(o paymentMethod, b bVar, r rVar) {
            super(null);
            AbstractC3292y.i(paymentMethod, "paymentMethod");
            this.f1300a = paymentMethod;
            this.f1301b = bVar;
            this.f1302c = rVar;
        }
    }

    private f() {
    }

    public abstract boolean a();

    public abstract C2.c b(String str, boolean z8);

    public /* synthetic */ f(AbstractC3284p abstractC3284p) {
        this();
    }
}
