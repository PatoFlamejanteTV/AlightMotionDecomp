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
/* renamed from: j4.p0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3199p0 extends AbstractC3179f0 {

    /* renamed from: a, reason: collision with root package name */
    private final r4.G f34236a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34237b;

    /* renamed from: c, reason: collision with root package name */
    private final u0 f34238c;
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f34235d = r4.G.f37990d;
    public static final Parcelable.Creator<C3199p0> CREATOR = new c();

    /* renamed from: j4.p0$a */
    /* loaded from: classes4.dex */
    public static final class a implements C6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34239a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1014e0 f34240b;

        static {
            a aVar = new a();
            f34239a = aVar;
            C1014e0 c1014e0 = new C1014e0("com.stripe.android.ui.core.elements.KlarnaMandateTextSpec", aVar, 2);
            c1014e0.k("api_path", true);
            c1014e0.k("stringResId", true);
            f34240b = c1014e0;
        }

        private a() {
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            return f34240b;
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
        public C3199p0 d(B6.e decoder) {
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
            return new C3199p0(i9, g8, i8, n0Var);
        }

        @Override // y6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(B6.f encoder, C3199p0 value) {
            AbstractC3292y.i(encoder, "encoder");
            AbstractC3292y.i(value, "value");
            A6.f a9 = a();
            B6.d c8 = encoder.c(a9);
            C3199p0.l(value, c8, a9);
            c8.a(a9);
        }
    }

    /* renamed from: j4.p0$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final y6.b serializer() {
            return a.f34239a;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: j4.p0$c */
    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3199p0 createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new C3199p0((r4.G) parcel.readParcelable(C3199p0.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C3199p0[] newArray(int i8) {
            return new C3199p0[i8];
        }
    }

    public /* synthetic */ C3199p0(int i8, r4.G g8, int i9, C6.n0 n0Var) {
        super(null);
        this.f34236a = (i8 & 1) == 0 ? r4.G.Companion.a("klarna_mandate") : g8;
        if ((i8 & 2) == 0) {
            this.f34237b = g4.n.f32360A;
        } else {
            this.f34237b = i9;
        }
        this.f34238c = new u0(h(), this.f34237b);
    }

    public static final /* synthetic */ void l(C3199p0 c3199p0, B6.d dVar, A6.f fVar) {
        if (dVar.x(fVar, 0) || !AbstractC3292y.d(c3199p0.h(), r4.G.Companion.a("klarna_mandate"))) {
            dVar.n(fVar, 0, G.a.f38016a, c3199p0.h());
        }
        if (dVar.x(fVar, 1) || c3199p0.f34237b != g4.n.f32360A) {
            dVar.u(fVar, 1, c3199p0.f34237b);
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
        if (!(obj instanceof C3199p0)) {
            return false;
        }
        C3199p0 c3199p0 = (C3199p0) obj;
        if (AbstractC3292y.d(this.f34236a, c3199p0.f34236a) && this.f34237b == c3199p0.f34237b) {
            return true;
        }
        return false;
    }

    public r4.G h() {
        return this.f34236a;
    }

    public int hashCode() {
        return (this.f34236a.hashCode() * 31) + this.f34237b;
    }

    public final r4.D i(String merchantName) {
        AbstractC3292y.i(merchantName, "merchantName");
        return this.f34238c.i(merchantName, merchantName);
    }

    public String toString() {
        return "KlarnaMandateTextSpec(apiPath=" + this.f34236a + ", stringResId=" + this.f34237b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeParcelable(this.f34236a, i8);
        out.writeInt(this.f34237b);
    }

    public /* synthetic */ C3199p0(r4.G g8, int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? r4.G.Companion.a("klarna_mandate") : g8, (i9 & 2) != 0 ? g4.n.f32360A : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3199p0(r4.G apiPath, int i8) {
        super(null);
        AbstractC3292y.i(apiPath, "apiPath");
        this.f34236a = apiPath;
        this.f34237b = i8;
        this.f34238c = new u0(h(), i8);
    }
}
