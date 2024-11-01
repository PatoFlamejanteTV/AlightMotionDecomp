package r4;

import C6.AbstractC1012d0;
import C6.C;
import C6.C1014e0;
import C6.C1018h;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import r4.P;

@StabilityInferred(parameters = 0)
@y6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class G implements Parcelable {

    /* renamed from: A, reason: collision with root package name */
    private static final G f37984A;

    /* renamed from: B, reason: collision with root package name */
    private static final G f37985B;

    /* renamed from: C, reason: collision with root package name */
    private static final G f37986C;

    /* renamed from: D, reason: collision with root package name */
    private static final G f37987D;

    /* renamed from: E, reason: collision with root package name */
    private static final G f37988E;

    /* renamed from: F, reason: collision with root package name */
    private static final G f37989F;

    /* renamed from: h, reason: collision with root package name */
    private static final G f37994h;

    /* renamed from: i, reason: collision with root package name */
    private static final G f37995i;

    /* renamed from: j, reason: collision with root package name */
    private static final G f37996j;

    /* renamed from: k, reason: collision with root package name */
    private static final G f37997k;

    /* renamed from: l, reason: collision with root package name */
    private static final G f37998l;

    /* renamed from: m, reason: collision with root package name */
    private static final G f37999m;

    /* renamed from: n, reason: collision with root package name */
    private static final G f38000n;

    /* renamed from: o, reason: collision with root package name */
    private static final G f38001o;

    /* renamed from: p, reason: collision with root package name */
    private static final G f38002p;

    /* renamed from: q, reason: collision with root package name */
    private static final G f38003q;

    /* renamed from: r, reason: collision with root package name */
    private static final G f38004r;

    /* renamed from: s, reason: collision with root package name */
    private static final G f38005s;

    /* renamed from: t, reason: collision with root package name */
    private static final G f38006t;

    /* renamed from: u, reason: collision with root package name */
    private static final G f38007u;

    /* renamed from: v, reason: collision with root package name */
    private static final G f38008v;

    /* renamed from: w, reason: collision with root package name */
    private static final G f38009w;

    /* renamed from: x, reason: collision with root package name */
    private static final G f38010x;

    /* renamed from: y, reason: collision with root package name */
    private static final G f38011y;

    /* renamed from: z, reason: collision with root package name */
    private static final G f38012z;

    /* renamed from: a, reason: collision with root package name */
    private final String f38013a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f38014b;

    /* renamed from: c, reason: collision with root package name */
    private final P f38015c;
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f37990d = 8;
    public static final Parcelable.Creator<G> CREATOR = new c();

    /* renamed from: e, reason: collision with root package name */
    private static final y6.b[] f37991e = {null, null, new y6.e(kotlin.jvm.internal.U.b(P.class), new Annotation[0])};

    /* renamed from: f, reason: collision with root package name */
    private static final G f37992f = new G("billing_details[name]", false, (P) null, 6, (AbstractC3284p) null);

    /* renamed from: g, reason: collision with root package name */
    private static final G f37993g = new G("card[brand]", false, (P) null, 6, (AbstractC3284p) null);

    /* loaded from: classes4.dex */
    public static final class a implements C6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f38016a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1014e0 f38017b;

        static {
            a aVar = new a();
            f38016a = aVar;
            C1014e0 c1014e0 = new C1014e0("com.stripe.android.uicore.elements.IdentifierSpec", aVar, 3);
            c1014e0.k("v1", false);
            c1014e0.k("ignoreField", true);
            c1014e0.k("destination", true);
            f38017b = c1014e0;
        }

        private a() {
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            return f38017b;
        }

        @Override // C6.C
        public y6.b[] b() {
            return C.a.a(this);
        }

        @Override // C6.C
        public y6.b[] c() {
            return new y6.b[]{C6.r0.f1092a, C1018h.f1064a, G.f37991e[2]};
        }

        @Override // y6.InterfaceC4248a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public G d(B6.e decoder) {
            int i8;
            boolean z8;
            String str;
            P p8;
            AbstractC3292y.i(decoder, "decoder");
            A6.f a9 = a();
            B6.c c8 = decoder.c(a9);
            y6.b[] bVarArr = G.f37991e;
            if (c8.z()) {
                String o8 = c8.o(a9, 0);
                boolean m8 = c8.m(a9, 1);
                p8 = (P) c8.p(a9, 2, bVarArr[2], null);
                str = o8;
                z8 = m8;
                i8 = 7;
            } else {
                String str2 = null;
                P p9 = null;
                int i9 = 0;
                boolean z9 = false;
                boolean z10 = true;
                while (z10) {
                    int y8 = c8.y(a9);
                    if (y8 != -1) {
                        if (y8 != 0) {
                            if (y8 != 1) {
                                if (y8 == 2) {
                                    p9 = (P) c8.p(a9, 2, bVarArr[2], p9);
                                    i9 |= 4;
                                } else {
                                    throw new y6.l(y8);
                                }
                            } else {
                                z9 = c8.m(a9, 1);
                                i9 |= 2;
                            }
                        } else {
                            str2 = c8.o(a9, 0);
                            i9 |= 1;
                        }
                    } else {
                        z10 = false;
                    }
                }
                i8 = i9;
                z8 = z9;
                str = str2;
                p8 = p9;
            }
            c8.a(a9);
            return new G(i8, str, z8, p8, (C6.n0) null);
        }

        @Override // y6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(B6.f encoder, G value) {
            AbstractC3292y.i(encoder, "encoder");
            AbstractC3292y.i(value, "value");
            A6.f a9 = a();
            B6.d c8 = encoder.c(a9);
            G.k0(value, c8, a9);
            c8.a(a9);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final G A() {
            return G.f37985B;
        }

        public final G a(String _value) {
            AbstractC3292y.i(_value, "_value");
            return new G(_value, false, (P) null, 6, (AbstractC3284p) null);
        }

        public final G b(String value) {
            AbstractC3292y.i(value, "value");
            if (AbstractC3292y.d(value, f().j0())) {
                return f();
            }
            if (AbstractC3292y.d(value, j().j0())) {
                return j();
            }
            if (AbstractC3292y.d(value, g().j0())) {
                return g();
            }
            if (AbstractC3292y.d(value, k().j0())) {
                return k();
            }
            if (AbstractC3292y.d(value, l().j0())) {
                return l();
            }
            if (AbstractC3292y.d(value, n().j0())) {
                return n();
            }
            if (AbstractC3292y.d(value, p().j0())) {
                return p();
            }
            if (AbstractC3292y.d(value, q().j0())) {
                return q();
            }
            if (AbstractC3292y.d(value, r().j0())) {
                return r();
            }
            if (AbstractC3292y.d(value, t().j0())) {
                return t();
            }
            if (AbstractC3292y.d(value, u().j0())) {
                return u();
            }
            if (AbstractC3292y.d(value, x().j0())) {
                return x();
            }
            if (AbstractC3292y.d(value, z().j0())) {
                return z();
            }
            if (AbstractC3292y.d(value, s().j0())) {
                return s();
            }
            return a(value);
        }

        public final G c() {
            return G.f37989F;
        }

        public final G d() {
            return G.f37999m;
        }

        public final G e() {
            return G.f37987D;
        }

        public final G f() {
            return G.f37993g;
        }

        public final G g() {
            return G.f37996j;
        }

        public final G h() {
            return G.f37997k;
        }

        public final G i() {
            return G.f37998l;
        }

        public final G j() {
            return G.f37995i;
        }

        public final G k() {
            return G.f38004r;
        }

        public final G l() {
            return G.f38009w;
        }

        public final G m() {
            return G.f38005s;
        }

        public final G n() {
            return G.f38000n;
        }

        public final G o() {
            return G.f37988E;
        }

        public final G p() {
            return G.f38002p;
        }

        public final G q() {
            return G.f38003q;
        }

        public final G r() {
            return G.f37992f;
        }

        public final G s() {
            return G.f38011y;
        }

        public final y6.b serializer() {
            return a.f38016a;
        }

        public final G t() {
            return G.f38001o;
        }

        public final G u() {
            return G.f38006t;
        }

        public final G v() {
            return G.f37994h;
        }

        public final G w() {
            return G.f38012z;
        }

        public final G x() {
            return G.f38010x;
        }

        public final G y() {
            return G.f38007u;
        }

        public final G z() {
            return G.f38008v;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G createFromParcel(Parcel parcel) {
            boolean z8;
            AbstractC3292y.i(parcel, "parcel");
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            return new G(readString, z8, (P) parcel.readParcelable(G.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final G[] newArray(int i8) {
            return new G[i8];
        }
    }

    static {
        int i8 = 6;
        boolean z8 = false;
        P p8 = null;
        f37994h = new G("card[networks][preferred]", z8, p8, i8, (AbstractC3284p) (0 == true ? 1 : 0));
        int i9 = 6;
        boolean z9 = false;
        P p9 = null;
        f37995i = new G("card[number]", z9, p9, i9, (AbstractC3284p) (0 == true ? 1 : 0));
        f37996j = new G("card[cvc]", z8, p8, i8, (AbstractC3284p) (0 == true ? 1 : 0));
        f37997k = new G("card[exp_month]", z9, p9, i9, (AbstractC3284p) (0 == true ? 1 : 0));
        f37998l = new G("card[exp_year]", z8, p8, i8, (AbstractC3284p) (0 == true ? 1 : 0));
        f37999m = new G("billing_details[address]", z9, p9, i9, (AbstractC3284p) (0 == true ? 1 : 0));
        f38000n = new G("billing_details[email]", z8, p8, i8, (AbstractC3284p) (0 == true ? 1 : 0));
        f38001o = new G("billing_details[phone]", z9, p9, i9, (AbstractC3284p) (0 == true ? 1 : 0));
        f38002p = new G("billing_details[address][line1]", z8, p8, i8, (AbstractC3284p) (0 == true ? 1 : 0));
        f38003q = new G("billing_details[address][line2]", z9, p9, i9, (AbstractC3284p) (0 == true ? 1 : 0));
        f38004r = new G("billing_details[address][city]", z8, p8, i8, (AbstractC3284p) (0 == true ? 1 : 0));
        f38005s = new G("", z9, p9, i9, (AbstractC3284p) (0 == true ? 1 : 0));
        f38006t = new G("billing_details[address][postal_code]", z8, p8, i8, (AbstractC3284p) (0 == true ? 1 : 0));
        f38007u = new G("", z9, p9, i9, (AbstractC3284p) (0 == true ? 1 : 0));
        f38008v = new G("billing_details[address][state]", z8, p8, i8, (AbstractC3284p) (0 == true ? 1 : 0));
        f38009w = new G("billing_details[address][country]", z9, p9, i9, (AbstractC3284p) (0 == true ? 1 : 0));
        f38010x = new G("save_for_future_use", z8, p8, i8, (AbstractC3284p) (0 == true ? 1 : 0));
        f38011y = new G("address", z9, p9, i9, (AbstractC3284p) (0 == true ? 1 : 0));
        f38012z = new G("same_as_shipping", true, p8, 4, (AbstractC3284p) (0 == true ? 1 : 0));
        f37984A = new G("upi", z9, p9, i9, (AbstractC3284p) (0 == true ? 1 : 0));
        boolean z10 = false;
        f37985B = new G("upi[vpa]", z10, p8, 6, (AbstractC3284p) (0 == true ? 1 : 0));
        P.a aVar = P.a.f38105b;
        int i10 = 2;
        f37986C = new G("blik", z9, (P) aVar, i10, (AbstractC3284p) (0 == true ? 1 : 0));
        int i11 = 2;
        f37987D = new G("blik[code]", z10, (P) aVar, i11, (AbstractC3284p) (0 == true ? 1 : 0));
        f37988E = new G("konbini[confirmation_number]", z10, (P) aVar, i11, (AbstractC3284p) (0 == true ? 1 : 0));
        f37989F = new G("bacs_debit[confirmed]", z9, (P) P.b.f38108a, i10, (AbstractC3284p) (0 == true ? 1 : 0));
    }

    public /* synthetic */ G(int i8, String str, boolean z8, P p8, C6.n0 n0Var) {
        if (1 != (i8 & 1)) {
            AbstractC1012d0.a(i8, 1, a.f38016a.a());
        }
        this.f38013a = str;
        if ((i8 & 2) == 0) {
            this.f38014b = false;
        } else {
            this.f38014b = z8;
        }
        if ((i8 & 4) == 0) {
            this.f38015c = P.a.f38104a;
        } else {
            this.f38015c = p8;
        }
    }

    public static /* synthetic */ G g0(G g8, String str, boolean z8, P p8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = g8.f38013a;
        }
        if ((i8 & 2) != 0) {
            z8 = g8.f38014b;
        }
        if ((i8 & 4) != 0) {
            p8 = g8.f38015c;
        }
        return g8.f0(str, z8, p8);
    }

    public static final /* synthetic */ void k0(G g8, B6.d dVar, A6.f fVar) {
        y6.b[] bVarArr = f37991e;
        dVar.q(fVar, 0, g8.f38013a);
        if (dVar.x(fVar, 1) || g8.f38014b) {
            dVar.o(fVar, 1, g8.f38014b);
        }
        if (dVar.x(fVar, 2) || g8.f38015c != P.a.f38104a) {
            dVar.n(fVar, 2, bVarArr[2], g8.f38015c);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g8 = (G) obj;
        if (AbstractC3292y.d(this.f38013a, g8.f38013a) && this.f38014b == g8.f38014b && AbstractC3292y.d(this.f38015c, g8.f38015c)) {
            return true;
        }
        return false;
    }

    public final G f0(String v12, boolean z8, P destination) {
        AbstractC3292y.i(v12, "v1");
        AbstractC3292y.i(destination, "destination");
        return new G(v12, z8, destination);
    }

    public final P h0() {
        return this.f38015c;
    }

    public int hashCode() {
        return (((this.f38013a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f38014b)) * 31) + this.f38015c.hashCode();
    }

    public final boolean i0() {
        return this.f38014b;
    }

    public final String j0() {
        return this.f38013a;
    }

    public String toString() {
        return "IdentifierSpec(v1=" + this.f38013a + ", ignoreField=" + this.f38014b + ", destination=" + this.f38015c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f38013a);
        out.writeInt(this.f38014b ? 1 : 0);
        out.writeParcelable(this.f38015c, i8);
    }

    public G(String v12, boolean z8, P destination) {
        AbstractC3292y.i(v12, "v1");
        AbstractC3292y.i(destination, "destination");
        this.f38013a = v12;
        this.f38014b = z8;
        this.f38015c = destination;
    }

    public /* synthetic */ G(String str, boolean z8, P p8, int i8, AbstractC3284p abstractC3284p) {
        this(str, (i8 & 2) != 0 ? false : z8, (i8 & 4) != 0 ? P.a.f38104a : p8);
    }

    public G() {
        this("", false, (P) null, 6, (AbstractC3284p) null);
    }
}
