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
public final class N extends AbstractC3179f0 {

    /* renamed from: a, reason: collision with root package name */
    private final r4.G f33898a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33899b;

    /* renamed from: c, reason: collision with root package name */
    private final u0 f33900c;
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f33897d = r4.G.f37990d;
    public static final Parcelable.Creator<N> CREATOR = new c();

    /* loaded from: classes4.dex */
    public static final class a implements C6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33901a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1014e0 f33902b;

        static {
            a aVar = new a();
            f33901a = aVar;
            C1014e0 c1014e0 = new C1014e0("com.stripe.android.ui.core.elements.CashAppPayMandateTextSpec", aVar, 2);
            c1014e0.k("api_path", true);
            c1014e0.k("stringResId", true);
            f33902b = c1014e0;
        }

        private a() {
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            return f33902b;
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
        public N d(B6.e decoder) {
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
            return new N(i9, g8, i8, n0Var);
        }

        @Override // y6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(B6.f encoder, N value) {
            AbstractC3292y.i(encoder, "encoder");
            AbstractC3292y.i(value, "value");
            A6.f a9 = a();
            B6.d c8 = encoder.c(a9);
            N.l(value, c8, a9);
            c8.a(a9);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final y6.b serializer() {
            return a.f33901a;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final N createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new N((r4.G) parcel.readParcelable(N.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final N[] newArray(int i8) {
            return new N[i8];
        }
    }

    public /* synthetic */ N(int i8, r4.G g8, int i9, C6.n0 n0Var) {
        super(null);
        this.f33898a = (i8 & 1) == 0 ? r4.G.Companion.a("cashapp_mandate") : g8;
        if ((i8 & 2) == 0) {
            this.f33899b = g4.n.f32414m;
        } else {
            this.f33899b = i9;
        }
        this.f33900c = new u0(h(), this.f33899b);
    }

    public static final /* synthetic */ void l(N n8, B6.d dVar, A6.f fVar) {
        if (dVar.x(fVar, 0) || !AbstractC3292y.d(n8.h(), r4.G.Companion.a("cashapp_mandate"))) {
            dVar.n(fVar, 0, G.a.f38016a, n8.h());
        }
        if (dVar.x(fVar, 1) || n8.f33899b != g4.n.f32414m) {
            dVar.u(fVar, 1, n8.f33899b);
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
        if (!(obj instanceof N)) {
            return false;
        }
        N n8 = (N) obj;
        if (AbstractC3292y.d(this.f33898a, n8.f33898a) && this.f33899b == n8.f33899b) {
            return true;
        }
        return false;
    }

    public r4.G h() {
        return this.f33898a;
    }

    public int hashCode() {
        return (this.f33898a.hashCode() * 31) + this.f33899b;
    }

    public final r4.D i(String merchantName) {
        AbstractC3292y.i(merchantName, "merchantName");
        return this.f33900c.i(merchantName, merchantName);
    }

    public String toString() {
        return "CashAppPayMandateTextSpec(apiPath=" + this.f33898a + ", stringResId=" + this.f33899b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeParcelable(this.f33898a, i8);
        out.writeInt(this.f33899b);
    }

    public /* synthetic */ N(r4.G g8, int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? r4.G.Companion.a("cashapp_mandate") : g8, (i9 & 2) != 0 ? g4.n.f32414m : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(r4.G apiPath, int i8) {
        super(null);
        AbstractC3292y.i(apiPath, "apiPath");
        this.f33898a = apiPath;
        this.f33899b = i8;
        this.f33900c = new u0(h(), i8);
    }
}
