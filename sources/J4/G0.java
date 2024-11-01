package j4;

import C6.C;
import C6.C1014e0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import r4.G;

@StabilityInferred(parameters = 0)
@y6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class G0 extends AbstractC3179f0 {

    /* renamed from: a, reason: collision with root package name */
    private final r4.G f33806a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33807b;

    /* renamed from: c, reason: collision with root package name */
    private final u0 f33808c;
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f33805d = r4.G.f37990d;
    public static final Parcelable.Creator<G0> CREATOR = new c();

    /* loaded from: classes4.dex */
    public static final class a implements C6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33809a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1014e0 f33810b;

        static {
            a aVar = new a();
            f33809a = aVar;
            C1014e0 c1014e0 = new C1014e0("com.stripe.android.ui.core.elements.SepaMandateTextSpec", aVar, 2);
            c1014e0.k("api_path", true);
            c1014e0.k("stringResId", true);
            f33810b = c1014e0;
        }

        private a() {
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            return f33810b;
        }

        @Override // C6.C
        public y6.b[] b() {
            return C.a.a(this);
        }

        @Override // C6.C
        public y6.b[] c() {
            return new y6.b[]{G.a.f38016a, C6.H.f1010a};
        }

        @Override // y6.InterfaceC4248a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public G0 d(B6.e decoder) {
            r4.G g8;
            int i8;
            int i9;
            AbstractC3292y.i(decoder, "decoder");
            A6.f a9 = a();
            B6.c c8 = decoder.c(a9);
            C6.n0 n0Var = null;
            if (c8.z()) {
                g8 = (r4.G) c8.p(a9, 0, G.a.f38016a, null);
                i8 = c8.u(a9, 1);
                i9 = 3;
            } else {
                g8 = null;
                int i10 = 0;
                int i11 = 0;
                boolean z8 = true;
                while (z8) {
                    int y8 = c8.y(a9);
                    if (y8 != -1) {
                        if (y8 != 0) {
                            if (y8 == 1) {
                                i10 = c8.u(a9, 1);
                                i11 |= 2;
                            } else {
                                throw new y6.l(y8);
                            }
                        } else {
                            g8 = (r4.G) c8.p(a9, 0, G.a.f38016a, g8);
                            i11 |= 1;
                        }
                    } else {
                        z8 = false;
                    }
                }
                i8 = i10;
                i9 = i11;
            }
            c8.a(a9);
            return new G0(i9, g8, i8, n0Var);
        }

        @Override // y6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(B6.f encoder, G0 value) {
            AbstractC3292y.i(encoder, "encoder");
            AbstractC3292y.i(value, "value");
            A6.f a9 = a();
            B6.d c8 = encoder.c(a9);
            G0.l(value, c8, a9);
            c8.a(a9);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final y6.b serializer() {
            return a.f33809a;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G0 createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new G0((r4.G) parcel.readParcelable(G0.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final G0[] newArray(int i8) {
            return new G0[i8];
        }
    }

    public /* synthetic */ G0(int i8, r4.G g8, int i9, C6.n0 n0Var) {
        super(null);
        this.f33806a = (i8 & 1) == 0 ? r4.G.Companion.a("sepa_mandate") : g8;
        if ((i8 & 2) == 0) {
            this.f33807b = g4.n.f32363B0;
        } else {
            this.f33807b = i9;
        }
        this.f33808c = new u0(h(), this.f33807b);
    }

    public static final /* synthetic */ void l(G0 g02, B6.d dVar, A6.f fVar) {
        if (dVar.x(fVar, 0) || !AbstractC3292y.d(g02.h(), r4.G.Companion.a("sepa_mandate"))) {
            dVar.n(fVar, 0, G.a.f38016a, g02.h());
        }
        if (dVar.x(fVar, 1) || g02.f33807b != g4.n.f32363B0) {
            dVar.u(fVar, 1, g02.f33807b);
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
        if (!(obj instanceof G0)) {
            return false;
        }
        G0 g02 = (G0) obj;
        if (AbstractC3292y.d(this.f33806a, g02.f33806a) && this.f33807b == g02.f33807b) {
            return true;
        }
        return false;
    }

    public r4.G h() {
        return this.f33806a;
    }

    public int hashCode() {
        return (this.f33806a.hashCode() * 31) + this.f33807b;
    }

    public final r4.D i(String merchantName) {
        AbstractC3292y.i(merchantName, "merchantName");
        return this.f33808c.i(merchantName);
    }

    public String toString() {
        return "SepaMandateTextSpec(apiPath=" + this.f33806a + ", stringResId=" + this.f33807b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeParcelable(this.f33806a, i8);
        out.writeInt(this.f33807b);
    }

    public /* synthetic */ G0(r4.G g8, int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? r4.G.Companion.a("sepa_mandate") : g8, (i9 & 2) != 0 ? g4.n.f32363B0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(r4.G apiPath, int i8) {
        super(null);
        AbstractC3292y.i(apiPath, "apiPath");
        this.f33806a = apiPath;
        this.f33807b = i8;
        this.f33808c = new u0(h(), i8);
    }
}
