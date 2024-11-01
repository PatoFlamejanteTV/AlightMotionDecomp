package j4;

import C6.AbstractC1012d0;
import C6.C;
import C6.C1014e0;
import R5.AbstractC1428l;
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
public final class u0 extends AbstractC3179f0 {

    /* renamed from: a, reason: collision with root package name */
    private final r4.G f34287a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34288b;
    public static final b Companion = new b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f34286c = r4.G.f37990d;
    public static final Parcelable.Creator<u0> CREATOR = new c();

    /* loaded from: classes4.dex */
    public static final class a implements C6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34289a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1014e0 f34290b;

        static {
            a aVar = new a();
            f34289a = aVar;
            C1014e0 c1014e0 = new C1014e0("com.stripe.android.ui.core.elements.MandateTextSpec", aVar, 2);
            c1014e0.k("api_path", true);
            c1014e0.k("stringResId", false);
            f34290b = c1014e0;
        }

        private a() {
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            return f34290b;
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
        public u0 d(B6.e decoder) {
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
            return new u0(i9, g8, i8, n0Var);
        }

        @Override // y6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(B6.f encoder, u0 value) {
            AbstractC3292y.i(encoder, "encoder");
            AbstractC3292y.i(value, "value");
            A6.f a9 = a();
            B6.d c8 = encoder.c(a9);
            u0.l(value, c8, a9);
            c8.a(a9);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final y6.b serializer() {
            return a.f34289a;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u0 createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new u0((r4.G) parcel.readParcelable(u0.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final u0[] newArray(int i8) {
            return new u0[i8];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(int i8, r4.G g8, int i9, C6.n0 n0Var) {
        super(null);
        if (2 != (i8 & 2)) {
            AbstractC1012d0.a(i8, 2, a.f34289a.a());
        }
        if ((i8 & 1) == 0) {
            this.f34287a = r4.G.Companion.a("mandate");
        } else {
            this.f34287a = g8;
        }
        this.f34288b = i9;
    }

    public static final /* synthetic */ void l(u0 u0Var, B6.d dVar, A6.f fVar) {
        if (dVar.x(fVar, 0) || !AbstractC3292y.d(u0Var.h(), r4.G.Companion.a("mandate"))) {
            dVar.n(fVar, 0, G.a.f38016a, u0Var.h());
        }
        dVar.u(fVar, 1, u0Var.f34288b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (AbstractC3292y.d(this.f34287a, u0Var.f34287a) && this.f34288b == u0Var.f34288b) {
            return true;
        }
        return false;
    }

    public r4.G h() {
        return this.f34287a;
    }

    public int hashCode() {
        return (this.f34287a.hashCode() * 31) + this.f34288b;
    }

    public final r4.D i(String... args) {
        AbstractC3292y.i(args, "args");
        return new t0(h(), this.f34288b, AbstractC1428l.V0(args), 0.0f, null, 24, null);
    }

    public String toString() {
        return "MandateTextSpec(apiPath=" + this.f34287a + ", stringResId=" + this.f34288b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeParcelable(this.f34287a, i8);
        out.writeInt(this.f34288b);
    }

    public /* synthetic */ u0(r4.G g8, int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? r4.G.Companion.a("mandate") : g8, i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(r4.G apiPath, int i8) {
        super(null);
        AbstractC3292y.i(apiPath, "apiPath");
        this.f34287a = apiPath;
        this.f34288b = i8;
    }
}
