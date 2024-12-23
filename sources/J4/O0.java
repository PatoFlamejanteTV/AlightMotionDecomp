package j4;

import C6.AbstractC1012d0;
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
public final class O0 extends AbstractC3179f0 {

    /* renamed from: a, reason: collision with root package name */
    private final r4.G f33913a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33914b;
    public static final b Companion = new b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f33912c = r4.G.f37990d;
    public static final Parcelable.Creator<O0> CREATOR = new c();

    /* loaded from: classes4.dex */
    public static final class a implements C6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33915a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1014e0 f33916b;

        static {
            a aVar = new a();
            f33915a = aVar;
            C1014e0 c1014e0 = new C1014e0("com.stripe.android.ui.core.elements.StaticTextSpec", aVar, 2);
            c1014e0.k("api_path", true);
            c1014e0.k("stringResId", false);
            f33916b = c1014e0;
        }

        private a() {
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            return f33916b;
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
        public O0 d(B6.e decoder) {
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
            return new O0(i9, g8, i8, n0Var);
        }

        @Override // y6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(B6.f encoder, O0 value) {
            AbstractC3292y.i(encoder, "encoder");
            AbstractC3292y.i(value, "value");
            A6.f a9 = a();
            B6.d c8 = encoder.c(a9);
            O0.l(value, c8, a9);
            c8.a(a9);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final y6.b serializer() {
            return a.f33915a;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final O0 createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new O0((r4.G) parcel.readParcelable(O0.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final O0[] newArray(int i8) {
            return new O0[i8];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ O0(int i8, r4.G g8, int i9, C6.n0 n0Var) {
        super(null);
        if (2 != (i8 & 2)) {
            AbstractC1012d0.a(i8, 2, a.f33915a.a());
        }
        if ((i8 & 1) == 0) {
            this.f33913a = r4.G.Companion.a("static_text");
        } else {
            this.f33913a = g8;
        }
        this.f33914b = i9;
    }

    public static final /* synthetic */ void l(O0 o02, B6.d dVar, A6.f fVar) {
        if (dVar.x(fVar, 0) || !AbstractC3292y.d(o02.h(), r4.G.Companion.a("static_text"))) {
            dVar.n(fVar, 0, G.a.f38016a, o02.h());
        }
        dVar.u(fVar, 1, o02.f33914b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O0)) {
            return false;
        }
        O0 o02 = (O0) obj;
        if (AbstractC3292y.d(this.f33913a, o02.f33913a) && this.f33914b == o02.f33914b) {
            return true;
        }
        return false;
    }

    public r4.G h() {
        return this.f33913a;
    }

    public int hashCode() {
        return (this.f33913a.hashCode() * 31) + this.f33914b;
    }

    public final r4.D i() {
        return new M0(h(), this.f33914b, null, 4, null);
    }

    public String toString() {
        return "StaticTextSpec(apiPath=" + this.f33913a + ", stringResId=" + this.f33914b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeParcelable(this.f33913a, i8);
        out.writeInt(this.f33914b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(r4.G apiPath, int i8) {
        super(null);
        AbstractC3292y.i(apiPath, "apiPath");
        this.f33913a = apiPath;
        this.f33914b = i8;
    }
}
